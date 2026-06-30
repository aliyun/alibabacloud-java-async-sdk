// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link CreateModelOperatorApiKeyRequest} extends {@link RequestModel}
 *
 * <p>CreateModelOperatorApiKeyRequest</p>
 */
public class CreateModelOperatorApiKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    private CreateModelOperatorApiKeyRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelOperatorApiKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder extends Request.Builder<CreateModelOperatorApiKeyRequest, Builder> {
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(CreateModelOperatorApiKeyRequest request) {
            super(request);
            this.description = request.description;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-apikey</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        @Override
        public CreateModelOperatorApiKeyRequest build() {
            return new CreateModelOperatorApiKeyRequest(this);
        } 

    } 

}
