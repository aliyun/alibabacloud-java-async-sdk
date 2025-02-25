// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeployK8sApplicationResponse} extends {@link TeaModel}
 *
 * <p>DeployK8sApplicationResponse</p>
 */
public class DeployK8sApplicationResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DeployK8sApplicationResponseBody body;

    private DeployK8sApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeployK8sApplicationResponse create() {
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
    public DeployK8sApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeployK8sApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeployK8sApplicationResponseBody body);

        @Override
        DeployK8sApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeployK8sApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DeployK8sApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeployK8sApplicationResponse response) {
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
        public Builder body(DeployK8sApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeployK8sApplicationResponse build() {
            return new DeployK8sApplicationResponse(this);
        } 

    } 

}
