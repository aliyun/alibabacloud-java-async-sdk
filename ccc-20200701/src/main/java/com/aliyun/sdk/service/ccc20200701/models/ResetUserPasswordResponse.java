// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetUserPasswordResponse} extends {@link TeaModel}
 *
 * <p>ResetUserPasswordResponse</p>
 */
public class ResetUserPasswordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetUserPasswordResponseBody body;

    private ResetUserPasswordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetUserPasswordResponse create() {
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
    public ResetUserPasswordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetUserPasswordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetUserPasswordResponseBody body);

        @Override
        ResetUserPasswordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetUserPasswordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetUserPasswordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetUserPasswordResponse response) {
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
        public Builder body(ResetUserPasswordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetUserPasswordResponse build() {
            return new ResetUserPasswordResponse(this);
        } 

    } 

}
