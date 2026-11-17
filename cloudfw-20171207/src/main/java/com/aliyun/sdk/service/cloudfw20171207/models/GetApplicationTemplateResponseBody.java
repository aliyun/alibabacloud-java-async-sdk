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
 * {@link GetApplicationTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationTemplateResponseBody</p>
 */
public class GetApplicationTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationTemplate")
    private ApplicationTemplate applicationTemplate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetApplicationTemplateResponseBody(Builder builder) {
        this.applicationTemplate = builder.applicationTemplate;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationTemplate
     */
    public ApplicationTemplate getApplicationTemplate() {
        return this.applicationTemplate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApplicationTemplate applicationTemplate; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetApplicationTemplateResponseBody model) {
            this.applicationTemplate = model.applicationTemplate;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The application template details.</p>
         */
        public Builder applicationTemplate(ApplicationTemplate applicationTemplate) {
            this.applicationTemplate = applicationTemplate;
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

        public GetApplicationTemplateResponseBody build() {
            return new GetApplicationTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetApplicationTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationTemplateResponseBody</p>
     */
    public static class BuiltInApplicationActions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private Long applicationId;

        private BuiltInApplicationActions(Builder builder) {
            this.action = builder.action;
            this.applicationId = builder.applicationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BuiltInApplicationActions create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return applicationId
         */
        public Long getApplicationId() {
            return this.applicationId;
        }

        public static final class Builder {
            private String action; 
            private Long applicationId; 

            private Builder() {
            } 

            private Builder(BuiltInApplicationActions model) {
                this.action = model.action;
                this.applicationId = model.applicationId;
            } 

            /**
             * <p>The action performed on the application. Valid values:</p>
             * <ul>
             * <li><strong>Allow</strong>: Allows the traffic.</li>
             * <li><strong>Alert</strong>: Monitors the traffic.</li>
             * <li><strong>Deny</strong>: Blocks the traffic.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Deny</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The ID of the application in the built-in application signature library.</p>
             * 
             * <strong>example:</strong>
             * <p>10012150000</p>
             */
            public Builder applicationId(Long applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            public BuiltInApplicationActions build() {
                return new BuiltInApplicationActions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetApplicationTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationTemplateResponseBody</p>
     */
    public static class ApplicationTemplate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationTemplateId")
        private String applicationTemplateId;

        @com.aliyun.core.annotation.NameInMap("ApplicationTemplateName")
        private String applicationTemplateName;

        @com.aliyun.core.annotation.NameInMap("BuiltInApplicationActions")
        private java.util.List<BuiltInApplicationActions> builtInApplicationActions;

        @com.aliyun.core.annotation.NameInMap("BuiltInApplicationStatus")
        private String builtInApplicationStatus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

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

        private ApplicationTemplate(Builder builder) {
            this.applicationTemplateId = builder.applicationTemplateId;
            this.applicationTemplateName = builder.applicationTemplateName;
            this.builtInApplicationActions = builder.builtInApplicationActions;
            this.builtInApplicationStatus = builder.builtInApplicationStatus;
            this.createTime = builder.createTime;
            this.customRuleStatus = builder.customRuleStatus;
            this.description = builder.description;
            this.templateStatus = builder.templateStatus;
            this.unknownAction = builder.unknownAction;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationTemplate create() {
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
         * @return builtInApplicationActions
         */
        public java.util.List<BuiltInApplicationActions> getBuiltInApplicationActions() {
            return this.builtInApplicationActions;
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
            private java.util.List<BuiltInApplicationActions> builtInApplicationActions; 
            private String builtInApplicationStatus; 
            private Long createTime; 
            private String customRuleStatus; 
            private String description; 
            private String templateStatus; 
            private String unknownAction; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(ApplicationTemplate model) {
                this.applicationTemplateId = model.applicationTemplateId;
                this.applicationTemplateName = model.applicationTemplateName;
                this.builtInApplicationActions = model.builtInApplicationActions;
                this.builtInApplicationStatus = model.builtInApplicationStatus;
                this.createTime = model.createTime;
                this.customRuleStatus = model.customRuleStatus;
                this.description = model.description;
                this.templateStatus = model.templateStatus;
                this.unknownAction = model.unknownAction;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The ID of the application template.</p>
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
             * <p>Application Template 01</p>
             */
            public Builder applicationTemplateName(String applicationTemplateName) {
                this.applicationTemplateName = applicationTemplateName;
                return this;
            }

            /**
             * <p>The list of built-in application actions.</p>
             */
            public Builder builtInApplicationActions(java.util.List<BuiltInApplicationActions> builtInApplicationActions) {
                this.builtInApplicationActions = builtInApplicationActions;
                return this;
            }

            /**
             * <p>The switch status for built-in application control. Valid values:</p>
             * <ul>
             * <li><strong>Enable</strong>: Enabled.</li>
             * <li><strong>Disable</strong>: Disabled.</li>
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
             * <p>The switch status for custom application rules. Valid values:</p>
             * <ul>
             * <li><strong>Enable</strong>: Enabled.</li>
             * <li><strong>Disable</strong>: Disabled.</li>
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
             * <p>The overall switch status of the application template. Valid values:</p>
             * <ul>
             * <li><strong>Enable</strong>: Enabled.</li>
             * <li><strong>Disable</strong>: Disabled.</li>
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
             * <p>The action for unidentified applications. Valid values:</p>
             * <ul>
             * <li><strong>Allow</strong>: Allows the traffic.</li>
             * <li><strong>Alert</strong>: Monitors the traffic.</li>
             * <li><strong>Deny</strong>: Blocks the traffic.</li>
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
             * <p>The last update time of the application template. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1731469200</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public ApplicationTemplate build() {
                return new ApplicationTemplate(this);
            } 

        } 

    }
}
