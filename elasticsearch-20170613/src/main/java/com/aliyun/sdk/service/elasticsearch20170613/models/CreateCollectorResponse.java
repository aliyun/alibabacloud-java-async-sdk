// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCollectorResponse} extends {@link TeaModel}
 *
 * <p>CreateCollectorResponse</p>
 */
public class CreateCollectorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCollectorResponseBody body;

    private CreateCollectorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCollectorResponse create() {
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
    public CreateCollectorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCollectorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCollectorResponseBody body);

        @Override
        CreateCollectorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCollectorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCollectorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCollectorResponse response) {
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
        public Builder body(CreateCollectorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCollectorResponse build() {
            return new CreateCollectorResponse(this);
        } 

    } 

}
