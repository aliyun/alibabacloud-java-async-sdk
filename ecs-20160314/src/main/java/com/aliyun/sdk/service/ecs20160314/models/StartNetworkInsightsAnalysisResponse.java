// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartNetworkInsightsAnalysisResponse} extends {@link TeaModel}
 *
 * <p>StartNetworkInsightsAnalysisResponse</p>
 */
public class StartNetworkInsightsAnalysisResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartNetworkInsightsAnalysisResponseBody body;

    private StartNetworkInsightsAnalysisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartNetworkInsightsAnalysisResponse create() {
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
    public StartNetworkInsightsAnalysisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartNetworkInsightsAnalysisResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartNetworkInsightsAnalysisResponseBody body);

        @Override
        StartNetworkInsightsAnalysisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartNetworkInsightsAnalysisResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartNetworkInsightsAnalysisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartNetworkInsightsAnalysisResponse response) {
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
        public Builder body(StartNetworkInsightsAnalysisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartNetworkInsightsAnalysisResponse build() {
            return new StartNetworkInsightsAnalysisResponse(this);
        } 

    } 

}
