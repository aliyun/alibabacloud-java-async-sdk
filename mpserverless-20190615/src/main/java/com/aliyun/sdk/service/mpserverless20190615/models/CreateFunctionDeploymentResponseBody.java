// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFunctionDeploymentResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFunctionDeploymentResponseBody</p>
 */
public class CreateFunctionDeploymentResponseBody extends TeaModel {
    @NameInMap("DeploymentId")
    private String deploymentId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UploadSignedUrl")
    private String uploadSignedUrl;

    private CreateFunctionDeploymentResponseBody(Builder builder) {
        this.deploymentId = builder.deploymentId;
        this.requestId = builder.requestId;
        this.uploadSignedUrl = builder.uploadSignedUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFunctionDeploymentResponseBody create() {
        return builder().build();
    }

    /**
     * @return deploymentId
     */
    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uploadSignedUrl
     */
    public String getUploadSignedUrl() {
        return this.uploadSignedUrl;
    }

    public static final class Builder {
        private String deploymentId; 
        private String requestId; 
        private String uploadSignedUrl; 

        /**
         * DeploymentId.
         */
        public Builder deploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UploadSignedUrl.
         */
        public Builder uploadSignedUrl(String uploadSignedUrl) {
            this.uploadSignedUrl = uploadSignedUrl;
            return this;
        }

        public CreateFunctionDeploymentResponseBody build() {
            return new CreateFunctionDeploymentResponseBody(this);
        } 

    } 

}
