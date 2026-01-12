// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link CreateMemoryCollectionRequest} extends {@link RequestModel}
 *
 * <p>CreateMemoryCollectionRequest</p>
 */
public class CreateMemoryCollectionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private CreateMemoryCollectionInput body;

    private CreateMemoryCollectionRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMemoryCollectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public CreateMemoryCollectionInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateMemoryCollectionRequest, Builder> {
        private CreateMemoryCollectionInput body; 

        private Builder() {
            super();
        } 

        private Builder(CreateMemoryCollectionRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(CreateMemoryCollectionInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateMemoryCollectionRequest build() {
            return new CreateMemoryCollectionRequest(this);
        } 

    } 

}
