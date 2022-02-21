// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEaiAllResponse} extends {@link TeaModel}
 *
 * <p>CreateEaiAllResponse</p>
 */
public class CreateEaiAllResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateEaiAllResponseBody body;

    private CreateEaiAllResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateEaiAllResponse create() {
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
    public CreateEaiAllResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateEaiAllResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateEaiAllResponseBody body);

        @Override
        CreateEaiAllResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateEaiAllResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateEaiAllResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateEaiAllResponse response) {
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
        public Builder body(CreateEaiAllResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateEaiAllResponse build() {
            return new CreateEaiAllResponse(this);
        } 

    } 

}
