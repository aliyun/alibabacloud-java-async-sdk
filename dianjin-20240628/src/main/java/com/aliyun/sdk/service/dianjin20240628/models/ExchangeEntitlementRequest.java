// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link ExchangeEntitlementRequest} extends {@link RequestModel}
 *
 * <p>ExchangeEntitlementRequest</p>
 */
public class ExchangeEntitlementRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("tenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long tenantId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-Load-Test")
    private Boolean xLoadTest;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("externalUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String externalUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keyHash")
    private String keyHash;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("requestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("templateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long templateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userName")
    private String userName;

    private ExchangeEntitlementRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.tenantId = builder.tenantId;
        this.xLoadTest = builder.xLoadTest;
        this.externalUserId = builder.externalUserId;
        this.keyHash = builder.keyHash;
        this.requestId = builder.requestId;
        this.templateId = builder.templateId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExchangeEntitlementRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    /**
     * @return xLoadTest
     */
    public Boolean getXLoadTest() {
        return this.xLoadTest;
    }

    /**
     * @return externalUserId
     */
    public String getExternalUserId() {
        return this.externalUserId;
    }

    /**
     * @return keyHash
     */
    public String getKeyHash() {
        return this.keyHash;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<ExchangeEntitlementRequest, Builder> {
        private String workspaceId; 
        private Long tenantId; 
        private Boolean xLoadTest; 
        private String externalUserId; 
        private String keyHash; 
        private String requestId; 
        private Long templateId; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(ExchangeEntitlementRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.tenantId = request.tenantId;
            this.xLoadTest = request.xLoadTest;
            this.externalUserId = request.externalUserId;
            this.keyHash = request.keyHash;
            this.requestId = request.requestId;
            this.templateId = request.templateId;
            this.userName = request.userName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>174274395739042</p>
         */
        public Builder tenantId(Long tenantId) {
            this.putPathParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * X-Load-Test.
         */
        public Builder xLoadTest(Boolean xLoadTest) {
            this.putHeaderParameter("X-Load-Test", xLoadTest);
            this.xLoadTest = xLoadTest;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>your_user_id_001</p>
         */
        public Builder externalUserId(String externalUserId) {
            this.putBodyParameter("externalUserId", externalUserId);
            this.externalUserId = externalUserId;
            return this;
        }

        /**
         * keyHash.
         */
        public Builder keyHash(String keyHash) {
            this.putBodyParameter("keyHash", keyHash);
            this.keyHash = keyHash;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>req_20240101_001</p>
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("requestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder templateId(Long templateId) {
            this.putBodyParameter("templateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * userName.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("userName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public ExchangeEntitlementRequest build() {
            return new ExchangeEntitlementRequest(this);
        } 

    } 

}
