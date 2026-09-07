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
 * {@link UpdateProhibitedPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateProhibitedPolicyResponseBody</p>
 */
public class UpdateProhibitedPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Policy")
    private Policy policy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateProhibitedPolicyResponseBody(Builder builder) {
        this.policy = builder.policy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProhibitedPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policy
     */
    public Policy getPolicy() {
        return this.policy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Policy policy; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateProhibitedPolicyResponseBody model) {
            this.policy = model.policy;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the software prohibition policy.</p>
         */
        public Builder policy(Policy policy) {
            this.policy = policy;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>C4F48DD4-B70D-5342-80B9-2BF5498262FF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateProhibitedPolicyResponseBody build() {
            return new UpdateProhibitedPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateProhibitedPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateProhibitedPolicyResponseBody</p>
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
             * <p>Indicates whether the prohibited software is a system built-in entry. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: A system built-in prohibited software entry shared across all Alibaba Cloud accounts. It cannot be modified or deleted.</li>
             * <li><strong>false</strong>: A custom prohibited software entry under the current Alibaba Cloud account.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The ID of the prohibited software.</p>
             * 
             * <strong>example:</strong>
             * <p>swb-f024ee962344****</p>
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
    /**
     * 
     * {@link UpdateProhibitedPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateProhibitedPolicyResponseBody</p>
     */
    public static class Policy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowReport")
        private Boolean allowReport;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("ForceKill")
        private Boolean forceKill;

        @com.aliyun.core.annotation.NameInMap("MainButtonTextCh")
        private String mainButtonTextCh;

        @com.aliyun.core.annotation.NameInMap("MainButtonTextEn")
        private String mainButtonTextEn;

        @com.aliyun.core.annotation.NameInMap("MatchMode")
        private String matchMode;

        @com.aliyun.core.annotation.NameInMap("MinorButtonTextCh")
        private String minorButtonTextCh;

        @com.aliyun.core.annotation.NameInMap("MinorButtonTextEn")
        private String minorButtonTextEn;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ObjectType")
        private String objectType;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("PromptCh")
        private String promptCh;

        @com.aliyun.core.annotation.NameInMap("PromptEn")
        private String promptEn;

        @com.aliyun.core.annotation.NameInMap("SoftwareIds")
        private java.util.List<SoftwareIds> softwareIds;

        @com.aliyun.core.annotation.NameInMap("TagIds")
        private java.util.List<String> tagIds;

        @com.aliyun.core.annotation.NameInMap("TitleCh")
        private String titleCh;

        @com.aliyun.core.annotation.NameInMap("TitleEn")
        private String titleEn;

        @com.aliyun.core.annotation.NameInMap("UserGroupIds")
        private java.util.List<String> userGroupIds;

        @com.aliyun.core.annotation.NameInMap("Whitelist")
        private java.util.List<String> whitelist;

        private Policy(Builder builder) {
            this.allowReport = builder.allowReport;
            this.createTime = builder.createTime;
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
            this.policyId = builder.policyId;
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

        public static Policy create() {
            return builder().build();
        }

        /**
         * @return allowReport
         */
        public Boolean getAllowReport() {
            return this.allowReport;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
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

        public static final class Builder {
            private Boolean allowReport; 
            private String createTime; 
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
            private String policyId; 
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
            } 

            private Builder(Policy model) {
                this.allowReport = model.allowReport;
                this.createTime = model.createTime;
                this.description = model.description;
                this.enabled = model.enabled;
                this.forceKill = model.forceKill;
                this.mainButtonTextCh = model.mainButtonTextCh;
                this.mainButtonTextEn = model.mainButtonTextEn;
                this.matchMode = model.matchMode;
                this.minorButtonTextCh = model.minorButtonTextCh;
                this.minorButtonTextEn = model.minorButtonTextEn;
                this.name = model.name;
                this.objectType = model.objectType;
                this.policyId = model.policyId;
                this.policyType = model.policyType;
                this.priority = model.priority;
                this.promptCh = model.promptCh;
                this.promptEn = model.promptEn;
                this.softwareIds = model.softwareIds;
                this.tagIds = model.tagIds;
                this.titleCh = model.titleCh;
                this.titleEn = model.titleEn;
                this.userGroupIds = model.userGroupIds;
                this.whitelist = model.whitelist;
            } 

            /**
             * <p>Specifies whether endpoint users are allowed to submit a filing request for this policy. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Filing is allowed. A filing entry is provided in the pop-up notification on the endpoint.</li>
             * <li><strong>false</strong>: Filing is not allowed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder allowReport(Boolean allowReport) {
                this.allowReport = allowReport;
                return this;
            }

            /**
             * <p>The time when the software prohibition policy was created, in the yyyy-MM-dd HH:mm:ss format. The time is in the UTC+8 time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-19 10:24:31</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the software prohibition policy.</p>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Specifies whether the policy is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Enabled. The policy is delivered to endpoints and takes effect.</li>
             * <li><strong>false</strong>: Disabled. The policy configuration is retained but not delivered to endpoints.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>Specifies whether to forcibly terminate running software processes. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The endpoint immediately terminates the running processes of the software when the policy is triggered.</li>
             * <li><strong>false</strong>: Running processes are not terminated. Only subsequent launches are blocked.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder forceKill(Boolean forceKill) {
                this.forceKill = forceKill;
                return this;
            }

            /**
             * <p>The Chinese text of the primary button in the pop-up notification on the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>Submit Filing</p>
             */
            public Builder mainButtonTextCh(String mainButtonTextCh) {
                this.mainButtonTextCh = mainButtonTextCh;
                return this;
            }

            /**
             * <p>The English text of the primary button in the pop-up notification on the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>Report</p>
             */
            public Builder mainButtonTextEn(String mainButtonTextEn) {
                this.mainButtonTextEn = mainButtonTextEn;
                return this;
            }

            /**
             * <p>The scope in which the policy takes effect. Valid values:</p>
             * <ul>
             * <li><strong>UserGroupAll</strong>: Takes effect for all users under the current Alibaba Cloud account. No user group needs to be specified.</li>
             * <li><strong>UserGroupNormal</strong>: Takes effect only for users in the user groups specified by UserGroupIds.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UserGroupNormal</p>
             */
            public Builder matchMode(String matchMode) {
                this.matchMode = matchMode;
                return this;
            }

            /**
             * <p>The Chinese text of the secondary button in the pop-up notification on the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>Got It</p>
             */
            public Builder minorButtonTextCh(String minorButtonTextCh) {
                this.minorButtonTextCh = minorButtonTextCh;
                return this;
            }

            /**
             * <p>The English text of the secondary button in the pop-up notification on the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>I know</p>
             */
            public Builder minorButtonTextEn(String minorButtonTextEn) {
                this.minorButtonTextEn = minorButtonTextEn;
                return this;
            }

            /**
             * <p>The name of the software prohibition policy.</p>
             * 
             * <strong>example:</strong>
             * <p>autotest_c51af82d</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The object type. Valid values:</p>
             * <ul>
             * <li><strong>App</strong>: Controls by prohibited software. The controlled objects are specified by SoftwareIds.</li>
             * <li><strong>Tag</strong>: Controls by prohibited software tag. The controlled objects are specified by TagIds. All prohibited software under the specified tags is controlled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>App</p>
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * <p>The ID of the software prohibition policy.</p>
             * 
             * <strong>example:</strong>
             * <p>pid-ef8eb37cff62****</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The action to take. Valid values:</p>
             * <ul>
             * <li><strong>Ban</strong>: Blocks the software from running and displays a pop-up notification on the endpoint to alert the user.</li>
             * <li><strong>BanSilent</strong>: Blocks the software from running without notifying the user (silent blocking).</li>
             * <li><strong>Warn</strong>: Displays a pop-up notification on the endpoint to alert the user without blocking the software from running.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Ban</p>
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * <p>The policy priority. Valid values: 0 to 99. A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The Chinese prompt content displayed in the pop-up notification on the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder promptCh(String promptCh) {
                this.promptCh = promptCh;
                return this;
            }

            /**
             * <p>The English prompt content displayed in the pop-up notification on the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>After analysis and monitoring, the software has been disabled as a security risk.</p>
             */
            public Builder promptEn(String promptEn) {
                this.promptEn = promptEn;
                return this;
            }

            /**
             * <p>The collection of prohibited software directly controlled by this policy.</p>
             */
            public Builder softwareIds(java.util.List<SoftwareIds> softwareIds) {
                this.softwareIds = softwareIds;
                return this;
            }

            /**
             * <p>The collection of prohibited software tag IDs controlled by this policy.</p>
             */
            public Builder tagIds(java.util.List<String> tagIds) {
                this.tagIds = tagIds;
                return this;
            }

            /**
             * <p>The Chinese title of the pop-up notification on the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>Software Prohibition Reminder</p>
             */
            public Builder titleCh(String titleCh) {
                this.titleCh = titleCh;
                return this;
            }

            /**
             * <p>The English title of the pop-up notification on the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>Software Blocked</p>
             */
            public Builder titleEn(String titleEn) {
                this.titleEn = titleEn;
                return this;
            }

            /**
             * <p>The collection of user group IDs for which the policy takes effect.</p>
             */
            public Builder userGroupIds(java.util.List<String> userGroupIds) {
                this.userGroupIds = userGroupIds;
                return this;
            }

            /**
             * <p>The list of exempted usernames.</p>
             */
            public Builder whitelist(java.util.List<String> whitelist) {
                this.whitelist = whitelist;
                return this;
            }

            public Policy build() {
                return new Policy(this);
            } 

        } 

    }
}
