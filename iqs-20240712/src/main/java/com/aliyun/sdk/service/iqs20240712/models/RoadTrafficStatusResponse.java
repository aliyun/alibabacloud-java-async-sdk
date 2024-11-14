// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20240712.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RoadTrafficStatusResponse} extends {@link TeaModel}
 *
 * <p>RoadTrafficStatusResponse</p>
 */
public class RoadTrafficStatusResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RoadTrafficStatusResponseBody body;

    private RoadTrafficStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RoadTrafficStatusResponse create() {
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
    public RoadTrafficStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RoadTrafficStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(RoadTrafficStatusResponseBody body);

        @Override
        RoadTrafficStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RoadTrafficStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private RoadTrafficStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RoadTrafficStatusResponse response) {
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
        public Builder body(RoadTrafficStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RoadTrafficStatusResponse build() {
            return new RoadTrafficStatusResponse(this);
        } 

    } 

}
