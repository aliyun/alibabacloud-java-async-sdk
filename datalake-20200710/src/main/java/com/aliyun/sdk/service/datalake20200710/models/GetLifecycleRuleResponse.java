// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLifecycleRuleResponse} extends {@link TeaModel}
 *
 * <p>GetLifecycleRuleResponse</p>
 */
public class GetLifecycleRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLifecycleRuleResponseBody body;

    private GetLifecycleRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLifecycleRuleResponse create() {
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
    public GetLifecycleRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLifecycleRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLifecycleRuleResponseBody body);

        @Override
        GetLifecycleRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLifecycleRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLifecycleRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLifecycleRuleResponse response) {
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
        public Builder body(GetLifecycleRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLifecycleRuleResponse build() {
            return new GetLifecycleRuleResponse(this);
        } 

    } 

}
