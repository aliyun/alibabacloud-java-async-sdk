// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetValidationReportResponse} extends {@link TeaModel}
 *
 * <p>GetValidationReportResponse</p>
 */
public class GetValidationReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetValidationReportResponseBody body;

    private GetValidationReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetValidationReportResponse create() {
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
    public GetValidationReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetValidationReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetValidationReportResponseBody body);

        @Override
        GetValidationReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetValidationReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetValidationReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetValidationReportResponse response) {
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
        public Builder body(GetValidationReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetValidationReportResponse build() {
            return new GetValidationReportResponse(this);
        } 

    } 

}
