// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddHDMInstanceRequest} extends {@link RequestModel}
 *
 * <p>AddHDMInstanceRequest</p>
 */
public class AddHDMInstanceRequest extends Request {
    @Query
    @NameInMap("Engine")
    private String engine;

    @Query
    @NameInMap("FlushAccount")
    private String flushAccount;

    @Query
    @NameInMap("InstanceAlias")
    private String instanceAlias;

    @Query
    @NameInMap("InstanceArea")
    @Validation(required = true)
    private String instanceArea;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Ip")
    private String ip;

    @Query
    @NameInMap("NetworkType")
    private String networkType;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("Port")
    private String port;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("Username")
    private String username;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    @Query
    @NameInMap("__context")
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
         * The database engine. Valid values:
         * <p>
         * 
         * *   **MySQL**
         * *   **PostgreSQL**
         * *   **SQLServer**
         * *   **PolarDBMySQL**
         * *   **PolarDBPostgreSQL**
         * *   **Redis**
         * *   **MongoDB**
         * *   **PolarDBOracle**
         * *   **PolarDBX**
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * The reserved parameter.
         */
        public Builder flushAccount(String flushAccount) {
            this.putQueryParameter("FlushAccount", flushAccount);
            this.flushAccount = flushAccount;
            return this;
        }

        /**
         * The name of the instance.
         */
        public Builder instanceAlias(String instanceAlias) {
            this.putQueryParameter("InstanceAlias", instanceAlias);
            this.instanceAlias = instanceAlias;
            return this;
        }

        /**
         * The type of the instance on which the database is deployed. Valid values:
         * <p>
         * 
         * *   **RDS**: an Alibaba Cloud database instance.
         * *   **ECS**: an Elastic Compute Service (ECS) instance on which a self-managed database is deployed.
         * *   **IDC**: a self-managed database instance that is not deployed on Alibaba Cloud.
         * 
         * >  IDC refers to your data center.
         */
        public Builder instanceArea(String instanceArea) {
            this.putQueryParameter("InstanceArea", instanceArea);
            this.instanceArea = instanceArea;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The endpoint that is used to access the instance over internal networks.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * The network type of the instance.
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * The password for the username.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * The port that is used to access the instance over internal networks.
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * The ID of the region in which the instance resides.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * The username that is used to log on to the database.
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * The virtual private cloud (VPC) ID.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The reserved parameter.
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
