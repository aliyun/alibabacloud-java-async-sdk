// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetUserStatusResponse} extends {@link TeaModel}
 *
 * <p>ResetUserStatusResponse</p>
 */
public class ResetUserStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetUserStatusResponseBody body;

    private ResetUserStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetUserStatusResponse create() {
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
    public ResetUserStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetUserStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetUserStatusResponseBody body);

        @Override
        ResetUserStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetUserStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetUserStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetUserStatusResponse response) {
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
        public Builder body(ResetUserStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetUserStatusResponse build() {
            return new ResetUserStatusResponse(this);
        } 

    } 

}
