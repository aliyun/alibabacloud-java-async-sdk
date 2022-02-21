// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHotParamRuleResponse} extends {@link TeaModel}
 *
 * <p>CreateHotParamRuleResponse</p>
 */
public class CreateHotParamRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateHotParamRuleResponseBody body;

    private CreateHotParamRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateHotParamRuleResponse create() {
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
    public CreateHotParamRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateHotParamRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateHotParamRuleResponseBody body);

        @Override
        CreateHotParamRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateHotParamRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateHotParamRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateHotParamRuleResponse response) {
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
        public Builder body(CreateHotParamRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateHotParamRuleResponse build() {
            return new CreateHotParamRuleResponse(this);
        } 

    } 

}
