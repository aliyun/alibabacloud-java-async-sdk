// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConnectionPoolAllIpsResponse} extends {@link TeaModel}
 *
 * <p>ListConnectionPoolAllIpsResponse</p>
 */
public class ListConnectionPoolAllIpsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListConnectionPoolAllIpsResponseBody body;

    private ListConnectionPoolAllIpsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListConnectionPoolAllIpsResponse create() {
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
    public ListConnectionPoolAllIpsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListConnectionPoolAllIpsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListConnectionPoolAllIpsResponseBody body);

        @Override
        ListConnectionPoolAllIpsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListConnectionPoolAllIpsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListConnectionPoolAllIpsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListConnectionPoolAllIpsResponse response) {
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
        public Builder body(ListConnectionPoolAllIpsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListConnectionPoolAllIpsResponse build() {
            return new ListConnectionPoolAllIpsResponse(this);
        } 

    } 

}
