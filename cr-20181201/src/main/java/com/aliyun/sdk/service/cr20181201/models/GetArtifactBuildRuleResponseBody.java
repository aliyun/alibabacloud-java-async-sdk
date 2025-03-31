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
         * ArtifactType.
         */
        public Builder artifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }

        /**
         * BuildRuleId.
         */
        public Builder buildRuleId(String buildRuleId) {
            this.buildRuleId = buildRuleId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(Parameters parameters) {
            this.parameters = parameters;
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
         * ScopeId.
         */
        public Builder scopeId(String scopeId) {
            this.scopeId = scopeId;
            return this;
        }

        /**
         * ScopeType.
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

        @com.aliyun.core.annotation.NameInMap("PriorityFile")
        private String priorityFile;

        private Parameters(Builder builder) {
            this.imageIndexOnly = builder.imageIndexOnly;
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
         * @return priorityFile
         */
        public String getPriorityFile() {
            return this.priorityFile;
        }

        public static final class Builder {
            private Boolean imageIndexOnly; 
            private String priorityFile; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.imageIndexOnly = model.imageIndexOnly;
                this.priorityFile = model.priorityFile;
            } 

            /**
             * ImageIndexOnly.
             */
            public Builder imageIndexOnly(Boolean imageIndexOnly) {
                this.imageIndexOnly = imageIndexOnly;
                return this;
            }

            /**
             * PriorityFile.
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
