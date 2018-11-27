Vagrant.configure("2") do |config|

  config.vm.define "haproxy" do |haproxy|
    haproxy.vm.box = "ubuntu/trusty64"
        haproxy.vm.hostname = "haproxy.localnet"
        haproxy.vm.network "forwarded_port", guest: 80, host: 81   
        haproxy.vm.network "private_network", ip: "192.168.70.4"
        haproxy.vm.provision :shell, :path => "haproxy.sh"
  end

  config.vm.define "db" do |data|
    db.vm.box = "ubuntu/trusty64"
        db.vm.hostname = "data.localnet"
        db.vm.network "forwarded_port", guest: 3306, host: 3306  
        db.vm.network "private_network", ip: "192.168.70.5"
        db.vm.provision :shell, :path => "db.sh"
  end

  config.vm.define "app" do |app|
    app.vm.box = "ubuntu/trusty64"
        app.vm.hostname = "app.localnet"
        app.vm.network "forwarded_port", guest: 3001, host: 3001
        app.vm.network "forwarded_port", guest: 8089, host: 8089
        app.vm.network "private_network", ip: "192.168.70.6"
        app.vm.provision :shell, :path => "app.sh"
        app.vm.provision :shell, :path => "run.sh"
  end
end
