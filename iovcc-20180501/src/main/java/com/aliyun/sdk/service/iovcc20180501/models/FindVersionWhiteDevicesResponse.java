// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindVersionWhiteDevicesResponse} extends {@link TeaModel}
 *
 * <p>FindVersionWhiteDevicesResponse</p>
 */
public class FindVersionWhiteDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FindVersionWhiteDevicesResponseBody body;

    private FindVersionWhiteDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FindVersionWhiteDevicesResponse create() {
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
    public FindVersionWhiteDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FindVersionWhiteDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FindVersionWhiteDevicesResponseBody body);

        @Override
        FindVersionWhiteDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FindVersionWhiteDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FindVersionWhiteDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FindVersionWhiteDevicesResponse response) {
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
        public Builder body(FindVersionWhiteDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FindVersionWhiteDevicesResponse build() {
            return new FindVersionWhiteDevicesResponse(this);
        } 

    } 

}
