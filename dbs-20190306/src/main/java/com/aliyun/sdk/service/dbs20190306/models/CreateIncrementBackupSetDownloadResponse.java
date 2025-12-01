// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

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
 * {@link CreateIncrementBackupSetDownloadResponse} extends {@link TeaModel}
 *
 * <p>CreateIncrementBackupSetDownloadResponse</p>
 */
public class CreateIncrementBackupSetDownloadResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateIncrementBackupSetDownloadResponseBody body;

    private CreateIncrementBackupSetDownloadResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateIncrementBackupSetDownloadResponse create() {
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
    public CreateIncrementBackupSetDownloadResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateIncrementBackupSetDownloadResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateIncrementBackupSetDownloadResponseBody body);

        @Override
        CreateIncrementBackupSetDownloadResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateIncrementBackupSetDownloadResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private CreateIncrementBackupSetDownloadResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateIncrementBackupSetDownloadResponse response) {
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
        public Builder body(CreateIncrementBackupSetDownloadResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateIncrementBackupSetDownloadResponse build() {
            return new CreateIncrementBackupSetDownloadResponse(this);
        } 

    } 

}
