// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAgentStatisticsResponse} extends {@link TeaModel}
 *
 * <p>GetAgentStatisticsResponse</p>
 */
public class GetAgentStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAgentStatisticsResponseBody body;

    private GetAgentStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAgentStatisticsResponse create() {
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
    public GetAgentStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAgentStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAgentStatisticsResponseBody body);

        @Override
        GetAgentStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAgentStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAgentStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAgentStatisticsResponse response) {
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
        public Builder body(GetAgentStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAgentStatisticsResponse build() {
            return new GetAgentStatisticsResponse(this);
        } 

    } 

}
