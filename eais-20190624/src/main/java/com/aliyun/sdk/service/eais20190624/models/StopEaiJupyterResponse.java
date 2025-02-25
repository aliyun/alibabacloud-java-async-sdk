// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

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
 * {@link StopEaiJupyterResponse} extends {@link TeaModel}
 *
 * <p>StopEaiJupyterResponse</p>
 */
public class StopEaiJupyterResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private StopEaiJupyterResponseBody body;

    private StopEaiJupyterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static StopEaiJupyterResponse create() {
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
    public StopEaiJupyterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopEaiJupyterResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(StopEaiJupyterResponseBody body);

        @Override
        StopEaiJupyterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopEaiJupyterResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private StopEaiJupyterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopEaiJupyterResponse response) {
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
        public Builder body(StopEaiJupyterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopEaiJupyterResponse build() {
            return new StopEaiJupyterResponse(this);
        } 

    } 

}
