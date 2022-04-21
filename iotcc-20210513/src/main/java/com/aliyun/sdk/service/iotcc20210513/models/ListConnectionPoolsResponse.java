// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConnectionPoolsResponse} extends {@link TeaModel}
 *
 * <p>ListConnectionPoolsResponse</p>
 */
public class ListConnectionPoolsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListConnectionPoolsResponseBody body;

    private ListConnectionPoolsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListConnectionPoolsResponse create() {
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
    public ListConnectionPoolsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListConnectionPoolsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListConnectionPoolsResponseBody body);

        @Override
        ListConnectionPoolsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListConnectionPoolsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListConnectionPoolsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListConnectionPoolsResponse response) {
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
        public Builder body(ListConnectionPoolsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListConnectionPoolsResponse build() {
            return new ListConnectionPoolsResponse(this);
        } 

    } 

}
