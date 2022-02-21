// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransitRouterVpcAttachmentsResponse} extends {@link TeaModel}
 *
 * <p>ListTransitRouterVpcAttachmentsResponse</p>
 */
public class ListTransitRouterVpcAttachmentsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTransitRouterVpcAttachmentsResponseBody body;

    private ListTransitRouterVpcAttachmentsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTransitRouterVpcAttachmentsResponse create() {
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
    public ListTransitRouterVpcAttachmentsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTransitRouterVpcAttachmentsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTransitRouterVpcAttachmentsResponseBody body);

        @Override
        ListTransitRouterVpcAttachmentsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTransitRouterVpcAttachmentsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTransitRouterVpcAttachmentsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTransitRouterVpcAttachmentsResponse response) {
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
        public Builder body(ListTransitRouterVpcAttachmentsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTransitRouterVpcAttachmentsResponse build() {
            return new ListTransitRouterVpcAttachmentsResponse(this);
        } 

    } 

}
