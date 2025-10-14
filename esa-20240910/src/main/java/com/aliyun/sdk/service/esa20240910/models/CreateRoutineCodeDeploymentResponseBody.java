// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreateRoutineCodeDeploymentResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRoutineCodeDeploymentResponseBody</p>
 */
public class CreateRoutineCodeDeploymentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CodeVersions")
    private java.util.List<CodeVersions> codeVersions;

    @com.aliyun.core.annotation.NameInMap("DeploymentId")
    private String deploymentId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Strategy")
    private String strategy;

    private CreateRoutineCodeDeploymentResponseBody(Builder builder) {
        this.codeVersions = builder.codeVersions;
        this.deploymentId = builder.deploymentId;
        this.requestId = builder.requestId;
        this.strategy = builder.strategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRoutineCodeDeploymentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeVersions
     */
    public java.util.List<CodeVersions> getCodeVersions() {
        return this.codeVersions;
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
     * @return strategy
     */
    public String getStrategy() {
        return this.strategy;
    }

    public static final class Builder {
        private java.util.List<CodeVersions> codeVersions; 
        private String deploymentId; 
        private String requestId; 
        private String strategy; 

        private Builder() {
        } 

        private Builder(CreateRoutineCodeDeploymentResponseBody model) {
            this.codeVersions = model.codeVersions;
            this.deploymentId = model.deploymentId;
            this.requestId = model.requestId;
            this.strategy = model.strategy;
        } 

        /**
         * <p>The configuration list of the phased release version number.</p>
         */
        public Builder codeVersions(java.util.List<CodeVersions> codeVersions) {
            this.codeVersions = codeVersions;
            return this;
        }

        /**
         * <p>The deployment record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>234</p>
         */
        public Builder deploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EDBD3EB3-97DA-5465-AEF5-8DCA5DC5E395</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The phased release policy. The constant string is &quot;percentage&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>percentage</p>
         */
        public Builder strategy(String strategy) {
            this.strategy = strategy;
            return this;
        }

        public CreateRoutineCodeDeploymentResponseBody build() {
            return new CreateRoutineCodeDeploymentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateRoutineCodeDeploymentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRoutineCodeDeploymentResponseBody</p>
     */
    public static class CodeVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CodeVersion")
        private String codeVersion;

        @com.aliyun.core.annotation.NameInMap("Percentage")
        private Long percentage;

        private CodeVersions(Builder builder) {
            this.codeVersion = builder.codeVersion;
            this.percentage = builder.percentage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CodeVersions create() {
            return builder().build();
        }

        /**
         * @return codeVersion
         */
        public String getCodeVersion() {
            return this.codeVersion;
        }

        /**
         * @return percentage
         */
        public Long getPercentage() {
            return this.percentage;
        }

        public static final class Builder {
            private String codeVersion; 
            private Long percentage; 

            private Builder() {
            } 

            private Builder(CodeVersions model) {
                this.codeVersion = model.codeVersion;
                this.percentage = model.percentage;
            } 

            /**
             * <p>The version of the code.</p>
             * 
             * <strong>example:</strong>
             * <p>1723599747213377175</p>
             */
            public Builder codeVersion(String codeVersion) {
                this.codeVersion = codeVersion;
                return this;
            }

            /**
             * <p>The phased release ratio.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percentage(Long percentage) {
                this.percentage = percentage;
                return this;
            }

            public CodeVersions build() {
                return new CodeVersions(this);
            } 

        } 

    }
}
