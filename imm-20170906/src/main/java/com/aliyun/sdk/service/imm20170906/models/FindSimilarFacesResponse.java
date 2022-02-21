// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindSimilarFacesResponse} extends {@link TeaModel}
 *
 * <p>FindSimilarFacesResponse</p>
 */
public class FindSimilarFacesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FindSimilarFacesResponseBody body;

    private FindSimilarFacesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FindSimilarFacesResponse create() {
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
    public FindSimilarFacesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FindSimilarFacesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FindSimilarFacesResponseBody body);

        @Override
        FindSimilarFacesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FindSimilarFacesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FindSimilarFacesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FindSimilarFacesResponse response) {
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
        public Builder body(FindSimilarFacesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FindSimilarFacesResponse build() {
            return new FindSimilarFacesResponse(this);
        } 

    } 

}
