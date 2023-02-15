// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FetchLosslessRuleListResponse} extends {@link TeaModel}
 *
 * <p>FetchLosslessRuleListResponse</p>
 */
public class FetchLosslessRuleListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FetchLosslessRuleListResponseBody body;

    private FetchLosslessRuleListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FetchLosslessRuleListResponse create() {
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
    public FetchLosslessRuleListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FetchLosslessRuleListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FetchLosslessRuleListResponseBody body);

        @Override
        FetchLosslessRuleListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FetchLosslessRuleListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FetchLosslessRuleListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FetchLosslessRuleListResponse response) {
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
        public Builder body(FetchLosslessRuleListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FetchLosslessRuleListResponse build() {
            return new FetchLosslessRuleListResponse(this);
        } 

    } 

}
