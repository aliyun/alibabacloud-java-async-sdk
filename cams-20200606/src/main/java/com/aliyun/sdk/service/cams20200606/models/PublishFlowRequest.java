// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishFlowRequest} extends {@link RequestModel}
 *
 * <p>PublishFlowRequest</p>
 */
public class PublishFlowRequest extends Request {
    @Body
    @NameInMap("CustSpaceId")
    private String custSpaceId;

    @Body
    @NameInMap("FlowId")
    @Validation(required = true)
    private String flowId;

    private PublishFlowRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.flowId = builder.flowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    public static final class Builder extends Request.Builder<PublishFlowRequest, Builder> {
        private String custSpaceId; 
        private String flowId; 

        private Builder() {
            super();
        } 

        private Builder(PublishFlowRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
            this.flowId = request.flowId;
        } 

        /**
         * CustSpaceId.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putBodyParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * Flow ID。
         */
        public Builder flowId(String flowId) {
            this.putBodyParameter("FlowId", flowId);
            this.flowId = flowId;
            return this;
        }

        @Override
        public PublishFlowRequest build() {
            return new PublishFlowRequest(this);
        } 

    } 

}
