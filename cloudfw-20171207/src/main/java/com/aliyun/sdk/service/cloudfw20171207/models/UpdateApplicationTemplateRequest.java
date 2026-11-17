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
 * {@link UpdateApplicationTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationTemplateRequest</p>
 */
public class UpdateApplicationTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddBuiltInApplicationCustomActions")
    private java.util.List<AddBuiltInApplicationCustomActions> addBuiltInApplicationCustomActions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationTemplateName")
    private String applicationTemplateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BuiltInApplicationStatus")
    private String builtInApplicationStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomRuleStatus")
    private String customRuleStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoveBuiltInApplicationCustomActions")
    private java.util.List<RemoveBuiltInApplicationCustomActions> removeBuiltInApplicationCustomActions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateStatus")
    private String templateStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnknownAction")
    private String unknownAction;

    private UpdateApplicationTemplateRequest(Builder builder) {
        super(builder);
        this.addBuiltInApplicationCustomActions = builder.addBuiltInApplicationCustomActions;
        this.applicationTemplateId = builder.applicationTemplateId;
        this.applicationTemplateName = builder.applicationTemplateName;
        this.builtInApplicationStatus = builder.builtInApplicationStatus;
        this.customRuleStatus = builder.customRuleStatus;
        this.description = builder.description;
        this.removeBuiltInApplicationCustomActions = builder.removeBuiltInApplicationCustomActions;
        this.templateStatus = builder.templateStatus;
        this.unknownAction = builder.unknownAction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addBuiltInApplicationCustomActions
     */
    public java.util.List<AddBuiltInApplicationCustomActions> getAddBuiltInApplicationCustomActions() {
        return this.addBuiltInApplicationCustomActions;
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
     * @return builtInApplicationStatus
     */
    public String getBuiltInApplicationStatus() {
        return this.builtInApplicationStatus;
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
     * @return removeBuiltInApplicationCustomActions
     */
    public java.util.List<RemoveBuiltInApplicationCustomActions> getRemoveBuiltInApplicationCustomActions() {
        return this.removeBuiltInApplicationCustomActions;
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

    public static final class Builder extends Request.Builder<UpdateApplicationTemplateRequest, Builder> {
        private java.util.List<AddBuiltInApplicationCustomActions> addBuiltInApplicationCustomActions; 
        private String applicationTemplateId; 
        private String applicationTemplateName; 
        private String builtInApplicationStatus; 
        private String customRuleStatus; 
        private String description; 
        private java.util.List<RemoveBuiltInApplicationCustomActions> removeBuiltInApplicationCustomActions; 
        private String templateStatus; 
        private String unknownAction; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApplicationTemplateRequest request) {
            super(request);
            this.addBuiltInApplicationCustomActions = request.addBuiltInApplicationCustomActions;
            this.applicationTemplateId = request.applicationTemplateId;
            this.applicationTemplateName = request.applicationTemplateName;
            this.builtInApplicationStatus = request.builtInApplicationStatus;
            this.customRuleStatus = request.customRuleStatus;
            this.description = request.description;
            this.removeBuiltInApplicationCustomActions = request.removeBuiltInApplicationCustomActions;
            this.templateStatus = request.templateStatus;
            this.unknownAction = request.unknownAction;
        } 

        /**
         * <p>The list of custom actions to be added or updated for built-in applications. This list is merged with RemoveBuiltInApplicationCustomActions by removing items first and then adding items. The same application ID cannot appear in both lists at the same time.</p>
         */
        public Builder addBuiltInApplicationCustomActions(java.util.List<AddBuiltInApplicationCustomActions> addBuiltInApplicationCustomActions) {
            String addBuiltInApplicationCustomActionsShrink = shrink(addBuiltInApplicationCustomActions, "AddBuiltInApplicationCustomActions", "json");
            this.putQueryParameter("AddBuiltInApplicationCustomActions", addBuiltInApplicationCustomActionsShrink);
            this.addBuiltInApplicationCustomActions = addBuiltInApplicationCustomActions;
            return this;
        }

        /**
         * <p>The ID of the application template to be modified. The template must exist within the current Alibaba Cloud account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ati-4f0691c56b8d4f06</p>
         */
        public Builder applicationTemplateId(String applicationTemplateId) {
            this.putQueryParameter("ApplicationTemplateId", applicationTemplateId);
            this.applicationTemplateId = applicationTemplateId;
            return this;
        }

        /**
         * <p>The name of the application template. The name must be 1 to 64 characters in length and can contain Chinese characters, letters, digits, hyphens (-), underscores (_), and periods (.). It cannot contain spaces. If this parameter is not specified or is left empty, the original value is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>Application template 02</p>
         */
        public Builder applicationTemplateName(String applicationTemplateName) {
            this.putQueryParameter("ApplicationTemplateName", applicationTemplateName);
            this.applicationTemplateName = applicationTemplateName;
            return this;
        }

        /**
         * <p>The switch status of built-in application control. Valid values: only <strong>Enable</strong> is supported. If you specify Disable, an error is returned. If this parameter is not specified or is left empty, the original value is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        public Builder builtInApplicationStatus(String builtInApplicationStatus) {
            this.putQueryParameter("BuiltInApplicationStatus", builtInApplicationStatus);
            this.builtInApplicationStatus = builtInApplicationStatus;
            return this;
        }

        /**
         * <p>The switch status of custom rules for applications. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong>: Enabled.</li>
         * <li><strong>Disable</strong>: Disabled.
         * If this parameter is not specified or is left empty, the original value is retained.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        public Builder customRuleStatus(String customRuleStatus) {
            this.putQueryParameter("CustomRuleStatus", customRuleStatus);
            this.customRuleStatus = customRuleStatus;
            return this;
        }

        /**
         * <p>The description of the application template. The description can be up to 128 characters in length. If this parameter is not specified, the original value is retained. If an empty string is specified, the description is cleared.</p>
         * 
         * <strong>example:</strong>
         * <p>Office network application control</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The list of built-in applications from which to remove custom actions. After removal, these applications revert to the default actions of the template. The same application ID cannot appear in AddBuiltInApplicationCustomActions at the same time.</p>
         */
        public Builder removeBuiltInApplicationCustomActions(java.util.List<RemoveBuiltInApplicationCustomActions> removeBuiltInApplicationCustomActions) {
            String removeBuiltInApplicationCustomActionsShrink = shrink(removeBuiltInApplicationCustomActions, "RemoveBuiltInApplicationCustomActions", "json");
            this.putQueryParameter("RemoveBuiltInApplicationCustomActions", removeBuiltInApplicationCustomActionsShrink);
            this.removeBuiltInApplicationCustomActions = removeBuiltInApplicationCustomActions;
            return this;
        }

        /**
         * <p>The master switch status of the application template. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong>: Enabled.</li>
         * <li><strong>Disable</strong>: Disabled.
         * If this parameter is not specified or is left empty, the original value is retained.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        public Builder templateStatus(String templateStatus) {
            this.putQueryParameter("TemplateStatus", templateStatus);
            this.templateStatus = templateStatus;
            return this;
        }

        /**
         * <p>The action for unidentified applications. Valid values:</p>
         * <ul>
         * <li><strong>Allow</strong>: Allow.</li>
         * <li><strong>Alert</strong>: Monitor.</li>
         * <li><strong>Deny</strong>: Block.
         * If this parameter is not specified or is left empty, the original value is retained.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Alert</p>
         */
        public Builder unknownAction(String unknownAction) {
            this.putQueryParameter("UnknownAction", unknownAction);
            this.unknownAction = unknownAction;
            return this;
        }

        @Override
        public UpdateApplicationTemplateRequest build() {
            return new UpdateApplicationTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateApplicationTemplateRequest} extends {@link TeaModel}
     *
     * <p>UpdateApplicationTemplateRequest</p>
     */
    public static class AddBuiltInApplicationCustomActions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private Long applicationId;

        private AddBuiltInApplicationCustomActions(Builder builder) {
            this.action = builder.action;
            this.applicationId = builder.applicationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddBuiltInApplicationCustomActions create() {
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

            private Builder(AddBuiltInApplicationCustomActions model) {
                this.action = model.action;
                this.applicationId = model.applicationId;
            } 

            /**
             * <p>The action to be performed on the application. Valid values:</p>
             * <ul>
             * <li><strong>Allow</strong>: Allow.</li>
             * <li><strong>Alert</strong>: Monitor.</li>
             * <li><strong>Deny</strong>: Block.</li>
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
             * <p>The ID of the application for which to set custom actions. The application must exist in the built-in application signature library and the ID cannot be 0. You can call the ListApplications operation to query the ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10012150000</p>
             */
            public Builder applicationId(Long applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            public AddBuiltInApplicationCustomActions build() {
                return new AddBuiltInApplicationCustomActions(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateApplicationTemplateRequest} extends {@link TeaModel}
     *
     * <p>UpdateApplicationTemplateRequest</p>
     */
    public static class RemoveBuiltInApplicationCustomActions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private Long applicationId;

        private RemoveBuiltInApplicationCustomActions(Builder builder) {
            this.applicationId = builder.applicationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemoveBuiltInApplicationCustomActions create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public Long getApplicationId() {
            return this.applicationId;
        }

        public static final class Builder {
            private Long applicationId; 

            private Builder() {
            } 

            private Builder(RemoveBuiltInApplicationCustomActions model) {
                this.applicationId = model.applicationId;
            } 

            /**
             * <p>The ID of the application from which to remove custom actions. The application must exist in the built-in application signature library.</p>
             * 
             * <strong>example:</strong>
             * <p>10012150000</p>
             */
            public Builder applicationId(Long applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            public RemoveBuiltInApplicationCustomActions build() {
                return new RemoveBuiltInApplicationCustomActions(this);
            } 

        } 

    }
}
