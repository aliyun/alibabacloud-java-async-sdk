// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CursorResponse} extends {@link TeaModel}
 *
 * <p>CursorResponse</p>
 */
public class CursorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CursorResponseBody body;

    private CursorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CursorResponse create() {
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
    public CursorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CursorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CursorResponseBody body);

        @Override
        CursorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CursorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CursorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CursorResponse response) {
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
        public Builder body(CursorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CursorResponse build() {
            return new CursorResponse(this);
        } 

    } 

}
