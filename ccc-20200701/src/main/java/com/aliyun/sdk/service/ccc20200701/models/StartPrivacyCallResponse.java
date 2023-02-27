// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartPrivacyCallResponse} extends {@link TeaModel}
 *
 * <p>StartPrivacyCallResponse</p>
 */
public class StartPrivacyCallResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartPrivacyCallResponseBody body;

    private StartPrivacyCallResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartPrivacyCallResponse create() {
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
    public StartPrivacyCallResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartPrivacyCallResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartPrivacyCallResponseBody body);

        @Override
        StartPrivacyCallResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartPrivacyCallResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartPrivacyCallResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartPrivacyCallResponse response) {
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
        public Builder body(StartPrivacyCallResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartPrivacyCallResponse build() {
            return new StartPrivacyCallResponse(this);
        } 

    } 

}
