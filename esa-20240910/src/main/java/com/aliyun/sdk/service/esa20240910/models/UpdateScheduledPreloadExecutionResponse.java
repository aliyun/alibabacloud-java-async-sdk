// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateScheduledPreloadExecutionResponse} extends {@link TeaModel}
 *
 * <p>UpdateScheduledPreloadExecutionResponse</p>
 */
public class UpdateScheduledPreloadExecutionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateScheduledPreloadExecutionResponseBody body;

    private UpdateScheduledPreloadExecutionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateScheduledPreloadExecutionResponse create() {
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
    public UpdateScheduledPreloadExecutionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateScheduledPreloadExecutionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateScheduledPreloadExecutionResponseBody body);

        @Override
        UpdateScheduledPreloadExecutionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateScheduledPreloadExecutionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateScheduledPreloadExecutionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateScheduledPreloadExecutionResponse response) {
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
        public Builder body(UpdateScheduledPreloadExecutionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateScheduledPreloadExecutionResponse build() {
            return new UpdateScheduledPreloadExecutionResponse(this);
        } 

    } 

}
