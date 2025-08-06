// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link ListAIVideoSummaryJobResponse} extends {@link TeaModel}
 *
 * <p>ListAIVideoSummaryJobResponse</p>
 */
public class ListAIVideoSummaryJobResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListAIVideoSummaryJobResponseBody body;

    private ListAIVideoSummaryJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListAIVideoSummaryJobResponse create() {
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
    public ListAIVideoSummaryJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAIVideoSummaryJobResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListAIVideoSummaryJobResponseBody body);

        @Override
        ListAIVideoSummaryJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAIVideoSummaryJobResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListAIVideoSummaryJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAIVideoSummaryJobResponse response) {
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
        public Builder body(ListAIVideoSummaryJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAIVideoSummaryJobResponse build() {
            return new ListAIVideoSummaryJobResponse(this);
        } 

    } 

}
