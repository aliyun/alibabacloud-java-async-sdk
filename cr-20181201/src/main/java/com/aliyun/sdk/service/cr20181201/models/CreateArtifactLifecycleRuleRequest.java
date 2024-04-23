// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateArtifactLifecycleRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateArtifactLifecycleRuleRequest</p>
 */
public class CreateArtifactLifecycleRuleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Auto")
    private Boolean auto;

    @Query
    @NameInMap("EnableDeleteTag")
    private Boolean enableDeleteTag;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NamespaceName")
    private String namespaceName;

    @Query
    @NameInMap("RepoName")
    private String repoName;

    @Query
    @NameInMap("RetentionTagCount")
    private Long retentionTagCount;

    @Query
    @NameInMap("ScheduleTime")
    private String scheduleTime;

    @Query
    @NameInMap("Scope")
    private String scope;

    @Query
    @NameInMap("TagRegexp")
    private String tagRegexp;

    private CreateArtifactLifecycleRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.auto = builder.auto;
        this.enableDeleteTag = builder.enableDeleteTag;
        this.instanceId = builder.instanceId;
        this.namespaceName = builder.namespaceName;
        this.repoName = builder.repoName;
        this.retentionTagCount = builder.retentionTagCount;
        this.scheduleTime = builder.scheduleTime;
        this.scope = builder.scope;
        this.tagRegexp = builder.tagRegexp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateArtifactLifecycleRuleRequest create() {
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

    public static final class Builder extends Request.Builder<CreateArtifactLifecycleRuleRequest, Builder> {
        private String regionId; 
        private Boolean auto; 
        private Boolean enableDeleteTag; 
        private String instanceId; 
        private String namespaceName; 
        private String repoName; 
        private Long retentionTagCount; 
        private String scheduleTime; 
        private String scope; 
        private String tagRegexp; 

        private Builder() {
            super();
        } 

        private Builder(CreateArtifactLifecycleRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.auto = request.auto;
            this.enableDeleteTag = request.enableDeleteTag;
            this.instanceId = request.instanceId;
            this.namespaceName = request.namespaceName;
            this.repoName = request.repoName;
            this.retentionTagCount = request.retentionTagCount;
            this.scheduleTime = request.scheduleTime;
            this.scope = request.scope;
            this.tagRegexp = request.tagRegexp;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Auto.
         */
        public Builder auto(Boolean auto) {
            this.putQueryParameter("Auto", auto);
            this.auto = auto;
            return this;
        }

        /**
         * EnableDeleteTag.
         */
        public Builder enableDeleteTag(Boolean enableDeleteTag) {
            this.putQueryParameter("EnableDeleteTag", enableDeleteTag);
            this.enableDeleteTag = enableDeleteTag;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NamespaceName.
         */
        public Builder namespaceName(String namespaceName) {
            this.putQueryParameter("NamespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * RepoName.
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * RetentionTagCount.
         */
        public Builder retentionTagCount(Long retentionTagCount) {
            this.putQueryParameter("RetentionTagCount", retentionTagCount);
            this.retentionTagCount = retentionTagCount;
            return this;
        }

        /**
         * ScheduleTime.
         */
        public Builder scheduleTime(String scheduleTime) {
            this.putQueryParameter("ScheduleTime", scheduleTime);
            this.scheduleTime = scheduleTime;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * TagRegexp.
         */
        public Builder tagRegexp(String tagRegexp) {
            this.putQueryParameter("TagRegexp", tagRegexp);
            this.tagRegexp = tagRegexp;
            return this;
        }

        @Override
        public CreateArtifactLifecycleRuleRequest build() {
            return new CreateArtifactLifecycleRuleRequest(this);
        } 

    } 

}
