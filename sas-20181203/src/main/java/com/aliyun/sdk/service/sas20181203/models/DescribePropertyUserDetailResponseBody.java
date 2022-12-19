// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

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
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The details of asset fingerprints for the account.
         */
        public Builder propertys(java.util.List < Propertys> propertys) {
            this.propertys = propertys;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
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
             * The number of entries returned per page. Default value: **10**.
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
    public static class Propertys extends TeaModel {
        @NameInMap("AccountsExpirationDate")
        private String accountsExpirationDate;

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

        @NameInMap("IsCouldLogin")
        private Integer isCouldLogin;

        @NameInMap("IsPasswdExpired")
        private Integer isPasswdExpired;

        @NameInMap("IsPasswdLocked")
        private Integer isPasswdLocked;

        @NameInMap("IsRoot")
        private String isRoot;

        @NameInMap("IsSudoer")
        private Integer isSudoer;

        @NameInMap("IsUserExpired")
        private Integer isUserExpired;

        @NameInMap("LastLoginIp")
        private String lastLoginIp;

        @NameInMap("LastLoginTime")
        private String lastLoginTime;

        @NameInMap("LastLoginTimeDt")
        private Long lastLoginTimeDt;

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
            this.createTimestamp = builder.createTimestamp;
            this.groupNames = builder.groupNames;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.ip = builder.ip;
            this.isCouldLogin = builder.isCouldLogin;
            this.isPasswdExpired = builder.isPasswdExpired;
            this.isPasswdLocked = builder.isPasswdLocked;
            this.isRoot = builder.isRoot;
            this.isSudoer = builder.isSudoer;
            this.isUserExpired = builder.isUserExpired;
            this.lastLoginIp = builder.lastLoginIp;
            this.lastLoginTime = builder.lastLoginTime;
            this.lastLoginTimeDt = builder.lastLoginTimeDt;
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
         * @return isCouldLogin
         */
        public Integer getIsCouldLogin() {
            return this.isCouldLogin;
        }

        /**
         * @return isPasswdExpired
         */
        public Integer getIsPasswdExpired() {
            return this.isPasswdExpired;
        }

        /**
         * @return isPasswdLocked
         */
        public Integer getIsPasswdLocked() {
            return this.isPasswdLocked;
        }

        /**
         * @return isRoot
         */
        public String getIsRoot() {
            return this.isRoot;
        }

        /**
         * @return isSudoer
         */
        public Integer getIsSudoer() {
            return this.isSudoer;
        }

        /**
         * @return isUserExpired
         */
        public Integer getIsUserExpired() {
            return this.isUserExpired;
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
         * @return lastLoginTimeDt
         */
        public Long getLastLoginTimeDt() {
            return this.lastLoginTimeDt;
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
            private Long createTimestamp; 
            private java.util.List < String > groupNames; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String ip; 
            private Integer isCouldLogin; 
            private Integer isPasswdExpired; 
            private Integer isPasswdLocked; 
            private String isRoot; 
            private Integer isSudoer; 
            private Integer isUserExpired; 
            private String lastLoginIp; 
            private String lastLoginTime; 
            private Long lastLoginTimeDt; 
            private Long lastLoginTimestamp; 
            private String passwordExpirationDate; 
            private String status; 
            private String user; 
            private String uuid; 

            /**
             * The date on which the account expires.
             */
            public Builder accountsExpirationDate(String accountsExpirationDate) {
                this.accountsExpirationDate = accountsExpirationDate;
                return this;
            }

            /**
             * The timestamp at which the last asset fingerprint collection is performed. Unit: milliseconds.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * The details of the user groups to which the account belongs.
             */
            public Builder groupNames(java.util.List < String > groupNames) {
                this.groupNames = groupNames;
                return this;
            }

            /**
             * The ID of the server.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the server.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The public IP address of the server.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The private IP address of the server.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * The IP addresses of the server.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Indicates whether the account is an interactive logon account. Valid values:
             * <p>
             * 
             * *   **0**: no
             * *   **1**: yes
             */
            public Builder isCouldLogin(Integer isCouldLogin) {
                this.isCouldLogin = isCouldLogin;
                return this;
            }

            /**
             * Indicates whether the password expires. Valid values:
             * <p>
             * 
             * *   **0**: yes
             * *   **1**: no
             */
            public Builder isPasswdExpired(Integer isPasswdExpired) {
                this.isPasswdExpired = isPasswdExpired;
                return this;
            }

            /**
             * Indicates whether the password is locked. Valid values:
             * <p>
             * 
             * *   **0**: yes
             * *   **1**: no
             */
            public Builder isPasswdLocked(Integer isPasswdLocked) {
                this.isPasswdLocked = isPasswdLocked;
                return this;
            }

            /**
             * Indicates whether the account has root permissions. Valid values:
             * <p>
             * 
             * *   **0**: no
             * *   **1**: yes
             */
            public Builder isRoot(String isRoot) {
                this.isRoot = isRoot;
                return this;
            }

            /**
             * Indicates whether the account is a sudo account. Valid values:
             * <p>
             * 
             * *   **0**: no
             * *   **1**: yes
             */
            public Builder isSudoer(Integer isSudoer) {
                this.isSudoer = isSudoer;
                return this;
            }

            /**
             * Indicates whether the account expires. Valid values:
             * <p>
             * 
             * *   **0**: yes
             * *   **1**: no
             */
            public Builder isUserExpired(Integer isUserExpired) {
                this.isUserExpired = isUserExpired;
                return this;
            }

            /**
             * The source IP address of the last logon to the account.
             */
            public Builder lastLoginIp(String lastLoginIp) {
                this.lastLoginIp = lastLoginIp;
                return this;
            }

            /**
             * The last logon time of the account.
             */
            public Builder lastLoginTime(String lastLoginTime) {
                this.lastLoginTime = lastLoginTime;
                return this;
            }

            /**
             * The timestamp of the last logon to the account. Unit: milliseconds.
             */
            public Builder lastLoginTimeDt(Long lastLoginTimeDt) {
                this.lastLoginTimeDt = lastLoginTimeDt;
                return this;
            }

            /**
             * The timestamp of the last logon to the account. Unit: milliseconds.
             */
            public Builder lastLoginTimestamp(Long lastLoginTimestamp) {
                this.lastLoginTimestamp = lastLoginTimestamp;
                return this;
            }

            /**
             * The date on which the password of the account expires.
             */
            public Builder passwordExpirationDate(String passwordExpirationDate) {
                this.passwordExpirationDate = passwordExpirationDate;
                return this;
            }

            /**
             * This parameter is deprecated. You can ignore it.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The name of the account.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            /**
             * The UUID of the server.
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
