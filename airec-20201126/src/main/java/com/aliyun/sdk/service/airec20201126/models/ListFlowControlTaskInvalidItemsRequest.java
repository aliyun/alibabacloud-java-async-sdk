// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListFlowControlTaskInvalidItemsRequest} extends {@link RequestModel}
 *
 * <p>ListFlowControlTaskInvalidItemsRequest</p>
 */
public class ListFlowControlTaskInvalidItemsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List < String > body;

    private ListFlowControlTaskInvalidItemsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.taskId = builder.taskId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowControlTaskInvalidItemsRequest create() {
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
     * @return body
     */
    public java.util.List < String > getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ListFlowControlTaskInvalidItemsRequest, Builder> {
        private String instanceId; 
        private String taskId; 
        private java.util.List < String > body; 

        private Builder() {
            super();
        } 

        private Builder(ListFlowControlTaskInvalidItemsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.taskId = request.taskId;
            this.body = request.body;
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
         * body.
         */
        public Builder body(java.util.List < String > body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ListFlowControlTaskInvalidItemsRequest build() {
            return new ListFlowControlTaskInvalidItemsRequest(this);
        } 

    } 

}
