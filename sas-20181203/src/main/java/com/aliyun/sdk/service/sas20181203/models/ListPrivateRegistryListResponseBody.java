// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListPrivateRegistryListResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrivateRegistryListResponseBody</p>
 */
public class ListPrivateRegistryListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageRegistryInfos")
    private java.util.List<ImageRegistryInfos> imageRegistryInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<ImageRegistryInfos> getImageRegistryInfos() {
        return this.imageRegistryInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ImageRegistryInfos> imageRegistryInfos; 
        private String requestId; 

        /**
         * <p>An array that consists of the image repositories.</p>
         */
        public Builder imageRegistryInfos(java.util.List<ImageRegistryInfos> imageRegistryInfos) {
            this.imageRegistryInfos = imageRegistryInfos;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>BE120DAB-F4E7-4C53-ADC3-A97578AB****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPrivateRegistryListResponseBody build() {
            return new ListPrivateRegistryListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPrivateRegistryListResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrivateRegistryListResponseBody</p>
     */
    public static class ImageRegistryInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("JenkinsEnv")
        private String jenkinsEnv;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private Long netType;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("PersistenceDay")
        private Long persistenceDay;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private Long protocolType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RegistryHostIp")
        private String registryHostIp;

        @com.aliyun.core.annotation.NameInMap("RegistryName")
        private String registryName;

        @com.aliyun.core.annotation.NameInMap("RegistryType")
        private String registryType;

        @com.aliyun.core.annotation.NameInMap("RegistryVersion")
        private String registryVersion;

        @com.aliyun.core.annotation.NameInMap("Token")
        private String token;

        @com.aliyun.core.annotation.NameInMap("TransPerHour")
        private Integer transPerHour;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("WhiteList")
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
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>1766185894******</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The domain name of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The ID of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>66485</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The information about the Jenkins environment.</p>
             * 
             * <strong>example:</strong>
             * <p>JenkinsInfo</p>
             */
            public Builder jenkinsEnv(String jenkinsEnv) {
                this.jenkinsEnv = jenkinsEnv;
                return this;
            }

            /**
             * <p>The network type. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Internet</li>
             * <li><strong>2</strong>: VPC</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder netType(Long netType) {
                this.netType = netType;
                return this;
            }

            /**
             * <p>The password used to log on to the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>Harbor******</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The number of days during which assets can be retained.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder persistenceDay(Long persistenceDay) {
                this.persistenceDay = persistenceDay;
                return this;
            }

            /**
             * <p>The type of the protocol. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: HTTP</li>
             * <li><strong>2</strong>: HTTPS</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder protocolType(Long protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * <p>The region ID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The IP address of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>114.55.XXX.XXX</p>
             */
            public Builder registryHostIp(String registryHostIp) {
                this.registryHostIp = registryHostIp;
                return this;
            }

            /**
             * <p>The alias of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
             */
            public Builder registryName(String registryName) {
                this.registryName = registryName;
                return this;
            }

            /**
             * <p>The type of the image repository. Valid values:</p>
             * <ul>
             * <li><strong>acr</strong>: Container Registry</li>
             * <li><strong>harbor</strong>: Harbor</li>
             * <li><strong>quay</strong>: Quay</li>
             * <li><strong>CI/CD</strong>: Jenkins</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>harbor</p>
             */
            public Builder registryType(String registryType) {
                this.registryType = registryType;
                return this;
            }

            /**
             * <p>The version of the image repository. Valid values:</p>
             * <ul>
             * <li><strong>V1</strong>: V1.0</li>
             * <li><strong>V2</strong>: V2.0</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>V1</p>
             */
            public Builder registryVersion(String registryVersion) {
                this.registryVersion = registryVersion;
                return this;
            }

            /**
             * <p>The authentication token of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>0da12bce-cc36-4c48-b3e6-2215fc3a****</p>
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * <p>The number of images that can be scanned per hour.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder transPerHour(Integer transPerHour) {
                this.transPerHour = transPerHour;
                return this;
            }

            /**
             * <p>The username used to log on to the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>RegistryUser</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp12897gqrex01zn0****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The whitelist of IP addresses.</p>
             * 
             * <strong>example:</strong>
             * <p>100.104.XXX.XXX</p>
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
