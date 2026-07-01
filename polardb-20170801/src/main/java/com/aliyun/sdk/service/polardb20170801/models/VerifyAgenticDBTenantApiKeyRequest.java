// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link VerifyAgenticDBTenantApiKeyRequest} extends {@link RequestModel}
 *
 * <p>VerifyAgenticDBTenantApiKeyRequest</p>
 */
public class VerifyAgenticDBTenantApiKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private VerifyAgenticDBTenantApiKeyRequest(Builder builder) {
        super(builder);
        this.apiKey = builder.apiKey;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyAgenticDBTenantApiKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<VerifyAgenticDBTenantApiKeyRequest, Builder> {
        private String apiKey; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(VerifyAgenticDBTenantApiKeyRequest request) {
            super(request);
            this.apiKey = request.apiKey;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pagc_key_cGFnYy1icDFh...kX9mP2vL7wQ3</p>
         */
        public Builder apiKey(String apiKey) {
            this.putQueryParameter("ApiKey", apiKey);
            this.apiKey = apiKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public VerifyAgenticDBTenantApiKeyRequest build() {
            return new VerifyAgenticDBTenantApiKeyRequest(this);
        } 

    } 

}
