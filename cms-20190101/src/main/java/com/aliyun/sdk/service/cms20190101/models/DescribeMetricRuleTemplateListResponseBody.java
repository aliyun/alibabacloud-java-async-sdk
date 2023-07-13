// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetricRuleTemplateListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetricRuleTemplateListResponseBody</p>
 */
public class DescribeMetricRuleTemplateListResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Templates")
    private Templates templates;

    @NameInMap("Total")
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
         * The timestamp when the alert template was applied to the application group.
         * <p>
         * 
         * Unit: milliseconds.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The list of alert templates.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The keyword of the alert template name.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The ID of the alert template.
         */
        public Builder templates(Templates templates) {
            this.templates = templates;
            return this;
        }

        /**
         * The sorting basis. Default value: gmtCreate. Valid values:
         * <p>
         * 
         * *   gmtMotified: Sorts alert templates by modification time.
         * *   gmtCreate: Sorts alert templates by creation time.
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
        @NameInMap("ApplyTime")
        private Long applyTime;

        @NameInMap("GroupId")
        private Long groupId;

        @NameInMap("GroupName")
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
             * ApplyTime.
             */
            public Builder applyTime(Long applyTime) {
                this.applyTime = applyTime;
                return this;
            }

            /**
             * For more information about common request parameters, see [Common parameters](~~199331~~).
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupName.
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
        @NameInMap("ApplyHistory")
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
        @NameInMap("ApplyHistories")
        private ApplyHistories applyHistories;

        @NameInMap("Description")
        private String description;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("Name")
        private String name;

        @NameInMap("RestVersion")
        private Long restVersion;

        @NameInMap("TemplateId")
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
             * The ID of the request.
             */
            public Builder applyHistories(ApplyHistories applyHistories) {
                this.applyHistories = applyHistories;
                return this;
            }

            /**
             * The order in which you want to sort alert templates. Default value: true. Valid values:
             * <p>
             * 
             * *   true: ascending order
             * *   false: descending order
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the application group.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The number of the page to return.
             * <p>
             * 
             * Default value: 1
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The application history of the alert template.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the alert template.
             */
            public Builder restVersion(Long restVersion) {
                this.restVersion = restVersion;
                return this;
            }

            /**
             * The description of the alert template.
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
        @NameInMap("Template")
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
