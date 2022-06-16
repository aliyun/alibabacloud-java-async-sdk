// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSlbAPsResponse} extends {@link TeaModel}
 *
 * <p>ListSlbAPsResponse</p>
 */
public class ListSlbAPsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSlbAPsResponseBody body;

    private ListSlbAPsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSlbAPsResponse create() {
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
    public ListSlbAPsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSlbAPsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSlbAPsResponseBody body);

        @Override
        ListSlbAPsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSlbAPsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSlbAPsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSlbAPsResponse response) {
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
        public Builder body(ListSlbAPsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSlbAPsResponse build() {
            return new ListSlbAPsResponse(this);
        } 

    } 

}
