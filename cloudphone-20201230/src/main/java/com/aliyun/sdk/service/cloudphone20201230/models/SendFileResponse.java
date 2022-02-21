// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudphone20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendFileResponse} extends {@link TeaModel}
 *
 * <p>SendFileResponse</p>
 */
public class SendFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendFileResponseBody body;

    private SendFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendFileResponse create() {
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
    public SendFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendFileResponseBody body);

        @Override
        SendFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendFileResponse response) {
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
        public Builder body(SendFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendFileResponse build() {
            return new SendFileResponse(this);
        } 

    } 

}
