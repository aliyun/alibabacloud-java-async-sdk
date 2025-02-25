// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFunctionVersionResponse} extends {@link TeaModel}
 *
 * <p>GetFunctionVersionResponse</p>
 */
public class GetFunctionVersionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetFunctionVersionResponseBody body;

    private GetFunctionVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetFunctionVersionResponse create() {
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
    public GetFunctionVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFunctionVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetFunctionVersionResponseBody body);

        @Override
        GetFunctionVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFunctionVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetFunctionVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFunctionVersionResponse response) {
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
        public Builder body(GetFunctionVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFunctionVersionResponse build() {
            return new GetFunctionVersionResponse(this);
        } 

    } 

}
