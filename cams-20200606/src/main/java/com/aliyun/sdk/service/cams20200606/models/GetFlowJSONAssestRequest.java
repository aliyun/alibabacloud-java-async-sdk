// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFlowJSONAssestRequest} extends {@link RequestModel}
 *
 * <p>GetFlowJSONAssestRequest</p>
 */
public class GetFlowJSONAssestRequest extends Request {
    @Body
    @NameInMap("CustSpaceId")
    private String custSpaceId;

    @Body
    @NameInMap("FlowId")
    @Validation(required = true)
    private String flowId;

    private GetFlowJSONAssestRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.flowId = builder.flowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFlowJSONAssestRequest create() {
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

    public static final class Builder extends Request.Builder<GetFlowJSONAssestRequest, Builder> {
        private String custSpaceId; 
        private String flowId; 

        private Builder() {
            super();
        } 

        private Builder(GetFlowJSONAssestRequest request) {
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
        public GetFlowJSONAssestRequest build() {
            return new GetFlowJSONAssestRequest(this);
        } 

    } 

}
