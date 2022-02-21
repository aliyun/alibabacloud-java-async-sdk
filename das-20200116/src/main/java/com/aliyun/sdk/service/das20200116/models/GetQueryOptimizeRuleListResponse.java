// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQueryOptimizeRuleListResponse} extends {@link TeaModel}
 *
 * <p>GetQueryOptimizeRuleListResponse</p>
 */
public class GetQueryOptimizeRuleListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetQueryOptimizeRuleListResponseBody body;

    private GetQueryOptimizeRuleListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetQueryOptimizeRuleListResponse create() {
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
    public GetQueryOptimizeRuleListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetQueryOptimizeRuleListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetQueryOptimizeRuleListResponseBody body);

        @Override
        GetQueryOptimizeRuleListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetQueryOptimizeRuleListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetQueryOptimizeRuleListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetQueryOptimizeRuleListResponse response) {
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
        public Builder body(GetQueryOptimizeRuleListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetQueryOptimizeRuleListResponse build() {
            return new GetQueryOptimizeRuleListResponse(this);
        } 

    } 

}
