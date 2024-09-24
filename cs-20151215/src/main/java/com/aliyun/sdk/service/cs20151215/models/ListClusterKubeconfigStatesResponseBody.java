// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterKubeconfigStatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterKubeconfigStatesResponseBody</p>
 */
public class ListClusterKubeconfigStatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("page")
    private Page page;

    @com.aliyun.core.annotation.NameInMap("states")
    private java.util.List < States> states;

    private ListClusterKubeconfigStatesResponseBody(Builder builder) {
        this.page = builder.page;
        this.states = builder.states;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterKubeconfigStatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return page
     */
    public Page getPage() {
        return this.page;
    }

    /**
     * @return states
     */
    public java.util.List < States> getStates() {
        return this.states;
    }

    public static final class Builder {
        private Page page; 
        private java.util.List < States> states; 

        /**
         * The pagination information.
         */
        public Builder page(Page page) {
            this.page = page;
            return this;
        }

        /**
         * The status list of the kubeconfig files associated with the cluster.
         */
        public Builder states(java.util.List < States> states) {
            this.states = states;
            return this;
        }

        public ListClusterKubeconfigStatesResponseBody build() {
            return new ListClusterKubeconfigStatesResponseBody(this);
        } 

    } 

    public static class Page extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("page_number")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("page_size")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("total_count")
        private Integer totalCount;

        private Page(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Page create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
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
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The page number.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries per page.
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

            public Page build() {
                return new Page(this);
            } 

        } 

    }
    public static class States extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("account_display_name")
        private String accountDisplayName;

        @com.aliyun.core.annotation.NameInMap("account_id")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("account_name")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("account_state")
        private String accountState;

        @com.aliyun.core.annotation.NameInMap("account_type")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("cert_expire_time")
        private String certExpireTime;

        @com.aliyun.core.annotation.NameInMap("cert_state")
        private String certState;

        @com.aliyun.core.annotation.NameInMap("revokable")
        private Boolean revokable;

        private States(Builder builder) {
            this.accountDisplayName = builder.accountDisplayName;
            this.accountId = builder.accountId;
            this.accountName = builder.accountName;
            this.accountState = builder.accountState;
            this.accountType = builder.accountType;
            this.certExpireTime = builder.certExpireTime;
            this.certState = builder.certState;
            this.revokable = builder.revokable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static States create() {
            return builder().build();
        }

        /**
         * @return accountDisplayName
         */
        public String getAccountDisplayName() {
            return this.accountDisplayName;
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return accountState
         */
        public String getAccountState() {
            return this.accountState;
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return certExpireTime
         */
        public String getCertExpireTime() {
            return this.certExpireTime;
        }

        /**
         * @return certState
         */
        public String getCertState() {
            return this.certState;
        }

        /**
         * @return revokable
         */
        public Boolean getRevokable() {
            return this.revokable;
        }

        public static final class Builder {
            private String accountDisplayName; 
            private String accountId; 
            private String accountName; 
            private String accountState; 
            private String accountType; 
            private String certExpireTime; 
            private String certState; 
            private Boolean revokable; 

            /**
             * The displayed name or role name of the RAM user.
             */
            public Builder accountDisplayName(String accountDisplayName) {
                this.accountDisplayName = accountDisplayName;
                return this;
            }

            /**
             * The ID of an Alibaba Cloud account, RAM user, or RAM role.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The logon name or role name of the RAM user.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * The status of the account.
             * <p>
             * 
             * *   Active: The account is active.
             * *   InActive: The account is locked.
             * *   Deleted: The account is deleted.
             */
            public Builder accountState(String accountState) {
                this.accountState = accountState;
                return this;
            }

            /**
             * The type of the account.
             * <p>
             * 
             * *   RootAccount: Alibaba Cloud account.
             * *   RamUser: RAM user.
             * *   RamRole: RAM role.
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * The expiration time of the client certificate for the kubeconfig file.
             */
            public Builder certExpireTime(String certExpireTime) {
                this.certExpireTime = certExpireTime;
                return this;
            }

            /**
             * The status of the client certificate for the kubeconfig file.
             * <p>
             * 
             * *   Unexpired: The certificate is not expired.
             * *   Expired: The certificate is expired.
             * *   Unknown: The status of the certificate is unknown.
             */
            public Builder certState(String certState) {
                this.certState = certState;
                return this;
            }

            /**
             * Indicates whether the client certificate for the kubeconfig file can be revoked.
             */
            public Builder revokable(Boolean revokable) {
                this.revokable = revokable;
                return this;
            }

            public States build() {
                return new States(this);
            } 

        } 

    }
}
