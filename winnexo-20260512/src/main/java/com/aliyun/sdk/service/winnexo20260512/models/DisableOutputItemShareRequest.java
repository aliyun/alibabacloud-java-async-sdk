// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link DisableOutputItemShareRequest} extends {@link RequestModel}
 *
 * <p>DisableOutputItemShareRequest</p>
 */
public class DisableOutputItemShareRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("outputItemId")
    private String outputItemId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("outputItemName")
    private String outputItemName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private DisableOutputItemShareRequest(Builder builder) {
        super(builder);
        this.outputItemId = builder.outputItemId;
        this.outputItemName = builder.outputItemName;
        this.sessionId = builder.sessionId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableOutputItemShareRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return outputItemId
     */
    public String getOutputItemId() {
        return this.outputItemId;
    }

    /**
     * @return outputItemName
     */
    public String getOutputItemName() {
        return this.outputItemName;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<DisableOutputItemShareRequest, Builder> {
        private String outputItemId; 
        private String outputItemName; 
        private String sessionId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(DisableOutputItemShareRequest request) {
            super(request);
            this.outputItemId = request.outputItemId;
            this.outputItemName = request.outputItemName;
            this.sessionId = request.sessionId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The output item ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleOutputItemId</p>
         */
        public Builder outputItemId(String outputItemId) {
            this.putBodyParameter("outputItemId", outputItemId);
            this.outputItemId = outputItemId;
            return this;
        }

        /**
         * <p>The name of the output item. This parameter must be used together with sessionId.</p>
         * 
         * <strong>example:</strong>
         * <p>Quarterly Review.pptx</p>
         */
        public Builder outputItemName(String outputItemName) {
            this.putBodyParameter("outputItemName", outputItemName);
            this.outputItemName = outputItemName;
            return this;
        }

        /**
         * <p>The session ID used for exact filtering. The value must be 1 to 128 characters in length. It applies to common sessions, skill sessions, and the execution ID of task executions.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSessionId</p>
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public DisableOutputItemShareRequest build() {
            return new DisableOutputItemShareRequest(this);
        } 

    } 

}
