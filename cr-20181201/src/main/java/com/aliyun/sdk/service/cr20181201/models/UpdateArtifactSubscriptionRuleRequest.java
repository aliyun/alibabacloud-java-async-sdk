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
 * {@link UpdateArtifactSubscriptionRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateArtifactSubscriptionRuleRequest</p>
 */
public class UpdateArtifactSubscriptionRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Accelerate")
    private String accelerate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceName")
    private String namespaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Override")
    private String override;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platform")
    private java.util.List<String> platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoName")
    private String repoName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceNamespaceName")
    private String sourceNamespaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceProvider")
    private String sourceProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRepoName")
    private String sourceRepoName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagCount")
    private Long tagCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagList")
    private java.util.List<String> tagList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagRegexp")
    private String tagRegexp;

    private UpdateArtifactSubscriptionRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.accelerate = builder.accelerate;
        this.instanceId = builder.instanceId;
        this.namespaceName = builder.namespaceName;
        this.override = builder.override;
        this.platform = builder.platform;
        this.repoName = builder.repoName;
        this.ruleId = builder.ruleId;
        this.sourceNamespaceName = builder.sourceNamespaceName;
        this.sourceProvider = builder.sourceProvider;
        this.sourceRepoName = builder.sourceRepoName;
        this.tagCount = builder.tagCount;
        this.tagList = builder.tagList;
        this.tagRegexp = builder.tagRegexp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateArtifactSubscriptionRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return accelerate
     */
    public String getAccelerate() {
        return this.accelerate;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
    public String getOverride() {
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
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
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
     * @return tagList
     */
    public java.util.List<String> getTagList() {
        return this.tagList;
    }

    /**
     * @return tagRegexp
     */
    public String getTagRegexp() {
        return this.tagRegexp;
    }

    public static final class Builder extends Request.Builder<UpdateArtifactSubscriptionRuleRequest, Builder> {
        private String regionId; 
        private String accelerate; 
        private String instanceId; 
        private String namespaceName; 
        private String override; 
        private java.util.List<String> platform; 
        private String repoName; 
        private String ruleId; 
        private String sourceNamespaceName; 
        private String sourceProvider; 
        private String sourceRepoName; 
        private Long tagCount; 
        private java.util.List<String> tagList; 
        private String tagRegexp; 

        private Builder() {
            super();
        } 

        private Builder(UpdateArtifactSubscriptionRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.accelerate = request.accelerate;
            this.instanceId = request.instanceId;
            this.namespaceName = request.namespaceName;
            this.override = request.override;
            this.platform = request.platform;
            this.repoName = request.repoName;
            this.ruleId = request.ruleId;
            this.sourceNamespaceName = request.sourceNamespaceName;
            this.sourceProvider = request.sourceProvider;
            this.sourceRepoName = request.sourceRepoName;
            this.tagCount = request.tagCount;
            this.tagList = request.tagList;
            this.tagRegexp = request.tagRegexp;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the acceleration link. The subscription acceleration feature is in public preview. It improves the image subscription speed based on scheduling policies and network link optimization.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder accelerate(String accelerate) {
            this.putQueryParameter("Accelerate", accelerate);
            this.accelerate = accelerate;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-c0o11woew0k****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ACR namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>test-ns</p>
         */
        public Builder namespaceName(String namespaceName) {
            this.putQueryParameter("NamespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * <p>Specifies whether to overwrite images.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder override(String override) {
            this.putQueryParameter("Override", override);
            this.override = override;
            return this;
        }

        /**
         * <p>The operating system and architecture. If the source repository contains multi-architecture images, only images with the specified operating system and architecture are subscribed to the destination repository of the Enterprise instance.</p>
         */
        public Builder platform(java.util.List<String> platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * <p>The ACR repository.</p>
         * 
         * <strong>example:</strong>
         * <p>test-repo</p>
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * <p>The rule ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>crasr-mdbpung4i1rm****</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The source namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>library</p>
         */
        public Builder sourceNamespaceName(String sourceNamespaceName) {
            this.putQueryParameter("SourceNamespaceName", sourceNamespaceName);
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
            this.putQueryParameter("SourceProvider", sourceProvider);
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
            this.putQueryParameter("SourceRepoName", sourceRepoName);
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
            this.putQueryParameter("TagCount", tagCount);
            this.tagCount = tagCount;
            return this;
        }

        /**
         * <ul>
         * <li>The image tags to subscribe to when matching by tag list. A maximum of 10 tags are supported.</li>
         * <li>This parameter is valid only when the rule is created by using tag list matching. It cannot be specified together with TagRegexp or TagCount.</li>
         * <li>If this parameter is not specified or an empty list is specified, the original tag list is retained and cannot be cleared. The matching method cannot be modified. To modify the matching method, delete the rule and create a new one.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>latest</p>
         */
        public Builder tagList(java.util.List<String> tagList) {
            this.putQueryParameter("TagList", tagList);
            this.tagList = tagList;
            return this;
        }

        /**
         * <p>The image versions in the source repository to subscribe to. Regular expressions are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>release-v.*</p>
         */
        public Builder tagRegexp(String tagRegexp) {
            this.putQueryParameter("TagRegexp", tagRegexp);
            this.tagRegexp = tagRegexp;
            return this;
        }

        @Override
        public UpdateArtifactSubscriptionRuleRequest build() {
            return new UpdateArtifactSubscriptionRuleRequest(this);
        } 

    } 

}
