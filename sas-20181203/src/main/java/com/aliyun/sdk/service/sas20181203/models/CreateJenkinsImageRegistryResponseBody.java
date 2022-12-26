// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateJenkinsImageRegistryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateJenkinsImageRegistryResponseBody</p>
 */
public class CreateJenkinsImageRegistryResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TimeCost")
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TimeCost.
         */
        public Builder timeCost(Long timeCost) {
            this.timeCost = timeCost;
            return this;
        }

        public CreateJenkinsImageRegistryResponseBody build() {
            return new CreateJenkinsImageRegistryResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BlackList")
        private String blackList;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("NetType")
        private Integer netType;

        @NameInMap("Password")
        private String password;

        @NameInMap("PersistenceDay")
        private Integer persistenceDay;

        @NameInMap("ProtocolType")
        private Integer protocolType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RegistryHostIp")
        private String registryHostIp;

        @NameInMap("RegistryName")
        private String registryName;

        @NameInMap("RegistryType")
        private String registryType;

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
             * 黑名单
             */
            public Builder blackList(String blackList) {
                this.blackList = blackList;
                return this;
            }

            /**
             * 域名
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * 创建日期
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * 更改日期
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * 唯一ID
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 网络类型 1：公网 2：vpc
             */
            public Builder netType(Integer netType) {
                this.netType = netType;
                return this;
            }

            /**
             * 密码
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * 资产保存天数
             */
            public Builder persistenceDay(Integer persistenceDay) {
                this.persistenceDay = persistenceDay;
                return this;
            }

            /**
             * 协议类型 1：http 2:https
             */
            public Builder protocolType(Integer protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * 镜像仓库所在的regionId
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * 主机Ip地址
             */
            public Builder registryHostIp(String registryHostIp) {
                this.registryHostIp = registryHostIp;
                return this;
            }

            /**
             * 镜像仓库别名
             */
            public Builder registryName(String registryName) {
                this.registryName = registryName;
                return this;
            }

            /**
             * 容器镜像服务类型 harbor，quory
             */
            public Builder registryType(String registryType) {
                this.registryType = registryType;
                return this;
            }

            /**
             * token 用户的唯一标识
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * 每小时扫描任务数
             */
            public Builder transPerHour(Integer transPerHour) {
                this.transPerHour = transPerHour;
                return this;
            }

            /**
             * 用户名
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * vpcId
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * 白名单
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
