// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMgsApiResponse} extends {@link TeaModel}
 *
 * <p>ListMgsApiResponse</p>
 */
public class ListMgsApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMgsApiResponseBody body;

    private ListMgsApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMgsApiResponse create() {
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
    public ListMgsApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMgsApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMgsApiResponseBody body);

        @Override
        ListMgsApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMgsApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMgsApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMgsApiResponse response) {
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
        public Builder body(ListMgsApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMgsApiResponse build() {
            return new ListMgsApiResponse(this);
        } 

    } 

}
