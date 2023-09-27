// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetArtifactBuildRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetArtifactBuildRuleResponseBody</p>
 */
public class GetArtifactBuildRuleResponseBody extends TeaModel {
    @NameInMap("ArtifactType")
    private String artifactType;

    @NameInMap("BuildRuleId")
    private String buildRuleId;

    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScopeId")
    private String scopeId;

    @NameInMap("ScopeType")
    private String scopeType;

    private GetArtifactBuildRuleResponseBody(Builder builder) {
        this.artifactType = builder.artifactType;
        this.buildRuleId = builder.buildRuleId;
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
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
        private String requestId; 
        private String scopeId; 
        private String scopeType; 

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

}
