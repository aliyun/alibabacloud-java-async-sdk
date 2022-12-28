// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInterceptionRuleDetailResponse} extends {@link TeaModel}
 *
 * <p>GetInterceptionRuleDetailResponse</p>
 */
public class GetInterceptionRuleDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetInterceptionRuleDetailResponseBody body;

    private GetInterceptionRuleDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetInterceptionRuleDetailResponse create() {
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
    public GetInterceptionRuleDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetInterceptionRuleDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetInterceptionRuleDetailResponseBody body);

        @Override
        GetInterceptionRuleDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInterceptionRuleDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetInterceptionRuleDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInterceptionRuleDetailResponse response) {
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
        public Builder body(GetInterceptionRuleDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetInterceptionRuleDetailResponse build() {
            return new GetInterceptionRuleDetailResponse(this);
        } 

    } 

}
