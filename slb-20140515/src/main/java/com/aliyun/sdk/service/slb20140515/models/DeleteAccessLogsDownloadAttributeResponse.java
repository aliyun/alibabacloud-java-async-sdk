// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAccessLogsDownloadAttributeResponse} extends {@link TeaModel}
 *
 * <p>DeleteAccessLogsDownloadAttributeResponse</p>
 */
public class DeleteAccessLogsDownloadAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAccessLogsDownloadAttributeResponseBody body;

    private DeleteAccessLogsDownloadAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteAccessLogsDownloadAttributeResponse create() {
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
    public DeleteAccessLogsDownloadAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAccessLogsDownloadAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteAccessLogsDownloadAttributeResponseBody body);

        @Override
        DeleteAccessLogsDownloadAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAccessLogsDownloadAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeleteAccessLogsDownloadAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAccessLogsDownloadAttributeResponse response) {
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
        public Builder body(DeleteAccessLogsDownloadAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAccessLogsDownloadAttributeResponse build() {
            return new DeleteAccessLogsDownloadAttributeResponse(this);
        } 

    } 

}
