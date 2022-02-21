// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransitRouterVbrAttachmentsResponse} extends {@link TeaModel}
 *
 * <p>ListTransitRouterVbrAttachmentsResponse</p>
 */
public class ListTransitRouterVbrAttachmentsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTransitRouterVbrAttachmentsResponseBody body;

    private ListTransitRouterVbrAttachmentsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTransitRouterVbrAttachmentsResponse create() {
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
    public ListTransitRouterVbrAttachmentsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTransitRouterVbrAttachmentsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTransitRouterVbrAttachmentsResponseBody body);

        @Override
        ListTransitRouterVbrAttachmentsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTransitRouterVbrAttachmentsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTransitRouterVbrAttachmentsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTransitRouterVbrAttachmentsResponse response) {
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
        public Builder body(ListTransitRouterVbrAttachmentsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTransitRouterVbrAttachmentsResponse build() {
            return new ListTransitRouterVbrAttachmentsResponse(this);
        } 

    } 

}
