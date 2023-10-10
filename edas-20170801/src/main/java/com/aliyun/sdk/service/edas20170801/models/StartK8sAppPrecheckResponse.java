// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartK8sAppPrecheckResponse} extends {@link TeaModel}
 *
 * <p>StartK8sAppPrecheckResponse</p>
 */
public class StartK8sAppPrecheckResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private StartK8sAppPrecheckResponseBody body;

    private StartK8sAppPrecheckResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static StartK8sAppPrecheckResponse create() {
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
    public StartK8sAppPrecheckResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartK8sAppPrecheckResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(StartK8sAppPrecheckResponseBody body);

        @Override
        StartK8sAppPrecheckResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartK8sAppPrecheckResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private StartK8sAppPrecheckResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartK8sAppPrecheckResponse response) {
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
        public Builder body(StartK8sAppPrecheckResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartK8sAppPrecheckResponse build() {
            return new StartK8sAppPrecheckResponse(this);
        } 

    } 

}
