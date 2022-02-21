// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCredentialReportResponse} extends {@link TeaModel}
 *
 * <p>GetCredentialReportResponse</p>
 */
public class GetCredentialReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCredentialReportResponseBody body;

    private GetCredentialReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCredentialReportResponse create() {
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
    public GetCredentialReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCredentialReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCredentialReportResponseBody body);

        @Override
        GetCredentialReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCredentialReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCredentialReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCredentialReportResponse response) {
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
        public Builder body(GetCredentialReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCredentialReportResponse build() {
            return new GetCredentialReportResponse(this);
        } 

    } 

}
