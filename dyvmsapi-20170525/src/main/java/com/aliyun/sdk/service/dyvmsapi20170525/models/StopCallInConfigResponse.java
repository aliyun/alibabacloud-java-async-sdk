// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StopCallInConfigResponse} extends {@link TeaModel}
 *
 * <p>StopCallInConfigResponse</p>
 */
public class StopCallInConfigResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private StopCallInConfigResponseBody body;

    private StopCallInConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static StopCallInConfigResponse create() {
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
    public StopCallInConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopCallInConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(StopCallInConfigResponseBody body);

        @Override
        StopCallInConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopCallInConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private StopCallInConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopCallInConfigResponse response) {
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
        public Builder body(StopCallInConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopCallInConfigResponse build() {
            return new StopCallInConfigResponse(this);
        } 

    } 

}
