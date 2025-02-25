// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSparkJobAttemptResponse} extends {@link TeaModel}
 *
 * <p>ListSparkJobAttemptResponse</p>
 */
public class ListSparkJobAttemptResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListSparkJobAttemptResponseBody body;

    private ListSparkJobAttemptResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListSparkJobAttemptResponse create() {
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
    public ListSparkJobAttemptResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSparkJobAttemptResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListSparkJobAttemptResponseBody body);

        @Override
        ListSparkJobAttemptResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSparkJobAttemptResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListSparkJobAttemptResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSparkJobAttemptResponse response) {
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
        public Builder body(ListSparkJobAttemptResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSparkJobAttemptResponse build() {
            return new ListSparkJobAttemptResponse(this);
        } 

    } 

}
