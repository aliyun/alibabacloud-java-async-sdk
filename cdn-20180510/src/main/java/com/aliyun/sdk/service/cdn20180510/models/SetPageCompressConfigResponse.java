// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetPageCompressConfigResponse} extends {@link TeaModel}
 *
 * <p>SetPageCompressConfigResponse</p>
 */
public class SetPageCompressConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetPageCompressConfigResponseBody body;

    private SetPageCompressConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetPageCompressConfigResponse create() {
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
    public SetPageCompressConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetPageCompressConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetPageCompressConfigResponseBody body);

        @Override
        SetPageCompressConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetPageCompressConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetPageCompressConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetPageCompressConfigResponse response) {
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
        public Builder body(SetPageCompressConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetPageCompressConfigResponse build() {
            return new SetPageCompressConfigResponse(this);
        } 

    } 

}
