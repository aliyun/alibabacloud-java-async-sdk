// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotlineAgentDetailReportResponse} extends {@link TeaModel}
 *
 * <p>GetHotlineAgentDetailReportResponse</p>
 */
public class GetHotlineAgentDetailReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHotlineAgentDetailReportResponseBody body;

    private GetHotlineAgentDetailReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHotlineAgentDetailReportResponse create() {
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
    public GetHotlineAgentDetailReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHotlineAgentDetailReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHotlineAgentDetailReportResponseBody body);

        @Override
        GetHotlineAgentDetailReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHotlineAgentDetailReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHotlineAgentDetailReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHotlineAgentDetailReportResponse response) {
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
        public Builder body(GetHotlineAgentDetailReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHotlineAgentDetailReportResponse build() {
            return new GetHotlineAgentDetailReportResponse(this);
        } 

    } 

}
