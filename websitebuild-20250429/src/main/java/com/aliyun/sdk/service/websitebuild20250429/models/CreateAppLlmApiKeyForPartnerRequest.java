// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link CreateAppLlmApiKeyForPartnerRequest} extends {@link RequestModel}
 *
 * <p>CreateAppLlmApiKeyForPartnerRequest</p>
 */
public class CreateAppLlmApiKeyForPartnerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IpWhiteList")
    private java.util.List<String> ipWhiteList;

    private CreateAppLlmApiKeyForPartnerRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.ipWhiteList = builder.ipWhiteList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppLlmApiKeyForPartnerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ipWhiteList
     */
    public java.util.List<String> getIpWhiteList() {
        return this.ipWhiteList;
    }

    public static final class Builder extends Request.Builder<CreateAppLlmApiKeyForPartnerRequest, Builder> {
        private String bizId; 
        private String clientToken; 
        private String description; 
        private java.util.List<String> ipWhiteList; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppLlmApiKeyForPartnerRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.ipWhiteList = request.ipWhiteList;
        } 

        /**
         * <p>The business ID of the application instance.</p>
         * 
         * <strong>example:</strong>
         * <p>WD20250814102215000001</p>
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>The idempotency token. This parameter is reserved for future use.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx-xxxx</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the API key usage.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The custom IP address whitelist defined by the invoker. The system default IP ranges are appended by the backend.</p>
         */
        public Builder ipWhiteList(java.util.List<String> ipWhiteList) {
            this.putBodyParameter("IpWhiteList", ipWhiteList);
            this.ipWhiteList = ipWhiteList;
            return this;
        }

        @Override
        public CreateAppLlmApiKeyForPartnerRequest build() {
            return new CreateAppLlmApiKeyForPartnerRequest(this);
        } 

    } 

}
