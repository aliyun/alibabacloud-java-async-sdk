// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetricRuleTemplateListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetricRuleTemplateListResponseBody</p>
 */
public class DescribeMetricRuleTemplateListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Templates")
    private Templates templates;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private DescribeMetricRuleTemplateListResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.templates = builder.templates;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricRuleTemplateListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return templates
     */
    public Templates getTemplates() {
        return this.templates;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Templates templates; 
        private Long total; 

        /**
         * The status code.
         * <p>
         * 
         * > The status code 200 indicates that the request was successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The queried alert templates.
         */
        public Builder templates(Templates templates) {
            this.templates = templates;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeMetricRuleTemplateListResponseBody build() {
            return new DescribeMetricRuleTemplateListResponseBody(this);
        } 

    } 

    public static class ApplyHistory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyTime")
        private Long applyTime;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        private ApplyHistory(Builder builder) {
            this.applyTime = builder.applyTime;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplyHistory create() {
            return builder().build();
        }

        /**
         * @return applyTime
         */
        public Long getApplyTime() {
            return this.applyTime;
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        public static final class Builder {
            private Long applyTime; 
            private Long groupId; 
            private String groupName; 

            /**
             * The timestamp when the alert template was applied to the application group.
             * <p>
             * 
             * Unit: milliseconds.
             */
            public Builder applyTime(Long applyTime) {
                this.applyTime = applyTime;
                return this;
            }

            /**
             * The ID of the application group.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the application group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            public ApplyHistory build() {
                return new ApplyHistory(this);
            } 

        } 

    }
    public static class ApplyHistories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyHistory")
        private java.util.List < ApplyHistory> applyHistory;

        private ApplyHistories(Builder builder) {
            this.applyHistory = builder.applyHistory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplyHistories create() {
            return builder().build();
        }

        /**
         * @return applyHistory
         */
        public java.util.List < ApplyHistory> getApplyHistory() {
            return this.applyHistory;
        }

        public static final class Builder {
            private java.util.List < ApplyHistory> applyHistory; 

            /**
             * ApplyHistory.
             */
            public Builder applyHistory(java.util.List < ApplyHistory> applyHistory) {
                this.applyHistory = applyHistory;
                return this;
            }

            public ApplyHistories build() {
                return new ApplyHistories(this);
            } 

        } 

    }
    public static class Template extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyHistories")
        private ApplyHistories applyHistories;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RestVersion")
        private Long restVersion;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        private Template(Builder builder) {
            this.applyHistories = builder.applyHistories;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.name = builder.name;
            this.restVersion = builder.restVersion;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Template create() {
            return builder().build();
        }

        /**
         * @return applyHistories
         */
        public ApplyHistories getApplyHistories() {
            return this.applyHistories;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return restVersion
         */
        public Long getRestVersion() {
            return this.restVersion;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private ApplyHistories applyHistories; 
            private String description; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String name; 
            private Long restVersion; 
            private Long templateId; 

            /**
             * The history of applying the alert templates to application groups.
             */
            public Builder applyHistories(ApplyHistories applyHistories) {
                this.applyHistories = applyHistories;
                return this;
            }

            /**
             * The description of the alert template.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The timestamp when the alert template was created.
             * <p>
             * 
             * Unit: milliseconds.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The timestamp when the alert template was modified.
             * <p>
             * 
             * Unit: milliseconds.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The name of the alert template.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The version of the alert template.
             * <p>
             * 
             * Default value: 0.
             */
            public Builder restVersion(Long restVersion) {
                this.restVersion = restVersion;
                return this;
            }

            /**
             * The ID of the alert template.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            public Template build() {
                return new Template(this);
            } 

        } 

    }
    public static class Templates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Template")
        private java.util.List < Template> template;

        private Templates(Builder builder) {
            this.template = builder.template;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Templates create() {
            return builder().build();
        }

        /**
         * @return template
         */
        public java.util.List < Template> getTemplate() {
            return this.template;
        }

        public static final class Builder {
            private java.util.List < Template> template; 

            /**
             * Template.
             */
            public Builder template(java.util.List < Template> template) {
                this.template = template;
                return this;
            }

            public Templates build() {
                return new Templates(this);
            } 

        } 

    }
}
