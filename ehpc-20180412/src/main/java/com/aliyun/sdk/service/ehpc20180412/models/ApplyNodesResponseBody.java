// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link ApplyNodesResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyNodesResponseBody</p>
 */
public class ApplyNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Detail")
    private String detail;

    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private InstanceIds instanceIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SatisfiedAmount")
    private Integer satisfiedAmount;

    @com.aliyun.core.annotation.NameInMap("TaskId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ApplyNodesResponseBody model) {
            this.detail = model.detail;
            this.instanceIds = model.instanceIds;
            this.requestId = model.requestId;
            this.satisfiedAmount = model.satisfiedAmount;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The detailed result of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>Resources Application is satisfied. Creating...</p>
         */
        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        /**
         * <p>The instance IDs.</p>
         * <blockquote>
         * <p> AddNodes is an asynchronous API operation. If a request succeeds, a response is immediately generated before ECS instances are created. Therefore, the value of this parameter is null. You can call the <a href="https://help.aliyun.com/document_detail/87161.html">ListNodes</a> operation to query the IDs of the ECS instances.</p>
         * </blockquote>
         */
        public Builder instanceIds(InstanceIds instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B745C159-3155-4B94-95D0-4B73D4D2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of the compute nodes that are created.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder satisfiedAmount(Integer satisfiedAmount) {
            this.satisfiedAmount = satisfiedAmount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B745C159-3155-4B94-95D0-4B73D4D2****</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public ApplyNodesResponseBody build() {
            return new ApplyNodesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ApplyNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyNodesResponseBody</p>
     */
    public static class InstanceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private java.util.List<String> instanceId;

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
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private java.util.List<String> instanceId; 

            private Builder() {
            } 

            private Builder(InstanceIds model) {
                this.instanceId = model.instanceId;
            } 

            /**
             * InstanceId.
             */
            public Builder instanceId(java.util.List<String> instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public InstanceIds build() {
                return new InstanceIds(this);
            } 

        } 

    }
}
