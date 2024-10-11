// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSparkSessionStateResponse} extends {@link TeaModel}
 *
 * <p>GetSparkSessionStateResponse</p>
 */
public class GetSparkSessionStateResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetSparkSessionStateResponseBody body;

    private GetSparkSessionStateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetSparkSessionStateResponse create() {
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
    public GetSparkSessionStateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSparkSessionStateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetSparkSessionStateResponseBody body);

        @Override
        GetSparkSessionStateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSparkSessionStateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetSparkSessionStateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSparkSessionStateResponse response) {
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
        public Builder body(GetSparkSessionStateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSparkSessionStateResponse build() {
            return new GetSparkSessionStateResponse(this);
        } 

    } 

}
