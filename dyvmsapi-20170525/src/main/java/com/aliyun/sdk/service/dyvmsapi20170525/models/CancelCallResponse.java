// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelCallResponse} extends {@link TeaModel}
 *
 * <p>CancelCallResponse</p>
 */
public class CancelCallResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelCallResponseBody body;

    private CancelCallResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelCallResponse create() {
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
    public CancelCallResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelCallResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelCallResponseBody body);

        @Override
        CancelCallResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelCallResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelCallResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelCallResponse response) {
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
        public Builder body(CancelCallResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelCallResponse build() {
            return new CancelCallResponse(this);
        } 

    } 

}
