// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLogstashLogResponse} extends {@link TeaModel}
 *
 * <p>ListLogstashLogResponse</p>
 */
public class ListLogstashLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListLogstashLogResponseBody body;

    private ListLogstashLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListLogstashLogResponse create() {
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
    public ListLogstashLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListLogstashLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListLogstashLogResponseBody body);

        @Override
        ListLogstashLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListLogstashLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListLogstashLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListLogstashLogResponse response) {
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
        public Builder body(ListLogstashLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListLogstashLogResponse build() {
            return new ListLogstashLogResponse(this);
        } 

    } 

}
