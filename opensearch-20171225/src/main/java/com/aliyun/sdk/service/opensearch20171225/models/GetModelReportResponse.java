// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetModelReportResponse} extends {@link TeaModel}
 *
 * <p>GetModelReportResponse</p>
 */
public class GetModelReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetModelReportResponseBody body;

    private GetModelReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetModelReportResponse create() {
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
    public GetModelReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetModelReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetModelReportResponseBody body);

        @Override
        GetModelReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetModelReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetModelReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetModelReportResponse response) {
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
        public Builder body(GetModelReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetModelReportResponse build() {
            return new GetModelReportResponse(this);
        } 

    } 

}
