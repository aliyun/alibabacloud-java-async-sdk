// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCategoriesResponse} extends {@link TeaModel}
 *
 * <p>GetCategoriesResponse</p>
 */
public class GetCategoriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCategoriesResponseBody body;

    private GetCategoriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCategoriesResponse create() {
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
    public GetCategoriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCategoriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCategoriesResponseBody body);

        @Override
        GetCategoriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCategoriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCategoriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCategoriesResponse response) {
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
        public Builder body(GetCategoriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCategoriesResponse build() {
            return new GetCategoriesResponse(this);
        } 

    } 

}
