// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLibraryResponse} extends {@link TeaModel}
 *
 * <p>CreateLibraryResponse</p>
 */
public class CreateLibraryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateLibraryResponseBody body;

    private CreateLibraryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateLibraryResponse create() {
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
    public CreateLibraryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateLibraryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateLibraryResponseBody body);

        @Override
        CreateLibraryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateLibraryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateLibraryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateLibraryResponse response) {
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
        public Builder body(CreateLibraryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateLibraryResponse build() {
            return new CreateLibraryResponse(this);
        } 

    } 

}
