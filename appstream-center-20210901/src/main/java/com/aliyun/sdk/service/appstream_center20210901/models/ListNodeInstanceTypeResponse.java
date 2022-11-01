// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodeInstanceTypeResponse} extends {@link TeaModel}
 *
 * <p>ListNodeInstanceTypeResponse</p>
 */
public class ListNodeInstanceTypeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListNodeInstanceTypeResponseBody body;

    private ListNodeInstanceTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListNodeInstanceTypeResponse create() {
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
    public ListNodeInstanceTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListNodeInstanceTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListNodeInstanceTypeResponseBody body);

        @Override
        ListNodeInstanceTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListNodeInstanceTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListNodeInstanceTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListNodeInstanceTypeResponse response) {
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
        public Builder body(ListNodeInstanceTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListNodeInstanceTypeResponse build() {
            return new ListNodeInstanceTypeResponse(this);
        } 

    } 

}
