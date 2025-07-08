// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link ExportCardSmsStatisticsSendResponse} extends {@link TeaModel}
 *
 * <p>ExportCardSmsStatisticsSendResponse</p>
 */
public class ExportCardSmsStatisticsSendResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ExportCardSmsStatisticsSendResponseBody body;

    private ExportCardSmsStatisticsSendResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ExportCardSmsStatisticsSendResponse create() {
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
    public ExportCardSmsStatisticsSendResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExportCardSmsStatisticsSendResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ExportCardSmsStatisticsSendResponseBody body);

        @Override
        ExportCardSmsStatisticsSendResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExportCardSmsStatisticsSendResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ExportCardSmsStatisticsSendResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExportCardSmsStatisticsSendResponse response) {
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
        public Builder body(ExportCardSmsStatisticsSendResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExportCardSmsStatisticsSendResponse build() {
            return new ExportCardSmsStatisticsSendResponse(this);
        } 

    } 

}
