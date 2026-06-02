// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appflow20230904.models;

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
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowVersion")
    private String flowVersion;

    private GetFlowRequest(Builder builder) {
        super(builder);
        this.flowId = builder.flowId;
        this.flowVersion = builder.flowVersion;
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
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    /**
     * @return flowVersion
     */
    public String getFlowVersion() {
        return this.flowVersion;
    }

    public static final class Builder extends Request.Builder<GetFlowRequest, Builder> {
        private String flowId; 
        private String flowVersion; 

        private Builder() {
            super();
        } 

        private Builder(GetFlowRequest request) {
            super(request);
            this.flowId = request.flowId;
            this.flowVersion = request.flowVersion;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>flow-xxxxx</p>
         */
        public Builder flowId(String flowId) {
            this.putQueryParameter("FlowId", flowId);
            this.flowId = flowId;
            return this;
        }

        /**
         * FlowVersion.
         */
        public Builder flowVersion(String flowVersion) {
            this.putQueryParameter("FlowVersion", flowVersion);
            this.flowVersion = flowVersion;
            return this;
        }

        @Override
        public GetFlowRequest build() {
            return new GetFlowRequest(this);
        } 

    } 

}
