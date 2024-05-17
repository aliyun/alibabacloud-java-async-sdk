// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachApplication2ConnectorResponse} extends {@link TeaModel}
 *
 * <p>DetachApplication2ConnectorResponse</p>
 */
public class DetachApplication2ConnectorResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DetachApplication2ConnectorResponseBody body;

    private DetachApplication2ConnectorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DetachApplication2ConnectorResponse create() {
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
    public DetachApplication2ConnectorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachApplication2ConnectorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DetachApplication2ConnectorResponseBody body);

        @Override
        DetachApplication2ConnectorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachApplication2ConnectorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DetachApplication2ConnectorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachApplication2ConnectorResponse response) {
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
        public Builder body(DetachApplication2ConnectorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachApplication2ConnectorResponse build() {
            return new DetachApplication2ConnectorResponse(this);
        } 

    } 

}
