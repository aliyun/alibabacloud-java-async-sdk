// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDingtalkOpenPlatformConfigResponse} extends {@link TeaModel}
 *
 * <p>AddDingtalkOpenPlatformConfigResponse</p>
 */
public class AddDingtalkOpenPlatformConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddDingtalkOpenPlatformConfigResponseBody body;

    private AddDingtalkOpenPlatformConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddDingtalkOpenPlatformConfigResponse create() {
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
    public AddDingtalkOpenPlatformConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddDingtalkOpenPlatformConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddDingtalkOpenPlatformConfigResponseBody body);

        @Override
        AddDingtalkOpenPlatformConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddDingtalkOpenPlatformConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddDingtalkOpenPlatformConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddDingtalkOpenPlatformConfigResponse response) {
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
        public Builder body(AddDingtalkOpenPlatformConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddDingtalkOpenPlatformConfigResponse build() {
            return new AddDingtalkOpenPlatformConfigResponse(this);
        } 

    } 

}
