// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBasicAcceleratorsResponse} extends {@link TeaModel}
 *
 * <p>ListBasicAcceleratorsResponse</p>
 */
public class ListBasicAcceleratorsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListBasicAcceleratorsResponseBody body;

    private ListBasicAcceleratorsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListBasicAcceleratorsResponse create() {
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
    public ListBasicAcceleratorsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBasicAcceleratorsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListBasicAcceleratorsResponseBody body);

        @Override
        ListBasicAcceleratorsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBasicAcceleratorsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListBasicAcceleratorsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBasicAcceleratorsResponse response) {
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
        public Builder body(ListBasicAcceleratorsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBasicAcceleratorsResponse build() {
            return new ListBasicAcceleratorsResponse(this);
        } 

    } 

}
