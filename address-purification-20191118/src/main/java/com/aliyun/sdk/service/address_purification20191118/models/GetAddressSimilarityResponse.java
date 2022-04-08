// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.address_purification20191118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAddressSimilarityResponse} extends {@link TeaModel}
 *
 * <p>GetAddressSimilarityResponse</p>
 */
public class GetAddressSimilarityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAddressSimilarityResponseBody body;

    private GetAddressSimilarityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAddressSimilarityResponse create() {
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
    public GetAddressSimilarityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAddressSimilarityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAddressSimilarityResponseBody body);

        @Override
        GetAddressSimilarityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAddressSimilarityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAddressSimilarityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAddressSimilarityResponse response) {
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
        public Builder body(GetAddressSimilarityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAddressSimilarityResponse build() {
            return new GetAddressSimilarityResponse(this);
        } 

    } 

}
