// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateStackGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateStackGroupRequest</p>
 */
public class UpdateStackGroupRequest extends Request {
    @Query
    @NameInMap("AccountIds")
    private java.util.List < String > accountIds;

    @Query
    @NameInMap("AdministrationRoleName")
    private String administrationRoleName;

    @Query
    @NameInMap("AutoDeployment")
    private AutoDeployment autoDeployment;

    @Query
    @NameInMap("Capabilities")
    private java.util.List < String > capabilities;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DeploymentTargets")
    private DeploymentTargets deploymentTargets;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ExecutionRoleName")
    private String executionRoleName;

    @Query
    @NameInMap("OperationDescription")
    private String operationDescription;

    @Query
    @NameInMap("OperationPreferences")
    private java.util.Map < String, ? > operationPreferences;

    @Query
    @NameInMap("Parameters")
    private java.util.List < Parameters> parameters;

    @Query
    @NameInMap("PermissionModel")
    private String permissionModel;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RegionIds")
    private java.util.List < String > regionIds;

    @Query
    @NameInMap("StackGroupName")
    @Validation(required = true)
    private String stackGroupName;

    @Query
    @NameInMap("TemplateBody")
    private String templateBody;

    @Query
    @NameInMap("TemplateId")
    private String templateId;

    @Query
    @NameInMap("TemplateURL")
    private String templateURL;

    @Query
    @NameInMap("TemplateVersion")
    private String templateVersion;

    private UpdateStackGroupRequest(Builder builder) {
        super(builder);
        this.accountIds = builder.accountIds;
        this.administrationRoleName = builder.administrationRoleName;
        this.autoDeployment = builder.autoDeployment;
        this.capabilities = builder.capabilities;
        this.clientToken = builder.clientToken;
        this.deploymentTargets = builder.deploymentTargets;
        this.description = builder.description;
        this.executionRoleName = builder.executionRoleName;
        this.operationDescription = builder.operationDescription;
        this.operationPreferences = builder.operationPreferences;
        this.parameters = builder.parameters;
        this.permissionModel = builder.permissionModel;
        this.regionId = builder.regionId;
        this.regionIds = builder.regionIds;
        this.stackGroupName = builder.stackGroupName;
        this.templateBody = builder.templateBody;
        this.templateId = builder.templateId;
        this.templateURL = builder.templateURL;
        this.templateVersion = builder.templateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateStackGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountIds
     */
    public java.util.List < String > getAccountIds() {
        return this.accountIds;
    }

    /**
     * @return administrationRoleName
     */
    public String getAdministrationRoleName() {
        return this.administrationRoleName;
    }

    /**
     * @return autoDeployment
     */
    public AutoDeployment getAutoDeployment() {
        return this.autoDeployment;
    }

    /**
     * @return capabilities
     */
    public java.util.List < String > getCapabilities() {
        return this.capabilities;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return deploymentTargets
     */
    public DeploymentTargets getDeploymentTargets() {
        return this.deploymentTargets;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return executionRoleName
     */
    public String getExecutionRoleName() {
        return this.executionRoleName;
    }

    /**
     * @return operationDescription
     */
    public String getOperationDescription() {
        return this.operationDescription;
    }

    /**
     * @return operationPreferences
     */
    public java.util.Map < String, ? > getOperationPreferences() {
        return this.operationPreferences;
    }

    /**
     * @return parameters
     */
    public java.util.List < Parameters> getParameters() {
        return this.parameters;
    }

    /**
     * @return permissionModel
     */
    public String getPermissionModel() {
        return this.permissionModel;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return regionIds
     */
    public java.util.List < String > getRegionIds() {
        return this.regionIds;
    }

    /**
     * @return stackGroupName
     */
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    /**
     * @return templateBody
     */
    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateURL
     */
    public String getTemplateURL() {
        return this.templateURL;
    }

    /**
     * @return templateVersion
     */
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static final class Builder extends Request.Builder<UpdateStackGroupRequest, Builder> {
        private java.util.List < String > accountIds; 
        private String administrationRoleName; 
        private AutoDeployment autoDeployment; 
        private java.util.List < String > capabilities; 
        private String clientToken; 
        private DeploymentTargets deploymentTargets; 
        private String description; 
        private String executionRoleName; 
        private String operationDescription; 
        private java.util.Map < String, ? > operationPreferences; 
        private java.util.List < Parameters> parameters; 
        private String permissionModel; 
        private String regionId; 
        private java.util.List < String > regionIds; 
        private String stackGroupName; 
        private String templateBody; 
        private String templateId; 
        private String templateURL; 
        private String templateVersion; 

        private Builder() {
            super();
        } 

        private Builder(UpdateStackGroupRequest request) {
            super(request);
            this.accountIds = request.accountIds;
            this.administrationRoleName = request.administrationRoleName;
            this.autoDeployment = request.autoDeployment;
            this.capabilities = request.capabilities;
            this.clientToken = request.clientToken;
            this.deploymentTargets = request.deploymentTargets;
            this.description = request.description;
            this.executionRoleName = request.executionRoleName;
            this.operationDescription = request.operationDescription;
            this.operationPreferences = request.operationPreferences;
            this.parameters = request.parameters;
            this.permissionModel = request.permissionModel;
            this.regionId = request.regionId;
            this.regionIds = request.regionIds;
            this.stackGroupName = request.stackGroupName;
            this.templateBody = request.templateBody;
            this.templateId = request.templateId;
            this.templateURL = request.templateURL;
            this.templateVersion = request.templateVersion;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the token is unique among different requests.
         * <p>
         * 
         * The token can be up to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (\_).
         * 
         * For more information, see [Ensure idempotence](~~134212~~).
         */
        public Builder accountIds(java.util.List < String > accountIds) {
            String accountIdsShrink = shrink(accountIds, "AccountIds", "json");
            this.putQueryParameter("AccountIds", accountIdsShrink);
            this.accountIds = accountIds;
            return this;
        }

        /**
         * The value of parameter N.
         * <p>
         * 
         * Maximum value of N: 200.
         * 
         * >  The Parameters parameter is optional. If you set the Parameters parameter, you must set the Parameters.N.ParameterValue parameter.
         */
        public Builder administrationRoleName(String administrationRoleName) {
            this.putQueryParameter("AdministrationRoleName", administrationRoleName);
            this.administrationRoleName = administrationRoleName;
            return this;
        }

        /**
         * The IDs of the members in the resource directory. You can specify a maximum of 20 member IDs.
         * <p>
         * 
         * >  To view the member IDs, go to the **Overview** page in the **Resource Management** console. For more information, see [View the detailed information of a member](~~111624~~).
         */
        public Builder autoDeployment(AutoDeployment autoDeployment) {
            String autoDeploymentShrink = shrink(autoDeployment, "AutoDeployment", "json");
            this.putQueryParameter("AutoDeployment", autoDeploymentShrink);
            this.autoDeployment = autoDeployment;
            return this;
        }

        /**
         * Capabilities.
         */
        public Builder capabilities(java.util.List < String > capabilities) {
            this.putQueryParameter("Capabilities", capabilities);
            this.capabilities = capabilities;
            return this;
        }

        /**
         * The version of the template. If you do not specify a version, the latest version is used.
         * <p>
         * 
         * >  This parameter takes effect only if the TemplateId parameter is set.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the operation.
         */
        public Builder deploymentTargets(DeploymentTargets deploymentTargets) {
            String deploymentTargetsShrink = shrink(deploymentTargets, "DeploymentTargets", "json");
            this.putQueryParameter("DeploymentTargets", deploymentTargetsShrink);
            this.deploymentTargets = deploymentTargets;
            return this;
        }

        /**
         * The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Alibaba Cloud Object Storage Service (OSS) bucket. The template body must be 1 to 524,288 bytes in length. Examples: oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. If you do not specify the region ID of the OSS bucket, the value of the RegionId parameter is used.
         * <p>
         * 
         * >  You must specify only one of the TemplateBody, TemplateURL, and TemplateId parameters.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The permission model.
         * <p>
         * 
         * Valid values:
         * 
         * *   SELF_MANAGED: the self-managed permission model. This is the default value. If you use the self-managed model for the stack group, you must create RAM roles for the administrator and execution accounts, and establish a trust relationship between the accounts to deploy stacks within the execution account.
         * *   SERVICE_MANAGED: the service-managed permission model. If you use the service-managed model for the stack group, ROS creates service-linked roles for the administrator and execution accounts, and the administrator account uses its role to deploy stacks within the execution account.
         * 
         * > 
         * *   If stack instances have been created in the stack group, you cannot switch the permission mode of the stack group.
         * *   If you want to use the service-managed permission model to deploy stacks, your account must be the management account or a delegated administrator account of your resource directory and the trusted access feature is enabled for the account. For more information, see [Step 1: (Optional) Create a delegated administrator account](~~308253~~) and [Step 2: Enable trusted access](~~298229~~).
         */
        public Builder executionRoleName(String executionRoleName) {
            this.putQueryParameter("ExecutionRoleName", executionRoleName);
            this.executionRoleName = executionRoleName;
            return this;
        }

        /**
         * The list of parameters.
         */
        public Builder operationDescription(String operationDescription) {
            this.putQueryParameter("OperationDescription", operationDescription);
            this.operationDescription = operationDescription;
            return this;
        }

        /**
         * The key of parameter N. If you do not specify the key and value of the parameter, ROS uses the default key and value in the template.
         * <p>
         * 
         * Maximum value of N: 200.
         * 
         * >  The Parameters parameter is optional. If you set the Parameters parameter, you must set the Parameters.N.ParameterKey parameter.
         */
        public Builder operationPreferences(java.util.Map < String, ? > operationPreferences) {
            String operationPreferencesShrink = shrink(operationPreferences, "OperationPreferences", "json");
            this.putQueryParameter("OperationPreferences", operationPreferencesShrink);
            this.operationPreferences = operationPreferences;
            return this;
        }

        /**
         * Specifies whether to retain stacks in a member when you remove the member from the folder.
         * <p>
         * 
         * Valid values:
         * 
         * *   true: retains the stacks.
         * *   false: deletes the stacks.
         * 
         * >  This parameter is required if the Enabled parameter is set to true.
         */
        public Builder parameters(java.util.List < Parameters> parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * The IDs of the folders in the resource directory. You can specify up to five folder IDs.
         * <p>
         * 
         * You can create stacks within all members in the specified folders. If you create stacks in the Root folder, the stacks are created within all members in the resource directory.
         * 
         * >  To view the folder IDs, go to the **Overview** page in the **Resource Management** console. For more information, see [View the basic information of a folder](~~111223~~).
         */
        public Builder permissionModel(String permissionModel) {
            this.putQueryParameter("PermissionModel", permissionModel);
            this.permissionModel = permissionModel;
            return this;
        }

        /**
         * The region IDs of stack instances. You can specify a maximum of 20 region IDs.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The preferences of the operation to update the stack group.
         * <p>
         * 
         * The following parameters are available:
         * 
         * *   {"FailureToleranceCount": N}
         * 
         *     The maximum number of accounts within which stack operation failures are allowed in each region. If the value is exceeded in a region, ROS stops the operation in the region. If ROS stops the operation in one region, the operation is not performed in other regions.
         * 
         *     Valid values of N: 0 to 20.
         * 
         *     If you do not specify a value for the FailureToleranceCount parameter, the default value 0 is used.
         * 
         * *   {"FailureTolerancePercentage": N}
         * 
         *     The percentage of accounts within which stack operation failures are allowed in each region. If the value is exceeded in a region, ROS stops the operation in the region.
         * 
         *     Valid values of N: 0 to 100. If the number of accounts specified by the percentage is not a whole number, ROS rounds down the number.
         * 
         *     If you do not specify a value for the FailureTolerancePercentage parameter, the default value 0 is used.
         * 
         * *   {"MaxConcurrentCount": N}
         * 
         *     The maximum number of accounts within which stacks can be deployed at a time in each region.
         * 
         *     Valid values of N: 1 to 20.
         * 
         *     If you do not specify a value for the MaxConcurrentCount parameter, the default value 1 is used.
         * 
         * *   {"MaxConcurrentPercentage": N}
         * 
         *     The percentage of accounts within which stacks can be deployed at a time in each region.
         * 
         *     Valid values of N: 1 to 100. If the number of accounts specified by the percentage is not a whole number, ROS rounds down the number.
         * 
         *     If you do not specify a value for the MaxConcurrentPercentage parameter, the default value 1 is used.
         * 
         * *   {"RegionConcurrencyType": N}
         * 
         *     Specifies whether stacks can be deployed in multiple regions in parallel. Valid values:
         * 
         *     *   SEQUENTIAL: deploys stacks in the specified regions one by one in sequence. This way, stacks are deployed in only one region at a time. This is the default value.
         *     *   PARALLEL: deploys stacks in all the specified regions in parallel.
         * 
         * Separate multiple parameters with commas (,).
         * 
         * > 
         * *   You can specify only one of the MaxConcurrentCount and MaxConcurrentPercentage parameters.
         * *   You can specify only one of the FailureToleranceCount and FailureTolerancePercentage parameters.
         */
        public Builder regionIds(java.util.List < String > regionIds) {
            String regionIdsShrink = shrink(regionIds, "RegionIds", "json");
            this.putQueryParameter("RegionIds", regionIdsShrink);
            this.regionIds = regionIds;
            return this;
        }

        /**
         * The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body exceeds the upper limit, we recommend that you add parameters to the HTTP POST request body to prevent request failures caused by excessively long URLs.
         * <p>
         * 
         * >  You must specify only one of the TemplateBody, TemplateURL, and TemplateId parameters.
         */
        public Builder stackGroupName(String stackGroupName) {
            this.putQueryParameter("StackGroupName", stackGroupName);
            this.stackGroupName = stackGroupName;
            return this;
        }

        /**
         * The name of the RAM role to be assumed by the administrator role AliyunROSStackGroupAdministrationRole. This parameter is required if you want to grant self-managed permissions to the stack group. If you do not specify a value for this parameter, the default value AliyunROSStackGroupExecutionRole is used. You can use this role in ROS to perform operations on the stacks that correspond to stack instances in the stack group.
         * <p>
         * 
         * The name must be 1 to 64 characters in length, and can contain letters, digits, and hyphens (-).
         */
        public Builder templateBody(String templateBody) {
            this.putQueryParameter("TemplateBody", templateBody);
            this.templateBody = templateBody;
            return this;
        }

        /**
         * The information about automatic deployment settings.
         * <p>
         * 
         * >  This parameter is required only if the PermissionModel parameter is set to SERVICE_MANAGED.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * The ID of the template. This parameter applies to shared and private templates.
         * <p>
         * 
         * >  You must specify only one of the TemplateBody, TemplateURL, and TemplateId parameters.
         */
        public Builder templateURL(String templateURL) {
            this.putQueryParameter("TemplateURL", templateURL);
            this.templateURL = templateURL;
            return this;
        }

        /**
         * Specifies whether to enable automatic deployment.
         * <p>
         * 
         * Valid values:
         * 
         * *   true: enables automatic deployment. If you add a member to the folder to which the stack group belongs after you enable automatic deployment, the stack group deploys its stack instances within the member. If you remove a member from the folder, the stack group deletes stack instances that are deployed within the member.
         * *   false: disables automatic deployment. After you disable automatic deployment, the stack instances remain unchanged even if members in the folder change.
         */
        public Builder templateVersion(String templateVersion) {
            this.putQueryParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        @Override
        public UpdateStackGroupRequest build() {
            return new UpdateStackGroupRequest(this);
        } 

    } 

    public static class AutoDeployment extends TeaModel {
        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("RetainStacksOnAccountRemoval")
        private Boolean retainStacksOnAccountRemoval;

        private AutoDeployment(Builder builder) {
            this.enabled = builder.enabled;
            this.retainStacksOnAccountRemoval = builder.retainStacksOnAccountRemoval;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoDeployment create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return retainStacksOnAccountRemoval
         */
        public Boolean getRetainStacksOnAccountRemoval() {
            return this.retainStacksOnAccountRemoval;
        }

        public static final class Builder {
            private Boolean enabled; 
            private Boolean retainStacksOnAccountRemoval; 

            /**
             * The IDs of the members in the resource directory. You can specify a maximum of 20 member IDs.
             * <p>
             * 
             * >  To view the member IDs, go to the **Overview** page in the **Resource Management** console. For more information, see [View the detailed information of a member](~~111624~~).
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder retainStacksOnAccountRemoval(Boolean retainStacksOnAccountRemoval) {
                this.retainStacksOnAccountRemoval = retainStacksOnAccountRemoval;
                return this;
            }

            public AutoDeployment build() {
                return new AutoDeployment(this);
            } 

        } 

    }
    public static class DeploymentTargets extends TeaModel {
        @NameInMap("AccountIds")
        private java.util.List < String > accountIds;

        @NameInMap("RdFolderIds")
        private java.util.List < String > rdFolderIds;

        private DeploymentTargets(Builder builder) {
            this.accountIds = builder.accountIds;
            this.rdFolderIds = builder.rdFolderIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeploymentTargets create() {
            return builder().build();
        }

        /**
         * @return accountIds
         */
        public java.util.List < String > getAccountIds() {
            return this.accountIds;
        }

        /**
         * @return rdFolderIds
         */
        public java.util.List < String > getRdFolderIds() {
            return this.rdFolderIds;
        }

        public static final class Builder {
            private java.util.List < String > accountIds; 
            private java.util.List < String > rdFolderIds; 

            /**
             * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the token is unique among different requests.
             * <p>
             * 
             * The token can be up to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (\_).
             * 
             * For more information, see [Ensure idempotence](~~134212~~).
             */
            public Builder accountIds(java.util.List < String > accountIds) {
                this.accountIds = accountIds;
                return this;
            }

            /**
             * RdFolderIds.
             */
            public Builder rdFolderIds(java.util.List < String > rdFolderIds) {
                this.rdFolderIds = rdFolderIds;
                return this;
            }

            public DeploymentTargets build() {
                return new DeploymentTargets(this);
            } 

        } 

    }
    public static class Parameters extends TeaModel {
        @NameInMap("ParameterKey")
        @Validation(required = true)
        private String parameterKey;

        @NameInMap("ParameterValue")
        @Validation(required = true)
        private String parameterValue;

        private Parameters(Builder builder) {
            this.parameterKey = builder.parameterKey;
            this.parameterValue = builder.parameterValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return parameterKey
         */
        public String getParameterKey() {
            return this.parameterKey;
        }

        /**
         * @return parameterValue
         */
        public String getParameterValue() {
            return this.parameterValue;
        }

        public static final class Builder {
            private String parameterKey; 
            private String parameterValue; 

            /**
             * The folders in which you want to use service-managed permissions to update stacks.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * The folder IDs in the resource directory. You can specify a maximum of five folder IDs.
             * <p>
             * 
             * You must set at least one of the RdFolderIds and AccountIds parameters. The parameters are subject to the following items:
             * 
             * *   If you set only the RdFolderIds parameter, stacks are deployed within all the members in the specified folders. If you specify the Root folder, ROS deploys the stacks within all the members in the resource directory.
             * *   If you set only the AccountIds parameter, stacks are deployed within the specified members.
             * *   If you set both parameters, the accounts specified by AccountIds must be contained in the folders specified by RdFolderIds.
             * 
             * >  To view the folder IDs, go to the **Overview** page in the **Resource Management** console. For more information, see [View the basic information of a folder](~~111223~~).
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
}
