// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPublishedServicesResponse} extends {@link TeaModel}
 *
 * <p>ListPublishedServicesResponse</p>
 */
public class ListPublishedServicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPublishedServicesResponseBody body;

    private ListPublishedServicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPublishedServicesResponse create() {
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
    public ListPublishedServicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPublishedServicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPublishedServicesResponseBody body);

        @Override
        ListPublishedServicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPublishedServicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPublishedServicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPublishedServicesResponse response) {
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
        public Builder body(ListPublishedServicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPublishedServicesResponse build() {
            return new ListPublishedServicesResponse(this);
        } 

    } 

}
