// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTempFileDownloadLinkResponse} extends {@link TeaModel}
 *
 * <p>GetTempFileDownloadLinkResponse</p>
 */
public class GetTempFileDownloadLinkResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetTempFileDownloadLinkResponseBody body;

    private GetTempFileDownloadLinkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetTempFileDownloadLinkResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public GetTempFileDownloadLinkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTempFileDownloadLinkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetTempFileDownloadLinkResponseBody body);

        @Override
        GetTempFileDownloadLinkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTempFileDownloadLinkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetTempFileDownloadLinkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTempFileDownloadLinkResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
        public Builder body(GetTempFileDownloadLinkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTempFileDownloadLinkResponse build() {
            return new GetTempFileDownloadLinkResponse(this);
        } 

    } 

}
