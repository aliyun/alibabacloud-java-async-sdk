// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PageImageRegistryResponseBody} extends {@link TeaModel}
 *
 * <p>PageImageRegistryResponseBody</p>
 */
public class PageImageRegistryResponseBody extends TeaModel {
    @NameInMap("List")
    private java.util.List < List> list;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    private PageImageRegistryResponseBody(Builder builder) {
        this.list = builder.list;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PageImageRegistryResponseBody create() {
        return builder().build();
    }

    /**
     * @return list
     */
    public java.util.List < List> getList() {
        return this.list;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < List> list; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * An array that consists of image repositories.
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PageImageRegistryResponseBody build() {
            return new PageImageRegistryResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
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

        @NameInMap("ImageCount")
        private Integer imageCount;

        @NameInMap("JenkinsEnv")
        private String jenkinsEnv;

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

        private List(Builder builder) {
            this.blackList = builder.blackList;
            this.domainName = builder.domainName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.imageCount = builder.imageCount;
            this.jenkinsEnv = builder.jenkinsEnv;
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

        public static List create() {
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
         * @return imageCount
         */
        public Integer getImageCount() {
            return this.imageCount;
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
            private Integer imageCount; 
            private String jenkinsEnv; 
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
             * The IP address blacklist.
             */
            public Builder blackList(String blackList) {
                this.blackList = blackList;
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
             * The time when the image repository was created. The time is in the yyyy-MM-dd HH:mm:ss format.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the image repository was updated. The time is in the yyyy-MM-dd HH:mm:ss format.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
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
             * The number of images that are stored in the image repository.
             */
            public Builder imageCount(Integer imageCount) {
                this.imageCount = imageCount;
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
             * *   **1**: Internet.
             * *   **2**: virtual private cloud (VPC).
             */
            public Builder netType(Integer netType) {
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
             * The number of days for which assets are retained.
             */
            public Builder persistenceDay(Integer persistenceDay) {
                this.persistenceDay = persistenceDay;
                return this;
            }

            /**
             * The type of the protocol. Valid values:
             * <p>
             * 
             * *   **1**: HTTP.
             * *   **2**: HTTPS.
             */
            public Builder protocolType(Integer protocolType) {
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
             * *   **acr**: Container Registry.
             * *   **harbor**: Harbor.
             * *   **quay**: Quay.
             * *   **CI/CD**: Jenkins.
             */
            public Builder registryType(String registryType) {
                this.registryType = registryType;
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
             * The VPC ID.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The IP address whitelist.
             */
            public Builder whiteList(String whiteList) {
                this.whiteList = whiteList;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
