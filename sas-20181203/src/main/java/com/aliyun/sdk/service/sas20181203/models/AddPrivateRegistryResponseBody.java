// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddPrivateRegistryResponseBody} extends {@link TeaModel}
 *
 * <p>AddPrivateRegistryResponseBody</p>
 */
public class AddPrivateRegistryResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private AddPrivateRegistryResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPrivateRegistryResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The handling result.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddPrivateRegistryResponseBody build() {
            return new AddPrivateRegistryResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AliUid")
        private Long aliUid;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("Id")
        private Long id;

        @NameInMap("NetType")
        private Long netType;

        @NameInMap("Password")
        private String password;

        @NameInMap("ProtocolType")
        private Long protocolType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RegistryHostIp")
        private String registryHostIp;

        @NameInMap("RegistryType")
        private String registryType;

        @NameInMap("RegistryVersion")
        private String registryVersion;

        @NameInMap("Token")
        private String token;

        @NameInMap("TransPerHour")
        private Integer transPerHour;

        @NameInMap("UserName")
        private String userName;

        @NameInMap("VpcId")
        private String vpcId;

        private Data(Builder builder) {
            this.aliUid = builder.aliUid;
            this.domainName = builder.domainName;
            this.id = builder.id;
            this.netType = builder.netType;
            this.password = builder.password;
            this.protocolType = builder.protocolType;
            this.regionId = builder.regionId;
            this.registryHostIp = builder.registryHostIp;
            this.registryType = builder.registryType;
            this.registryVersion = builder.registryVersion;
            this.token = builder.token;
            this.transPerHour = builder.transPerHour;
            this.userName = builder.userName;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return netType
         */
        public Long getNetType() {
            return this.netType;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return protocolType
         */
        public Long getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return registryHostIp
         */
        public String getRegistryHostIp() {
            return this.registryHostIp;
        }

        /**
         * @return registryType
         */
        public String getRegistryType() {
            return this.registryType;
        }

        /**
         * @return registryVersion
         */
        public String getRegistryVersion() {
            return this.registryVersion;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        /**
         * @return transPerHour
         */
        public Integer getTransPerHour() {
            return this.transPerHour;
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

        public static final class Builder {
            private Long aliUid; 
            private String domainName; 
            private Long id; 
            private Long netType; 
            private String password; 
            private Long protocolType; 
            private String regionId; 
            private String registryHostIp; 
            private String registryType; 
            private String registryVersion; 
            private String token; 
            private Integer transPerHour; 
            private String userName; 
            private String vpcId; 

            /**
             * The ID of the user.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * The domain name of the image repository.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The ID of the image repository.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The network type. Valid values:
             * <p>
             * 
             * *   **1**: Internet
             * *   **2**: VPC
             */
            public Builder netType(Long netType) {
                this.netType = netType;
                return this;
            }

            /**
             * The password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * The type of the protocol. Valid values:
             * <p>
             * 
             * *   **1**: HTTP
             * *   **2**: HTTPS
             */
            public Builder protocolType(Long protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * The region ID of the image repository.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The IP address of the image repository.
             */
            public Builder registryHostIp(String registryHostIp) {
                this.registryHostIp = registryHostIp;
                return this;
            }

            /**
             * The type of the image repository. Valid values:
             * <p>
             * 
             * *   **harbor**
             * *   **quay**
             */
            public Builder registryType(String registryType) {
                this.registryType = registryType;
                return this;
            }

            /**
             * The version of the image repository. Default value: -. Valid values:
             * <p>
             * 
             * *   **-**: the default version
             * *   **V1**
             * *   **V2**
             */
            public Builder registryVersion(String registryVersion) {
                this.registryVersion = registryVersion;
                return this;
            }

            /**
             * The value of the token.
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * The number of scan tasks that are performed per hour.
             */
            public Builder transPerHour(Integer transPerHour) {
                this.transPerHour = transPerHour;
                return this;
            }

            /**
             * The username.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
