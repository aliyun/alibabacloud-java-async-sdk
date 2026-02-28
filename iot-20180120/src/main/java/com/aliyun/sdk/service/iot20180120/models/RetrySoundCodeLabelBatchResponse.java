// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link RetrySoundCodeLabelBatchResponse} extends {@link TeaModel}
 *
 * <p>RetrySoundCodeLabelBatchResponse</p>
 */
public class RetrySoundCodeLabelBatchResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RetrySoundCodeLabelBatchResponseBody body;

    private RetrySoundCodeLabelBatchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RetrySoundCodeLabelBatchResponse create() {
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
    public RetrySoundCodeLabelBatchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RetrySoundCodeLabelBatchResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(RetrySoundCodeLabelBatchResponseBody body);

        @Override
        RetrySoundCodeLabelBatchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RetrySoundCodeLabelBatchResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private RetrySoundCodeLabelBatchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RetrySoundCodeLabelBatchResponse response) {
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
        public Builder body(RetrySoundCodeLabelBatchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RetrySoundCodeLabelBatchResponse build() {
            return new RetrySoundCodeLabelBatchResponse(this);
        } 

    } 

}
