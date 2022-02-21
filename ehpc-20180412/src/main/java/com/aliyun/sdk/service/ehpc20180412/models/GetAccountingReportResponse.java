// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountingReportResponse} extends {@link TeaModel}
 *
 * <p>GetAccountingReportResponse</p>
 */
public class GetAccountingReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAccountingReportResponseBody body;

    private GetAccountingReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAccountingReportResponse create() {
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
    public GetAccountingReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAccountingReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAccountingReportResponseBody body);

        @Override
        GetAccountingReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAccountingReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAccountingReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAccountingReportResponse response) {
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
        public Builder body(GetAccountingReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAccountingReportResponse build() {
            return new GetAccountingReportResponse(this);
        } 

    } 

}
