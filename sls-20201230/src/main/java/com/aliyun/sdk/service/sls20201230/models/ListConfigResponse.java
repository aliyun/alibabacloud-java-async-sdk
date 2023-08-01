// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListConfigResponse} extends {@link TeaModel}
 *
 * <p>ListConfigResponse</p>
 */
public class ListConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListConfigResponseBody body;

    private ListConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListConfigResponse create() {
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
    public ListConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListConfigResponseBody body);

        @Override
        ListConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListConfigResponse response) {
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
        public Builder body(ListConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListConfigResponse build() {
            return new ListConfigResponse(this);
        } 

    } 

}
