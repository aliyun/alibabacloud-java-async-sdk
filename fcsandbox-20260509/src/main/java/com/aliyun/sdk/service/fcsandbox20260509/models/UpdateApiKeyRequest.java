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
 * {@link UpdateApiKeyRequest} extends {@link RequestModel}
 *
 * <p>UpdateApiKeyRequest</p>
 */
public class UpdateApiKeyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("apiKeyID")
    private String apiKeyID;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateApiKeyInput body;

    private UpdateApiKeyRequest(Builder builder) {
        super(builder);
        this.apiKeyID = builder.apiKeyID;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApiKeyRequest create() {
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

    /**
     * @return body
     */
    public UpdateApiKeyInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateApiKeyRequest, Builder> {
        private String apiKeyID; 
        private UpdateApiKeyInput body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApiKeyRequest request) {
            super(request);
            this.apiKeyID = request.apiKeyID;
            this.body = request.body;
        } 

        /**
         * apiKeyID.
         */
        public Builder apiKeyID(String apiKeyID) {
            this.putPathParameter("apiKeyID", apiKeyID);
            this.apiKeyID = apiKeyID;
            return this;
        }

        /**
         * body.
         */
        public Builder body(UpdateApiKeyInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateApiKeyRequest build() {
            return new UpdateApiKeyRequest(this);
        } 

    } 

}
