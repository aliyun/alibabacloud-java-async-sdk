// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link CreateProhibitedPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateProhibitedPolicyRequest</p>
 */
public class CreateProhibitedPolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AllowReport")
    private String allowReport;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Enabled")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ForceKill")
    private Boolean forceKill;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MainButtonTextCh")
    private String mainButtonTextCh;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MainButtonTextEn")
    private String mainButtonTextEn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MatchMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String matchMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MinorButtonTextCh")
    private String minorButtonTextCh;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MinorButtonTextEn")
    private String minorButtonTextEn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ObjectType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objectType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Priority")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PromptCh")
    @com.aliyun.core.annotation.Validation(required = true)
    private String promptCh;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PromptEn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String promptEn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SoftwareIds")
    private java.util.List<SoftwareIds> softwareIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagIds")
    private java.util.List<String> tagIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TitleCh")
    private String titleCh;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TitleEn")
    private String titleEn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserGroupIds")
    private java.util.List<String> userGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Whitelist")
    private java.util.List<String> whitelist;

    private CreateProhibitedPolicyRequest(Builder builder) {
        super(builder);
        this.allowReport = builder.allowReport;
        this.description = builder.description;
        this.enabled = builder.enabled;
        this.forceKill = builder.forceKill;
        this.mainButtonTextCh = builder.mainButtonTextCh;
        this.mainButtonTextEn = builder.mainButtonTextEn;
        this.matchMode = builder.matchMode;
        this.minorButtonTextCh = builder.minorButtonTextCh;
        this.minorButtonTextEn = builder.minorButtonTextEn;
        this.name = builder.name;
        this.objectType = builder.objectType;
        this.policyType = builder.policyType;
        this.priority = builder.priority;
        this.promptCh = builder.promptCh;
        this.promptEn = builder.promptEn;
        this.softwareIds = builder.softwareIds;
        this.tagIds = builder.tagIds;
        this.titleCh = builder.titleCh;
        this.titleEn = builder.titleEn;
        this.userGroupIds = builder.userGroupIds;
        this.whitelist = builder.whitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProhibitedPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowReport
     */
    public String getAllowReport() {
        return this.allowReport;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return forceKill
     */
    public Boolean getForceKill() {
        return this.forceKill;
    }

    /**
     * @return mainButtonTextCh
     */
    public String getMainButtonTextCh() {
        return this.mainButtonTextCh;
    }

    /**
     * @return mainButtonTextEn
     */
    public String getMainButtonTextEn() {
        return this.mainButtonTextEn;
    }

    /**
     * @return matchMode
     */
    public String getMatchMode() {
        return this.matchMode;
    }

    /**
     * @return minorButtonTextCh
     */
    public String getMinorButtonTextCh() {
        return this.minorButtonTextCh;
    }

    /**
     * @return minorButtonTextEn
     */
    public String getMinorButtonTextEn() {
        return this.minorButtonTextEn;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return promptCh
     */
    public String getPromptCh() {
        return this.promptCh;
    }

    /**
     * @return promptEn
     */
    public String getPromptEn() {
        return this.promptEn;
    }

    /**
     * @return softwareIds
     */
    public java.util.List<SoftwareIds> getSoftwareIds() {
        return this.softwareIds;
    }

    /**
     * @return tagIds
     */
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }

    /**
     * @return titleCh
     */
    public String getTitleCh() {
        return this.titleCh;
    }

    /**
     * @return titleEn
     */
    public String getTitleEn() {
        return this.titleEn;
    }

    /**
     * @return userGroupIds
     */
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    /**
     * @return whitelist
     */
    public java.util.List<String> getWhitelist() {
        return this.whitelist;
    }

    public static final class Builder extends Request.Builder<CreateProhibitedPolicyRequest, Builder> {
        private String allowReport; 
        private String description; 
        private Boolean enabled; 
        private Boolean forceKill; 
        private String mainButtonTextCh; 
        private String mainButtonTextEn; 
        private String matchMode; 
        private String minorButtonTextCh; 
        private String minorButtonTextEn; 
        private String name; 
        private String objectType; 
        private String policyType; 
        private Integer priority; 
        private String promptCh; 
        private String promptEn; 
        private java.util.List<SoftwareIds> softwareIds; 
        private java.util.List<String> tagIds; 
        private String titleCh; 
        private String titleEn; 
        private java.util.List<String> userGroupIds; 
        private java.util.List<String> whitelist; 

        private Builder() {
            super();
        } 

        private Builder(CreateProhibitedPolicyRequest request) {
            super(request);
            this.allowReport = request.allowReport;
            this.description = request.description;
            this.enabled = request.enabled;
            this.forceKill = request.forceKill;
            this.mainButtonTextCh = request.mainButtonTextCh;
            this.mainButtonTextEn = request.mainButtonTextEn;
            this.matchMode = request.matchMode;
            this.minorButtonTextCh = request.minorButtonTextCh;
            this.minorButtonTextEn = request.minorButtonTextEn;
            this.name = request.name;
            this.objectType = request.objectType;
            this.policyType = request.policyType;
            this.priority = request.priority;
            this.promptCh = request.promptCh;
            this.promptEn = request.promptEn;
            this.softwareIds = request.softwareIds;
            this.tagIds = request.tagIds;
            this.titleCh = request.titleCh;
            this.titleEn = request.titleEn;
            this.userGroupIds = request.userGroupIds;
            this.whitelist = request.whitelist;
        } 

        /**
         * <p>Specifies whether end users are allowed to submit a report request for this policy. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Reporting is allowed. The pop-up window on the endpoint provides a reporting entry.</li>
         * <li><strong>false</strong>: Reporting is not allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder allowReport(String allowReport) {
            this.putBodyParameter("AllowReport", allowReport);
            this.allowReport = allowReport;
            return this;
        }

        /**
         * <p>The description of the software ban policy. The description can be up to 128 characters in length and can be left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>project name pass the check</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether the policy is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled. The policy is delivered to the endpoint and takes effect.</li>
         * <li><strong>false</strong>: Disabled. The policy configuration is retained but not delivered to the endpoint.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.putBodyParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>Specifies whether to forcefully terminate running software processes. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder forceKill(Boolean forceKill) {
            this.putBodyParameter("ForceKill", forceKill);
            this.forceKill = forceKill;
            return this;
        }

        /**
         * <p>The Chinese text of the primary button in the pop-up window on the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>Submit Filing</p>
         */
        public Builder mainButtonTextCh(String mainButtonTextCh) {
            this.putBodyParameter("MainButtonTextCh", mainButtonTextCh);
            this.mainButtonTextCh = mainButtonTextCh;
            return this;
        }

        /**
         * <p>The English text of the primary button in the pop-up window on the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>Report</p>
         */
        public Builder mainButtonTextEn(String mainButtonTextEn) {
            this.putBodyParameter("MainButtonTextEn", mainButtonTextEn);
            this.mainButtonTextEn = mainButtonTextEn;
            return this;
        }

        /**
         * <p>The scope in which the policy takes effect. Valid values:</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UserGroupAll</p>
         */
        public Builder matchMode(String matchMode) {
            this.putBodyParameter("MatchMode", matchMode);
            this.matchMode = matchMode;
            return this;
        }

        /**
         * <p>The Chinese text of the secondary button in the pop-up window on the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>Got It</p>
         */
        public Builder minorButtonTextCh(String minorButtonTextCh) {
            this.putBodyParameter("MinorButtonTextCh", minorButtonTextCh);
            this.minorButtonTextCh = minorButtonTextCh;
            return this;
        }

        /**
         * <p>The English text of the secondary button in the pop-up window on the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>I know</p>
         */
        public Builder minorButtonTextEn(String minorButtonTextEn) {
            this.putBodyParameter("MinorButtonTextEn", minorButtonTextEn);
            this.minorButtonTextEn = minorButtonTextEn;
            return this;
        }

        /**
         * <p>Policy Name of the software ban policy. Policy Name must be 1 to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-). Spaces are not supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>autotest_a0344d22</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The object type. Valid values:</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>App</p>
         */
        public Builder objectType(String objectType) {
            this.putBodyParameter("ObjectType", objectType);
            this.objectType = objectType;
            return this;
        }

        /**
         * <p>The action to take. Valid values:</p>
         * <ul>
         * <li><strong>Ban</strong>: Blocks the software from running and displays a pop-up notification to the end user.</li>
         * <li><strong>BanSilent</strong>: Blocks the software from running without notifying the end user (silent blocking).</li>
         * <li><strong>Warn</strong>: Displays a pop-up notification to the end user without blocking the software from running.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Warn</p>
         */
        public Builder policyType(String policyType) {
            this.putBodyParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        /**
         * <p>The policy priority. Valid values: 0 to 99. A smaller value indicates a higher priority.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>99</p>
         */
        public Builder priority(Integer priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The Chinese prompt content displayed in the pop-up window on the endpoint.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder promptCh(String promptCh) {
            this.putBodyParameter("PromptCh", promptCh);
            this.promptCh = promptCh;
            return this;
        }

        /**
         * <p>The English prompt content displayed in the pop-up window on the endpoint.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Auto test prohibition prompt</p>
         */
        public Builder promptEn(String promptEn) {
            this.putBodyParameter("PromptEn", promptEn);
            this.promptEn = promptEn;
            return this;
        }

        /**
         * <p>The collection of banned software directly controlled by this policy.</p>
         */
        public Builder softwareIds(java.util.List<SoftwareIds> softwareIds) {
            this.putBodyParameter("SoftwareIds", softwareIds);
            this.softwareIds = softwareIds;
            return this;
        }

        /**
         * <p>The collection of banned software tag IDs controlled by this policy.</p>
         */
        public Builder tagIds(java.util.List<String> tagIds) {
            this.putBodyParameter("TagIds", tagIds);
            this.tagIds = tagIds;
            return this;
        }

        /**
         * <p>The Chinese title of the pop-up window on the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>Software Ban Reminder</p>
         */
        public Builder titleCh(String titleCh) {
            this.putBodyParameter("TitleCh", titleCh);
            this.titleCh = titleCh;
            return this;
        }

        /**
         * <p>The English title of the pop-up window on the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>Software Blocked</p>
         */
        public Builder titleEn(String titleEn) {
            this.putBodyParameter("TitleEn", titleEn);
            this.titleEn = titleEn;
            return this;
        }

        /**
         * <p>The collection of user group IDs for which the policy takes effect.</p>
         */
        public Builder userGroupIds(java.util.List<String> userGroupIds) {
            this.putBodyParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * <p>The list of exempted usernames.</p>
         */
        public Builder whitelist(java.util.List<String> whitelist) {
            this.putBodyParameter("Whitelist", whitelist);
            this.whitelist = whitelist;
            return this;
        }

        @Override
        public CreateProhibitedPolicyRequest build() {
            return new CreateProhibitedPolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateProhibitedPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateProhibitedPolicyRequest</p>
     */
    public static class SoftwareIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("SoftwareId")
        private String softwareId;

        private SoftwareIds(Builder builder) {
            this.isDefault = builder.isDefault;
            this.softwareId = builder.softwareId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SoftwareIds create() {
            return builder().build();
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return softwareId
         */
        public String getSoftwareId() {
            return this.softwareId;
        }

        public static final class Builder {
            private Boolean isDefault; 
            private String softwareId; 

            private Builder() {
            } 

            private Builder(SoftwareIds model) {
                this.isDefault = model.isDefault;
                this.softwareId = model.softwareId;
            } 

            /**
             * <p>Specifies whether the blocked software is a built-in blocked software entry. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: A built-in blocked software entry that is shared across all Alibaba Cloud accounts. Built-in entries cannot be modified or deleted.</li>
             * <li><strong>false</strong>: A custom blocked software entry under the current Alibaba Cloud account.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The ID of the prohibited software. You can obtain the value from the following operations:</p>
             * <ul>
             * <li><a href="~~ListProhibitedSoftware~~">ListProhibitedSoftware</a>: Lists prohibited software.</li>
             * <li><a href="~~CreateProhibitedSoftware~~">CreateProhibitedSoftware</a>: Creates custom prohibited software.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>swb-df1fa76d889b****</p>
             */
            public Builder softwareId(String softwareId) {
                this.softwareId = softwareId;
                return this;
            }

            public SoftwareIds build() {
                return new SoftwareIds(this);
            } 

        } 

    }
}
