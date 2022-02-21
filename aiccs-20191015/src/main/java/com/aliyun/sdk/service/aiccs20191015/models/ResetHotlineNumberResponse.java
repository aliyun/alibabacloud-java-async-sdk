// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetHotlineNumberResponse} extends {@link TeaModel}
 *
 * <p>ResetHotlineNumberResponse</p>
 */
public class ResetHotlineNumberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetHotlineNumberResponseBody body;

    private ResetHotlineNumberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetHotlineNumberResponse create() {
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
    public ResetHotlineNumberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetHotlineNumberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetHotlineNumberResponseBody body);

        @Override
        ResetHotlineNumberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetHotlineNumberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetHotlineNumberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetHotlineNumberResponse response) {
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
        public Builder body(ResetHotlineNumberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetHotlineNumberResponse build() {
            return new ResetHotlineNumberResponse(this);
        } 

    } 

}
