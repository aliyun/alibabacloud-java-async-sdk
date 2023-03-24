// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConnectorsResponse} extends {@link TeaModel}
 *
 * <p>ListConnectorsResponse</p>
 */
public class ListConnectorsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListConnectorsResponseBody body;

    private ListConnectorsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListConnectorsResponse create() {
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
    public ListConnectorsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListConnectorsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListConnectorsResponseBody body);

        @Override
        ListConnectorsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListConnectorsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListConnectorsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListConnectorsResponse response) {
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
        public Builder body(ListConnectorsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListConnectorsResponse build() {
            return new ListConnectorsResponse(this);
        } 

    } 

}
