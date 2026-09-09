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
         * <p>The list of cloud roles.</p>
         */
        public Builder cloudAccountRoles(java.util.List<CloudAccountRoles> cloudAccountRoles) {
            this.cloudAccountRoles = cloudAccountRoles;
            return this;
        }

        /**
         * <p>The number of rows per page in the paging query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token returned for this request, which is used for the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>AuthenticationFail.NoPermission</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>There is no permission.</p>
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
             * <p>The error reason. This field is returned when the health check status is unhealthy.</p>
             */
            public Builder errorReason(ErrorReason errorReason) {
                this.errorReason = errorReason;
                return this;
            }

            /**
             * <p>The last check time, in UNIX timestamp format, measured in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649830226000</p>
             */
            public Builder lastCheckTime(Long lastCheckTime) {
                this.lastCheckTime = lastCheckTime;
                return this;
            }

            /**
             * <p>The cloud role health check result. Valid values:</p>
             * <ul>
             * <li>success: succeeded.</li>
             * <li>failed: failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
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

        @com.aliyun.core.annotation.NameInMap("CloudAccountRoleCreationType")
        private String cloudAccountRoleCreationType;

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
            this.cloudAccountRoleCreationType = builder.cloudAccountRoleCreationType;
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
         * @return cloudAccountRoleCreationType
         */
        public String getCloudAccountRoleCreationType() {
            return this.cloudAccountRoleCreationType;
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
            private String cloudAccountRoleCreationType; 
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
                this.cloudAccountRoleCreationType = model.cloudAccountRoleCreationType;
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
             * <p>The cloud account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ca_01kmegjc11qa1txxxxx</p>
             */
            public Builder cloudAccountId(String cloudAccountId) {
                this.cloudAccountId = cloudAccountId;
                return this;
            }

            /**
             * <p>The creation source. Valid values:</p>
             * <ul>
             * <li>system_init: created by the system. The role is automatically generated by the platform as a preset and typically cannot be modified or deleted.</li>
             * <li>user_custom: created by the user. The role is manually created by the user and can be edited and managed throughout its lifecycle.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>user_custom</p>
             */
            public Builder cloudAccountRoleCreationType(String cloudAccountRoleCreationType) {
                this.cloudAccountRoleCreationType = cloudAccountRoleCreationType;
                return this;
            }

            /**
             * <p>The cloud role identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::xxx:role/role-test</p>
             */
            public Builder cloudAccountRoleExternalId(String cloudAccountRoleExternalId) {
                this.cloudAccountRoleExternalId = cloudAccountRoleExternalId;
                return this;
            }

            /**
             * <p>The cloud role health status. Valid values:</p>
             * <ul>
             * <li>healthy: healthy.</li>
             * <li>unhealthy: unhealthy.</li>
             * <li>unknown: unknown.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>healthy</p>
             */
            public Builder cloudAccountRoleHealth(String cloudAccountRoleHealth) {
                this.cloudAccountRoleHealth = cloudAccountRoleHealth;
                return this;
            }

            /**
             * <p>The cloud role health check result.</p>
             */
            public Builder cloudAccountRoleHealthCheckResult(CloudAccountRoleHealthCheckResult cloudAccountRoleHealthCheckResult) {
                this.cloudAccountRoleHealthCheckResult = cloudAccountRoleHealthCheckResult;
                return this;
            }

            /**
             * <p>The cloud role ID.</p>
             * 
             * <strong>example:</strong>
             * <p>carole_01kmek49aqxxxx</p>
             */
            public Builder cloudAccountRoleId(String cloudAccountRoleId) {
                this.cloudAccountRoleId = cloudAccountRoleId;
                return this;
            }

            /**
             * <p>The cloud role name.</p>
             * 
             * <strong>example:</strong>
             * <p>role-test</p>
             */
            public Builder cloudAccountRoleName(String cloudAccountRoleName) {
                this.cloudAccountRoleName = cloudAccountRoleName;
                return this;
            }

            /**
             * <p>The cloud role type. The specific format depends on the cloud account type. Valid values:</p>
             * <ul>
             * <li>role: applicable to Alibaba Cloud accounts.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>role</p>
             */
            public Builder cloudAccountRoleType(String cloudAccountRoleType) {
                this.cloudAccountRoleType = cloudAccountRoleType;
                return this;
            }

            /**
             * <p>The cloud role usage type. Valid values:</p>
             * <ul>
             * <li>system: system.</li>
             * <li>user: user.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder cloudAccountRoleUsageType(String cloudAccountRoleUsageType) {
                this.cloudAccountRoleUsageType = cloudAccountRoleUsageType;
                return this;
            }

            /**
             * <p>The creation time, in UNIX timestamp format, measured in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1719320115000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The cloud role description.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_account_role_description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The cloud role status. Valid values:</p>
             * <ul>
             * <li>enabled: enabled.</li>
             * <li>disable: disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The last update time, in UNIX timestamp format, measured in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1719320117000</p>
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
