// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link ListOperationPlansForRegionResponseBody} extends {@link TeaModel}
 *
 * <p>ListOperationPlansForRegionResponseBody</p>
 */
public class ListOperationPlansForRegionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("plans")
    private java.util.List<Plans> plans;

    private ListOperationPlansForRegionResponseBody(Builder builder) {
        this.plans = builder.plans;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationPlansForRegionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return plans
     */
    public java.util.List<Plans> getPlans() {
        return this.plans;
    }

    public static final class Builder {
        private java.util.List<Plans> plans; 

        private Builder() {
        } 

        private Builder(ListOperationPlansForRegionResponseBody model) {
            this.plans = model.plans;
        } 

        /**
         * <p>The list of execution plans.</p>
         */
        public Builder plans(java.util.List<Plans> plans) {
            this.plans = plans;
            return this;
        }

        public ListOperationPlansForRegionResponseBody build() {
            return new ListOperationPlansForRegionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOperationPlansForRegionResponseBody} extends {@link TeaModel}
     *
     * <p>ListOperationPlansForRegionResponseBody</p>
     */
    public static class StateReason extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        private StateReason(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StateReason create() {
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

        public static final class Builder {
            private String code; 
            private String message; 

            private Builder() {
            } 

            private Builder(StateReason model) {
                this.code = model.code;
                this.message = model.message;
            } 

            /**
             * <p>The code.</p>
             * 
             * <strong>example:</strong>
             * <p>CanceledByUser</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The message.</p>
             * 
             * <strong>example:</strong>
             * <p>plan has been canceled by user</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public StateReason build() {
                return new StateReason(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListOperationPlansForRegionResponseBody} extends {@link TeaModel}
     *
     * <p>ListOperationPlansForRegionResponseBody</p>
     */
    public static class Plans extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cluster_id")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("created")
        private String created;

        @com.aliyun.core.annotation.NameInMap("end_time")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("plan_id")
        private String planId;

        @com.aliyun.core.annotation.NameInMap("start_time")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("state_reason")
        private StateReason stateReason;

        @com.aliyun.core.annotation.NameInMap("target_id")
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("target_type")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("task_id")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Plans(Builder builder) {
            this.clusterId = builder.clusterId;
            this.created = builder.created;
            this.endTime = builder.endTime;
            this.planId = builder.planId;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.stateReason = builder.stateReason;
            this.targetId = builder.targetId;
            this.targetType = builder.targetType;
            this.taskId = builder.taskId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Plans create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return planId
         */
        public String getPlanId() {
            return this.planId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return stateReason
         */
        public StateReason getStateReason() {
            return this.stateReason;
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String clusterId; 
            private String created; 
            private String endTime; 
            private String planId; 
            private String startTime; 
            private String state; 
            private StateReason stateReason; 
            private String targetId; 
            private String targetType; 
            private String taskId; 
            private String type; 

            private Builder() {
            } 

            private Builder(Plans model) {
                this.clusterId = model.clusterId;
                this.created = model.created;
                this.endTime = model.endTime;
                this.planId = model.planId;
                this.startTime = model.startTime;
                this.state = model.state;
                this.stateReason = model.stateReason;
                this.targetId = model.targetId;
                this.targetType = model.targetType;
                this.taskId = model.taskId;
                this.type = model.type;
            } 

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>c29ced64b3dfe4f33b57ca0aa9f68****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The time when the execution plan was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-11-21T20:01:22+08:00</p>
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The expected end time of the execution. The time is in ISO 8601 format and includes time zone information.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-11-22T18:00:00+08:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The ID of the execution plan.</p>
             * 
             * <strong>example:</strong>
             * <p>P-655c9c127e0e6603ef00****</p>
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * <p>The expected start time of the execution. The time is in ISO 8601 format and includes time zone information.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-11-22T15:18:00+08:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The state of the execution plan.</p>
             * 
             * <strong>example:</strong>
             * <p>Scheduled</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The reason for the current state.</p>
             */
            public Builder stateReason(StateReason stateReason) {
                this.stateReason = stateReason;
                return this;
            }

            /**
             * <p>The ID of the execution target.</p>
             * 
             * <strong>example:</strong>
             * <p>c29ced64b3dfe4f33b57ca0aa9f68****</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>The type of the execution target.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The ID of the task generated by the execution plan.</p>
             * 
             * <strong>example:</strong>
             * <p>T-681ac448b23ced010600****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The type of the execution plan.</p>
             * 
             * <strong>example:</strong>
             * <p>CLUSTER_UPGRADE_MASTER</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Plans build() {
                return new Plans(this);
            } 

        } 

    }
}
