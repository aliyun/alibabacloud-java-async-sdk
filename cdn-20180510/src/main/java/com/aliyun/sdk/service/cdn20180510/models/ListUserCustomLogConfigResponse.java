// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserCustomLogConfigResponse} extends {@link TeaModel}
 *
 * <p>ListUserCustomLogConfigResponse</p>
 */
public class ListUserCustomLogConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListUserCustomLogConfigResponseBody body;

    private ListUserCustomLogConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListUserCustomLogConfigResponse create() {
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
    public ListUserCustomLogConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUserCustomLogConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListUserCustomLogConfigResponseBody body);

        @Override
        ListUserCustomLogConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUserCustomLogConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListUserCustomLogConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUserCustomLogConfigResponse response) {
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
        public Builder body(ListUserCustomLogConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUserCustomLogConfigResponse build() {
            return new ListUserCustomLogConfigResponse(this);
        } 

    } 

}
