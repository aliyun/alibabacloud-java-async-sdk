// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAgentDetailReportResponse} extends {@link TeaModel}
 *
 * <p>GetAgentDetailReportResponse</p>
 */
public class GetAgentDetailReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAgentDetailReportResponseBody body;

    private GetAgentDetailReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAgentDetailReportResponse create() {
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
    public GetAgentDetailReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAgentDetailReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAgentDetailReportResponseBody body);

        @Override
        GetAgentDetailReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAgentDetailReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAgentDetailReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAgentDetailReportResponse response) {
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
        public Builder body(GetAgentDetailReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAgentDetailReportResponse build() {
            return new GetAgentDetailReportResponse(this);
        } 

    } 

}
