// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWarningConfigResponse} extends {@link TeaModel}
 *
 * <p>ListWarningConfigResponse</p>
 */
public class ListWarningConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListWarningConfigResponseBody body;

    private ListWarningConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListWarningConfigResponse create() {
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
    public ListWarningConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListWarningConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListWarningConfigResponseBody body);

        @Override
        ListWarningConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListWarningConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListWarningConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListWarningConfigResponse response) {
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
        public Builder body(ListWarningConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListWarningConfigResponse build() {
            return new ListWarningConfigResponse(this);
        } 

    } 

}
