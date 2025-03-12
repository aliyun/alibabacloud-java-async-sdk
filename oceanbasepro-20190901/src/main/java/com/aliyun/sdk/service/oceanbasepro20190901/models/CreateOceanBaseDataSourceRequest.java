// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateOceanBaseDataSourceRequest} extends {@link RequestModel}
 *
 * <p>CreateOceanBaseDataSourceRequest</p>
 */
public class CreateOceanBaseDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Cluster")
    private String cluster;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigUrl")
    private String configUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DrcPassword")
    private String drcPassword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DrcUserName")
    private String drcUserName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InnerDrcPassword")
    private String innerDrcPassword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogProxyIp")
    private String logProxyIp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogProxyPort")
    private String logProxyPort;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tenant")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenant;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private CreateOceanBaseDataSourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cluster = builder.cluster;
        this.configUrl = builder.configUrl;
        this.description = builder.description;
        this.drcPassword = builder.drcPassword;
        this.drcUserName = builder.drcUserName;
        this.innerDrcPassword = builder.innerDrcPassword;
        this.ip = builder.ip;
        this.logProxyIp = builder.logProxyIp;
        this.logProxyPort = builder.logProxyPort;
        this.name = builder.name;
        this.password = builder.password;
        this.port = builder.port;
        this.tenant = builder.tenant;
        this.type = builder.type;
        this.userName = builder.userName;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOceanBaseDataSourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return cluster
     */
    public String getCluster() {
        return this.cluster;
    }

    /**
     * @return configUrl
     */
    public String getConfigUrl() {
        return this.configUrl;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return drcPassword
     */
    public String getDrcPassword() {
        return this.drcPassword;
    }

    /**
     * @return drcUserName
     */
    public String getDrcUserName() {
        return this.drcUserName;
    }

    /**
     * @return innerDrcPassword
     */
    public String getInnerDrcPassword() {
        return this.innerDrcPassword;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return logProxyIp
     */
    public String getLogProxyIp() {
        return this.logProxyIp;
    }

    /**
     * @return logProxyPort
     */
    public String getLogProxyPort() {
        return this.logProxyPort;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return tenant
     */
    public String getTenant() {
        return this.tenant;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<CreateOceanBaseDataSourceRequest, Builder> {
        private String regionId; 
        private String cluster; 
        private String configUrl; 
        private String description; 
        private String drcPassword; 
        private String drcUserName; 
        private String innerDrcPassword; 
        private String ip; 
        private String logProxyIp; 
        private String logProxyPort; 
        private String name; 
        private String password; 
        private Integer port; 
        private String tenant; 
        private String type; 
        private String userName; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateOceanBaseDataSourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cluster = request.cluster;
            this.configUrl = request.configUrl;
            this.description = request.description;
            this.drcPassword = request.drcPassword;
            this.drcUserName = request.drcUserName;
            this.innerDrcPassword = request.innerDrcPassword;
            this.ip = request.ip;
            this.logProxyIp = request.logProxyIp;
            this.logProxyPort = request.logProxyPort;
            this.name = request.name;
            this.password = request.password;
            this.port = request.port;
            this.tenant = request.tenant;
            this.type = request.type;
            this.userName = request.userName;
            this.vpcId = request.vpcId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Cluster.
         */
        public Builder cluster(String cluster) {
            this.putBodyParameter("Cluster", cluster);
            this.cluster = cluster;
            return this;
        }

        /**
         * ConfigUrl.
         */
        public Builder configUrl(String configUrl) {
            this.putBodyParameter("ConfigUrl", configUrl);
            this.configUrl = configUrl;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DrcPassword.
         */
        public Builder drcPassword(String drcPassword) {
            this.putBodyParameter("DrcPassword", drcPassword);
            this.drcPassword = drcPassword;
            return this;
        }

        /**
         * DrcUserName.
         */
        public Builder drcUserName(String drcUserName) {
            this.putBodyParameter("DrcUserName", drcUserName);
            this.drcUserName = drcUserName;
            return this;
        }

        /**
         * InnerDrcPassword.
         */
        public Builder innerDrcPassword(String innerDrcPassword) {
            this.putBodyParameter("InnerDrcPassword", innerDrcPassword);
            this.innerDrcPassword = innerDrcPassword;
            return this;
        }

        /**
         * Ip.
         */
        public Builder ip(String ip) {
            this.putBodyParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * <p>LogProxy IP。</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder logProxyIp(String logProxyIp) {
            this.putBodyParameter("LogProxyIp", logProxyIp);
            this.logProxyIp = logProxyIp;
            return this;
        }

        /**
         * LogProxyPort.
         */
        public Builder logProxyPort(String logProxyPort) {
            this.putBodyParameter("LogProxyPort", logProxyPort);
            this.logProxyPort = logProxyPort;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>source_name</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pass_word</p>
         */
        public Builder password(String password) {
            this.putBodyParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(Integer port) {
            this.putBodyParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tenant_name</p>
         */
        public Builder tenant(String tenant) {
            this.putBodyParameter("Tenant", tenant);
            this.tenant = tenant;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OB_MYSQL_VPC</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user_name</p>
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public CreateOceanBaseDataSourceRequest build() {
            return new CreateOceanBaseDataSourceRequest(this);
        } 

    } 

}
