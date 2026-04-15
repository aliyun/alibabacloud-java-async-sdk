// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link GetFlowRequest} extends {@link RequestModel}
 *
 * <p>GetFlowRequest</p>
 */
public class GetFlowRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("flowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowName;

    private GetFlowRequest(Builder builder) {
        super(builder);
        this.flowName = builder.flowName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFlowRequest create() {
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

    public static final class Builder extends Request.Builder<GetFlowRequest, Builder> {
        private String flowName; 

        private Builder() {
            super();
        } 

        private Builder(GetFlowRequest request) {
            super(request);
            this.flowName = request.flowName;
        } 

        /**
         * <p>要获取详情的工作流实例的唯一标识符</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>flow-1234567890abcdef</p>
         */
        public Builder flowName(String flowName) {
            this.putPathParameter("flowName", flowName);
            this.flowName = flowName;
            return this;
        }

        @Override
        public GetFlowRequest build() {
            return new GetFlowRequest(this);
        } 

    } 

}
