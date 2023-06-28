// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckAccessLogAuthResponse} extends {@link TeaModel}
 *
 * <p>CheckAccessLogAuthResponse</p>
 */
public class CheckAccessLogAuthResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckAccessLogAuthResponseBody body;

    private CheckAccessLogAuthResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckAccessLogAuthResponse create() {
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
    public CheckAccessLogAuthResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckAccessLogAuthResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckAccessLogAuthResponseBody body);

        @Override
        CheckAccessLogAuthResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckAccessLogAuthResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckAccessLogAuthResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckAccessLogAuthResponse response) {
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
        public Builder body(CheckAccessLogAuthResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckAccessLogAuthResponse build() {
            return new CheckAccessLogAuthResponse(this);
        } 

    } 

}
