// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppInfoResponse} extends {@link TeaModel}
 *
 * <p>ListAppInfoResponse</p>
 */
public class ListAppInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAppInfoResponseBody body;

    private ListAppInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAppInfoResponse create() {
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
    public ListAppInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAppInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAppInfoResponseBody body);

        @Override
        ListAppInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAppInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAppInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAppInfoResponse response) {
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
        public Builder body(ListAppInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAppInfoResponse build() {
            return new ListAppInfoResponse(this);
        } 

    } 

}
