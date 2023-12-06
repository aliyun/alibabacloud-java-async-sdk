// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateEnvironmentTunnelRequest} extends {@link RequestModel}
 *
 * <p>ValidateEnvironmentTunnelRequest</p>
 */
public class ValidateEnvironmentTunnelRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    @Body
    @NameInMap("tunnelConfig")
    @Validation(required = true)
    private TunnelConfig tunnelConfig;

    @Body
    @NameInMap("tunnelType")
    @Validation(required = true)
    private String tunnelType;

    private ValidateEnvironmentTunnelRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.tunnelConfig = builder.tunnelConfig;
        this.tunnelType = builder.tunnelType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateEnvironmentTunnelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return tunnelConfig
     */
    public TunnelConfig getTunnelConfig() {
        return this.tunnelConfig;
    }

    /**
     * @return tunnelType
     */
    public String getTunnelType() {
        return this.tunnelType;
    }

    public static final class Builder extends Request.Builder<ValidateEnvironmentTunnelRequest, Builder> {
        private String uid; 
        private TunnelConfig tunnelConfig; 
        private String tunnelType; 

        private Builder() {
            super();
        } 

        private Builder(ValidateEnvironmentTunnelRequest request) {
            super(request);
            this.uid = request.uid;
            this.tunnelConfig = request.tunnelConfig;
            this.tunnelType = request.tunnelType;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * tunnelConfig.
         */
        public Builder tunnelConfig(TunnelConfig tunnelConfig) {
            this.putBodyParameter("tunnelConfig", tunnelConfig);
            this.tunnelConfig = tunnelConfig;
            return this;
        }

        /**
         * tunnelType.
         */
        public Builder tunnelType(String tunnelType) {
            this.putBodyParameter("tunnelType", tunnelType);
            this.tunnelType = tunnelType;
            return this;
        }

        @Override
        public ValidateEnvironmentTunnelRequest build() {
            return new ValidateEnvironmentTunnelRequest(this);
        } 

    } 

    public static class TunnelConfig extends TeaModel {
        @NameInMap("hostname")
        private String hostname;

        @NameInMap("password")
        private String password;

        @NameInMap("regionId")
        private String regionId;

        @NameInMap("sshPort")
        private Integer sshPort;

        @NameInMap("username")
        private String username;

        @NameInMap("vpcId")
        private String vpcId;

        private TunnelConfig(Builder builder) {
            this.hostname = builder.hostname;
            this.password = builder.password;
            this.regionId = builder.regionId;
            this.sshPort = builder.sshPort;
            this.username = builder.username;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TunnelConfig create() {
            return builder().build();
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return sshPort
         */
        public Integer getSshPort() {
            return this.sshPort;
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

        public static final class Builder {
            private String hostname; 
            private String password; 
            private String regionId; 
            private Integer sshPort; 
            private String username; 
            private String vpcId; 

            /**
             * hostname.
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * sshPort.
             */
            public Builder sshPort(Integer sshPort) {
                this.sshPort = sshPort;
                return this;
            }

            /**
             * username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            /**
             * vpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public TunnelConfig build() {
                return new TunnelConfig(this);
            } 

        } 

    }
}
