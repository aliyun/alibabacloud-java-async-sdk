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
 * {@link SendAIAgentTextRequest} extends {@link RequestModel}
 *
 * <p>SendAIAgentTextRequest</p>
 */
public class SendAIAgentTextRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Text")
    @com.aliyun.core.annotation.Validation(required = true)
    private String text;

    private SendAIAgentTextRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendAIAgentTextRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    public static final class Builder extends Request.Builder<SendAIAgentTextRequest, Builder> {
        private String instanceId; 
        private String text; 

        private Builder() {
            super();
        } 

        private Builder(SendAIAgentTextRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.text = request.text;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f27f9b9be28642a88e18****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder text(String text) {
            this.putQueryParameter("Text", text);
            this.text = text;
            return this;
        }

        @Override
        public SendAIAgentTextRequest build() {
            return new SendAIAgentTextRequest(this);
        } 

    } 

}
