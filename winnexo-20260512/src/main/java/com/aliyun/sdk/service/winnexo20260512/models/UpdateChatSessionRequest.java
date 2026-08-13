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
 * {@link UpdateChatSessionRequest} extends {@link RequestModel}
 *
 * <p>UpdateChatSessionRequest</p>
 */
public class UpdateChatSessionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("model")
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    private UpdateChatSessionRequest(Builder builder) {
        super(builder);
        this.model = builder.model;
        this.sessionId = builder.sessionId;
        this.tenantId = builder.tenantId;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateChatSessionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
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

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<UpdateChatSessionRequest, Builder> {
        private String model; 
        private String sessionId; 
        private String tenantId; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(UpdateChatSessionRequest request) {
            super(request);
            this.model = request.model;
            this.sessionId = request.sessionId;
            this.tenantId = request.tenantId;
            this.title = request.title;
        } 

        /**
         * <p>抽象模型名（模型档位）；不传则不修改会话当前模型</p>
         * 
         * <strong>example:</strong>
         * <p>quick</p>
         */
        public Builder model(String model) {
            this.putBodyParameter("model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>会话 ID</p>
         * <p>This parameter is required.</p>
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
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>新的会话标题</p>
         * 
         * <strong>example:</strong>
         * <p>示例标题</p>
         */
        public Builder title(String title) {
            this.putBodyParameter("title", title);
            this.title = title;
            return this;
        }

        @Override
        public UpdateChatSessionRequest build() {
            return new UpdateChatSessionRequest(this);
        } 

    } 

}
