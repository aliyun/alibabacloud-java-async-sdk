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
 * {@link CreateArtifactSubscriptionRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateArtifactSubscriptionRuleRequest</p>
 */
public class CreateArtifactSubscriptionRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Accelerate")
    private Boolean accelerate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Override")
    private Boolean override;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platform")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String repoName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceNamespaceName")
    private String sourceNamespaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceProvider")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRepoName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceRepoName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagCount")
    @com.aliyun.core.annotation.Validation(maximum = 30, minimum = 1)
    private Long tagCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagList")
    private java.util.List<String> tagList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagRegexp")
    private String tagRegexp;

    private CreateArtifactSubscriptionRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.accelerate = builder.accelerate;
        this.instanceId = builder.instanceId;
        this.namespaceName = builder.namespaceName;
        this.override = builder.override;
        this.platform = builder.platform;
        this.repoName = builder.repoName;
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

    public static CreateArtifactSubscriptionRuleRequest create() {
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
    public Boolean getAccelerate() {
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

    public static final class Builder extends Request.Builder<CreateArtifactSubscriptionRuleRequest, Builder> {
        private String regionId; 
        private Boolean accelerate; 
        private String instanceId; 
        private String namespaceName; 
        private Boolean override; 
        private java.util.List<String> platform; 
        private String repoName; 
        private String sourceNamespaceName; 
        private String sourceProvider; 
        private String sourceRepoName; 
        private Long tagCount; 
        private java.util.List<String> tagList; 
        private String tagRegexp; 

        private Builder() {
            super();
        } 

        private Builder(CreateArtifactSubscriptionRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.accelerate = request.accelerate;
            this.instanceId = request.instanceId;
            this.namespaceName = request.namespaceName;
            this.override = request.override;
            this.platform = request.platform;
            this.repoName = request.repoName;
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
         * <p>Specifies whether to enable the acceleration link. The subscription acceleration feature is in public preview. Based on scheduling policies and network link optimization, it can improve the image subscription speed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder accelerate(Boolean accelerate) {
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
         * <p>This parameter is required.</p>
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
        public Builder override(Boolean override) {
            this.putQueryParameter("Override", override);
            this.override = override;
            return this;
        }

        /**
         * <p>The operating system or architecture. If the source repository contains multi-architecture images, only images with the specified operating system or architecture are subscribed to the destination repository of the Enterprise instance.</p>
         * <p>This parameter is required.</p>
         */
        public Builder platform(java.util.List<String> platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * <p>The ACR repository.</p>
         * <p>This parameter is required.</p>
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
         * <p>The source namespace. If <code>SourceProvider</code> is set to <code>DOCKER_HUB</code>, the default value is <code>library</code>. This parameter is required in other scenarios.</p>
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
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
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
         * <li>If TagList is specified, these tags are queried one by one. TagRegexp and TagCount cannot be specified at the same time. If TagList is not specified, TagRegexp and TagCount are used for matching, and both must be specified.</li>
         * <li>The matching method cannot be changed after the rule is created. To change the matching method, delete the rule and create a new one.</li>
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
         * <p>The image versions to subscribe to from the source repository. Regular expressions are supported.</p>
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
        public CreateArtifactSubscriptionRuleRequest build() {
            return new CreateArtifactSubscriptionRuleRequest(this);
        } 

    } 

}
