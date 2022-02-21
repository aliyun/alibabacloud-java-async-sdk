// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMessageReceiversResponse} extends {@link TeaModel}
 *
 * <p>ListMessageReceiversResponse</p>
 */
public class ListMessageReceiversResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMessageReceiversResponseBody body;

    private ListMessageReceiversResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMessageReceiversResponse create() {
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
    public ListMessageReceiversResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMessageReceiversResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMessageReceiversResponseBody body);

        @Override
        ListMessageReceiversResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMessageReceiversResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMessageReceiversResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMessageReceiversResponse response) {
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
        public Builder body(ListMessageReceiversResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMessageReceiversResponse build() {
            return new ListMessageReceiversResponse(this);
        } 

    } 

}
