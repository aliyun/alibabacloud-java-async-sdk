// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTranslateReportResponse} extends {@link TeaModel}
 *
 * <p>GetTranslateReportResponse</p>
 */
public class GetTranslateReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTranslateReportResponseBody body;

    private GetTranslateReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTranslateReportResponse create() {
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
    public GetTranslateReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTranslateReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTranslateReportResponseBody body);

        @Override
        GetTranslateReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTranslateReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTranslateReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTranslateReportResponse response) {
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
        public Builder body(GetTranslateReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTranslateReportResponse build() {
            return new GetTranslateReportResponse(this);
        } 

    } 

}
