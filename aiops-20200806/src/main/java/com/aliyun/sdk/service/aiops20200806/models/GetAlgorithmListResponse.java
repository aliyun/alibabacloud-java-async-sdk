// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAlgorithmListResponse} extends {@link TeaModel}
 *
 * <p>GetAlgorithmListResponse</p>
 */
public class GetAlgorithmListResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private GetAlgorithmListResponseBody body;

    private GetAlgorithmListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetAlgorithmListResponse create() {
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
    public GetAlgorithmListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAlgorithmListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetAlgorithmListResponseBody body);

        @Override
        GetAlgorithmListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAlgorithmListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetAlgorithmListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAlgorithmListResponse response) {
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
        public Builder body(GetAlgorithmListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAlgorithmListResponse build() {
            return new GetAlgorithmListResponse(this);
        } 

    } 

}
