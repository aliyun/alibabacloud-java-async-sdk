// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CitySearchResponse} extends {@link TeaModel}
 *
 * <p>CitySearchResponse</p>
 */
public class CitySearchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CitySearchResponseBody body;

    private CitySearchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CitySearchResponse create() {
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
    public CitySearchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CitySearchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CitySearchResponseBody body);

        @Override
        CitySearchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CitySearchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CitySearchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CitySearchResponse response) {
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
        public Builder body(CitySearchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CitySearchResponse build() {
            return new CitySearchResponse(this);
        } 

    } 

}
