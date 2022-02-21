// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetLoginPasswordResponse} extends {@link TeaModel}
 *
 * <p>ResetLoginPasswordResponse</p>
 */
public class ResetLoginPasswordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetLoginPasswordResponseBody body;

    private ResetLoginPasswordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetLoginPasswordResponse create() {
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
    public ResetLoginPasswordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetLoginPasswordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetLoginPasswordResponseBody body);

        @Override
        ResetLoginPasswordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetLoginPasswordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetLoginPasswordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetLoginPasswordResponse response) {
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
        public Builder body(ResetLoginPasswordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetLoginPasswordResponse build() {
            return new ResetLoginPasswordResponse(this);
        } 

    } 

}
