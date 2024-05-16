// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUsageDetailDataExportTaskResponse} extends {@link TeaModel}
 *
 * <p>DeleteUsageDetailDataExportTaskResponse</p>
 */
public class DeleteUsageDetailDataExportTaskResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteUsageDetailDataExportTaskResponseBody body;

    private DeleteUsageDetailDataExportTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteUsageDetailDataExportTaskResponse create() {
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
    public DeleteUsageDetailDataExportTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteUsageDetailDataExportTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteUsageDetailDataExportTaskResponseBody body);

        @Override
        DeleteUsageDetailDataExportTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteUsageDetailDataExportTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeleteUsageDetailDataExportTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteUsageDetailDataExportTaskResponse response) {
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
        public Builder body(DeleteUsageDetailDataExportTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteUsageDetailDataExportTaskResponse build() {
            return new DeleteUsageDetailDataExportTaskResponse(this);
        } 

    } 

}
