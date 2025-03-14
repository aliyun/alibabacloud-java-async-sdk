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
 * {@link DescribePropertyUserDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePropertyUserDetailResponseBody</p>
 */
public class DescribePropertyUserDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("Propertys")
    private java.util.List<Propertys> propertys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Propertys> getPropertys() {
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
        private java.util.List<Propertys> propertys; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePropertyUserDetailResponseBody model) {
            this.pageInfo = model.pageInfo;
            this.propertys = model.propertys;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The details of asset fingerprints for the account.</p>
         */
        public Builder propertys(java.util.List<Propertys> propertys) {
            this.propertys = propertys;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>33A71BE3-2CC2-14CB-B460-33A1DD82953A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePropertyUserDetailResponseBody build() {
            return new DescribePropertyUserDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePropertyUserDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePropertyUserDetailResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page. Default value: <strong>10</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link DescribePropertyUserDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePropertyUserDetailResponseBody</p>
     */
    public static class Propertys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountsExpirationDate")
        private String accountsExpirationDate;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("GroupNames")
        private java.util.List<String> groupNames;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("IsCouldLogin")
        private Integer isCouldLogin;

        @com.aliyun.core.annotation.NameInMap("IsPasswdExpired")
        private Integer isPasswdExpired;

        @com.aliyun.core.annotation.NameInMap("IsPasswdLocked")
        private Integer isPasswdLocked;

        @com.aliyun.core.annotation.NameInMap("IsRoot")
        private String isRoot;

        @com.aliyun.core.annotation.NameInMap("IsSudoer")
        private Integer isSudoer;

        @com.aliyun.core.annotation.NameInMap("IsUserExpired")
        private Integer isUserExpired;

        @com.aliyun.core.annotation.NameInMap("LastLoginIp")
        private String lastLoginIp;

        @com.aliyun.core.annotation.NameInMap("LastLoginTime")
        private String lastLoginTime;

        @com.aliyun.core.annotation.NameInMap("LastLoginTimeDt")
        private Long lastLoginTimeDt;

        @com.aliyun.core.annotation.NameInMap("LastLoginTimestamp")
        private Long lastLoginTimestamp;

        @com.aliyun.core.annotation.NameInMap("PasswordExpirationDate")
        private String passwordExpirationDate;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        @com.aliyun.core.annotation.NameInMap("Uuid")
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
        public java.util.List<String> getGroupNames() {
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
            private java.util.List<String> groupNames; 
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

            private Builder() {
            } 

            private Builder(Propertys model) {
                this.accountsExpirationDate = model.accountsExpirationDate;
                this.createTimestamp = model.createTimestamp;
                this.groupNames = model.groupNames;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.internetIp = model.internetIp;
                this.intranetIp = model.intranetIp;
                this.ip = model.ip;
                this.isCouldLogin = model.isCouldLogin;
                this.isPasswdExpired = model.isPasswdExpired;
                this.isPasswdLocked = model.isPasswdLocked;
                this.isRoot = model.isRoot;
                this.isSudoer = model.isSudoer;
                this.isUserExpired = model.isUserExpired;
                this.lastLoginIp = model.lastLoginIp;
                this.lastLoginTime = model.lastLoginTime;
                this.lastLoginTimeDt = model.lastLoginTimeDt;
                this.lastLoginTimestamp = model.lastLoginTimestamp;
                this.passwordExpirationDate = model.passwordExpirationDate;
                this.status = model.status;
                this.user = model.user;
                this.uuid = model.uuid;
            } 

            /**
             * <p>The date on which the account expires.</p>
             * 
             * <strong>example:</strong>
             * <p>never</p>
             */
            public Builder accountsExpirationDate(String accountsExpirationDate) {
                this.accountsExpirationDate = accountsExpirationDate;
                return this;
            }

            /**
             * <p>The timestamp at which the last asset fingerprint collection is performed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649149566000</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The details of the user groups to which the account belongs.</p>
             */
            public Builder groupNames(java.util.List<String> groupNames) {
                this.groupNames = groupNames;
                return this;
            }

            /**
             * <p>The ID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>i-hp35tftuh52wbp1g****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>hc-host-****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>100.104.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The IP addresses of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>Indicates whether the account is an interactive logon account. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: no</li>
             * <li><strong>1</strong>: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isCouldLogin(Integer isCouldLogin) {
                this.isCouldLogin = isCouldLogin;
                return this;
            }

            /**
             * <p>Indicates whether the password expires. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: yes</li>
             * <li><strong>1</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isPasswdExpired(Integer isPasswdExpired) {
                this.isPasswdExpired = isPasswdExpired;
                return this;
            }

            /**
             * <p>Indicates whether the password is locked. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: yes</li>
             * <li><strong>1</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isPasswdLocked(Integer isPasswdLocked) {
                this.isPasswdLocked = isPasswdLocked;
                return this;
            }

            /**
             * <p>Indicates whether the account has root permissions. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: no</li>
             * <li><strong>1</strong>: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isRoot(String isRoot) {
                this.isRoot = isRoot;
                return this;
            }

            /**
             * <p>Indicates whether the account is a sudo account. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: no</li>
             * <li><strong>1</strong>: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isSudoer(Integer isSudoer) {
                this.isSudoer = isSudoer;
                return this;
            }

            /**
             * <p>Indicates whether the account expires. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: yes</li>
             * <li><strong>1</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isUserExpired(Integer isUserExpired) {
                this.isUserExpired = isUserExpired;
                return this;
            }

            /**
             * <p>The source IP address of the last logon to the account.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder lastLoginIp(String lastLoginIp) {
                this.lastLoginIp = lastLoginIp;
                return this;
            }

            /**
             * <p>The last logon time of the account.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-04 18:07:06</p>
             */
            public Builder lastLoginTime(String lastLoginTime) {
                this.lastLoginTime = lastLoginTime;
                return this;
            }

            /**
             * <p>The timestamp of the last logon to the account. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649066826000</p>
             */
            public Builder lastLoginTimeDt(Long lastLoginTimeDt) {
                this.lastLoginTimeDt = lastLoginTimeDt;
                return this;
            }

            /**
             * <p>The timestamp of the last logon to the account. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649066826000</p>
             */
            public Builder lastLoginTimestamp(Long lastLoginTimestamp) {
                this.lastLoginTimestamp = lastLoginTimestamp;
                return this;
            }

            /**
             * <p>The date on which the password of the account expires.</p>
             * 
             * <strong>example:</strong>
             * <p>never</p>
             */
            public Builder passwordExpirationDate(String passwordExpirationDate) {
                this.passwordExpirationDate = passwordExpirationDate;
                return this;
            }

            /**
             * <p>This parameter is deprecated. You can ignore it.</p>
             * 
             * <strong>example:</strong>
             * <p>**</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The name of the account.</p>
             * 
             * <strong>example:</strong>
             * <p>bin</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            /**
             * <p>The UUID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>162eb349-c2d9-4f8b-805c-75b43d4c****</p>
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
