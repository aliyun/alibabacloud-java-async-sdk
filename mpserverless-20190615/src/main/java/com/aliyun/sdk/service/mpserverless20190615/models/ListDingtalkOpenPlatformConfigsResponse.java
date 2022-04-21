// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDingtalkOpenPlatformConfigsResponse} extends {@link TeaModel}
 *
 * <p>ListDingtalkOpenPlatformConfigsResponse</p>
 */
public class ListDingtalkOpenPlatformConfigsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDingtalkOpenPlatformConfigsResponseBody body;

    private ListDingtalkOpenPlatformConfigsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDingtalkOpenPlatformConfigsResponse create() {
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
    public ListDingtalkOpenPlatformConfigsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDingtalkOpenPlatformConfigsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDingtalkOpenPlatformConfigsResponseBody body);

        @Override
        ListDingtalkOpenPlatformConfigsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDingtalkOpenPlatformConfigsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDingtalkOpenPlatformConfigsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDingtalkOpenPlatformConfigsResponse response) {
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
        public Builder body(ListDingtalkOpenPlatformConfigsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDingtalkOpenPlatformConfigsResponse build() {
            return new ListDingtalkOpenPlatformConfigsResponse(this);
        } 

    } 

}
