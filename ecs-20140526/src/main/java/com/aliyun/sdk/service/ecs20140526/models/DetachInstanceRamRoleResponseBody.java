// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachInstanceRamRoleResponseBody} extends {@link TeaModel}
 *
 * <p>DetachInstanceRamRoleResponseBody</p>
 */
public class DetachInstanceRamRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DetachInstanceRamRoleResults")
    private DetachInstanceRamRoleResults detachInstanceRamRoleResults;

    @com.aliyun.core.annotation.NameInMap("FailCount")
    private Integer failCount;

    @com.aliyun.core.annotation.NameInMap("RamRoleName")
    private String ramRoleName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DetachInstanceRamRoleResponseBody(Builder builder) {
        this.detachInstanceRamRoleResults = builder.detachInstanceRamRoleResults;
        this.failCount = builder.failCount;
        this.ramRoleName = builder.ramRoleName;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachInstanceRamRoleResponseBody create() {
        return builder().build();
    }

    /**
     * @return detachInstanceRamRoleResults
     */
    public DetachInstanceRamRoleResults getDetachInstanceRamRoleResults() {
        return this.detachInstanceRamRoleResults;
    }

    /**
     * @return failCount
     */
    public Integer getFailCount() {
        return this.failCount;
    }

    /**
     * @return ramRoleName
     */
    public String getRamRoleName() {
        return this.ramRoleName;
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
        private DetachInstanceRamRoleResults detachInstanceRamRoleResults; 
        private Integer failCount; 
        private String ramRoleName; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Details about the results of detaching instance RAM roles from the instances.
         */
        public Builder detachInstanceRamRoleResults(DetachInstanceRamRoleResults detachInstanceRamRoleResults) {
            this.detachInstanceRamRoleResults = detachInstanceRamRoleResults;
            return this;
        }

        /**
         * The number of instances from which instance RAM roles failed to be detached.
         */
        public Builder failCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }

        /**
         * The name of the instance RAM role.
         */
        public Builder ramRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of instances from which you attempted to detach instance RAM roles.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DetachInstanceRamRoleResponseBody build() {
            return new DetachInstanceRamRoleResponseBody(this);
        } 

    } 

    public static class InstanceRamRoleSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RamRoleName")
        private String ramRoleName;

        private InstanceRamRoleSet(Builder builder) {
            this.instanceId = builder.instanceId;
            this.ramRoleName = builder.ramRoleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceRamRoleSet create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ramRoleName
         */
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public static final class Builder {
            private String instanceId; 
            private String ramRoleName; 

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the instance RAM role.
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
                return this;
            }

            public InstanceRamRoleSet build() {
                return new InstanceRamRoleSet(this);
            } 

        } 

    }
    public static class InstanceRamRoleSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceRamRoleSet")
        private java.util.List < InstanceRamRoleSet> instanceRamRoleSet;

        private InstanceRamRoleSets(Builder builder) {
            this.instanceRamRoleSet = builder.instanceRamRoleSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceRamRoleSets create() {
            return builder().build();
        }

        /**
         * @return instanceRamRoleSet
         */
        public java.util.List < InstanceRamRoleSet> getInstanceRamRoleSet() {
            return this.instanceRamRoleSet;
        }

        public static final class Builder {
            private java.util.List < InstanceRamRoleSet> instanceRamRoleSet; 

            /**
             * InstanceRamRoleSet.
             */
            public Builder instanceRamRoleSet(java.util.List < InstanceRamRoleSet> instanceRamRoleSet) {
                this.instanceRamRoleSet = instanceRamRoleSet;
                return this;
            }

            public InstanceRamRoleSets build() {
                return new InstanceRamRoleSets(this);
            } 

        } 

    }
    public static class DetachInstanceRamRoleResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceRamRoleSets")
        private InstanceRamRoleSets instanceRamRoleSets;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private DetachInstanceRamRoleResult(Builder builder) {
            this.code = builder.code;
            this.instanceId = builder.instanceId;
            this.instanceRamRoleSets = builder.instanceRamRoleSets;
            this.message = builder.message;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetachInstanceRamRoleResult create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceRamRoleSets
         */
        public InstanceRamRoleSets getInstanceRamRoleSets() {
            return this.instanceRamRoleSets;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String code; 
            private String instanceId; 
            private InstanceRamRoleSets instanceRamRoleSets; 
            private String message; 
            private Boolean success; 

            /**
             * Indicates whether the instance RAM role was detached. If 200 is returned, the instance RAM role was detached. If any other value is returned, the instance RAM role failed to be detached. For more information, see the "Error codes" section.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The ID of the instance from which you attempted to detach the instance RAM role.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Details about the instance RAM role of the instance.
             */
            public Builder instanceRamRoleSets(InstanceRamRoleSets instanceRamRoleSets) {
                this.instanceRamRoleSets = instanceRamRoleSets;
                return this;
            }

            /**
             * Indicates whether the instance RAM role was detached. If success is returned, the instance RAM role was detached. If any other value is returned, the instance RAM role failed to be detached. For more information, see the "Error codes" section.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Indicates whether the instance RAM role was detached.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public DetachInstanceRamRoleResult build() {
                return new DetachInstanceRamRoleResult(this);
            } 

        } 

    }
    public static class DetachInstanceRamRoleResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DetachInstanceRamRoleResult")
        private java.util.List < DetachInstanceRamRoleResult> detachInstanceRamRoleResult;

        private DetachInstanceRamRoleResults(Builder builder) {
            this.detachInstanceRamRoleResult = builder.detachInstanceRamRoleResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetachInstanceRamRoleResults create() {
            return builder().build();
        }

        /**
         * @return detachInstanceRamRoleResult
         */
        public java.util.List < DetachInstanceRamRoleResult> getDetachInstanceRamRoleResult() {
            return this.detachInstanceRamRoleResult;
        }

        public static final class Builder {
            private java.util.List < DetachInstanceRamRoleResult> detachInstanceRamRoleResult; 

            /**
             * DetachInstanceRamRoleResult.
             */
            public Builder detachInstanceRamRoleResult(java.util.List < DetachInstanceRamRoleResult> detachInstanceRamRoleResult) {
                this.detachInstanceRamRoleResult = detachInstanceRamRoleResult;
                return this;
            }

            public DetachInstanceRamRoleResults build() {
                return new DetachInstanceRamRoleResults(this);
            } 

        } 

    }
}
