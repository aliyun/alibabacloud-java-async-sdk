// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStackGroupOperationsResponse} extends {@link TeaModel}
 *
 * <p>ListStackGroupOperationsResponse</p>
 */
public class ListStackGroupOperationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListStackGroupOperationsResponseBody body;

    private ListStackGroupOperationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListStackGroupOperationsResponse create() {
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
    public ListStackGroupOperationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListStackGroupOperationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListStackGroupOperationsResponseBody body);

        @Override
        ListStackGroupOperationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListStackGroupOperationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListStackGroupOperationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListStackGroupOperationsResponse response) {
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
        public Builder body(ListStackGroupOperationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListStackGroupOperationsResponse build() {
            return new ListStackGroupOperationsResponse(this);
        } 

    } 

}
