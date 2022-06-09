// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetTemplateRequest</p>
 */
public class GetTemplateRequest extends Request {
    @Query
    @NameInMap("ChangeSetId")
    private String changeSetId;

    @Query
    @NameInMap("IncludePermission")
    private String includePermission;

    @Query
    @NameInMap("IncludeTags")
    private String includeTags;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StackGroupName")
    private String stackGroupName;

    @Query
    @NameInMap("StackId")
    private String stackId;

    @Query
    @NameInMap("TemplateId")
    private String templateId;

    @Query
    @NameInMap("TemplateStage")
    private String templateStage;

    @Query
    @NameInMap("TemplateVersion")
    private String templateVersion;

    private GetTemplateRequest(Builder builder) {
        super(builder);
        this.changeSetId = builder.changeSetId;
        this.includePermission = builder.includePermission;
        this.includeTags = builder.includeTags;
        this.regionId = builder.regionId;
        this.stackGroupName = builder.stackGroupName;
        this.stackId = builder.stackId;
        this.templateId = builder.templateId;
        this.templateStage = builder.templateStage;
        this.templateVersion = builder.templateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return changeSetId
     */
    public String getChangeSetId() {
        return this.changeSetId;
    }

    /**
     * @return includePermission
     */
    public String getIncludePermission() {
        return this.includePermission;
    }

    /**
     * @return includeTags
     */
    public String getIncludeTags() {
        return this.includeTags;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return stackGroupName
     */
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateStage
     */
    public String getTemplateStage() {
        return this.templateStage;
    }

    /**
     * @return templateVersion
     */
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static final class Builder extends Request.Builder<GetTemplateRequest, Builder> {
        private String changeSetId; 
        private String includePermission; 
        private String includeTags; 
        private String regionId; 
        private String stackGroupName; 
        private String stackId; 
        private String templateId; 
        private String templateStage; 
        private String templateVersion; 

        private Builder() {
            super();
        } 

        private Builder(GetTemplateRequest request) {
            super(request);
            this.changeSetId = request.changeSetId;
            this.includePermission = request.includePermission;
            this.includeTags = request.includeTags;
            this.regionId = request.regionId;
            this.stackGroupName = request.stackGroupName;
            this.stackId = request.stackId;
            this.templateId = request.templateId;
            this.templateStage = request.templateStage;
            this.templateVersion = request.templateVersion;
        } 

        /**
         * ChangeSetId.
         */
        public Builder changeSetId(String changeSetId) {
            this.putQueryParameter("ChangeSetId", changeSetId);
            this.changeSetId = changeSetId;
            return this;
        }

        /**
         * IncludePermission.
         */
        public Builder includePermission(String includePermission) {
            this.putQueryParameter("IncludePermission", includePermission);
            this.includePermission = includePermission;
            return this;
        }

        /**
         * IncludeTags.
         */
        public Builder includeTags(String includeTags) {
            this.putQueryParameter("IncludeTags", includeTags);
            this.includeTags = includeTags;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * StackGroupName.
         */
        public Builder stackGroupName(String stackGroupName) {
            this.putQueryParameter("StackGroupName", stackGroupName);
            this.stackGroupName = stackGroupName;
            return this;
        }

        /**
         * StackId.
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * TemplateStage.
         */
        public Builder templateStage(String templateStage) {
            this.putQueryParameter("TemplateStage", templateStage);
            this.templateStage = templateStage;
            return this;
        }

        /**
         * TemplateVersion.
         */
        public Builder templateVersion(String templateVersion) {
            this.putQueryParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        @Override
        public GetTemplateRequest build() {
            return new GetTemplateRequest(this);
        } 

    } 

}
