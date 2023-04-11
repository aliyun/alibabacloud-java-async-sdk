// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataImportSQLPreCheckDetailResponse} extends {@link TeaModel}
 *
 * <p>ListDataImportSQLPreCheckDetailResponse</p>
 */
public class ListDataImportSQLPreCheckDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDataImportSQLPreCheckDetailResponseBody body;

    private ListDataImportSQLPreCheckDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDataImportSQLPreCheckDetailResponse create() {
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
    public ListDataImportSQLPreCheckDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDataImportSQLPreCheckDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDataImportSQLPreCheckDetailResponseBody body);

        @Override
        ListDataImportSQLPreCheckDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDataImportSQLPreCheckDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDataImportSQLPreCheckDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDataImportSQLPreCheckDetailResponse response) {
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
        public Builder body(ListDataImportSQLPreCheckDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDataImportSQLPreCheckDetailResponse build() {
            return new ListDataImportSQLPreCheckDetailResponse(this);
        } 

    } 

}
