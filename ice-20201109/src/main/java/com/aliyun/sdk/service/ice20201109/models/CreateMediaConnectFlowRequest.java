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
 * {@link CreateMediaConnectFlowRequest} extends {@link RequestModel}
 *
 * <p>CreateMediaConnectFlowRequest</p>
 */
public class CreateMediaConnectFlowRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowRegion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowRegion;

    private CreateMediaConnectFlowRequest(Builder builder) {
        super(builder);
        this.flowName = builder.flowName;
        this.flowRegion = builder.flowRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMediaConnectFlowRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    /**
     * @return flowRegion
     */
    public String getFlowRegion() {
        return this.flowRegion;
    }

    public static final class Builder extends Request.Builder<CreateMediaConnectFlowRequest, Builder> {
        private String flowName; 
        private String flowRegion; 

        private Builder() {
            super();
        } 

        private Builder(CreateMediaConnectFlowRequest request) {
            super(request);
            this.flowName = request.flowName;
            this.flowRegion = request.flowRegion;
        } 

        /**
         * <p>The flow name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AliTestFlow</p>
         */
        public Builder flowName(String flowName) {
            this.putQueryParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * <p>The region in which the flow resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-1</p>
         */
        public Builder flowRegion(String flowRegion) {
            this.putQueryParameter("FlowRegion", flowRegion);
            this.flowRegion = flowRegion;
            return this;
        }

        @Override
        public CreateMediaConnectFlowRequest build() {
            return new CreateMediaConnectFlowRequest(this);
        } 

    } 

}
