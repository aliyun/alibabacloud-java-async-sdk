// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClientSdksResponse} extends {@link TeaModel}
 *
 * <p>ListClientSdksResponse</p>
 */
public class ListClientSdksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListClientSdksResponseBody body;

    private ListClientSdksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListClientSdksResponse create() {
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
    public ListClientSdksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListClientSdksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListClientSdksResponseBody body);

        @Override
        ListClientSdksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListClientSdksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListClientSdksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListClientSdksResponse response) {
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
        public Builder body(ListClientSdksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListClientSdksResponse build() {
            return new ListClientSdksResponse(this);
        } 

    } 

}
