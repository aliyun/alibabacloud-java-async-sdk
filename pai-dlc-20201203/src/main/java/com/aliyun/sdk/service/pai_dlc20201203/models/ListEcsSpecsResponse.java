// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEcsSpecsResponse} extends {@link TeaModel}
 *
 * <p>ListEcsSpecsResponse</p>
 */
public class ListEcsSpecsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListEcsSpecsResponseBody body;

    private ListEcsSpecsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListEcsSpecsResponse create() {
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
    public ListEcsSpecsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEcsSpecsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListEcsSpecsResponseBody body);

        @Override
        ListEcsSpecsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEcsSpecsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListEcsSpecsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEcsSpecsResponse response) {
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
        public Builder body(ListEcsSpecsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEcsSpecsResponse build() {
            return new ListEcsSpecsResponse(this);
        } 

    } 

}
