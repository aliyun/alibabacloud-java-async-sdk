// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyNodesResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyNodesResponseBody</p>
 */
public class ApplyNodesResponseBody extends TeaModel {
    @NameInMap("Detail")
    private String detail;

    @NameInMap("InstanceIds")
    private InstanceIds instanceIds;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SatisfiedAmount")
    private Integer satisfiedAmount;

    @NameInMap("TaskId")
    private String taskId;

    private ApplyNodesResponseBody(Builder builder) {
        this.detail = builder.detail;
        this.instanceIds = builder.instanceIds;
        this.requestId = builder.requestId;
        this.satisfiedAmount = builder.satisfiedAmount;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyNodesResponseBody create() {
        return builder().build();
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * @return instanceIds
     */
    public InstanceIds getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return satisfiedAmount
     */
    public Integer getSatisfiedAmount() {
        return this.satisfiedAmount;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String detail; 
        private InstanceIds instanceIds; 
        private String requestId; 
        private Integer satisfiedAmount; 
        private String taskId; 

        /**
         * The detailed result of the request.
         */
        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        /**
         * The ID of the Elastic Compute Service (ECS) instance.
         * <p>
         * 
         * >  AddNodes is an asynchronous API operation. If a request succeeds, a response is immediately generated before ECS instances are created. Therefore, the value of the parameter is null. You can call the [ListNodes](~~87161~~) operation to query the ID of the ECS instance.
         */
        public Builder instanceIds(InstanceIds instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * The ID of the task.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of the compute nodes that were created.
         */
        public Builder satisfiedAmount(Integer satisfiedAmount) {
            this.satisfiedAmount = satisfiedAmount;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public ApplyNodesResponseBody build() {
            return new ApplyNodesResponseBody(this);
        } 

    } 

    public static class InstanceIds extends TeaModel {
        @NameInMap("InstanceId")
        private java.util.List < String > instanceId;

        private InstanceIds(Builder builder) {
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceIds create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public java.util.List < String > getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private java.util.List < String > instanceId; 

            /**
             * InstanceId.
             */
            public Builder instanceId(java.util.List < String > instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public InstanceIds build() {
                return new InstanceIds(this);
            } 

        } 

    }
}
