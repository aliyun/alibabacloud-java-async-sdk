// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQualityRuleResponse} extends {@link TeaModel}
 *
 * <p>GetQualityRuleResponse</p>
 */
public class GetQualityRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetQualityRuleResponseBody body;

    private GetQualityRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetQualityRuleResponse create() {
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
    public GetQualityRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetQualityRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetQualityRuleResponseBody body);

        @Override
        GetQualityRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetQualityRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetQualityRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetQualityRuleResponse response) {
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
        public Builder body(GetQualityRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetQualityRuleResponse build() {
            return new GetQualityRuleResponse(this);
        } 

    } 

}
