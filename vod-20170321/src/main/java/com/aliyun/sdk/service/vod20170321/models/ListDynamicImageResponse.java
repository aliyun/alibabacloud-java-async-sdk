// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDynamicImageResponse} extends {@link TeaModel}
 *
 * <p>ListDynamicImageResponse</p>
 */
public class ListDynamicImageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDynamicImageResponseBody body;

    private ListDynamicImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDynamicImageResponse create() {
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
    public ListDynamicImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDynamicImageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDynamicImageResponseBody body);

        @Override
        ListDynamicImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDynamicImageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDynamicImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDynamicImageResponse response) {
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
        public Builder body(ListDynamicImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDynamicImageResponse build() {
            return new ListDynamicImageResponse(this);
        } 

    } 

}
