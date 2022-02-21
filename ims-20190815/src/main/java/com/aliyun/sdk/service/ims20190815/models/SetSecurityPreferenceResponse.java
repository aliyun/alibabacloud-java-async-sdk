// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetSecurityPreferenceResponse} extends {@link TeaModel}
 *
 * <p>SetSecurityPreferenceResponse</p>
 */
public class SetSecurityPreferenceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetSecurityPreferenceResponseBody body;

    private SetSecurityPreferenceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetSecurityPreferenceResponse create() {
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
    public SetSecurityPreferenceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetSecurityPreferenceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetSecurityPreferenceResponseBody body);

        @Override
        SetSecurityPreferenceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetSecurityPreferenceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetSecurityPreferenceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetSecurityPreferenceResponse response) {
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
        public Builder body(SetSecurityPreferenceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetSecurityPreferenceResponse build() {
            return new SetSecurityPreferenceResponse(this);
        } 

    } 

}
