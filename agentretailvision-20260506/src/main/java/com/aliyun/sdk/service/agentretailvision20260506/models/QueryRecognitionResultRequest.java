// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentretailvision20260506.models;

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
 * {@link QueryRecognitionResultRequest} extends {@link RequestModel}
 *
 * <p>QueryRecognitionResultRequest</p>
 */
public class QueryRecognitionResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderUniqueId")
    private String orderUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private QueryRecognitionResultRequest(Builder builder) {
        super(builder);
        this.orderUniqueId = builder.orderUniqueId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRecognitionResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderUniqueId
     */
    public String getOrderUniqueId() {
        return this.orderUniqueId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<QueryRecognitionResultRequest, Builder> {
        private String orderUniqueId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(QueryRecognitionResultRequest request) {
            super(request);
            this.orderUniqueId = request.orderUniqueId;
            this.taskId = request.taskId;
        } 

        /**
         * OrderUniqueId.
         */
        public Builder orderUniqueId(String orderUniqueId) {
            this.putQueryParameter("OrderUniqueId", orderUniqueId);
            this.orderUniqueId = orderUniqueId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public QueryRecognitionResultRequest build() {
            return new QueryRecognitionResultRequest(this);
        } 

    } 

}
