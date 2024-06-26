// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ContinuouslyPushResponse} extends {@link TeaModel}
 *
 * <p>ContinuouslyPushResponse</p>
 */
public class ContinuouslyPushResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ContinuouslyPushResponseBody body;

    private ContinuouslyPushResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ContinuouslyPushResponse create() {
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
    public ContinuouslyPushResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ContinuouslyPushResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ContinuouslyPushResponseBody body);

        @Override
        ContinuouslyPushResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ContinuouslyPushResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ContinuouslyPushResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ContinuouslyPushResponse response) {
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
        public Builder body(ContinuouslyPushResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ContinuouslyPushResponse build() {
            return new ContinuouslyPushResponse(this);
        } 

    } 

}
