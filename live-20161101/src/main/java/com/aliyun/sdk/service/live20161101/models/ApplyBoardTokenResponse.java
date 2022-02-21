// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyBoardTokenResponse} extends {@link TeaModel}
 *
 * <p>ApplyBoardTokenResponse</p>
 */
public class ApplyBoardTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ApplyBoardTokenResponseBody body;

    private ApplyBoardTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ApplyBoardTokenResponse create() {
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
    public ApplyBoardTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApplyBoardTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ApplyBoardTokenResponseBody body);

        @Override
        ApplyBoardTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApplyBoardTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ApplyBoardTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApplyBoardTokenResponse response) {
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
        public Builder body(ApplyBoardTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApplyBoardTokenResponse build() {
            return new ApplyBoardTokenResponse(this);
        } 

    } 

}
