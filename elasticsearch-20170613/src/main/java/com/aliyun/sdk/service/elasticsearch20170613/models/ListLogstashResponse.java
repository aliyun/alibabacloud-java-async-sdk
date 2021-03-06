// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLogstashResponse} extends {@link TeaModel}
 *
 * <p>ListLogstashResponse</p>
 */
public class ListLogstashResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListLogstashResponseBody body;

    private ListLogstashResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListLogstashResponse create() {
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
    public ListLogstashResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListLogstashResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListLogstashResponseBody body);

        @Override
        ListLogstashResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListLogstashResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListLogstashResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListLogstashResponse response) {
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
        public Builder body(ListLogstashResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListLogstashResponse build() {
            return new ListLogstashResponse(this);
        } 

    } 

}
