// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataExportOrderDetailResponse} extends {@link TeaModel}
 *
 * <p>GetDataExportOrderDetailResponse</p>
 */
public class GetDataExportOrderDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDataExportOrderDetailResponseBody body;

    private GetDataExportOrderDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDataExportOrderDetailResponse create() {
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
    public GetDataExportOrderDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDataExportOrderDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDataExportOrderDetailResponseBody body);

        @Override
        GetDataExportOrderDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDataExportOrderDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDataExportOrderDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDataExportOrderDetailResponse response) {
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
        public Builder body(GetDataExportOrderDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDataExportOrderDetailResponse build() {
            return new GetDataExportOrderDetailResponse(this);
        } 

    } 

}
