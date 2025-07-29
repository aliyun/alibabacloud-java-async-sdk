// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link DownloadAuditNoteResponse} extends {@link TeaModel}
 *
 * <p>DownloadAuditNoteResponse</p>
 */
public class DownloadAuditNoteResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DownloadAuditNoteResponseBody body;

    private DownloadAuditNoteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DownloadAuditNoteResponse create() {
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
    public DownloadAuditNoteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DownloadAuditNoteResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DownloadAuditNoteResponseBody body);

        @Override
        DownloadAuditNoteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DownloadAuditNoteResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DownloadAuditNoteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DownloadAuditNoteResponse response) {
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
        public Builder body(DownloadAuditNoteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DownloadAuditNoteResponse build() {
            return new DownloadAuditNoteResponse(this);
        } 

    } 

}
