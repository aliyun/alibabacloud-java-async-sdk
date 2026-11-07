// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ValidateLlmTemplateConfigRequest} extends {@link RequestModel}
 *
 * <p>ValidateLlmTemplateConfigRequest</p>
 */
public class ValidateLlmTemplateConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProviderTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String providerTemplateId;

    private ValidateLlmTemplateConfigRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.providerTemplateId = builder.providerTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateLlmTemplateConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return providerTemplateId
     */
    public String getProviderTemplateId() {
        return this.providerTemplateId;
    }

    public static final class Builder extends Request.Builder<ValidateLlmTemplateConfigRequest, Builder> {
        private String config; 
        private String providerTemplateId; 

        private Builder() {
            super();
        } 

        private Builder(ValidateLlmTemplateConfigRequest request) {
            super(request);
            this.config = request.config;
            this.providerTemplateId = request.providerTemplateId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;id&quot;:&quot;qwen3-max-2026-01-23&quot;,&quot;name&quot;:&quot;Qwen3 Max&quot;,&quot;contextWindow&quot;:200000,&quot;maxTokens&quot;:32768}</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pt-xxx-001</p>
         */
        public Builder providerTemplateId(String providerTemplateId) {
            this.putQueryParameter("ProviderTemplateId", providerTemplateId);
            this.providerTemplateId = providerTemplateId;
            return this;
        }

        @Override
        public ValidateLlmTemplateConfigRequest build() {
            return new ValidateLlmTemplateConfigRequest(this);
        } 

    } 

}
