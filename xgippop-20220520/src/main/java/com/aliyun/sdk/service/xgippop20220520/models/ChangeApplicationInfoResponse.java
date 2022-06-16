// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeApplicationInfoResponse} extends {@link TeaModel}
 *
 * <p>ChangeApplicationInfoResponse</p>
 */
public class ChangeApplicationInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChangeApplicationInfoResponseBody body;

    private ChangeApplicationInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChangeApplicationInfoResponse create() {
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
    public ChangeApplicationInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChangeApplicationInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChangeApplicationInfoResponseBody body);

        @Override
        ChangeApplicationInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChangeApplicationInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChangeApplicationInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChangeApplicationInfoResponse response) {
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
        public Builder body(ChangeApplicationInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChangeApplicationInfoResponse build() {
            return new ChangeApplicationInfoResponse(this);
        } 

    } 

}
