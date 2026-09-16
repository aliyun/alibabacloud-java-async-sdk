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
 * {@link GetArtifactSubscriptionRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetArtifactSubscriptionRuleResponseBody</p>
 */
public class GetArtifactSubscriptionRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accelerate")
    private Boolean accelerate;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("ModifiedTime")
    private Long modifiedTime;

    @com.aliyun.core.annotation.NameInMap("NamespaceName")
    private String namespaceName;

    @com.aliyun.core.annotation.NameInMap("Override")
    private Boolean override;

    @com.aliyun.core.annotation.NameInMap("Platform")
    private java.util.List<String> platform;

    @com.aliyun.core.annotation.NameInMap("RepoName")
    private String repoName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleId")
    private String ruleId;

    @com.aliyun.core.annotation.NameInMap("SourceDomain")
    private String sourceDomain;

    @com.aliyun.core.annotation.NameInMap("SourceNamespaceName")
    private String sourceNamespaceName;

    @com.aliyun.core.annotation.NameInMap("SourceProvider")
    private String sourceProvider;

    @com.aliyun.core.annotation.NameInMap("SourceRepoName")
    private String sourceRepoName;

    @com.aliyun.core.annotation.NameInMap("TagCount")
    private Long tagCount;

    @com.aliyun.core.annotation.NameInMap("TagRegexp")
    private String tagRegexp;

    private GetArtifactSubscriptionRuleResponseBody(Builder builder) {
        this.accelerate = builder.accelerate;
        this.code = builder.code;
        this.createTime = builder.createTime;
        this.instanceId = builder.instanceId;
        this.isSuccess = builder.isSuccess;
        this.modifiedTime = builder.modifiedTime;
        this.namespaceName = builder.namespaceName;
        this.override = builder.override;
        this.platform = builder.platform;
        this.repoName = builder.repoName;
        this.requestId = builder.requestId;
        this.ruleId = builder.ruleId;
        this.sourceDomain = builder.sourceDomain;
        this.sourceNamespaceName = builder.sourceNamespaceName;
        this.sourceProvider = builder.sourceProvider;
        this.sourceRepoName = builder.sourceRepoName;
        this.tagCount = builder.tagCount;
        this.tagRegexp = builder.tagRegexp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetArtifactSubscriptionRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accelerate
     */
    public Boolean getAccelerate() {
        return this.accelerate;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return modifiedTime
     */
    public Long getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * @return override
     */
    public Boolean getOverride() {
        return this.override;
    }

    /**
     * @return platform
     */
    public java.util.List<String> getPlatform() {
        return this.platform;
    }

    /**
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return sourceDomain
     */
    public String getSourceDomain() {
        return this.sourceDomain;
    }

    /**
     * @return sourceNamespaceName
     */
    public String getSourceNamespaceName() {
        return this.sourceNamespaceName;
    }

    /**
     * @return sourceProvider
     */
    public String getSourceProvider() {
        return this.sourceProvider;
    }

    /**
     * @return sourceRepoName
     */
    public String getSourceRepoName() {
        return this.sourceRepoName;
    }

    /**
     * @return tagCount
     */
    public Long getTagCount() {
        return this.tagCount;
    }

    /**
     * @return tagRegexp
     */
    public String getTagRegexp() {
        return this.tagRegexp;
    }

    public static final class Builder {
        private Boolean accelerate; 
        private String code; 
        private Long createTime; 
        private String instanceId; 
        private Boolean isSuccess; 
        private Long modifiedTime; 
        private String namespaceName; 
        private Boolean override; 
        private java.util.List<String> platform; 
        private String repoName; 
        private String requestId; 
        private String ruleId; 
        private String sourceDomain; 
        private String sourceNamespaceName; 
        private String sourceProvider; 
        private String sourceRepoName; 
        private Long tagCount; 
        private String tagRegexp; 

        private Builder() {
        } 

        private Builder(GetArtifactSubscriptionRuleResponseBody model) {
            this.accelerate = model.accelerate;
            this.code = model.code;
            this.createTime = model.createTime;
            this.instanceId = model.instanceId;
            this.isSuccess = model.isSuccess;
            this.modifiedTime = model.modifiedTime;
            this.namespaceName = model.namespaceName;
            this.override = model.override;
            this.platform = model.platform;
            this.repoName = model.repoName;
            this.requestId = model.requestId;
            this.ruleId = model.ruleId;
            this.sourceDomain = model.sourceDomain;
            this.sourceNamespaceName = model.sourceNamespaceName;
            this.sourceProvider = model.sourceProvider;
            this.sourceRepoName = model.sourceRepoName;
            this.tagCount = model.tagCount;
            this.tagRegexp = model.tagRegexp;
        } 

        /**
         * <p>Indicates whether to enable the accelerated data transfer feature. This feature is in public preview. It optimizes scheduling policies and network paths to improve the speed of artifact subscription.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder accelerate(Boolean accelerate) {
            this.accelerate = accelerate;
            return this;
        }

        /**
         * <p>The return code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The time when the rule was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1570759546000</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-hpdfkc6utbaq****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: The request succeeded.</p>
         * </li>
         * <li><p><code>false</code>: The request failed.</p>
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
         * <p>The time when the rule was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1638259914000</p>
         */
        public Builder modifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * <p>The destination ACR namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>test-ns</p>
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * <p>Indicates whether to overwrite the existing images that have the same tag in the destination repository.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder override(Boolean override) {
            this.override = override;
            return this;
        }

        /**
         * <p>The operating systems and architectures. If a source repository contains multi-architecture images, only images that match the specified platforms are synchronized to the destination repository of the Enterprise Edition instance.</p>
         */
        public Builder platform(java.util.List<String> platform) {
            this.platform = platform;
            return this;
        }

        /**
         * <p>The destination ACR repository.</p>
         * 
         * <strong>example:</strong>
         * <p>test-repo</p>
         */
        public Builder repoName(String repoName) {
            this.repoName = repoName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D4978DCC-ECBD-40B0-A714-EE6959B22C77</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>crasr-mdbpung4i1rm****</p>
         */
        public Builder ruleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The domain name of the artifact source.</p>
         */
        public Builder sourceDomain(String sourceDomain) {
            this.sourceDomain = sourceDomain;
            return this;
        }

        /**
         * <p>The source namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>library</p>
         */
        public Builder sourceNamespaceName(String sourceNamespaceName) {
            this.sourceNamespaceName = sourceNamespaceName;
            return this;
        }

        /**
         * <p>The artifact source.</p>
         * 
         * <strong>example:</strong>
         * <p>DOCKER_HUB</p>
         */
        public Builder sourceProvider(String sourceProvider) {
            this.sourceProvider = sourceProvider;
            return this;
        }

        /**
         * <p>The source repository.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx</p>
         */
        public Builder sourceRepoName(String sourceRepoName) {
            this.sourceRepoName = sourceRepoName;
            return this;
        }

        /**
         * <p>The number of images to subscribe to.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder tagCount(Long tagCount) {
            this.tagCount = tagCount;
            return this;
        }

        /**
         * <p>The regular expression that is used to match the tags of images in the source repository for subscription.</p>
         * 
         * <strong>example:</strong>
         * <p>release-v.*</p>
         */
        public Builder tagRegexp(String tagRegexp) {
            this.tagRegexp = tagRegexp;
            return this;
        }

        public GetArtifactSubscriptionRuleResponseBody build() {
            return new GetArtifactSubscriptionRuleResponseBody(this);
        } 

    } 

}
