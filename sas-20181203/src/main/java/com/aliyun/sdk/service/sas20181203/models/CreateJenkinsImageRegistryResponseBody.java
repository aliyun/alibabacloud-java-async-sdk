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
 * {@link CreateJenkinsImageRegistryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateJenkinsImageRegistryResponseBody</p>
 */
public class CreateJenkinsImageRegistryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TimeCost")
    private Long timeCost;

    private CreateJenkinsImageRegistryResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.timeCost = builder.timeCost;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateJenkinsImageRegistryResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return timeCost
     */
    public Long getTimeCost() {
        return this.timeCost;
    }

    public static final class Builder {
        private Data data; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Long timeCost; 

        /**
         * <p>The result of creating the image repository.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1AF1E723-53F1-55BF-A4B2-15CB7A32****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The time consumed. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder timeCost(Long timeCost) {
            this.timeCost = timeCost;
            return this;
        }

        public CreateJenkinsImageRegistryResponseBody build() {
            return new CreateJenkinsImageRegistryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateJenkinsImageRegistryResponseBody} extends {@link TeaModel}
     *
     * <p>CreateJenkinsImageRegistryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlackList")
        private String blackList;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private Integer netType;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("PersistenceDay")
        private Integer persistenceDay;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private Integer protocolType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RegistryHostIp")
        private String registryHostIp;

        @com.aliyun.core.annotation.NameInMap("RegistryName")
        private String registryName;

        @com.aliyun.core.annotation.NameInMap("RegistryType")
        private String registryType;

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

        private Data(Builder builder) {
            this.blackList = builder.blackList;
            this.domainName = builder.domainName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.netType = builder.netType;
            this.password = builder.password;
            this.persistenceDay = builder.persistenceDay;
            this.protocolType = builder.protocolType;
            this.regionId = builder.regionId;
            this.registryHostIp = builder.registryHostIp;
            this.registryName = builder.registryName;
            this.registryType = builder.registryType;
            this.token = builder.token;
            this.transPerHour = builder.transPerHour;
            this.userName = builder.userName;
            this.vpcId = builder.vpcId;
            this.whiteList = builder.whiteList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return blackList
         */
        public String getBlackList() {
            return this.blackList;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
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
        public Integer getNetType() {
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
        public Integer getPersistenceDay() {
            return this.persistenceDay;
        }

        /**
         * @return protocolType
         */
        public Integer getProtocolType() {
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
            private String blackList; 
            private String domainName; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private Integer netType; 
            private String password; 
            private Integer persistenceDay; 
            private Integer protocolType; 
            private String regionId; 
            private String registryHostIp; 
            private String registryName; 
            private String registryType; 
            private String token; 
            private Integer transPerHour; 
            private String userName; 
            private String vpcId; 
            private String whiteList; 

            /**
             * <p>The blacklist.</p>
             * 
             * <strong>example:</strong>
             * <p>61.9.XXX.XXX</p>
             */
            public Builder blackList(String blackList) {
                this.blackList = blackList;
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
             * <p>The creation time. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-16 18:17:16</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The update time. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-21 10:40:01</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>443496</p>
             */
            public Builder id(Long id) {
                this.id = id;
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
            public Builder netType(Integer netType) {
                this.netType = netType;
                return this;
            }

            /**
             * <p>The password.</p>
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
             * <p>30</p>
             */
            public Builder persistenceDay(Integer persistenceDay) {
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
            public Builder protocolType(Integer protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * <p>The region ID of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The IP address of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>1.13.XXX.XXX</p>
             */
            public Builder registryHostIp(String registryHostIp) {
                this.registryHostIp = registryHostIp;
                return this;
            }

            /**
             * <p>The alias of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>fanyi</p>
             */
            public Builder registryName(String registryName) {
                this.registryName = registryName;
                return this;
            }

            /**
             * <p>The type of the image repository. Valid values:</p>
             * <ul>
             * <li><strong>CI/CD</strong>: Jenkins</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CI/CD</p>
             */
            public Builder registryType(String registryType) {
                this.registryType = registryType;
                return this;
            }

            /**
             * <p>The authentication token of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>3c3c602c-fa1f-4bc0-992f-b4b2cac7****</p>
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
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>RegistryUser</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2vchkxmf2j9yjt3x2****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XXX.XXX</p>
             */
            public Builder whiteList(String whiteList) {
                this.whiteList = whiteList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
