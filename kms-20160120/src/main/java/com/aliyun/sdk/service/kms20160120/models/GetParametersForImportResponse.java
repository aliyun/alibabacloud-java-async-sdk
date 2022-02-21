// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetParametersForImportResponse} extends {@link TeaModel}
 *
 * <p>GetParametersForImportResponse</p>
 */
public class GetParametersForImportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetParametersForImportResponseBody body;

    private GetParametersForImportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetParametersForImportResponse create() {
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
    public GetParametersForImportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetParametersForImportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetParametersForImportResponseBody body);

        @Override
        GetParametersForImportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetParametersForImportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetParametersForImportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetParametersForImportResponse response) {
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
        public Builder body(GetParametersForImportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetParametersForImportResponse build() {
            return new GetParametersForImportResponse(this);
        } 

    } 

}
