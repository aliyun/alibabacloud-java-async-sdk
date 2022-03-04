// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachInstanceRamRoleResponseBody} extends {@link TeaModel}
 *
 * <p>DetachInstanceRamRoleResponseBody</p>
 */
public class DetachInstanceRamRoleResponseBody extends TeaModel {
    @NameInMap("RamRoleName")
    private String ramRoleName;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("FailCount")
    private Integer failCount;

    @NameInMap("DetachInstanceRamRoleResults")
    private DetachInstanceRamRoleResults detachInstanceRamRoleResults;

    private DetachInstanceRamRoleResponseBody(Builder builder) {
        this.ramRoleName = builder.ramRoleName;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.failCount = builder.failCount;
        this.detachInstanceRamRoleResults = builder.detachInstanceRamRoleResults;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachInstanceRamRoleResponseBody create() {
        return builder().build();
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

    /**
     * @return failCount
     */
    public Integer getFailCount() {
        return this.failCount;
    }

    /**
     * @return detachInstanceRamRoleResults
     */
    public DetachInstanceRamRoleResults getDetachInstanceRamRoleResults() {
        return this.detachInstanceRamRoleResults;
    }

    public static final class Builder {
        private String ramRoleName; 
        private String requestId; 
        private Integer totalCount; 
        private Integer failCount; 
        private DetachInstanceRamRoleResults detachInstanceRamRoleResults; 

        /**
         * The name of the RAM role.
         */
        public Builder ramRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of instance RAM roles that are reclaimed.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The number of instance RAM roles that failed to be detached.
         */
        public Builder failCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }

        /**
         * The information set of the instance RAM role type (DetachInstanceRamRoleResult).
         */
        public Builder detachInstanceRamRoleResults(DetachInstanceRamRoleResults detachInstanceRamRoleResults) {
            this.detachInstanceRamRoleResults = detachInstanceRamRoleResults;
            return this;
        }

        public DetachInstanceRamRoleResponseBody build() {
            return new DetachInstanceRamRoleResponseBody(this);
        } 

    } 

    public static class InstanceRamRoleSet extends TeaModel {
        @NameInMap("RamRoleName")
        private String ramRoleName;

        @NameInMap("InstanceId")
        private String instanceId;

        private InstanceRamRoleSet(Builder builder) {
            this.ramRoleName = builder.ramRoleName;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceRamRoleSet create() {
            return builder().build();
        }

        /**
         * @return ramRoleName
         */
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String ramRoleName; 
            private String instanceId; 

            /**
             * The name of the RAM role.
             */
            public Builder ramRoleName(String ramRoleName) {
                this.ramRoleName = ramRoleName;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public InstanceRamRoleSet build() {
                return new InstanceRamRoleSet(this);
            } 

        } 

    }
    public static class InstanceRamRoleSets extends TeaModel {
        @NameInMap("InstanceRamRoleSet")
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
        @NameInMap("Code")
        private String code;

        @NameInMap("Message")
        private String message;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Success")
        private Boolean success;

        @NameInMap("InstanceRamRoleSets")
        private InstanceRamRoleSets instanceRamRoleSets;

        private DetachInstanceRamRoleResult(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.instanceId = builder.instanceId;
            this.success = builder.success;
            this.instanceRamRoleSets = builder.instanceRamRoleSets;
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
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return instanceRamRoleSets
         */
        public InstanceRamRoleSets getInstanceRamRoleSets() {
            return this.instanceRamRoleSets;
        }

        public static final class Builder {
            private String code; 
            private String message; 
            private String instanceId; 
            private Boolean success; 
            private InstanceRamRoleSets instanceRamRoleSets; 

            /**
             * Determines whether the instance RAM role is revoked. A value of 200 indicates that the request is successfully withdrawn. A value other than 200 indicates that the request failed. For more information about the cause of the failure, see error codes.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Determines whether the instance RAM role is revoked. If the return value is Success, it indicates that the Reclaim is successful. If the return value is other, it indicates that the reclaim fails. For more information, see error codes.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The ECS instance to which the instance RAM role is to be revoked.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Indicates whether the specified instance role has been reclaimed.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * The set of RAM roles for the instance.
             */
            public Builder instanceRamRoleSets(InstanceRamRoleSets instanceRamRoleSets) {
                this.instanceRamRoleSets = instanceRamRoleSets;
                return this;
            }

            public DetachInstanceRamRoleResult build() {
                return new DetachInstanceRamRoleResult(this);
            } 

        } 

    }
    public static class DetachInstanceRamRoleResults extends TeaModel {
        @NameInMap("DetachInstanceRamRoleResult")
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
