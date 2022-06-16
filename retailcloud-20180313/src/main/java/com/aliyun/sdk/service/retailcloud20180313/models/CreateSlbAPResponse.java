// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSlbAPResponse} extends {@link TeaModel}
 *
 * <p>CreateSlbAPResponse</p>
 */
public class CreateSlbAPResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSlbAPResponseBody body;

    private CreateSlbAPResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSlbAPResponse create() {
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
    public CreateSlbAPResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSlbAPResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSlbAPResponseBody body);

        @Override
        CreateSlbAPResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSlbAPResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSlbAPResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSlbAPResponse response) {
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
        public Builder body(CreateSlbAPResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSlbAPResponse build() {
            return new CreateSlbAPResponse(this);
        } 

    } 

}
