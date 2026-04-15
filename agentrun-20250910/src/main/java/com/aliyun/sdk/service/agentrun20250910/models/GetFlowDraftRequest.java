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
 * {@link GetFlowDraftRequest} extends {@link RequestModel}
 *
 * <p>GetFlowDraftRequest</p>
 */
public class GetFlowDraftRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("flowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowName;

    private GetFlowDraftRequest(Builder builder) {
        super(builder);
        this.flowName = builder.flowName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFlowDraftRequest create() {
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

    public static final class Builder extends Request.Builder<GetFlowDraftRequest, Builder> {
        private String flowName; 

        private Builder() {
            super();
        } 

        private Builder(GetFlowDraftRequest request) {
            super(request);
            this.flowName = request.flowName;
        } 

        /**
         * <p>要获取草稿的工作流实例的唯一标识符</p>
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
        public GetFlowDraftRequest build() {
            return new GetFlowDraftRequest(this);
        } 

    } 

}
