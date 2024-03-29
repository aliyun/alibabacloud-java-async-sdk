// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRecordDownloadByTimeJobResponse} extends {@link TeaModel}
 *
 * <p>CreateRecordDownloadByTimeJobResponse</p>
 */
public class CreateRecordDownloadByTimeJobResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private CreateRecordDownloadByTimeJobResponseBody body;

    private CreateRecordDownloadByTimeJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateRecordDownloadByTimeJobResponse create() {
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
    public CreateRecordDownloadByTimeJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRecordDownloadByTimeJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateRecordDownloadByTimeJobResponseBody body);

        @Override
        CreateRecordDownloadByTimeJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRecordDownloadByTimeJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateRecordDownloadByTimeJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRecordDownloadByTimeJobResponse response) {
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
        public Builder body(CreateRecordDownloadByTimeJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRecordDownloadByTimeJobResponse build() {
            return new CreateRecordDownloadByTimeJobResponse(this);
        } 

    } 

}
