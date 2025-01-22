// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link UpdateMediaConnectFlowStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateMediaConnectFlowStatusRequest</p>
 */
public class UpdateMediaConnectFlowStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowId")
    private String flowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private UpdateMediaConnectFlowStatusRequest(Builder builder) {
        super(builder);
        this.flowId = builder.flowId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMediaConnectFlowStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateMediaConnectFlowStatusRequest, Builder> {
        private String flowId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMediaConnectFlowStatusRequest request) {
            super(request);
            this.flowId = request.flowId;
            this.status = request.status;
        } 

        /**
         * FlowId.
         */
        public Builder flowId(String flowId) {
            this.putQueryParameter("FlowId", flowId);
            this.flowId = flowId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateMediaConnectFlowStatusRequest build() {
            return new UpdateMediaConnectFlowStatusRequest(this);
        } 

    } 

}
