// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateExpressCloudConnectionResponse} extends {@link TeaModel}
 *
 * <p>CreateExpressCloudConnectionResponse</p>
 */
public class CreateExpressCloudConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateExpressCloudConnectionResponseBody body;

    private CreateExpressCloudConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateExpressCloudConnectionResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public CreateExpressCloudConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateExpressCloudConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateExpressCloudConnectionResponseBody body);

        @Override
        CreateExpressCloudConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateExpressCloudConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateExpressCloudConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateExpressCloudConnectionResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(CreateExpressCloudConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateExpressCloudConnectionResponse build() {
            return new CreateExpressCloudConnectionResponse(this);
        } 

    } 

}
