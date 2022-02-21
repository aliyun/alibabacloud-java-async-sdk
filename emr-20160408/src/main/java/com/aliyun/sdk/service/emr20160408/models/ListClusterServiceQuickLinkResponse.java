// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterServiceQuickLinkResponse} extends {@link TeaModel}
 *
 * <p>ListClusterServiceQuickLinkResponse</p>
 */
public class ListClusterServiceQuickLinkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListClusterServiceQuickLinkResponseBody body;

    private ListClusterServiceQuickLinkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListClusterServiceQuickLinkResponse create() {
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
    public ListClusterServiceQuickLinkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListClusterServiceQuickLinkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListClusterServiceQuickLinkResponseBody body);

        @Override
        ListClusterServiceQuickLinkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListClusterServiceQuickLinkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListClusterServiceQuickLinkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListClusterServiceQuickLinkResponse response) {
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
        public Builder body(ListClusterServiceQuickLinkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListClusterServiceQuickLinkResponse build() {
            return new ListClusterServiceQuickLinkResponse(this);
        } 

    } 

}
