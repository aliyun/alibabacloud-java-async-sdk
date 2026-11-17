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
 * {@link ConvertDirectConversationToWorkRequest} extends {@link RequestModel}
 *
 * <p>ConvertDirectConversationToWorkRequest</p>
 */
public class ConvertDirectConversationToWorkRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ConvertDirectConversationToWorkRequest(Builder builder) {
        super(builder);
        this.sessionId = builder.sessionId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConvertDirectConversationToWorkRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<ConvertDirectConversationToWorkRequest, Builder> {
        private String sessionId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ConvertDirectConversationToWorkRequest request) {
            super(request);
            this.sessionId = request.sessionId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The source direct session ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSourceSessionId</p>
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
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
        public ConvertDirectConversationToWorkRequest build() {
            return new ConvertDirectConversationToWorkRequest(this);
        } 

    } 

}
