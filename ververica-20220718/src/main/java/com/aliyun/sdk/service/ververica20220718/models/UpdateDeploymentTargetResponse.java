// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateDeploymentTargetResponse} extends {@link TeaModel}
 *
 * <p>UpdateDeploymentTargetResponse</p>
 */
public class UpdateDeploymentTargetResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateDeploymentTargetResponseBody body;

    private UpdateDeploymentTargetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateDeploymentTargetResponse create() {
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
    public UpdateDeploymentTargetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDeploymentTargetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateDeploymentTargetResponseBody body);

        @Override
        UpdateDeploymentTargetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDeploymentTargetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateDeploymentTargetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDeploymentTargetResponse response) {
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
        public Builder body(UpdateDeploymentTargetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDeploymentTargetResponse build() {
            return new UpdateDeploymentTargetResponse(this);
        } 

    } 

}
