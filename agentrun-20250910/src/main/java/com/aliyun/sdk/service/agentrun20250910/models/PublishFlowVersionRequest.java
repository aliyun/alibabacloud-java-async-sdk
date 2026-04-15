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
 * {@link PublishFlowVersionRequest} extends {@link RequestModel}
 *
 * <p>PublishFlowVersionRequest</p>
 */
public class PublishFlowVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("flowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private PublishFlowVersionInput body;

    private PublishFlowVersionRequest(Builder builder) {
        super(builder);
        this.flowName = builder.flowName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishFlowVersionRequest create() {
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
    public PublishFlowVersionInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<PublishFlowVersionRequest, Builder> {
        private String flowName; 
        private PublishFlowVersionInput body; 

        private Builder() {
            super();
        } 

        private Builder(PublishFlowVersionRequest request) {
            super(request);
            this.flowName = request.flowName;
            this.body = request.body;
        } 

        /**
         * <p>要发布版本的工作流实例的唯一标识符</p>
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
         * <p>包含版本描述等信息的请求体</p>
         */
        public Builder body(PublishFlowVersionInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public PublishFlowVersionRequest build() {
            return new PublishFlowVersionRequest(this);
        } 

    } 

}
