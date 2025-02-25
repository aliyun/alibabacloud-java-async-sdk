// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetTemplateRequest</p>
 */
public class GetTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChangeSetId")
    private String changeSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludePermission")
    private String includePermission;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeTags")
    private String includeTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackGroupName")
    private String stackGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackId")
    private String stackId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateStage")
    private String templateStage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateVersion")
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
         * <p>The ID of the change set.</p>
         * <blockquote>
         * <p>You must specify one of the following parameters: StackId, ChangeSetId, StackGroupName, and TemplateId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1f6521a4-05af-4975-afe9-bc4b45ad****</p>
         */
        public Builder changeSetId(String changeSetId) {
            this.putQueryParameter("ChangeSetId", changeSetId);
            this.changeSetId = changeSetId;
            return this;
        }

        /**
         * <p>Specifies whether to query the shared information about the template. Valid values:</p>
         * <ul>
         * <li>Enabled</li>
         * <li>Disabled (default)</li>
         * </ul>
         * <blockquote>
         * <p>Only the template owner can query the shared information of a template.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder includePermission(String includePermission) {
            this.putQueryParameter("IncludePermission", includePermission);
            this.includePermission = includePermission;
            return this;
        }

        /**
         * <p>Specifies whether to query the information about tags. Valid values:</p>
         * <ul>
         * <li>Enabled</li>
         * <li>Disabled (default)</li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only if you specify TemplateId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder includeTags(String includeTags) {
            this.putQueryParameter("IncludeTags", includeTags);
            this.includeTags = includeTags;
            return this;
        }

        /**
         * <p>The region ID of the stack or stack group that uses the template. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the stack group.</p>
         * <blockquote>
         * <p>You must specify one of the following parameters: StackId, ChangeSetId, StackGroupName, and TemplateId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>MyStackGroup</p>
         */
        public Builder stackGroupName(String stackGroupName) {
            this.putQueryParameter("StackGroupName", stackGroupName);
            this.stackGroupName = stackGroupName;
            return this;
        }

        /**
         * <p>The ID of the stack.</p>
         * <blockquote>
         * <p>You must specify one of the following parameters: StackId, ChangeSetId, StackGroupName, and TemplateId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        /**
         * <p>The ID of the template.</p>
         * <p>This parameter applies to shared and private templates. If the template is a shared template, the value of TemplateId is the same as the value of TemplateARN. You can use the template ID to query a shared template.</p>
         * <blockquote>
         * <p>You must specify one of the following parameters: StackId, ChangeSetId, StackGroupName, and TemplateId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5ecd1e10-b0e9-4389-a565-e4c15efc****</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The stage of the template. This parameter takes effect only if you specify StackId, ChangeSetId, or StackGroupName.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Processed (default): returns the processed template.</li>
         * <li>Original: returns the original template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Processed</p>
         */
        public Builder templateStage(String templateStage) {
            this.putQueryParameter("TemplateStage", templateStage);
            this.templateStage = templateStage;
            return this;
        }

        /**
         * <p>The version of the template. This parameter takes effect only if you specify TemplateId.<br>If the template is a shared template, you can specify this parameter only if VersionOption is set to AllVersions. For more information, see <a href="https://help.aliyun.com/document_detail/194768.html">SetTemplatePermission</a>.</p>
         * <p>Valid values: v1 to v100.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
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
