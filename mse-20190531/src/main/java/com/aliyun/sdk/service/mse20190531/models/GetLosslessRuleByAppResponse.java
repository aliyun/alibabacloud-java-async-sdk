// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLosslessRuleByAppResponse} extends {@link TeaModel}
 *
 * <p>GetLosslessRuleByAppResponse</p>
 */
public class GetLosslessRuleByAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLosslessRuleByAppResponseBody body;

    private GetLosslessRuleByAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLosslessRuleByAppResponse create() {
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
    public GetLosslessRuleByAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLosslessRuleByAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLosslessRuleByAppResponseBody body);

        @Override
        GetLosslessRuleByAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLosslessRuleByAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLosslessRuleByAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLosslessRuleByAppResponse response) {
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
        public Builder body(GetLosslessRuleByAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLosslessRuleByAppResponse build() {
            return new GetLosslessRuleByAppResponse(this);
        } 

    } 

}
