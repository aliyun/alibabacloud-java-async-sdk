// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApmResponse} extends {@link TeaModel}
 *
 * <p>ListApmResponse</p>
 */
public class ListApmResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListApmResponseBody body;

    private ListApmResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListApmResponse create() {
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
    public ListApmResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListApmResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListApmResponseBody body);

        @Override
        ListApmResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListApmResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListApmResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListApmResponse response) {
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
        public Builder body(ListApmResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListApmResponse build() {
            return new ListApmResponse(this);
        } 

    } 

}
