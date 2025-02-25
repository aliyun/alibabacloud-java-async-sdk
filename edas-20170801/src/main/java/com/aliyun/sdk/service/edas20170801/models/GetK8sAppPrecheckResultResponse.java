// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetK8sAppPrecheckResultResponse} extends {@link TeaModel}
 *
 * <p>GetK8sAppPrecheckResultResponse</p>
 */
public class GetK8sAppPrecheckResultResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private GetK8sAppPrecheckResultResponseBody body;

    private GetK8sAppPrecheckResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetK8sAppPrecheckResultResponse create() {
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
    public GetK8sAppPrecheckResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetK8sAppPrecheckResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetK8sAppPrecheckResultResponseBody body);

        @Override
        GetK8sAppPrecheckResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetK8sAppPrecheckResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetK8sAppPrecheckResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetK8sAppPrecheckResultResponse response) {
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
        public Builder body(GetK8sAppPrecheckResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetK8sAppPrecheckResultResponse build() {
            return new GetK8sAppPrecheckResultResponse(this);
        } 

    } 

}
