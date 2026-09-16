// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link GetArtifactBuildRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetArtifactBuildRuleResponseBody</p>
 */
public class GetArtifactBuildRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ArtifactType")
    private String artifactType;

    @com.aliyun.core.annotation.NameInMap("BuildRuleId")
    private String buildRuleId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("Parameters")
    private Parameters parameters;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScopeId")
    private String scopeId;

    @com.aliyun.core.annotation.NameInMap("ScopeType")
    private String scopeType;

    private GetArtifactBuildRuleResponseBody(Builder builder) {
        this.artifactType = builder.artifactType;
        this.buildRuleId = builder.buildRuleId;
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.parameters = builder.parameters;
        this.requestId = builder.requestId;
        this.scopeId = builder.scopeId;
        this.scopeType = builder.scopeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetArtifactBuildRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return artifactType
     */
    public String getArtifactType() {
        return this.artifactType;
    }

    /**
     * @return buildRuleId
     */
    public String getBuildRuleId() {
        return this.buildRuleId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return parameters
     */
    public Parameters getParameters() {
        return this.parameters;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scopeId
     */
    public String getScopeId() {
        return this.scopeId;
    }

    /**
     * @return scopeType
     */
    public String getScopeType() {
        return this.scopeType;
    }

    public static final class Builder {
        private String artifactType; 
        private String buildRuleId; 
        private String code; 
        private Boolean isSuccess; 
        private Parameters parameters; 
        private String requestId; 
        private String scopeId; 
        private String scopeType; 

        private Builder() {
        } 

        private Builder(GetArtifactBuildRuleResponseBody model) {
            this.artifactType = model.artifactType;
            this.buildRuleId = model.buildRuleId;
            this.code = model.code;
            this.isSuccess = model.isSuccess;
            this.parameters = model.parameters;
            this.requestId = model.requestId;
            this.scopeId = model.scopeId;
            this.scopeType = model.scopeType;
        } 

        /**
         * <p>The type of the accelerated image. Valid values:</p>
         * <ul>
         * <li><code>ACCELERATED_IMAGE</code>: generates an accelerated image.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACCELERATED_IMAGE</p>
         */
        public Builder artifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }

        /**
         * <p>The build rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>crabr-o2670wqz2n70****</p>
         */
        public Builder buildRuleId(String buildRuleId) {
            this.buildRuleId = buildRuleId;
            return this;
        }

        /**
         * <p>The response code. Valid values:</p>
         * <ul>
         * <li><strong>200</strong>: success.</li>
         * <li>Other values: error codes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether the API call is successful. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: The API call is successful.</p>
         * </li>
         * <li><p><code>false</code>: The API call failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The additional parameters.</p>
         */
        public Builder parameters(Parameters parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7A3E98F6-296C-54AC-A612-B75E7777D4C1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the scope in which the rule takes effect. Valid values:</p>
         * <ul>
         * <li>ScopeId: the image repository ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>crr-8dz3aedjqlmk****</p>
         */
        public Builder scopeId(String scopeId) {
            this.scopeId = scopeId;
            return this;
        }

        /**
         * <p>The scope of the rule. Valid values:</p>
         * <ul>
         * <li><code>REPOSITORY</code>: repository level.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>REPOSITORY</p>
         */
        public Builder scopeType(String scopeType) {
            this.scopeType = scopeType;
            return this;
        }

        public GetArtifactBuildRuleResponseBody build() {
            return new GetArtifactBuildRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetArtifactBuildRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetArtifactBuildRuleResponseBody</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageIndexOnly")
        private Boolean imageIndexOnly;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("PriorityFile")
        private String priorityFile;

        private Parameters(Builder builder) {
            this.imageIndexOnly = builder.imageIndexOnly;
            this.priority = builder.priority;
            this.priorityFile = builder.priorityFile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return imageIndexOnly
         */
        public Boolean getImageIndexOnly() {
            return this.imageIndexOnly;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return priorityFile
         */
        public String getPriorityFile() {
            return this.priorityFile;
        }

        public static final class Builder {
            private Boolean imageIndexOnly; 
            private Integer priority; 
            private String priorityFile; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.imageIndexOnly = model.imageIndexOnly;
                this.priority = model.priority;
                this.priorityFile = model.priorityFile;
            } 

            /**
             * <p>Indicates whether the index-only mode is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder imageIndexOnly(Boolean imageIndexOnly) {
                this.imageIndexOnly = imageIndexOnly;
                return this;
            }

            /**
             * <p>The task priority. Valid values: [1, 5].</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The list of prefetch files for the accelerated image. Each line contains an absolute path. The list is Base64-encoded.</p>
             * 
             * <strong>example:</strong>
             * <p>L2hvbWUvdGVzdC8=</p>
             */
            public Builder priorityFile(String priorityFile) {
                this.priorityFile = priorityFile;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
}
