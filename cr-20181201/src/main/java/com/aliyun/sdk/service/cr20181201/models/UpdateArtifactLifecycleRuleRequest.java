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
 * {@link UpdateArtifactLifecycleRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateArtifactLifecycleRuleRequest</p>
 */
public class UpdateArtifactLifecycleRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Auto")
    private Boolean auto;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableDeleteTag")
    private Boolean enableDeleteTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceName")
    private String namespaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepoName")
    private String repoName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetentionTagCount")
    private Long retentionTagCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleTime")
    private String scheduleTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagRegexp")
    private String tagRegexp;

    private UpdateArtifactLifecycleRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.auto = builder.auto;
        this.enableDeleteTag = builder.enableDeleteTag;
        this.instanceId = builder.instanceId;
        this.namespaceName = builder.namespaceName;
        this.repoName = builder.repoName;
        this.retentionTagCount = builder.retentionTagCount;
        this.ruleId = builder.ruleId;
        this.scheduleTime = builder.scheduleTime;
        this.scope = builder.scope;
        this.tagRegexp = builder.tagRegexp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateArtifactLifecycleRuleRequest create() {
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
     * @return auto
     */
    public Boolean getAuto() {
        return this.auto;
    }

    /**
     * @return enableDeleteTag
     */
    public Boolean getEnableDeleteTag() {
        return this.enableDeleteTag;
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
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    /**
     * @return retentionTagCount
     */
    public Long getRetentionTagCount() {
        return this.retentionTagCount;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return scheduleTime
     */
    public String getScheduleTime() {
        return this.scheduleTime;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return tagRegexp
     */
    public String getTagRegexp() {
        return this.tagRegexp;
    }

    public static final class Builder extends Request.Builder<UpdateArtifactLifecycleRuleRequest, Builder> {
        private String regionId; 
        private Boolean auto; 
        private Boolean enableDeleteTag; 
        private String instanceId; 
        private String namespaceName; 
        private String repoName; 
        private Long retentionTagCount; 
        private String ruleId; 
        private String scheduleTime; 
        private String scope; 
        private String tagRegexp; 

        private Builder() {
            super();
        } 

        private Builder(UpdateArtifactLifecycleRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.auto = request.auto;
            this.enableDeleteTag = request.enableDeleteTag;
            this.instanceId = request.instanceId;
            this.namespaceName = request.namespaceName;
            this.repoName = request.repoName;
            this.retentionTagCount = request.retentionTagCount;
            this.ruleId = request.ruleId;
            this.scheduleTime = request.scheduleTime;
            this.scope = request.scope;
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
         * <p>Specifies whether to automatically execute the lifecycle management rule.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder auto(Boolean auto) {
            this.putQueryParameter("Auto", auto);
            this.auto = auto;
            return this;
        }

        /**
         * <p>Specifies whether to enable lifecycle management for the artifact.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableDeleteTag(Boolean enableDeleteTag) {
            this.putQueryParameter("EnableDeleteTag", enableDeleteTag);
            this.enableDeleteTag = enableDeleteTag;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-r6ym0lerldp****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the namespace.</p>
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
         * <p>The name of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>test_1</p>
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * <p>The number of images that you want to retain.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder retentionTagCount(Long retentionTagCount) {
            this.putQueryParameter("RetentionTagCount", retentionTagCount);
            this.retentionTagCount = retentionTagCount;
            return this;
        }

        /**
         * <p>The rule ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cralr-luq6qiegzvx****</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The execution cycle of the lifecycle management rule.</p>
         * 
         * <strong>example:</strong>
         * <p>WEEK</p>
         */
        public Builder scheduleTime(String scheduleTime) {
            this.putQueryParameter("ScheduleTime", scheduleTime);
            this.scheduleTime = scheduleTime;
            return this;
        }

        /**
         * <p>The deletion scope of artifacts.</p>
         * 
         * <strong>example:</strong>
         * <p>REPO</p>
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * <p>The regular expression that indicates which image tags you want to retain.</p>
         * 
         * <strong>example:</strong>
         * <p>.<em>production_.</em></p>
         */
        public Builder tagRegexp(String tagRegexp) {
            this.putQueryParameter("TagRegexp", tagRegexp);
            this.tagRegexp = tagRegexp;
            return this;
        }

        @Override
        public UpdateArtifactLifecycleRuleRequest build() {
            return new UpdateArtifactLifecycleRuleRequest(this);
        } 

    } 

}
