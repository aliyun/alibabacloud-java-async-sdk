// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DisposeWorkTaskRequest} extends {@link RequestModel}
 *
 * <p>DisposeWorkTaskRequest</p>
 */
public class DisposeWorkTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Operator")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operator;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OptRemark")
    @com.aliyun.core.annotation.Validation(required = true)
    private String optRemark;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskIds;

    private DisposeWorkTaskRequest(Builder builder) {
        super(builder);
        this.operator = builder.operator;
        this.optRemark = builder.optRemark;
        this.status = builder.status;
        this.taskIds = builder.taskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisposeWorkTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return optRemark
     */
    public String getOptRemark() {
        return this.optRemark;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return taskIds
     */
    public String getTaskIds() {
        return this.taskIds;
    }

    public static final class Builder extends Request.Builder<DisposeWorkTaskRequest, Builder> {
        private String operator; 
        private String optRemark; 
        private Integer status; 
        private String taskIds; 

        private Builder() {
            super();
        } 

        private Builder(DisposeWorkTaskRequest request) {
            super(request);
            this.operator = request.operator;
            this.optRemark = request.optRemark;
            this.status = request.status;
            this.taskIds = request.taskIds;
        } 

        /**
         * <p>Operator.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WB01089929</p>
         */
        public Builder operator(String operator) {
            this.putBodyParameter("Operator", operator);
            this.operator = operator;
            return this;
        }

        /**
         * <p>Operation remarks.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>处理完成</p>
         */
        public Builder optRemark(String optRemark) {
            this.putBodyParameter("OptRemark", optRemark);
            this.optRemark = optRemark;
            return this;
        }

        /**
         * <p>Work order status.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>Work order ID, multiple IDs separated by commas.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10310</p>
         */
        public Builder taskIds(String taskIds) {
            this.putBodyParameter("TaskIds", taskIds);
            this.taskIds = taskIds;
            return this;
        }

        @Override
        public DisposeWorkTaskRequest build() {
            return new DisposeWorkTaskRequest(this);
        } 

    } 

}
