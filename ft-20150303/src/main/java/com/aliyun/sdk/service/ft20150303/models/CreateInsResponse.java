// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20150303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInsResponse} extends {@link TeaModel}
 *
 * <p>CreateInsResponse</p>
 */
public class CreateInsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateInsResponseBody body;

    private CreateInsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateInsResponse create() {
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
    public CreateInsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateInsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateInsResponseBody body);

        @Override
        CreateInsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateInsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateInsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateInsResponse response) {
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
        public Builder body(CreateInsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateInsResponse build() {
            return new CreateInsResponse(this);
        } 

    } 

}
