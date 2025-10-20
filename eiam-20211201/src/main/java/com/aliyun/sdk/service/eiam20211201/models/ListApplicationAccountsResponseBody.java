// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListApplicationAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationAccountsResponseBody</p>
 */
public class ListApplicationAccountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationAccounts")
    private java.util.List<ApplicationAccounts> applicationAccounts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListApplicationAccountsResponseBody(Builder builder) {
        this.applicationAccounts = builder.applicationAccounts;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationAccountsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationAccounts
     */
    public java.util.List<ApplicationAccounts> getApplicationAccounts() {
        return this.applicationAccounts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<ApplicationAccounts> applicationAccounts; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListApplicationAccountsResponseBody model) {
            this.applicationAccounts = model.applicationAccounts;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * ApplicationAccounts.
         */
        public Builder applicationAccounts(java.util.List<ApplicationAccounts> applicationAccounts) {
            this.applicationAccounts = applicationAccounts;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListApplicationAccountsResponseBody build() {
            return new ListApplicationAccountsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApplicationAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationAccountsResponseBody</p>
     */
    public static class ApplicationAccounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationAccountId")
        private String applicationAccountId;

        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("ApplicationUsername")
        private String applicationUsername;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private ApplicationAccounts(Builder builder) {
            this.applicationAccountId = builder.applicationAccountId;
            this.applicationId = builder.applicationId;
            this.applicationUsername = builder.applicationUsername;
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationAccounts create() {
            return builder().build();
        }

        /**
         * @return applicationAccountId
         */
        public String getApplicationAccountId() {
            return this.applicationAccountId;
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return applicationUsername
         */
        public String getApplicationUsername() {
            return this.applicationUsername;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String applicationAccountId; 
            private String applicationId; 
            private String applicationUsername; 
            private Long createTime; 
            private String instanceId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(ApplicationAccounts model) {
                this.applicationAccountId = model.applicationAccountId;
                this.applicationId = model.applicationId;
                this.applicationUsername = model.applicationUsername;
                this.createTime = model.createTime;
                this.instanceId = model.instanceId;
                this.userId = model.userId;
            } 

            /**
             * <p>IDaaS EIAM 应用账号Id</p>
             * 
             * <strong>example:</strong>
             * <p>aac_m66smhbq5krept7nza54hxxxx</p>
             */
            public Builder applicationAccountId(String applicationAccountId) {
                this.applicationAccountId = applicationAccountId;
                return this;
            }

            /**
             * <p>IDaaS EIAM 应用Id</p>
             * 
             * <strong>example:</strong>
             * <p>app_m43o4h5adeo5klvbbxgxxxxx</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>IDaaS EIAM 应用账号名称</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder applicationUsername(String applicationUsername) {
                this.applicationUsername = applicationUsername;
                return this;
            }

            /**
             * <p>创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>1737510353000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>IDaaS EIAM 实例Id</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_eznwtkkaucljizh6qqu7ptxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>IDaaS EIAM 用户Id</p>
             * 
             * <strong>example:</strong>
             * <p>user_tkmboufpnvpbitdpzrlngxzxxxx</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ApplicationAccounts build() {
                return new ApplicationAccounts(this);
            } 

        } 

    }
}
