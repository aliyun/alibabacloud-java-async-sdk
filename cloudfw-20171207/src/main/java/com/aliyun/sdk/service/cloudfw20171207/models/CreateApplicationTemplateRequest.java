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
 * {@link CreateApplicationTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateApplicationTemplateRequest</p>
 */
public class CreateApplicationTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddBuiltInApplicationCustomActions")
    private java.util.List<AddBuiltInApplicationCustomActions> addBuiltInApplicationCustomActions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationTemplateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationTemplateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BuiltInApplicationStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String builtInApplicationStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomRuleStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customRuleStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnknownAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String unknownAction;

    private CreateApplicationTemplateRequest(Builder builder) {
        super(builder);
        this.addBuiltInApplicationCustomActions = builder.addBuiltInApplicationCustomActions;
        this.applicationTemplateName = builder.applicationTemplateName;
        this.builtInApplicationStatus = builder.builtInApplicationStatus;
        this.customRuleStatus = builder.customRuleStatus;
        this.description = builder.description;
        this.templateStatus = builder.templateStatus;
        this.unknownAction = builder.unknownAction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationTemplateRequest create() {
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

    public static final class Builder extends Request.Builder<CreateApplicationTemplateRequest, Builder> {
        private java.util.List<AddBuiltInApplicationCustomActions> addBuiltInApplicationCustomActions; 
        private String applicationTemplateName; 
        private String builtInApplicationStatus; 
        private String customRuleStatus; 
        private String description; 
        private String templateStatus; 
        private String unknownAction; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationTemplateRequest request) {
            super(request);
            this.addBuiltInApplicationCustomActions = request.addBuiltInApplicationCustomActions;
            this.applicationTemplateName = request.applicationTemplateName;
            this.builtInApplicationStatus = request.builtInApplicationStatus;
            this.customRuleStatus = request.customRuleStatus;
            this.description = request.description;
            this.templateStatus = request.templateStatus;
            this.unknownAction = request.unknownAction;
        } 

        /**
         * <p>The list of custom actions to configure for built-in applications. The application IDs in the list must be unique.</p>
         */
        public Builder addBuiltInApplicationCustomActions(java.util.List<AddBuiltInApplicationCustomActions> addBuiltInApplicationCustomActions) {
            String addBuiltInApplicationCustomActionsShrink = shrink(addBuiltInApplicationCustomActions, "AddBuiltInApplicationCustomActions", "json");
            this.putQueryParameter("AddBuiltInApplicationCustomActions", addBuiltInApplicationCustomActionsShrink);
            this.addBuiltInApplicationCustomActions = addBuiltInApplicationCustomActions;
            return this;
        }

        /**
         * <p>The name of the application template. The name must be 1 to 64 characters in length and can contain Chinese characters, letters, digits, hyphens (-), underscores (_), and periods (.). It cannot contain spaces or be empty.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ApplicationTemplate01</p>
         */
        public Builder applicationTemplateName(String applicationTemplateName) {
            this.putQueryParameter("ApplicationTemplateName", applicationTemplateName);
            this.applicationTemplateName = applicationTemplateName;
            return this;
        }

        /**
         * <p>The switch status of built-in application control. Only <strong>Enable</strong> is supported, which indicates that built-in application control is enabled. If you pass Disable, an error is returned.</p>
         * <p>This parameter is required.</p>
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
         * <p>The switch status of custom application rules. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong>: Enables the feature.</li>
         * <li><strong>Disable</strong>: Disables the feature.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The description of the application template. The description can be up to 128 characters in length and can be empty.</p>
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
         * <p>The overall switch status of the application template. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong>: Enables the template.</li>
         * <li><strong>Disable</strong>: Disables the template.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The action to take on unidentified applications. Valid values:</p>
         * <ul>
         * <li><strong>Allow</strong>: Allows the traffic.</li>
         * <li><strong>Alert</strong>: Monitors the traffic.</li>
         * <li><strong>Deny</strong>: Blocks the traffic.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
        public CreateApplicationTemplateRequest build() {
            return new CreateApplicationTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateApplicationTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateApplicationTemplateRequest</p>
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
             * <p>The action to perform on the application. Valid values:</p>
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
             * <p>The ID of the application for which you want to configure a custom action. The application must exist in the built-in application signature library and the ID cannot be 0. You can call the ListApplications operation to query the ID.</p>
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
}
