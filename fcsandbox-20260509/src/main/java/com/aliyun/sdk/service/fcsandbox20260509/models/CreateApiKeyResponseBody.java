// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link CreateApiKeyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateApiKeyResponseBody</p>
 */
public class CreateApiKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiKey")
    private ApiKey apiKey;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ipBlacklist")
    private java.util.List<IPConfig> ipBlacklist;

    @com.aliyun.core.annotation.NameInMap("ipWhitelist")
    private java.util.List<IPConfig> ipWhitelist;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateApiKeyResponseBody(Builder builder) {
        this.apiKey = builder.apiKey;
        this.code = builder.code;
        this.ipBlacklist = builder.ipBlacklist;
        this.ipWhitelist = builder.ipWhitelist;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApiKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public ApiKey getApiKey() {
        return this.apiKey;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return ipBlacklist
     */
    public java.util.List<IPConfig> getIpBlacklist() {
        return this.ipBlacklist;
    }

    /**
     * @return ipWhitelist
     */
    public java.util.List<IPConfig> getIpWhitelist() {
        return this.ipWhitelist;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApiKey apiKey; 
        private String code; 
        private java.util.List<IPConfig> ipBlacklist; 
        private java.util.List<IPConfig> ipWhitelist; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateApiKeyResponseBody model) {
            this.apiKey = model.apiKey;
            this.code = model.code;
            this.ipBlacklist = model.ipBlacklist;
            this.ipWhitelist = model.ipWhitelist;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>API Key。</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;gmtCreate&quot;: 1776997128000, &quot;workspaceId&quot;: &quot;ws-3w77kird5sblwwfk&quot;, &quot;apiKeyId&quot;: 4808780, &quot;createdBy&quot;: &quot;AssumedRoleUser300873166069492100&quot;, &quot;apiKeyValue&quot;: &quot;sk-110ff0028ad64a24b9453c8955c4c191&quot;}</p>
         */
        public Builder apiKey(ApiKey apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ipBlacklist.
         */
        public Builder ipBlacklist(java.util.List<IPConfig> ipBlacklist) {
            this.ipBlacklist = ipBlacklist;
            return this;
        }

        /**
         * ipWhitelist.
         */
        public Builder ipWhitelist(java.util.List<IPConfig> ipWhitelist) {
            this.ipWhitelist = ipWhitelist;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>7ADFF8D8-D4BA-5F79-AD49-DDABFEA59B6C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateApiKeyResponseBody build() {
            return new CreateApiKeyResponseBody(this);
        } 

    } 

}
