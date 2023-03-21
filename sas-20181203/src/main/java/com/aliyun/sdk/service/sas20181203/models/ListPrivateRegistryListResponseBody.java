// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrivateRegistryListResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrivateRegistryListResponseBody</p>
 */
public class ListPrivateRegistryListResponseBody extends TeaModel {
    @NameInMap("ImageRegistryInfos")
    private java.util.List < ImageRegistryInfos> imageRegistryInfos;

    @NameInMap("RequestId")
    private String requestId;

    private ListPrivateRegistryListResponseBody(Builder builder) {
        this.imageRegistryInfos = builder.imageRegistryInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrivateRegistryListResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageRegistryInfos
     */
    public java.util.List < ImageRegistryInfos> getImageRegistryInfos() {
        return this.imageRegistryInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ImageRegistryInfos> imageRegistryInfos; 
        private String requestId; 

        /**
         * An array that consists of the image repositories.
         */
        public Builder imageRegistryInfos(java.util.List < ImageRegistryInfos> imageRegistryInfos) {
            this.imageRegistryInfos = imageRegistryInfos;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPrivateRegistryListResponseBody build() {
            return new ListPrivateRegistryListResponseBody(this);
        } 

    } 

    public static class ImageRegistryInfos extends TeaModel {
        @NameInMap("AliUid")
        private Long aliUid;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("Id")
        private Long id;

        @NameInMap("JenkinsEnv")
        private String jenkinsEnv;

        @NameInMap("NetType")
        private Long netType;

        @NameInMap("Password")
        private String password;

        @NameInMap("PersistenceDay")
        private Long persistenceDay;

        @NameInMap("ProtocolType")
        private Long protocolType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RegistryHostIp")
        private String registryHostIp;

        @NameInMap("RegistryName")
        private String registryName;

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

        @NameInMap("WhiteList")
        private String whiteList;

        private ImageRegistryInfos(Builder builder) {
            this.aliUid = builder.aliUid;
            this.domainName = builder.domainName;
            this.id = builder.id;
            this.jenkinsEnv = builder.jenkinsEnv;
            this.netType = builder.netType;
            this.password = builder.password;
            this.persistenceDay = builder.persistenceDay;
            this.protocolType = builder.protocolType;
            this.regionId = builder.regionId;
            this.registryHostIp = builder.registryHostIp;
            this.registryName = builder.registryName;
            this.registryType = builder.registryType;
            this.registryVersion = builder.registryVersion;
            this.token = builder.token;
            this.transPerHour = builder.transPerHour;
            this.userName = builder.userName;
            this.vpcId = builder.vpcId;
            this.whiteList = builder.whiteList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageRegistryInfos create() {
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
         * @return jenkinsEnv
         */
        public String getJenkinsEnv() {
            return this.jenkinsEnv;
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
         * @return persistenceDay
         */
        public Long getPersistenceDay() {
            return this.persistenceDay;
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
         * @return registryName
         */
        public String getRegistryName() {
            return this.registryName;
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

        /**
         * @return whiteList
         */
        public String getWhiteList() {
            return this.whiteList;
        }

        public static final class Builder {
            private Long aliUid; 
            private String domainName; 
            private Long id; 
            private String jenkinsEnv; 
            private Long netType; 
            private String password; 
            private Long persistenceDay; 
            private Long protocolType; 
            private String regionId; 
            private String registryHostIp; 
            private String registryName; 
            private String registryType; 
            private String registryVersion; 
            private String token; 
            private Integer transPerHour; 
            private String userName; 
            private String vpcId; 
            private String whiteList; 

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
             * The information about the Jenkins environment.
             */
            public Builder jenkinsEnv(String jenkinsEnv) {
                this.jenkinsEnv = jenkinsEnv;
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
             * The password used to log on to the image repository.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * The number of days during which assets can be retained.
             */
            public Builder persistenceDay(Long persistenceDay) {
                this.persistenceDay = persistenceDay;
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
             * The region ID of the server.
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
             * The alias of the image repository.
             */
            public Builder registryName(String registryName) {
                this.registryName = registryName;
                return this;
            }

            /**
             * The type of the image repository. Valid values:
             * <p>
             * 
             * *   **acr**: Container Registry
             * *   **harbor**: Harbor
             * *   **quay**: Quay
             * *   **CI/CD**: Jenkins
             */
            public Builder registryType(String registryType) {
                this.registryType = registryType;
                return this;
            }

            /**
             * The version of the image repository. Valid values:
             * <p>
             * 
             * *   **V1**: V1.0
             * *   **V2**: V2.0
             */
            public Builder registryVersion(String registryVersion) {
                this.registryVersion = registryVersion;
                return this;
            }

            /**
             * The authentication token of the user.
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * The number of images that can be scanned per hour.
             */
            public Builder transPerHour(Integer transPerHour) {
                this.transPerHour = transPerHour;
                return this;
            }

            /**
             * The username used to log on to the image repository.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC).
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The whitelist of IP addresses.
             */
            public Builder whiteList(String whiteList) {
                this.whiteList = whiteList;
                return this;
            }

            public ImageRegistryInfos build() {
                return new ImageRegistryInfos(this);
            } 

        } 

    }
}
