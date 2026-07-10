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
 * {@link ResetApiKeyRequest} extends {@link RequestModel}
 *
 * <p>ResetApiKeyRequest</p>
 */
public class ResetApiKeyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("apiKeyID")
    private String apiKeyID;

    private ResetApiKeyRequest(Builder builder) {
        super(builder);
        this.apiKeyID = builder.apiKeyID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetApiKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKeyID
     */
    public String getApiKeyID() {
        return this.apiKeyID;
    }

    public static final class Builder extends Request.Builder<ResetApiKeyRequest, Builder> {
        private String apiKeyID; 

        private Builder() {
            super();
        } 

        private Builder(ResetApiKeyRequest request) {
            super(request);
            this.apiKeyID = request.apiKeyID;
        } 

        /**
         * apiKeyID.
         */
        public Builder apiKeyID(String apiKeyID) {
            this.putPathParameter("apiKeyID", apiKeyID);
            this.apiKeyID = apiKeyID;
            return this;
        }

        @Override
        public ResetApiKeyRequest build() {
            return new ResetApiKeyRequest(this);
        } 

    } 

}
