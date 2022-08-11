// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FTApiAliasApiResponse} extends {@link TeaModel}
 *
 * <p>FTApiAliasApiResponse</p>
 */
public class FTApiAliasApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FTApiAliasApiResponseBody body;

    private FTApiAliasApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FTApiAliasApiResponse create() {
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
    public FTApiAliasApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FTApiAliasApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FTApiAliasApiResponseBody body);

        @Override
        FTApiAliasApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FTApiAliasApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FTApiAliasApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FTApiAliasApiResponse response) {
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
        public Builder body(FTApiAliasApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FTApiAliasApiResponse build() {
            return new FTApiAliasApiResponse(this);
        } 

    } 

}
