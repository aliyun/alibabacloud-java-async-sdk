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
 * {@link ListCloudAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCloudAccountsResponseBody</p>
 */
public class ListCloudAccountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CloudAccounts")
    private java.util.List<CloudAccounts> cloudAccounts;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListCloudAccountsResponseBody(Builder builder) {
        this.cloudAccounts = builder.cloudAccounts;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudAccountsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudAccounts
     */
    public java.util.List<CloudAccounts> getCloudAccounts() {
        return this.cloudAccounts;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<CloudAccounts> cloudAccounts; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListCloudAccountsResponseBody model) {
            this.cloudAccounts = model.cloudAccounts;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * CloudAccounts.
         */
        public Builder cloudAccounts(java.util.List<CloudAccounts> cloudAccounts) {
            this.cloudAccounts = cloudAccounts;
            return this;
        }

        /**
         * <p>分页查询时每页行数。</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>本次调用返回的查询凭证（Token）值，用于下一次翻页查询。</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCloudAccountsResponseBody build() {
            return new ListCloudAccountsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCloudAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudAccountsResponseBody</p>
     */
    public static class ErrorReason extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        private ErrorReason(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorReason create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 

            private Builder() {
            } 

            private Builder(ErrorReason model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
            } 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            public ErrorReason build() {
                return new ErrorReason(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCloudAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudAccountsResponseBody</p>
     */
    public static class CloudAccountHealthCheckResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorReason")
        private ErrorReason errorReason;

        @com.aliyun.core.annotation.NameInMap("LastCheckTime")
        private Long lastCheckTime;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        private CloudAccountHealthCheckResult(Builder builder) {
            this.errorReason = builder.errorReason;
            this.lastCheckTime = builder.lastCheckTime;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudAccountHealthCheckResult create() {
            return builder().build();
        }

        /**
         * @return errorReason
         */
        public ErrorReason getErrorReason() {
            return this.errorReason;
        }

        /**
         * @return lastCheckTime
         */
        public Long getLastCheckTime() {
            return this.lastCheckTime;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        public static final class Builder {
            private ErrorReason errorReason; 
            private Long lastCheckTime; 
            private String result; 

            private Builder() {
            } 

            private Builder(CloudAccountHealthCheckResult model) {
                this.errorReason = model.errorReason;
                this.lastCheckTime = model.lastCheckTime;
                this.result = model.result;
            } 

            /**
             * ErrorReason.
             */
            public Builder errorReason(ErrorReason errorReason) {
                this.errorReason = errorReason;
                return this;
            }

            /**
             * LastCheckTime.
             */
            public Builder lastCheckTime(Long lastCheckTime) {
                this.lastCheckTime = lastCheckTime;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            public CloudAccountHealthCheckResult build() {
                return new CloudAccountHealthCheckResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCloudAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudAccountsResponseBody</p>
     */
    public static class CloudAccounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CloudAccountExternalId")
        private String cloudAccountExternalId;

        @com.aliyun.core.annotation.NameInMap("CloudAccountHealth")
        private String cloudAccountHealth;

        @com.aliyun.core.annotation.NameInMap("CloudAccountHealthCheckResult")
        private CloudAccountHealthCheckResult cloudAccountHealthCheckResult;

        @com.aliyun.core.annotation.NameInMap("CloudAccountId")
        private String cloudAccountId;

        @com.aliyun.core.annotation.NameInMap("CloudAccountName")
        private String cloudAccountName;

        @com.aliyun.core.annotation.NameInMap("CloudAccountProviderName")
        private String cloudAccountProviderName;

        @com.aliyun.core.annotation.NameInMap("CloudAccountVendorType")
        private String cloudAccountVendorType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private CloudAccounts(Builder builder) {
            this.cloudAccountExternalId = builder.cloudAccountExternalId;
            this.cloudAccountHealth = builder.cloudAccountHealth;
            this.cloudAccountHealthCheckResult = builder.cloudAccountHealthCheckResult;
            this.cloudAccountId = builder.cloudAccountId;
            this.cloudAccountName = builder.cloudAccountName;
            this.cloudAccountProviderName = builder.cloudAccountProviderName;
            this.cloudAccountVendorType = builder.cloudAccountVendorType;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudAccounts create() {
            return builder().build();
        }

        /**
         * @return cloudAccountExternalId
         */
        public String getCloudAccountExternalId() {
            return this.cloudAccountExternalId;
        }

        /**
         * @return cloudAccountHealth
         */
        public String getCloudAccountHealth() {
            return this.cloudAccountHealth;
        }

        /**
         * @return cloudAccountHealthCheckResult
         */
        public CloudAccountHealthCheckResult getCloudAccountHealthCheckResult() {
            return this.cloudAccountHealthCheckResult;
        }

        /**
         * @return cloudAccountId
         */
        public String getCloudAccountId() {
            return this.cloudAccountId;
        }

        /**
         * @return cloudAccountName
         */
        public String getCloudAccountName() {
            return this.cloudAccountName;
        }

        /**
         * @return cloudAccountProviderName
         */
        public String getCloudAccountProviderName() {
            return this.cloudAccountProviderName;
        }

        /**
         * @return cloudAccountVendorType
         */
        public String getCloudAccountVendorType() {
            return this.cloudAccountVendorType;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String cloudAccountExternalId; 
            private String cloudAccountHealth; 
            private CloudAccountHealthCheckResult cloudAccountHealthCheckResult; 
            private String cloudAccountId; 
            private String cloudAccountName; 
            private String cloudAccountProviderName; 
            private String cloudAccountVendorType; 
            private Long createTime; 
            private String description; 
            private String instanceId; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(CloudAccounts model) {
                this.cloudAccountExternalId = model.cloudAccountExternalId;
                this.cloudAccountHealth = model.cloudAccountHealth;
                this.cloudAccountHealthCheckResult = model.cloudAccountHealthCheckResult;
                this.cloudAccountId = model.cloudAccountId;
                this.cloudAccountName = model.cloudAccountName;
                this.cloudAccountProviderName = model.cloudAccountProviderName;
                this.cloudAccountVendorType = model.cloudAccountVendorType;
                this.createTime = model.createTime;
                this.description = model.description;
                this.instanceId = model.instanceId;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>云账号外部唯一ID</p>
             * 
             * <strong>example:</strong>
             * <p>1234567</p>
             */
            public Builder cloudAccountExternalId(String cloudAccountExternalId) {
                this.cloudAccountExternalId = cloudAccountExternalId;
                return this;
            }

            /**
             * <p>云账号可用性</p>
             * 
             * <strong>example:</strong>
             * <p>healthy</p>
             */
            public Builder cloudAccountHealth(String cloudAccountHealth) {
                this.cloudAccountHealth = cloudAccountHealth;
                return this;
            }

            /**
             * CloudAccountHealthCheckResult.
             */
            public Builder cloudAccountHealthCheckResult(CloudAccountHealthCheckResult cloudAccountHealthCheckResult) {
                this.cloudAccountHealthCheckResult = cloudAccountHealthCheckResult;
                return this;
            }

            /**
             * <p>云账号ID</p>
             * 
             * <strong>example:</strong>
             * <p>ca_01kmegjc11qa1txxxxx</p>
             */
            public Builder cloudAccountId(String cloudAccountId) {
                this.cloudAccountId = cloudAccountId;
                return this;
            }

            /**
             * <p>云账号名称</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_accout_xxxx</p>
             */
            public Builder cloudAccountName(String cloudAccountName) {
                this.cloudAccountName = cloudAccountName;
                return this;
            }

            /**
             * <p>云账号提供商名称</p>
             * 
             * <strong>example:</strong>
             * <p>idaas-eiam-oidc-provider</p>
             */
            public Builder cloudAccountProviderName(String cloudAccountProviderName) {
                this.cloudAccountProviderName = cloudAccountProviderName;
                return this;
            }

            /**
             * <p>云账号类别</p>
             * 
             * <strong>example:</strong>
             * <p>alibaba_cloud</p>
             */
            public Builder cloudAccountVendorType(String cloudAccountVendorType) {
                this.cloudAccountVendorType = cloudAccountVendorType;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>云账号描述</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_accout_description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>IDaaS EIAM 实例Id</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public CloudAccounts build() {
                return new CloudAccounts(this);
            } 

        } 

    }
}
