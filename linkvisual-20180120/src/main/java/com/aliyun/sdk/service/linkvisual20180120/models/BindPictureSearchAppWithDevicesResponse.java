// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindPictureSearchAppWithDevicesResponse} extends {@link TeaModel}
 *
 * <p>BindPictureSearchAppWithDevicesResponse</p>
 */
public class BindPictureSearchAppWithDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindPictureSearchAppWithDevicesResponseBody body;

    private BindPictureSearchAppWithDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindPictureSearchAppWithDevicesResponse create() {
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
    public BindPictureSearchAppWithDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindPictureSearchAppWithDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindPictureSearchAppWithDevicesResponseBody body);

        @Override
        BindPictureSearchAppWithDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindPictureSearchAppWithDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindPictureSearchAppWithDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindPictureSearchAppWithDevicesResponse response) {
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
        public Builder body(BindPictureSearchAppWithDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindPictureSearchAppWithDevicesResponse build() {
            return new BindPictureSearchAppWithDevicesResponse(this);
        } 

    } 

}
