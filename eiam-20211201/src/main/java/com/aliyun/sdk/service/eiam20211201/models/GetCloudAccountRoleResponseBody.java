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
 * {@link GetCloudAccountRoleResponseBody} extends {@link TeaModel}
 *
 * <p>GetCloudAccountRoleResponseBody</p>
 */
public class GetCloudAccountRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CloudAccountRole")
    private CloudAccountRole cloudAccountRole;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCloudAccountRoleResponseBody(Builder builder) {
        this.cloudAccountRole = builder.cloudAccountRole;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCloudAccountRoleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudAccountRole
     */
    public CloudAccountRole getCloudAccountRole() {
        return this.cloudAccountRole;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CloudAccountRole cloudAccountRole; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCloudAccountRoleResponseBody model) {
            this.cloudAccountRole = model.cloudAccountRole;
            this.requestId = model.requestId;
        } 

        /**
         * CloudAccountRole.
         */
        public Builder cloudAccountRole(CloudAccountRole cloudAccountRole) {
            this.cloudAccountRole = cloudAccountRole;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCloudAccountRoleResponseBody build() {
            return new GetCloudAccountRoleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCloudAccountRoleResponseBody} extends {@link TeaModel}
     *
     * <p>GetCloudAccountRoleResponseBody</p>
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
             * <p>错误码</p>
             * 
             * <strong>example:</strong>
             * <p>AuthenticationFail.NoPermission</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>错误信息</p>
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
     * {@link GetCloudAccountRoleResponseBody} extends {@link TeaModel}
     *
     * <p>GetCloudAccountRoleResponseBody</p>
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
             * <p>错误原因</p>
             */
            public Builder errorReason(ErrorReason errorReason) {
                this.errorReason = errorReason;
                return this;
            }

            /**
             * <p>检测时间</p>
             * 
             * <strong>example:</strong>
             * <p>1649830226000</p>
             */
            public Builder lastCheckTime(Long lastCheckTime) {
                this.lastCheckTime = lastCheckTime;
                return this;
            }

            /**
             * <p>结果</p>
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
     * {@link GetCloudAccountRoleResponseBody} extends {@link TeaModel}
     *
     * <p>GetCloudAccountRoleResponseBody</p>
     */
    public static class CloudAccountRole extends TeaModel {
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

        private CloudAccountRole(Builder builder) {
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

        public static CloudAccountRole create() {
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

            private Builder(CloudAccountRole model) {
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
             * <p>云账号角色验证结果</p>
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
             * <p>云账号角色类型</p>
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
             * Description.
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

            public CloudAccountRole build() {
                return new CloudAccountRole(this);
            } 

        } 

    }
}
