// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListFlowControlTaskItemReportsRequest} extends {@link RequestModel}
 *
 * <p>ListFlowControlTaskItemReportsRequest</p>
 */
public class ListFlowControlTaskItemReportsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("count")
    private String count;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("selectTimeType")
    private String selectTimeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("selectType")
    private String selectType;

    private ListFlowControlTaskItemReportsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.taskId = builder.taskId;
        this.count = builder.count;
        this.selectTimeType = builder.selectTimeType;
        this.selectType = builder.selectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowControlTaskItemReportsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return count
     */
    public String getCount() {
        return this.count;
    }

    /**
     * @return selectTimeType
     */
    public String getSelectTimeType() {
        return this.selectTimeType;
    }

    /**
     * @return selectType
     */
    public String getSelectType() {
        return this.selectType;
    }

    public static final class Builder extends Request.Builder<ListFlowControlTaskItemReportsRequest, Builder> {
        private String instanceId; 
        private String taskId; 
        private String count; 
        private String selectTimeType; 
        private String selectType; 

        private Builder() {
            super();
        } 

        private Builder(ListFlowControlTaskItemReportsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.taskId = request.taskId;
            this.count = request.count;
            this.selectTimeType = request.selectTimeType;
            this.selectType = request.selectType;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * count.
         */
        public Builder count(String count) {
            this.putQueryParameter("count", count);
            this.count = count;
            return this;
        }

        /**
         * selectTimeType.
         */
        public Builder selectTimeType(String selectTimeType) {
            this.putQueryParameter("selectTimeType", selectTimeType);
            this.selectTimeType = selectTimeType;
            return this;
        }

        /**
         * selectType.
         */
        public Builder selectType(String selectType) {
            this.putQueryParameter("selectType", selectType);
            this.selectType = selectType;
            return this;
        }

        @Override
        public ListFlowControlTaskItemReportsRequest build() {
            return new ListFlowControlTaskItemReportsRequest(this);
        } 

    } 

}
