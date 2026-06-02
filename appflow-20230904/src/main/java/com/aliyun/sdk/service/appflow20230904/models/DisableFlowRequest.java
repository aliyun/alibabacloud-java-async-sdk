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
 * {@link DisableFlowRequest} extends {@link RequestModel}
 *
 * <p>DisableFlowRequest</p>
 */
public class DisableFlowRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowVersion")
    private Integer flowVersion;

    private DisableFlowRequest(Builder builder) {
        super(builder);
        this.flowId = builder.flowId;
        this.flowVersion = builder.flowVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableFlowRequest create() {
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
    public Integer getFlowVersion() {
        return this.flowVersion;
    }

    public static final class Builder extends Request.Builder<DisableFlowRequest, Builder> {
        private String flowId; 
        private Integer flowVersion; 

        private Builder() {
            super();
        } 

        private Builder(DisableFlowRequest request) {
            super(request);
            this.flowId = request.flowId;
            this.flowVersion = request.flowVersion;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>flow-xxxxxx</p>
         */
        public Builder flowId(String flowId) {
            this.putQueryParameter("FlowId", flowId);
            this.flowId = flowId;
            return this;
        }

        /**
         * FlowVersion.
         */
        public Builder flowVersion(Integer flowVersion) {
            this.putQueryParameter("FlowVersion", flowVersion);
            this.flowVersion = flowVersion;
            return this;
        }

        @Override
        public DisableFlowRequest build() {
            return new DisableFlowRequest(this);
        } 

    } 

}
