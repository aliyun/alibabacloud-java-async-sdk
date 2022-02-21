// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateAgentStatisticReportResponse} extends {@link TeaModel}
 *
 * <p>GenerateAgentStatisticReportResponse</p>
 */
public class GenerateAgentStatisticReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GenerateAgentStatisticReportResponseBody body;

    private GenerateAgentStatisticReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GenerateAgentStatisticReportResponse create() {
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
    public GenerateAgentStatisticReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateAgentStatisticReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GenerateAgentStatisticReportResponseBody body);

        @Override
        GenerateAgentStatisticReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateAgentStatisticReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GenerateAgentStatisticReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateAgentStatisticReportResponse response) {
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
        public Builder body(GenerateAgentStatisticReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateAgentStatisticReportResponse build() {
            return new GenerateAgentStatisticReportResponse(this);
        } 

    } 

}
