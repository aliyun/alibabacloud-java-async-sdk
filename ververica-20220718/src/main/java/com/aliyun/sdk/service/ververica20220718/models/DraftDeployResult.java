// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DraftDeployResult} extends {@link TeaModel}
 *
 * <p>DraftDeployResult</p>
 */
public class DraftDeployResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("artifactValidationDetail")
    private ValidateStatementResult artifactValidationDetail;

    @com.aliyun.core.annotation.NameInMap("deploymentId")
    private String deploymentId;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private DraftDeployResult(Builder builder) {
        this.artifactValidationDetail = builder.artifactValidationDetail;
        this.deploymentId = builder.deploymentId;
        this.message = builder.message;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DraftDeployResult create() {
        return builder().build();
    }

    /**
     * @return artifactValidationDetail
     */
    public ValidateStatementResult getArtifactValidationDetail() {
        return this.artifactValidationDetail;
    }

    /**
     * @return deploymentId
     */
    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private ValidateStatementResult artifactValidationDetail; 
        private String deploymentId; 
        private String message; 
        private Boolean success; 

        /**
         * artifactValidationDetail.
         */
        public Builder artifactValidationDetail(ValidateStatementResult artifactValidationDetail) {
            this.artifactValidationDetail = artifactValidationDetail;
            return this;
        }

        /**
         * deploymentId.
         */
        public Builder deploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DraftDeployResult build() {
            return new DraftDeployResult(this);
        } 

    } 

}
