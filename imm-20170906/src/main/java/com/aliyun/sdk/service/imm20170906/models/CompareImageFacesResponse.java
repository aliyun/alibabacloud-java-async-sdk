// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CompareImageFacesResponse} extends {@link TeaModel}
 *
 * <p>CompareImageFacesResponse</p>
 */
public class CompareImageFacesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CompareImageFacesResponseBody body;

    private CompareImageFacesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CompareImageFacesResponse create() {
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
    public CompareImageFacesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CompareImageFacesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CompareImageFacesResponseBody body);

        @Override
        CompareImageFacesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CompareImageFacesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CompareImageFacesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CompareImageFacesResponse response) {
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
        public Builder body(CompareImageFacesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CompareImageFacesResponse build() {
            return new CompareImageFacesResponse(this);
        } 

    } 

}
