// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAcceleratorsResponse} extends {@link TeaModel}
 *
 * <p>ListAcceleratorsResponse</p>
 */
public class ListAcceleratorsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAcceleratorsResponseBody body;

    private ListAcceleratorsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAcceleratorsResponse create() {
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
    public ListAcceleratorsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAcceleratorsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAcceleratorsResponseBody body);

        @Override
        ListAcceleratorsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAcceleratorsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAcceleratorsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAcceleratorsResponse response) {
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
        public Builder body(ListAcceleratorsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAcceleratorsResponse build() {
            return new ListAcceleratorsResponse(this);
        } 

    } 

}
