// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataExportDownloadURLResponse} extends {@link TeaModel}
 *
 * <p>GetDataExportDownloadURLResponse</p>
 */
public class GetDataExportDownloadURLResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDataExportDownloadURLResponseBody body;

    private GetDataExportDownloadURLResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDataExportDownloadURLResponse create() {
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
    public GetDataExportDownloadURLResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDataExportDownloadURLResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDataExportDownloadURLResponseBody body);

        @Override
        GetDataExportDownloadURLResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDataExportDownloadURLResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDataExportDownloadURLResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDataExportDownloadURLResponse response) {
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
        public Builder body(GetDataExportDownloadURLResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDataExportDownloadURLResponse build() {
            return new GetDataExportDownloadURLResponse(this);
        } 

    } 

}
