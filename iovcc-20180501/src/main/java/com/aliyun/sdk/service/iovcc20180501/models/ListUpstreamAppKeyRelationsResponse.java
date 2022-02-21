// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUpstreamAppKeyRelationsResponse} extends {@link TeaModel}
 *
 * <p>ListUpstreamAppKeyRelationsResponse</p>
 */
public class ListUpstreamAppKeyRelationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListUpstreamAppKeyRelationsResponseBody body;

    private ListUpstreamAppKeyRelationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListUpstreamAppKeyRelationsResponse create() {
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
    public ListUpstreamAppKeyRelationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUpstreamAppKeyRelationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListUpstreamAppKeyRelationsResponseBody body);

        @Override
        ListUpstreamAppKeyRelationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUpstreamAppKeyRelationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListUpstreamAppKeyRelationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUpstreamAppKeyRelationsResponse response) {
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
        public Builder body(ListUpstreamAppKeyRelationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUpstreamAppKeyRelationsResponse build() {
            return new ListUpstreamAppKeyRelationsResponse(this);
        } 

    } 

}
