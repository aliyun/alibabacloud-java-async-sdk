// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribePropertyUserDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePropertyUserDetailResponseBody</p>
 */
public class DescribePropertyUserDetailResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("Propertys")
    private java.util.List < Propertys> propertys;

    @NameInMap("RequestId")
    private String requestId;


    private DescribePropertyUserDetailResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.propertys = builder.propertys;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyUserDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return propertys
     */
    public java.util.List < Propertys> getPropertys() {
        return this.propertys;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private java.util.List < Propertys> propertys; 
        private String requestId; 

        /**
         * <p>PageInfo.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>Propertys.</p>
         */
        public Builder propertys(java.util.List < Propertys> propertys) {
            this.propertys = propertys;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePropertyUserDetailResponseBody build() {
            return new DescribePropertyUserDetailResponseBody(this);
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
             * <p>Count.</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>CurrentPage.</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>PageSize.</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>TotalCount.</p>
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
    public static class Propertys extends TeaModel {
        @NameInMap("AccountsExpirationDate")
        private String accountsExpirationDate;

        @NameInMap("Create")
        private String create;

        @NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @NameInMap("GroupNames")
        private java.util.List < String > groupNames;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("IsRoot")
        private String isRoot;

        @NameInMap("LastLoginIp")
        private String lastLoginIp;

        @NameInMap("LastLoginTime")
        private String lastLoginTime;

        @NameInMap("LastLoginTimestamp")
        private Long lastLoginTimestamp;

        @NameInMap("PasswordExpirationDate")
        private String passwordExpirationDate;

        @NameInMap("Status")
        private String status;

        @NameInMap("User")
        private String user;

        @NameInMap("Uuid")
        private String uuid;


        private Propertys(Builder builder) {
            this.accountsExpirationDate = builder.accountsExpirationDate;
            this.create = builder.create;
            this.createTimestamp = builder.createTimestamp;
            this.groupNames = builder.groupNames;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.ip = builder.ip;
            this.isRoot = builder.isRoot;
            this.lastLoginIp = builder.lastLoginIp;
            this.lastLoginTime = builder.lastLoginTime;
            this.lastLoginTimestamp = builder.lastLoginTimestamp;
            this.passwordExpirationDate = builder.passwordExpirationDate;
            this.status = builder.status;
            this.user = builder.user;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Propertys create() {
            return builder().build();
        }

        /**
         * @return accountsExpirationDate
         */
        public String getAccountsExpirationDate() {
            return this.accountsExpirationDate;
        }

        /**
         * @return create
         */
        public String getCreate() {
            return this.create;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return groupNames
         */
        public java.util.List < String > getGroupNames() {
            return this.groupNames;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return isRoot
         */
        public String getIsRoot() {
            return this.isRoot;
        }

        /**
         * @return lastLoginIp
         */
        public String getLastLoginIp() {
            return this.lastLoginIp;
        }

        /**
         * @return lastLoginTime
         */
        public String getLastLoginTime() {
            return this.lastLoginTime;
        }

        /**
         * @return lastLoginTimestamp
         */
        public Long getLastLoginTimestamp() {
            return this.lastLoginTimestamp;
        }

        /**
         * @return passwordExpirationDate
         */
        public String getPasswordExpirationDate() {
            return this.passwordExpirationDate;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String accountsExpirationDate; 
            private String create; 
            private Long createTimestamp; 
            private java.util.List < String > groupNames; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String ip; 
            private String isRoot; 
            private String lastLoginIp; 
            private String lastLoginTime; 
            private Long lastLoginTimestamp; 
            private String passwordExpirationDate; 
            private String status; 
            private String user; 
            private String uuid; 

            /**
             * <p>AccountsExpirationDate.</p>
             */
            public Builder accountsExpirationDate(String accountsExpirationDate) {
                this.accountsExpirationDate = accountsExpirationDate;
                return this;
            }

            /**
             * <p>Create.</p>
             */
            public Builder create(String create) {
                this.create = create;
                return this;
            }

            /**
             * <p>CreateTimestamp.</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>GroupNames.</p>
             */
            public Builder groupNames(java.util.List < String > groupNames) {
                this.groupNames = groupNames;
                return this;
            }

            /**
             * <p>InstanceId.</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>InstanceName.</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>InternetIp.</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>IntranetIp.</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>Ip.</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>IsRoot.</p>
             */
            public Builder isRoot(String isRoot) {
                this.isRoot = isRoot;
                return this;
            }

            /**
             * <p>LastLoginIp.</p>
             */
            public Builder lastLoginIp(String lastLoginIp) {
                this.lastLoginIp = lastLoginIp;
                return this;
            }

            /**
             * <p>LastLoginTime.</p>
             */
            public Builder lastLoginTime(String lastLoginTime) {
                this.lastLoginTime = lastLoginTime;
                return this;
            }

            /**
             * <p>LastLoginTimestamp.</p>
             */
            public Builder lastLoginTimestamp(Long lastLoginTimestamp) {
                this.lastLoginTimestamp = lastLoginTimestamp;
                return this;
            }

            /**
             * <p>PasswordExpirationDate.</p>
             */
            public Builder passwordExpirationDate(String passwordExpirationDate) {
                this.passwordExpirationDate = passwordExpirationDate;
                return this;
            }

            /**
             * <p>Status.</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>User.</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            /**
             * <p>Uuid.</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Propertys build() {
                return new Propertys(this);
            } 

        } 

    }
}
