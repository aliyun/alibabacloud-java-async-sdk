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
 * {@link GetProhibitedPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetProhibitedPolicyResponseBody</p>
 */
public class GetProhibitedPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Policy")
    private Policy policy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetProhibitedPolicyResponseBody(Builder builder) {
        this.policy = builder.policy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProhibitedPolicyResponseBody create() {
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

        private Builder(GetProhibitedPolicyResponseBody model) {
            this.policy = model.policy;
            this.requestId = model.requestId;
        } 

        /**
         * Policy.
         */
        public Builder policy(Policy policy) {
            this.policy = policy;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E966413B-7538-5332-99B4-C3DA016B9453</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProhibitedPolicyResponseBody build() {
            return new GetProhibitedPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetProhibitedPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetProhibitedPolicyResponseBody</p>
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
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * SoftwareId.
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
     * {@link GetProhibitedPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetProhibitedPolicyResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("ReportProcessId")
        private String reportProcessId;

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
            this.reportProcessId = builder.reportProcessId;
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
         * @return reportProcessId
         */
        public String getReportProcessId() {
            return this.reportProcessId;
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
            private String reportProcessId; 
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
                this.reportProcessId = model.reportProcessId;
                this.softwareIds = model.softwareIds;
                this.tagIds = model.tagIds;
                this.titleCh = model.titleCh;
                this.titleEn = model.titleEn;
                this.userGroupIds = model.userGroupIds;
                this.whitelist = model.whitelist;
            } 

            /**
             * AllowReport.
             */
            public Builder allowReport(Boolean allowReport) {
                this.allowReport = allowReport;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * ForceKill.
             */
            public Builder forceKill(Boolean forceKill) {
                this.forceKill = forceKill;
                return this;
            }

            /**
             * MainButtonTextCh.
             */
            public Builder mainButtonTextCh(String mainButtonTextCh) {
                this.mainButtonTextCh = mainButtonTextCh;
                return this;
            }

            /**
             * MainButtonTextEn.
             */
            public Builder mainButtonTextEn(String mainButtonTextEn) {
                this.mainButtonTextEn = mainButtonTextEn;
                return this;
            }

            /**
             * MatchMode.
             */
            public Builder matchMode(String matchMode) {
                this.matchMode = matchMode;
                return this;
            }

            /**
             * MinorButtonTextCh.
             */
            public Builder minorButtonTextCh(String minorButtonTextCh) {
                this.minorButtonTextCh = minorButtonTextCh;
                return this;
            }

            /**
             * MinorButtonTextEn.
             */
            public Builder minorButtonTextEn(String minorButtonTextEn) {
                this.minorButtonTextEn = minorButtonTextEn;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ObjectType.
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * PolicyId.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * PolicyType.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * PromptCh.
             */
            public Builder promptCh(String promptCh) {
                this.promptCh = promptCh;
                return this;
            }

            /**
             * PromptEn.
             */
            public Builder promptEn(String promptEn) {
                this.promptEn = promptEn;
                return this;
            }

            /**
             * ReportProcessId.
             */
            public Builder reportProcessId(String reportProcessId) {
                this.reportProcessId = reportProcessId;
                return this;
            }

            /**
             * SoftwareIds.
             */
            public Builder softwareIds(java.util.List<SoftwareIds> softwareIds) {
                this.softwareIds = softwareIds;
                return this;
            }

            /**
             * TagIds.
             */
            public Builder tagIds(java.util.List<String> tagIds) {
                this.tagIds = tagIds;
                return this;
            }

            /**
             * TitleCh.
             */
            public Builder titleCh(String titleCh) {
                this.titleCh = titleCh;
                return this;
            }

            /**
             * TitleEn.
             */
            public Builder titleEn(String titleEn) {
                this.titleEn = titleEn;
                return this;
            }

            /**
             * UserGroupIds.
             */
            public Builder userGroupIds(java.util.List<String> userGroupIds) {
                this.userGroupIds = userGroupIds;
                return this;
            }

            /**
             * Whitelist.
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
