// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataImportSQLResponse} extends {@link TeaModel}
 *
 * <p>GetDataImportSQLResponse</p>
 */
public class GetDataImportSQLResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDataImportSQLResponseBody body;

    private GetDataImportSQLResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDataImportSQLResponse create() {
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
    public GetDataImportSQLResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDataImportSQLResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDataImportSQLResponseBody body);

        @Override
        GetDataImportSQLResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDataImportSQLResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDataImportSQLResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDataImportSQLResponse response) {
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
        public Builder body(GetDataImportSQLResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDataImportSQLResponse build() {
            return new GetDataImportSQLResponse(this);
        } 

    } 

}
