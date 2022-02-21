// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateForwardingRulesResponse} extends {@link TeaModel}
 *
 * <p>UpdateForwardingRulesResponse</p>
 */
public class UpdateForwardingRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateForwardingRulesResponseBody body;

    private UpdateForwardingRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateForwardingRulesResponse create() {
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
    public UpdateForwardingRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateForwardingRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateForwardingRulesResponseBody body);

        @Override
        UpdateForwardingRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateForwardingRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateForwardingRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateForwardingRulesResponse response) {
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
        public Builder body(UpdateForwardingRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateForwardingRulesResponse build() {
            return new UpdateForwardingRulesResponse(this);
        } 

    } 

}
