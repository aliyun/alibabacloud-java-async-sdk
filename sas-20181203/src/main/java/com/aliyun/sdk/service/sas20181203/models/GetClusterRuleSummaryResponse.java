// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterRuleSummaryResponse} extends {@link TeaModel}
 *
 * <p>GetClusterRuleSummaryResponse</p>
 */
public class GetClusterRuleSummaryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetClusterRuleSummaryResponseBody body;

    private GetClusterRuleSummaryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetClusterRuleSummaryResponse create() {
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
    public GetClusterRuleSummaryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetClusterRuleSummaryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetClusterRuleSummaryResponseBody body);

        @Override
        GetClusterRuleSummaryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetClusterRuleSummaryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetClusterRuleSummaryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetClusterRuleSummaryResponse response) {
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
        public Builder body(GetClusterRuleSummaryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetClusterRuleSummaryResponse build() {
            return new GetClusterRuleSummaryResponse(this);
        } 

    } 

}
