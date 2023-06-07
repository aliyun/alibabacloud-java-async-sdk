// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceKeyPairResponse} extends {@link TeaModel}
 *
 * <p>CreateInstanceKeyPairResponse</p>
 */
public class CreateInstanceKeyPairResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateInstanceKeyPairResponseBody body;

    private CreateInstanceKeyPairResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateInstanceKeyPairResponse create() {
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
    public CreateInstanceKeyPairResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateInstanceKeyPairResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateInstanceKeyPairResponseBody body);

        @Override
        CreateInstanceKeyPairResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateInstanceKeyPairResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateInstanceKeyPairResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateInstanceKeyPairResponse response) {
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
        public Builder body(CreateInstanceKeyPairResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateInstanceKeyPairResponse build() {
            return new CreateInstanceKeyPairResponse(this);
        } 

    } 

}
