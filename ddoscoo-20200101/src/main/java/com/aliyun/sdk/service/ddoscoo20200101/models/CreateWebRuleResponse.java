// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWebRuleResponse} extends {@link TeaModel}
 *
 * <p>CreateWebRuleResponse</p>
 */
public class CreateWebRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateWebRuleResponseBody body;

    private CreateWebRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateWebRuleResponse create() {
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
    public CreateWebRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateWebRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateWebRuleResponseBody body);

        @Override
        CreateWebRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateWebRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateWebRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateWebRuleResponse response) {
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
        public Builder body(CreateWebRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateWebRuleResponse build() {
            return new CreateWebRuleResponse(this);
        } 

    } 

}
