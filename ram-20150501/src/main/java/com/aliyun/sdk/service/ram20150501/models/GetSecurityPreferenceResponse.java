// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSecurityPreferenceResponse} extends {@link TeaModel}
 *
 * <p>GetSecurityPreferenceResponse</p>
 */
public class GetSecurityPreferenceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSecurityPreferenceResponseBody body;

    private GetSecurityPreferenceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSecurityPreferenceResponse create() {
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
    public GetSecurityPreferenceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSecurityPreferenceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSecurityPreferenceResponseBody body);

        @Override
        GetSecurityPreferenceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSecurityPreferenceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSecurityPreferenceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSecurityPreferenceResponse response) {
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
        public Builder body(GetSecurityPreferenceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSecurityPreferenceResponse build() {
            return new GetSecurityPreferenceResponse(this);
        } 

    } 

}
