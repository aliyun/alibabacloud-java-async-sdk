// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOperationPlansResponseBody} extends {@link TeaModel}
 *
 * <p>ListOperationPlansResponseBody</p>
 */
public class ListOperationPlansResponseBody extends TeaModel {
    @NameInMap("plans")
    private java.util.List < Plans> plans;

    private ListOperationPlansResponseBody(Builder builder) {
        this.plans = builder.plans;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationPlansResponseBody create() {
        return builder().build();
    }

    /**
     * @return plans
     */
    public java.util.List < Plans> getPlans() {
        return this.plans;
    }

    public static final class Builder {
        private java.util.List < Plans> plans; 

        /**
         * plans.
         */
        public Builder plans(java.util.List < Plans> plans) {
            this.plans = plans;
            return this;
        }

        public ListOperationPlansResponseBody build() {
            return new ListOperationPlansResponseBody(this);
        } 

    } 

    public static class Plans extends TeaModel {
        @NameInMap("cluster_id")
        private String clusterId;

        @NameInMap("created")
        private String created;

        @NameInMap("end_time")
        private String endTime;

        @NameInMap("plan_id")
        private String planId;

        @NameInMap("start_time")
        private String startTime;

        @NameInMap("state")
        private String state;

        @NameInMap("target_id")
        private String targetId;

        @NameInMap("target_type")
        private String targetType;

        @NameInMap("type")
        private String type;

        private Plans(Builder builder) {
            this.clusterId = builder.clusterId;
            this.created = builder.created;
            this.endTime = builder.endTime;
            this.planId = builder.planId;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.targetId = builder.targetId;
            this.targetType = builder.targetType;
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
            private String targetId; 
            private String targetType; 
            private String type; 

            /**
             * cluster_id.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * created.
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * end_time.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * plan_id.
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * start_time.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * target_id.
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * target_type.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * type.
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
