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
 * {@link ListOperationPlansResponseBody} extends {@link TeaModel}
 *
 * <p>ListOperationPlansResponseBody</p>
 */
public class ListOperationPlansResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("plans")
    private java.util.List<Plans> plans;

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
    public java.util.List<Plans> getPlans() {
        return this.plans;
    }

    public static final class Builder {
        private java.util.List<Plans> plans; 

        /**
         * <p>The operation plans.</p>
         */
        public Builder plans(java.util.List<Plans> plans) {
            this.plans = plans;
            return this;
        }

        public ListOperationPlansResponseBody build() {
            return new ListOperationPlansResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOperationPlansResponseBody} extends {@link TeaModel}
     *
     * <p>ListOperationPlansResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("target_id")
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("target_type")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("type")
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
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c29ced64b3dfe4f33b57ca0aa9f68****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The time when the operation plan was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-11-21T20:01:22+08:00</p>
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The expected end time of the plan.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-11-22T18:00:00+08:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The operation plan ID.</p>
             * 
             * <strong>example:</strong>
             * <p>P-655c9c127e0e6603ef00****</p>
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * <p>The expected start time of the plan.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-11-22T15:18:00+08:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The plan status. Valid values:</p>
             * <ul>
             * <li>scheduled</li>
             * <li>Canceled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>scheduled</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The target ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c29ced64b3dfe4f33b57ca0aa9f68****</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>The target type.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The plan type. Valid values:</p>
             * <ul>
             * <li>cluster_upgrade</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cluster_upgrade</p>
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
