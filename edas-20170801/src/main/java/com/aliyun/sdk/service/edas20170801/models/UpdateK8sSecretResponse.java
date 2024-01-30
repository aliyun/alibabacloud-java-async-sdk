// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateK8sSecretResponse} extends {@link TeaModel}
 *
 * <p>UpdateK8sSecretResponse</p>
 */
public class UpdateK8sSecretResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private UpdateK8sSecretResponseBody body;

    private UpdateK8sSecretResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateK8sSecretResponse create() {
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
    public UpdateK8sSecretResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateK8sSecretResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateK8sSecretResponseBody body);

        @Override
        UpdateK8sSecretResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateK8sSecretResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateK8sSecretResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateK8sSecretResponse response) {
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
        public Builder body(UpdateK8sSecretResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateK8sSecretResponse build() {
            return new UpdateK8sSecretResponse(this);
        } 

    } 

}
