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
         * The ID of the change set.
         * <p>
         * 
         * >  You must specify only one of the following parameters: StackId, ChangeSetId, StackGroupName, and TemplateId.
         */
        public Builder changeSetId(String changeSetId) {
            this.putQueryParameter("ChangeSetId", changeSetId);
            this.changeSetId = changeSetId;
            return this;
        }

        /**
         * Specifies whether to query the template sharing information. Default value: Disabled. Valid values:
         * <p>
         * 
         * *   Enabled
         * *   Disabled
         * 
         * >  Only the template owner can query the template sharing information.
         */
        public Builder includePermission(String includePermission) {
            this.putQueryParameter("IncludePermission", includePermission);
            this.includePermission = includePermission;
            return this;
        }

        /**
         * Specifies whether to query the information about tags. Default value: Disabled. Valid values:
         * <p>
         * 
         * *   Enabled
         * *   Disabled
         * 
         * >  This parameter only takes effect when you specify the TemplateId parameter.
         */
        public Builder includeTags(String includeTags) {
            this.putQueryParameter("IncludeTags", includeTags);
            this.includeTags = includeTags;
            return this;
        }

        /**
         * The ID of the region to which the stack or stack group defined in the template belongs. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the stack group.
         * <p>
         * 
         * >  You must specify only one of the following parameters: StackId, ChangeSetId, StackGroupName, and TemplateId.
         */
        public Builder stackGroupName(String stackGroupName) {
            this.putQueryParameter("StackGroupName", stackGroupName);
            this.stackGroupName = stackGroupName;
            return this;
        }

        /**
         * The ID of the stack.
         * <p>
         * 
         * >  You must specify only one of the following parameters: StackId, ChangeSetId, StackGroupName, and TemplateId.
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        /**
         * The ID of the template.
         * <p>
         * 
         * This parameter applies to shared and private templates. If the template is a shared template, the value of the TemplateId parameter is the same as the value of the TemplateARN parameter. You can use the template ID to query a shared template.
         * 
         * >  You must specify only one of the following parameters: StackId, ChangeSetId, StackGroupName, and TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * The stage of the template. This parameter only takes effect when you specify the StackId, ChangeSetId, or StackGroupName parameter.
         * <p>
         * 
         * Default value: Processed. Valid values:
         * 
         * *   Processed: returns the processed template that contains transforms.
         * *   Original: returns the original template that you specify.
         */
        public Builder templateStage(String templateStage) {
            this.putQueryParameter("TemplateStage", templateStage);
            this.templateStage = templateStage;
            return this;
        }

        /**
         * The version of the template. This parameter only takes effect when you specify the TemplateId parameter.
         * <p>
         * 
         * If the template is a shared template, you can specify this parameter only if you set the VersionOption parameter to AllVersions.
         * 
         * Valid values: v1 to v100.
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
