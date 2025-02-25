// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDbExportDownloadURLResponse} extends {@link TeaModel}
 *
 * <p>GetDbExportDownloadURLResponse</p>
 */
public class GetDbExportDownloadURLResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetDbExportDownloadURLResponseBody body;

    private GetDbExportDownloadURLResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetDbExportDownloadURLResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public GetDbExportDownloadURLResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDbExportDownloadURLResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetDbExportDownloadURLResponseBody body);

        @Override
        GetDbExportDownloadURLResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDbExportDownloadURLResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetDbExportDownloadURLResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDbExportDownloadURLResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(GetDbExportDownloadURLResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDbExportDownloadURLResponse build() {
            return new GetDbExportDownloadURLResponse(this);
        } 

    } 

}
