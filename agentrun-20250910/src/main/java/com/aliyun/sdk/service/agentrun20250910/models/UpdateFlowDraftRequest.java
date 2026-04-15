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
 * {@link UpdateFlowDraftRequest} extends {@link RequestModel}
 *
 * <p>UpdateFlowDraftRequest</p>
 */
public class UpdateFlowDraftRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("flowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateFlowDraftInput body;

    private UpdateFlowDraftRequest(Builder builder) {
        super(builder);
        this.flowName = builder.flowName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFlowDraftRequest create() {
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
     * @return body
     */
    public UpdateFlowDraftInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateFlowDraftRequest, Builder> {
        private String flowName; 
        private UpdateFlowDraftInput body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFlowDraftRequest request) {
            super(request);
            this.flowName = request.flowName;
            this.body = request.body;
        } 

        /**
         * <p>要更新草稿的工作流实例的唯一标识符</p>
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

        /**
         * <p>包含要更新的工作流草稿配置信息的请求体</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(UpdateFlowDraftInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateFlowDraftRequest build() {
            return new UpdateFlowDraftRequest(this);
        } 

    } 

}
