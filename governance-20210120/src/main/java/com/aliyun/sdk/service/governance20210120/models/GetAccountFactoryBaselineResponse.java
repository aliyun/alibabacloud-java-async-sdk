// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountFactoryBaselineResponse} extends {@link TeaModel}
 *
 * <p>GetAccountFactoryBaselineResponse</p>
 */
public class GetAccountFactoryBaselineResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private GetAccountFactoryBaselineResponseBody body;

    private GetAccountFactoryBaselineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetAccountFactoryBaselineResponse create() {
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
    public GetAccountFactoryBaselineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAccountFactoryBaselineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetAccountFactoryBaselineResponseBody body);

        @Override
        GetAccountFactoryBaselineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAccountFactoryBaselineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetAccountFactoryBaselineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAccountFactoryBaselineResponse response) {
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
        public Builder body(GetAccountFactoryBaselineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAccountFactoryBaselineResponse build() {
            return new GetAccountFactoryBaselineResponse(this);
        } 

    } 

}
