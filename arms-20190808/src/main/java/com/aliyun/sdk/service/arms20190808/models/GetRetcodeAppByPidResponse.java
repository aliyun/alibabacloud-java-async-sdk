// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRetcodeAppByPidResponse} extends {@link TeaModel}
 *
 * <p>GetRetcodeAppByPidResponse</p>
 */
public class GetRetcodeAppByPidResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetRetcodeAppByPidResponseBody body;

    private GetRetcodeAppByPidResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetRetcodeAppByPidResponse create() {
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
    public GetRetcodeAppByPidResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRetcodeAppByPidResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetRetcodeAppByPidResponseBody body);

        @Override
        GetRetcodeAppByPidResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRetcodeAppByPidResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetRetcodeAppByPidResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRetcodeAppByPidResponse response) {
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
        public Builder body(GetRetcodeAppByPidResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRetcodeAppByPidResponse build() {
            return new GetRetcodeAppByPidResponse(this);
        } 

    } 

}
