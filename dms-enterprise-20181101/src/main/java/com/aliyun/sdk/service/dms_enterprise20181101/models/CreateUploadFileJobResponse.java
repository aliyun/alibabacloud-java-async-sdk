// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateUploadFileJobResponse} extends {@link TeaModel}
 *
 * <p>CreateUploadFileJobResponse</p>
 */
public class CreateUploadFileJobResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateUploadFileJobResponseBody body;

    private CreateUploadFileJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateUploadFileJobResponse create() {
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
    public CreateUploadFileJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateUploadFileJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateUploadFileJobResponseBody body);

        @Override
        CreateUploadFileJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateUploadFileJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateUploadFileJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateUploadFileJobResponse response) {
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
        public Builder body(CreateUploadFileJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateUploadFileJobResponse build() {
            return new CreateUploadFileJobResponse(this);
        } 

    } 

}
