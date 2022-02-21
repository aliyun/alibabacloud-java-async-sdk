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

        private Builder(AddHDMInstanceRequest response) {
            super(response);
            this.engine = response.engine;
            this.flushAccount = response.flushAccount;
            this.instanceAlias = response.instanceAlias;
            this.instanceArea = response.instanceArea;
            this.instanceId = response.instanceId;
            this.ip = response.ip;
            this.networkType = response.networkType;
            this.password = response.password;
            this.port = response.port;
            this.region = response.region;
            this.username = response.username;
            this.vpcId = response.vpcId;
            this.context = response.context;
        } 

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * FlushAccount.
         */
        public Builder flushAccount(String flushAccount) {
            this.putQueryParameter("FlushAccount", flushAccount);
            this.flushAccount = flushAccount;
            return this;
        }

        /**
         * InstanceAlias.
         */
        public Builder instanceAlias(String instanceAlias) {
            this.putQueryParameter("InstanceAlias", instanceAlias);
            this.instanceAlias = instanceAlias;
            return this;
        }

        /**
         * InstanceArea.
         */
        public Builder instanceArea(String instanceArea) {
            this.putQueryParameter("InstanceArea", instanceArea);
            this.instanceArea = instanceArea;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Ip.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * NetworkType.
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * __context.
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
