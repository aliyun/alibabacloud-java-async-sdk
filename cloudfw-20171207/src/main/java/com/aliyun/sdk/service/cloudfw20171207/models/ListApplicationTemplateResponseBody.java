// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link ListApplicationTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationTemplateResponseBody</p>
 */
public class ListApplicationTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationTemplates")
    private java.util.List<ApplicationTemplates> applicationTemplates;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListApplicationTemplateResponseBody(Builder builder) {
        this.applicationTemplates = builder.applicationTemplates;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationTemplates
     */
    public java.util.List<ApplicationTemplates> getApplicationTemplates() {
        return this.applicationTemplates;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<ApplicationTemplates> applicationTemplates; 
        private Long pageNo; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListApplicationTemplateResponseBody model) {
            this.applicationTemplates = model.applicationTemplates;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of application templates.</p>
         */
        public Builder applicationTemplates(java.util.List<ApplicationTemplates> applicationTemplates) {
            this.applicationTemplates = applicationTemplates;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of application templates that meet the filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListApplicationTemplateResponseBody build() {
            return new ListApplicationTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApplicationTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationTemplateResponseBody</p>
     */
    public static class BuiltInApplicationActionStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertApplicationCount")
        private Long alertApplicationCount;

        @com.aliyun.core.annotation.NameInMap("AllowApplicationCount")
        private Long allowApplicationCount;

        @com.aliyun.core.annotation.NameInMap("DenyApplicationCount")
        private Long denyApplicationCount;

        private BuiltInApplicationActionStatistics(Builder builder) {
            this.alertApplicationCount = builder.alertApplicationCount;
            this.allowApplicationCount = builder.allowApplicationCount;
            this.denyApplicationCount = builder.denyApplicationCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BuiltInApplicationActionStatistics create() {
            return builder().build();
        }

        /**
         * @return alertApplicationCount
         */
        public Long getAlertApplicationCount() {
            return this.alertApplicationCount;
        }

        /**
         * @return allowApplicationCount
         */
        public Long getAllowApplicationCount() {
            return this.allowApplicationCount;
        }

        /**
         * @return denyApplicationCount
         */
        public Long getDenyApplicationCount() {
            return this.denyApplicationCount;
        }

        public static final class Builder {
            private Long alertApplicationCount; 
            private Long allowApplicationCount; 
            private Long denyApplicationCount; 

            private Builder() {
            } 

            private Builder(BuiltInApplicationActionStatistics model) {
                this.alertApplicationCount = model.alertApplicationCount;
                this.allowApplicationCount = model.allowApplicationCount;
                this.denyApplicationCount = model.denyApplicationCount;
            } 

            /**
             * <p>The number of built-in applications whose final effective action is Alert.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder alertApplicationCount(Long alertApplicationCount) {
                this.alertApplicationCount = alertApplicationCount;
                return this;
            }

            /**
             * <p>The number of built-in applications whose final effective action is Allow.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder allowApplicationCount(Long allowApplicationCount) {
                this.allowApplicationCount = allowApplicationCount;
                return this;
            }

            /**
             * <p>The number of built-in applications whose final effective action is Deny.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder denyApplicationCount(Long denyApplicationCount) {
                this.denyApplicationCount = denyApplicationCount;
                return this;
            }

            public BuiltInApplicationActionStatistics build() {
                return new BuiltInApplicationActionStatistics(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApplicationTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationTemplateResponseBody</p>
     */
    public static class ApplicationTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationTemplateId")
        private String applicationTemplateId;

        @com.aliyun.core.annotation.NameInMap("ApplicationTemplateName")
        private String applicationTemplateName;

        @com.aliyun.core.annotation.NameInMap("BuiltInApplicationActionStatistics")
        private BuiltInApplicationActionStatistics builtInApplicationActionStatistics;

        @com.aliyun.core.annotation.NameInMap("BuiltInApplicationStatus")
        private String builtInApplicationStatus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CustomRuleCount")
        private Long customRuleCount;

        @com.aliyun.core.annotation.NameInMap("CustomRuleStatus")
        private String customRuleStatus;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("TemplateStatus")
        private String templateStatus;

        @com.aliyun.core.annotation.NameInMap("UnknownAction")
        private String unknownAction;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private ApplicationTemplates(Builder builder) {
            this.applicationTemplateId = builder.applicationTemplateId;
            this.applicationTemplateName = builder.applicationTemplateName;
            this.builtInApplicationActionStatistics = builder.builtInApplicationActionStatistics;
            this.builtInApplicationStatus = builder.builtInApplicationStatus;
            this.createTime = builder.createTime;
            this.customRuleCount = builder.customRuleCount;
            this.customRuleStatus = builder.customRuleStatus;
            this.description = builder.description;
            this.templateStatus = builder.templateStatus;
            this.unknownAction = builder.unknownAction;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationTemplates create() {
            return builder().build();
        }

        /**
         * @return applicationTemplateId
         */
        public String getApplicationTemplateId() {
            return this.applicationTemplateId;
        }

        /**
         * @return applicationTemplateName
         */
        public String getApplicationTemplateName() {
            return this.applicationTemplateName;
        }

        /**
         * @return builtInApplicationActionStatistics
         */
        public BuiltInApplicationActionStatistics getBuiltInApplicationActionStatistics() {
            return this.builtInApplicationActionStatistics;
        }

        /**
         * @return builtInApplicationStatus
         */
        public String getBuiltInApplicationStatus() {
            return this.builtInApplicationStatus;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return customRuleCount
         */
        public Long getCustomRuleCount() {
            return this.customRuleCount;
        }

        /**
         * @return customRuleStatus
         */
        public String getCustomRuleStatus() {
            return this.customRuleStatus;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return templateStatus
         */
        public String getTemplateStatus() {
            return this.templateStatus;
        }

        /**
         * @return unknownAction
         */
        public String getUnknownAction() {
            return this.unknownAction;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String applicationTemplateId; 
            private String applicationTemplateName; 
            private BuiltInApplicationActionStatistics builtInApplicationActionStatistics; 
            private String builtInApplicationStatus; 
            private Long createTime; 
            private Long customRuleCount; 
            private String customRuleStatus; 
            private String description; 
            private String templateStatus; 
            private String unknownAction; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(ApplicationTemplates model) {
                this.applicationTemplateId = model.applicationTemplateId;
                this.applicationTemplateName = model.applicationTemplateName;
                this.builtInApplicationActionStatistics = model.builtInApplicationActionStatistics;
                this.builtInApplicationStatus = model.builtInApplicationStatus;
                this.createTime = model.createTime;
                this.customRuleCount = model.customRuleCount;
                this.customRuleStatus = model.customRuleStatus;
                this.description = model.description;
                this.templateStatus = model.templateStatus;
                this.unknownAction = model.unknownAction;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The application template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ati-4f0691c56b8d4f06</p>
             */
            public Builder applicationTemplateId(String applicationTemplateId) {
                this.applicationTemplateId = applicationTemplateId;
                return this;
            }

            /**
             * <p>The name of the application template.</p>
             * 
             * <strong>example:</strong>
             * <p>Application template 01</p>
             */
            public Builder applicationTemplateName(String applicationTemplateName) {
                this.applicationTemplateName = applicationTemplateName;
                return this;
            }

            /**
             * <p>The statistics on the number of built-in applications in the template, categorized by the final effective action.</p>
             */
            public Builder builtInApplicationActionStatistics(BuiltInApplicationActionStatistics builtInApplicationActionStatistics) {
                this.builtInApplicationActionStatistics = builtInApplicationActionStatistics;
                return this;
            }

            /**
             * <p>The switch status of built-in application control. Valid values:</p>
             * <ul>
             * <li><strong>Enable</strong>: enabled</li>
             * <li><strong>Disable</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder builtInApplicationStatus(String builtInApplicationStatus) {
                this.builtInApplicationStatus = builtInApplicationStatus;
                return this;
            }

            /**
             * <p>The creation time of the application template. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1731465600</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The number of custom application rules under the template.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder customRuleCount(Long customRuleCount) {
                this.customRuleCount = customRuleCount;
                return this;
            }

            /**
             * <p>The switch status of custom application rules. Valid values:</p>
             * <ul>
             * <li><strong>Enable</strong>: enabled</li>
             * <li><strong>Disable</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder customRuleStatus(String customRuleStatus) {
                this.customRuleStatus = customRuleStatus;
                return this;
            }

            /**
             * <p>The description of the application template.</p>
             * 
             * <strong>example:</strong>
             * <p>Office network application control</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The master switch status of the application template. Valid values:</p>
             * <ul>
             * <li><strong>Enable</strong>: enabled</li>
             * <li><strong>Disable</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder templateStatus(String templateStatus) {
                this.templateStatus = templateStatus;
                return this;
            }

            /**
             * <p>The action for unrecognized applications. Valid values:</p>
             * <ul>
             * <li><strong>Allow</strong>: allow</li>
             * <li><strong>Alert</strong>: monitor</li>
             * <li><strong>Deny</strong>: block</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Alert</p>
             */
            public Builder unknownAction(String unknownAction) {
                this.unknownAction = unknownAction;
                return this;
            }

            /**
             * <p>The last modification time of the application template. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1731469200</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public ApplicationTemplates build() {
                return new ApplicationTemplates(this);
            } 

        } 

    }
}
