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
 * {@link ListCloudAccountRolesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCloudAccountRolesResponseBody</p>
 */
public class ListCloudAccountRolesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CloudAccountRoles")
    private java.util.List<CloudAccountRoles> cloudAccountRoles;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListCloudAccountRolesResponseBody(Builder builder) {
        this.cloudAccountRoles = builder.cloudAccountRoles;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudAccountRolesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudAccountRoles
     */
    public java.util.List<CloudAccountRoles> getCloudAccountRoles() {
        return this.cloudAccountRoles;
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
        private java.util.List<CloudAccountRoles> cloudAccountRoles; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListCloudAccountRolesResponseBody model) {
            this.cloudAccountRoles = model.cloudAccountRoles;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * CloudAccountRoles.
         */
        public Builder cloudAccountRoles(java.util.List<CloudAccountRoles> cloudAccountRoles) {
            this.cloudAccountRoles = cloudAccountRoles;
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

        public ListCloudAccountRolesResponseBody build() {
            return new ListCloudAccountRolesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCloudAccountRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudAccountRolesResponseBody</p>
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
     * {@link ListCloudAccountRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudAccountRolesResponseBody</p>
     */
    public static class CloudAccountRoleHealthCheckResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorReason")
        private ErrorReason errorReason;

        @com.aliyun.core.annotation.NameInMap("LastCheckTime")
        private Long lastCheckTime;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        private CloudAccountRoleHealthCheckResult(Builder builder) {
            this.errorReason = builder.errorReason;
            this.lastCheckTime = builder.lastCheckTime;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudAccountRoleHealthCheckResult create() {
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

            private Builder(CloudAccountRoleHealthCheckResult model) {
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

            public CloudAccountRoleHealthCheckResult build() {
                return new CloudAccountRoleHealthCheckResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCloudAccountRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudAccountRolesResponseBody</p>
     */
    public static class CloudAccountRoles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CloudAccountId")
        private String cloudAccountId;

        @com.aliyun.core.annotation.NameInMap("CloudAccountRoleExternalId")
        private String cloudAccountRoleExternalId;

        @com.aliyun.core.annotation.NameInMap("CloudAccountRoleHealth")
        private String cloudAccountRoleHealth;

        @com.aliyun.core.annotation.NameInMap("CloudAccountRoleHealthCheckResult")
        private CloudAccountRoleHealthCheckResult cloudAccountRoleHealthCheckResult;

        @com.aliyun.core.annotation.NameInMap("CloudAccountRoleId")
        private String cloudAccountRoleId;

        @com.aliyun.core.annotation.NameInMap("CloudAccountRoleName")
        private String cloudAccountRoleName;

        @com.aliyun.core.annotation.NameInMap("CloudAccountRoleType")
        private String cloudAccountRoleType;

        @com.aliyun.core.annotation.NameInMap("CloudAccountRoleUsageType")
        private String cloudAccountRoleUsageType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private CloudAccountRoles(Builder builder) {
            this.cloudAccountId = builder.cloudAccountId;
            this.cloudAccountRoleExternalId = builder.cloudAccountRoleExternalId;
            this.cloudAccountRoleHealth = builder.cloudAccountRoleHealth;
            this.cloudAccountRoleHealthCheckResult = builder.cloudAccountRoleHealthCheckResult;
            this.cloudAccountRoleId = builder.cloudAccountRoleId;
            this.cloudAccountRoleName = builder.cloudAccountRoleName;
            this.cloudAccountRoleType = builder.cloudAccountRoleType;
            this.cloudAccountRoleUsageType = builder.cloudAccountRoleUsageType;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudAccountRoles create() {
            return builder().build();
        }

        /**
         * @return cloudAccountId
         */
        public String getCloudAccountId() {
            return this.cloudAccountId;
        }

        /**
         * @return cloudAccountRoleExternalId
         */
        public String getCloudAccountRoleExternalId() {
            return this.cloudAccountRoleExternalId;
        }

        /**
         * @return cloudAccountRoleHealth
         */
        public String getCloudAccountRoleHealth() {
            return this.cloudAccountRoleHealth;
        }

        /**
         * @return cloudAccountRoleHealthCheckResult
         */
        public CloudAccountRoleHealthCheckResult getCloudAccountRoleHealthCheckResult() {
            return this.cloudAccountRoleHealthCheckResult;
        }

        /**
         * @return cloudAccountRoleId
         */
        public String getCloudAccountRoleId() {
            return this.cloudAccountRoleId;
        }

        /**
         * @return cloudAccountRoleName
         */
        public String getCloudAccountRoleName() {
            return this.cloudAccountRoleName;
        }

        /**
         * @return cloudAccountRoleType
         */
        public String getCloudAccountRoleType() {
            return this.cloudAccountRoleType;
        }

        /**
         * @return cloudAccountRoleUsageType
         */
        public String getCloudAccountRoleUsageType() {
            return this.cloudAccountRoleUsageType;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String cloudAccountId; 
            private String cloudAccountRoleExternalId; 
            private String cloudAccountRoleHealth; 
            private CloudAccountRoleHealthCheckResult cloudAccountRoleHealthCheckResult; 
            private String cloudAccountRoleId; 
            private String cloudAccountRoleName; 
            private String cloudAccountRoleType; 
            private String cloudAccountRoleUsageType; 
            private Long createTime; 
            private String description; 
            private String instanceId; 
            private String status; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(CloudAccountRoles model) {
                this.cloudAccountId = model.cloudAccountId;
                this.cloudAccountRoleExternalId = model.cloudAccountRoleExternalId;
                this.cloudAccountRoleHealth = model.cloudAccountRoleHealth;
                this.cloudAccountRoleHealthCheckResult = model.cloudAccountRoleHealthCheckResult;
                this.cloudAccountRoleId = model.cloudAccountRoleId;
                this.cloudAccountRoleName = model.cloudAccountRoleName;
                this.cloudAccountRoleType = model.cloudAccountRoleType;
                this.cloudAccountRoleUsageType = model.cloudAccountRoleUsageType;
                this.createTime = model.createTime;
                this.description = model.description;
                this.instanceId = model.instanceId;
                this.status = model.status;
                this.updateTime = model.updateTime;
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
             * <p>云账号角色外部唯一ID</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::xxx:role/role-test</p>
             */
            public Builder cloudAccountRoleExternalId(String cloudAccountRoleExternalId) {
                this.cloudAccountRoleExternalId = cloudAccountRoleExternalId;
                return this;
            }

            /**
             * <p>云账号角色可用性</p>
             * 
             * <strong>example:</strong>
             * <p>healthy</p>
             */
            public Builder cloudAccountRoleHealth(String cloudAccountRoleHealth) {
                this.cloudAccountRoleHealth = cloudAccountRoleHealth;
                return this;
            }

            /**
             * CloudAccountRoleHealthCheckResult.
             */
            public Builder cloudAccountRoleHealthCheckResult(CloudAccountRoleHealthCheckResult cloudAccountRoleHealthCheckResult) {
                this.cloudAccountRoleHealthCheckResult = cloudAccountRoleHealthCheckResult;
                return this;
            }

            /**
             * <p>云账号角色ID</p>
             * 
             * <strong>example:</strong>
             * <p>carole_01kmek49aqxxxx</p>
             */
            public Builder cloudAccountRoleId(String cloudAccountRoleId) {
                this.cloudAccountRoleId = cloudAccountRoleId;
                return this;
            }

            /**
             * <p>云账号名称</p>
             * 
             * <strong>example:</strong>
             * <p>role-test</p>
             */
            public Builder cloudAccountRoleName(String cloudAccountRoleName) {
                this.cloudAccountRoleName = cloudAccountRoleName;
                return this;
            }

            /**
             * <p>云账号角色用途</p>
             * 
             * <strong>example:</strong>
             * <p>role</p>
             */
            public Builder cloudAccountRoleType(String cloudAccountRoleType) {
                this.cloudAccountRoleType = cloudAccountRoleType;
                return this;
            }

            /**
             * <p>云账号角色类别</p>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder cloudAccountRoleUsageType(String cloudAccountRoleUsageType) {
                this.cloudAccountRoleUsageType = cloudAccountRoleUsageType;
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
             * <p>cloud_account_role_description</p>
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
             * <p>云账号角色状态</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public CloudAccountRoles build() {
                return new CloudAccountRoles(this);
            } 

        } 

    }
}
