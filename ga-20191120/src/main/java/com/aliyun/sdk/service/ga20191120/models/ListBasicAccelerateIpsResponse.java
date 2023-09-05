// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBasicAccelerateIpsResponse} extends {@link TeaModel}
 *
 * <p>ListBasicAccelerateIpsResponse</p>
 */
public class ListBasicAccelerateIpsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListBasicAccelerateIpsResponseBody body;

    private ListBasicAccelerateIpsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListBasicAccelerateIpsResponse create() {
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
    public ListBasicAccelerateIpsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBasicAccelerateIpsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListBasicAccelerateIpsResponseBody body);

        @Override
        ListBasicAccelerateIpsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBasicAccelerateIpsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListBasicAccelerateIpsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBasicAccelerateIpsResponse response) {
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
        public Builder body(ListBasicAccelerateIpsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBasicAccelerateIpsResponse build() {
            return new ListBasicAccelerateIpsResponse(this);
        } 

    } 

}
