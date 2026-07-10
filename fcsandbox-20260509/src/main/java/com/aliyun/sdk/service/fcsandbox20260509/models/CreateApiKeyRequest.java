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
 * {@link CreateApiKeyRequest} extends {@link RequestModel}
 *
 * <p>CreateApiKeyRequest</p>
 */
public class CreateApiKeyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private CreateApiKeyInput body;

    private CreateApiKeyRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApiKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public CreateApiKeyInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateApiKeyRequest, Builder> {
        private CreateApiKeyInput body; 

        private Builder() {
            super();
        } 

        private Builder(CreateApiKeyRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(CreateApiKeyInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateApiKeyRequest build() {
            return new CreateApiKeyRequest(this);
        } 

    } 

}
