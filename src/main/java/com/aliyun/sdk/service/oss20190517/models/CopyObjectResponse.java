// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link CopyObjectResponse} extends {@link TeaModel}
 *
 * <p>CopyObjectResponse</p>
 */
public class CopyObjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CopyObjectResponseBody body;

    private CopyObjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CopyObjectResponse create() {
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
    public CopyObjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CopyObjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CopyObjectResponseBody body);

        @Override
        CopyObjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CopyObjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CopyObjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CopyObjectResponse response) {
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
        public Builder body(CopyObjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CopyObjectResponse build() {
            return new CopyObjectResponse(this);
        } 

    } 

}
