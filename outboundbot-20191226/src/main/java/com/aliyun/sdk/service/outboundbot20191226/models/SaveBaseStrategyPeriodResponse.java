// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link SaveBaseStrategyPeriodResponse} extends {@link TeaModel}
 *
 * <p>SaveBaseStrategyPeriodResponse</p>
 */
public class SaveBaseStrategyPeriodResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SaveBaseStrategyPeriodResponseBody body;

    private SaveBaseStrategyPeriodResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SaveBaseStrategyPeriodResponse create() {
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
    public SaveBaseStrategyPeriodResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveBaseStrategyPeriodResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(SaveBaseStrategyPeriodResponseBody body);

        @Override
        SaveBaseStrategyPeriodResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveBaseStrategyPeriodResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private SaveBaseStrategyPeriodResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveBaseStrategyPeriodResponse response) {
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
        public Builder body(SaveBaseStrategyPeriodResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveBaseStrategyPeriodResponse build() {
            return new SaveBaseStrategyPeriodResponse(this);
        } 

    } 

}
