// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApplicationVariablesResponse} extends {@link TeaModel}
 *
 * <p>GetApplicationVariablesResponse</p>
 */
public class GetApplicationVariablesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetApplicationVariablesResponseBody body;

    private GetApplicationVariablesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetApplicationVariablesResponse create() {
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
    public GetApplicationVariablesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetApplicationVariablesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetApplicationVariablesResponseBody body);

        @Override
        GetApplicationVariablesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetApplicationVariablesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetApplicationVariablesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetApplicationVariablesResponse response) {
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
        public Builder body(GetApplicationVariablesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetApplicationVariablesResponse build() {
            return new GetApplicationVariablesResponse(this);
        } 

    } 

}
