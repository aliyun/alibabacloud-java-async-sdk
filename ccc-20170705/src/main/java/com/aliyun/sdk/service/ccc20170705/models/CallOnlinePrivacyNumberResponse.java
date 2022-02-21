// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CallOnlinePrivacyNumberResponse} extends {@link TeaModel}
 *
 * <p>CallOnlinePrivacyNumberResponse</p>
 */
public class CallOnlinePrivacyNumberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CallOnlinePrivacyNumberResponseBody body;

    private CallOnlinePrivacyNumberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CallOnlinePrivacyNumberResponse create() {
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
    public CallOnlinePrivacyNumberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CallOnlinePrivacyNumberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CallOnlinePrivacyNumberResponseBody body);

        @Override
        CallOnlinePrivacyNumberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CallOnlinePrivacyNumberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CallOnlinePrivacyNumberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CallOnlinePrivacyNumberResponse response) {
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
        public Builder body(CallOnlinePrivacyNumberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CallOnlinePrivacyNumberResponse build() {
            return new CallOnlinePrivacyNumberResponse(this);
        } 

    } 

}
