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
 * {@link PublishRuntimeVersionRequest} extends {@link RequestModel}
 *
 * <p>PublishRuntimeVersionRequest</p>
 */
public class PublishRuntimeVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentRuntimeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentRuntimeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private PublishRuntimeVersionInput body;

    private PublishRuntimeVersionRequest(Builder builder) {
        super(builder);
        this.agentRuntimeId = builder.agentRuntimeId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishRuntimeVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentRuntimeId
     */
    public String getAgentRuntimeId() {
        return this.agentRuntimeId;
    }

    /**
     * @return body
     */
    public PublishRuntimeVersionInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<PublishRuntimeVersionRequest, Builder> {
        private String agentRuntimeId; 
        private PublishRuntimeVersionInput body; 

        private Builder() {
            super();
        } 

        private Builder(PublishRuntimeVersionRequest request) {
            super(request);
            this.agentRuntimeId = request.agentRuntimeId;
            this.body = request.body;
        } 

        /**
         * <p>要发布版本的智能体运行时实例的唯一标识符</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-1234-1234-123456789abc</p>
         */
        public Builder agentRuntimeId(String agentRuntimeId) {
            this.putPathParameter("agentRuntimeId", agentRuntimeId);
            this.agentRuntimeId = agentRuntimeId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(PublishRuntimeVersionInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public PublishRuntimeVersionRequest build() {
            return new PublishRuntimeVersionRequest(this);
        } 

    } 

}
