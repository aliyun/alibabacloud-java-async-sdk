// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddHDMInstanceRequest} extends {@link RequestModel}
 *
 * <p>AddHDMInstanceRequest</p>
 */
public class AddHDMInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlushAccount")
    private String flushAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceAlias")
    private String instanceAlias;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceArea")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceArea;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("__context")
    private String context;

    private AddHDMInstanceRequest(Builder builder) {
        super(builder);
        this.engine = builder.engine;
        this.flushAccount = builder.flushAccount;
        this.instanceAlias = builder.instanceAlias;
        this.instanceArea = builder.instanceArea;
        this.instanceId = builder.instanceId;
        this.ip = builder.ip;
        this.networkType = builder.networkType;
        this.password = builder.password;
        this.port = builder.port;
        this.region = builder.region;
        this.username = builder.username;
        this.vpcId = builder.vpcId;
        this.context = builder.context;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddHDMInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return flushAccount
     */
    public String getFlushAccount() {
        return this.flushAccount;
    }

    /**
     * @return instanceAlias
     */
    public String getInstanceAlias() {
        return this.instanceAlias;
    }

    /**
     * @return instanceArea
     */
    public String getInstanceArea() {
        return this.instanceArea;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
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
    public String getPort() {
        return this.port;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return context
     */
    public String getContext() {
        return this.context;
    }

    public static final class Builder extends Request.Builder<AddHDMInstanceRequest, Builder> {
        private String engine; 
        private String flushAccount; 
        private String instanceAlias; 
        private String instanceArea; 
        private String instanceId; 
        private String ip; 
        private String networkType; 
        private String password; 
        private String port; 
        private String region; 
        private String username; 
        private String vpcId; 
        private String context; 

        private Builder() {
            super();
        } 

        private Builder(AddHDMInstanceRequest request) {
            super(request);
            this.engine = request.engine;
            this.flushAccount = request.flushAccount;
            this.instanceAlias = request.instanceAlias;
            this.instanceArea = request.instanceArea;
            this.instanceId = request.instanceId;
            this.ip = request.ip;
            this.networkType = request.networkType;
            this.password = request.password;
            this.port = request.port;
            this.region = request.region;
            this.username = request.username;
            this.vpcId = request.vpcId;
            this.context = request.context;
        } 

        /**
         * <p>The database engine. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong></li>
         * <li><strong>PostgreSQL</strong></li>
         * <li><strong>SQLServer</strong></li>
         * <li><strong>PolarDBMySQL</strong></li>
         * <li><strong>PolarDBPostgreSQL</strong></li>
         * <li><strong>Redis</strong></li>
         * <li><strong>MongoDB</strong></li>
         * <li><strong>PolarDBOracle</strong></li>
         * <li><strong>PolarDBX</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder flushAccount(String flushAccount) {
            this.putQueryParameter("FlushAccount", flushAccount);
            this.flushAccount = flushAccount;
            return this;
        }

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>yuecq--test****</p>
         */
        public Builder instanceAlias(String instanceAlias) {
            this.putQueryParameter("InstanceAlias", instanceAlias);
            this.instanceAlias = instanceAlias;
            return this;
        }

        /**
         * <p>The type of the instance on which the database is deployed. Valid values:</p>
         * <ul>
         * <li><strong>RDS</strong>: an Alibaba Cloud database instance.</li>
         * <li><strong>ECS</strong>: an Elastic Compute Service (ECS) instance on which a self-managed database is deployed.</li>
         * <li><strong>IDC</strong>: a self-managed database instance that is not deployed on Alibaba Cloud.</li>
         * </ul>
         * <blockquote>
         * <p> IDC refers to your data center.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        public Builder instanceArea(String instanceArea) {
            this.putQueryParameter("InstanceArea", instanceArea);
            this.instanceArea = instanceArea;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1jdv45i7l6****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The endpoint that is used to access the instance over internal networks.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1jdv45i7l6****.mysql.rds.aliyuncs.com</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * <p>The network type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * <p>The password for the username.</p>
         * 
         * <strong>example:</strong>
         * <p>122****</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The port that is used to access the instance over internal networks.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The ID of the region in which the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The username that is used to log on to the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test****</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-m5e666n89m2bx8jar****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder context(String context) {
            this.putQueryParameter("__context", context);
            this.context = context;
            return this;
        }

        @Override
        public AddHDMInstanceRequest build() {
            return new AddHDMInstanceRequest(this);
        } 

    } 

}
