// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The results of the instance RAM role detachment, which include the names of the instance RAM roles and the IDs of the ECS instances from which you attempted to detach the instance RAM roles.</p>
         */
        public Builder detachInstanceRamRoleResults(DetachInstanceRamRoleResults detachInstanceRamRoleResults) {
            this.detachInstanceRamRoleResults = detachInstanceRamRoleResults;
            return this;
        }

        /**
         * <p>The number of ECS instances from which instance RAM roles failed to be detached.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder failCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }

        /**
         * <p>The name of the instance RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>RamRoleTest</p>
         */
        public Builder ramRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of ECS instances from which you attempted to detach instance RAM roles.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DetachInstanceRamRoleResponseBody build() {
            return new DetachInstanceRamRoleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DetachInstanceRamRoleResponseBody} extends {@link TeaModel}
     *
     * <p>DetachInstanceRamRoleResponseBody</p>
     */
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
             * <p>The ID of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp67acfmxazb4p****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the instance RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>RamRoleTest</p>
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
    /**
     * 
     * {@link DetachInstanceRamRoleResponseBody} extends {@link TeaModel}
     *
     * <p>DetachInstanceRamRoleResponseBody</p>
     */
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
    /**
     * 
     * {@link DetachInstanceRamRoleResponseBody} extends {@link TeaModel}
     *
     * <p>DetachInstanceRamRoleResponseBody</p>
     */
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
             * <p>Indicates whether the instance RAM role was detached. If 200 is returned, the instance RAM role was detached. If any other value is returned, the instance RAM role failed to be detached. For more information, see the &quot;Error codes&quot; section.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The ID of the ECS instance from which you attempted to detach the instance RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp67acfmxazb4p****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the instance RAM role and the ID of the ECS instance.</p>
             */
            public Builder instanceRamRoleSets(InstanceRamRoleSets instanceRamRoleSets) {
                this.instanceRamRoleSets = instanceRamRoleSets;
                return this;
            }

            /**
             * <p>Indicates whether the instance RAM role was detached. If success is returned, the instance RAM role was detached. If any other value is returned, the instance RAM role failed to be detached. For more information, see the &quot;Error codes&quot; section.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Indicates whether the instance RAM role was detached.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link DetachInstanceRamRoleResponseBody} extends {@link TeaModel}
     *
     * <p>DetachInstanceRamRoleResponseBody</p>
     */
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
