// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConnectionRequest} extends {@link RequestModel}
 *
 * <p>CreateConnectionRequest</p>
 */
public class CreateConnectionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private Connection body;

    private CreateConnectionRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConnectionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public Connection getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateConnectionRequest, Builder> {
        private Connection body; 

        private Builder() {
            super();
        } 

        private Builder(CreateConnectionRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(Connection body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateConnectionRequest build() {
            return new CreateConnectionRequest(this);
        } 

    } 

}
