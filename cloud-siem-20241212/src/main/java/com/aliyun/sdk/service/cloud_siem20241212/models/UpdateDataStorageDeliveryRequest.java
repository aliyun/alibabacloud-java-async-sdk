// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link UpdateDataStorageDeliveryRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataStorageDeliveryRequest</p>
 */
public class UpdateDataStorageDeliveryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoIncludeNewAccounts")
    private Boolean autoIncludeNewAccounts;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigurationVersion")
    private Long configurationVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogDeliveryStatus")
    @com.aliyun.core.annotation.Validation(maxLength = 1000)
    private String logDeliveryStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SelectedAccountIds")
    private java.util.List<String> selectedAccountIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubUserId")
    private Long subUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetProject")
    private String targetProject;

    private UpdateDataStorageDeliveryRequest(Builder builder) {
        super(builder);
        this.autoIncludeNewAccounts = builder.autoIncludeNewAccounts;
        this.configurationVersion = builder.configurationVersion;
        this.lang = builder.lang;
        this.logCode = builder.logCode;
        this.logDeliveryStatus = builder.logDeliveryStatus;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.selectedAccountIds = builder.selectedAccountIds;
        this.subUserId = builder.subUserId;
        this.targetProject = builder.targetProject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataStorageDeliveryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoIncludeNewAccounts
     */
    public Boolean getAutoIncludeNewAccounts() {
        return this.autoIncludeNewAccounts;
    }

    /**
     * @return configurationVersion
     */
    public Long getConfigurationVersion() {
        return this.configurationVersion;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return logCode
     */
    public String getLogCode() {
        return this.logCode;
    }

    /**
     * @return logDeliveryStatus
     */
    public String getLogDeliveryStatus() {
        return this.logDeliveryStatus;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return selectedAccountIds
     */
    public java.util.List<String> getSelectedAccountIds() {
        return this.selectedAccountIds;
    }

    /**
     * @return subUserId
     */
    public Long getSubUserId() {
        return this.subUserId;
    }

    /**
     * @return targetProject
     */
    public String getTargetProject() {
        return this.targetProject;
    }

    public static final class Builder extends Request.Builder<UpdateDataStorageDeliveryRequest, Builder> {
        private Boolean autoIncludeNewAccounts; 
        private Long configurationVersion; 
        private String lang; 
        private String logCode; 
        private String logDeliveryStatus; 
        private String regionId; 
        private Long roleFor; 
        private java.util.List<String> selectedAccountIds; 
        private Long subUserId; 
        private String targetProject; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataStorageDeliveryRequest request) {
            super(request);
            this.autoIncludeNewAccounts = request.autoIncludeNewAccounts;
            this.configurationVersion = request.configurationVersion;
            this.lang = request.lang;
            this.logCode = request.logCode;
            this.logDeliveryStatus = request.logDeliveryStatus;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.selectedAccountIds = request.selectedAccountIds;
            this.subUserId = request.subUserId;
            this.targetProject = request.targetProject;
        } 

        /**
         * <p>Specifies whether to automatically add subsequent new and available managed members to the account selection for the log type. A value of true indicates that the feature is enabled. A value of false indicates that the feature is disabled. Disabling the feature does not remove selected members. If this parameter is omitted, the original value is retained. You must also specify LogCode, ConfigurationVersion, and TargetProject. You can update this parameter together with SelectedAccountIds. You cannot specify LogDeliveryStatus or the member SubUserId at the same time. The actual delivery is also controlled by the global switch for multi-account delivery and the delivery switch for the log type.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoIncludeNewAccounts(Boolean autoIncludeNewAccounts) {
            this.putBodyParameter("AutoIncludeNewAccounts", autoIncludeNewAccounts);
            this.autoIncludeNewAccounts = autoIncludeNewAccounts;
            return this;
        }

        /**
         * <p>The version of the delivery settings on which the current modification is based. Call GetDataStorage first and pass the original value of Data.DeliverySettings.ConfigurationVersion. Example 1 only shows the format and cannot be used as a fixed version. This parameter is required when you modify the global switch, account selection, auto-inclusion settings, or specified member delivery. If the version is missing or has changed, the OperationDenied.CentralizedDeliveryConfigChanged error is returned. In this case, query the version again before you submit the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder configurationVersion(Long configurationVersion) {
            this.putBodyParameter("ConfigurationVersion", configurationVersion);
            this.configurationVersion = configurationVersion;
            return this;
        }

        /**
         * <p>The language of the response message. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.
         * This parameter is required. If this parameter is not specified, the API returns a 400 error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The log code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aegis-log-login</p>
         */
        public Builder logCode(String logCode) {
            this.putBodyParameter("LogCode", logCode);
            this.logCode = logCode;
            return this;
        }

        /**
         * <p>The log delivery status. Valid values:</p>
         * <ul>
         * <li>enable: Enables delivery.</li>
         * <li>disable: Disables delivery.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        public Builder logDeliveryStatus(String logDeliveryStatus) {
            this.putBodyParameter("LogDeliveryStatus", logDeliveryStatus);
            this.logDeliveryStatus = logDeliveryStatus;
            return this;
        }

        /**
         * <p>The region where the data management center for threat analysis is located. You must select the region of the management center based on the region where your assets are located. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: The assets are located in the Chinese mainland.</li>
         * <li>ap-southeast-1: The assets are located outside the Chinese mainland.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the user whose perspective the administrator switches to.</p>
         * 
         * <strong>example:</strong>
         * <p>113091674488****</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * <p>The complete list of selected accounts for the log type. Each element is a decimal UID string. The list must include Data.DeliverySettings.DaAccountId (the current account) and can contain up to 10,000 items. A new member must be in the Accounts list returned by GetDataStorage and have Authorized set to true. If only the current account is retained, specify the UID of the current account. Do not use an empty string or an empty array. If this parameter is omitted, the original selection is retained. For HTTP requests, use the comma-separated format of array(simple): SelectedAccountIds=1234567890123456,1234567890123457. For a single account, specify only one UID. Do not use SelectedAccountIds.1/.2 or a JSON array string. You must also specify ConfigurationVersion and TargetProject, and omit LogDeliveryStatus and the member SubUserId.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456,1234567890123457</p>
         */
        public Builder selectedAccountIds(java.util.List<String> selectedAccountIds) {
            String selectedAccountIdsShrink = shrink(selectedAccountIds, "SelectedAccountIds", "simple");
            this.putBodyParameter("SelectedAccountIds", selectedAccountIdsShrink);
            this.selectedAccountIds = selectedAccountIds;
            return this;
        }

        /**
         * <p>The UID of the source Alibaba Cloud account, which is a decimal integer. If this parameter is omitted or set to the UID of the current account, the delivery settings of the current account are modified. If a member UID is specified, the expected delivery status in the current configuration is applied only to the member. In this case, you must also specify LogDeliveryStatus, ConfigurationVersion, and TargetProject. The member must be within the selection scope of the log type or have existing delivery records. You must omit this parameter when you save the account selection or auto-inclusion settings. You cannot specify the UID of another member.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123457</p>
         */
        public Builder subUserId(Long subUserId) {
            this.putBodyParameter("SubUserId", subUserId);
            this.subUserId = subUserId;
            return this;
        }

        /**
         * <p>The name of the current Simple Log Service project for log delivery. Invoke GetDataStorage first and pass the original value of Data.DeliverySettings.TargetProject. This parameter is used to verify the target of the current modification, not to specify a new project. This parameter is required when you modify the global switch, account selection, auto-inclusion settings, or specified member log delivery. If this parameter is missing or different from the current target, the OperationDenied.CentralizedDeliveryConfigChanged error is returned. Replace the account UID and region in the example with the query results.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-cloudsiem-data-1234567890123456-cn-shanghai</p>
         */
        public Builder targetProject(String targetProject) {
            this.putBodyParameter("TargetProject", targetProject);
            this.targetProject = targetProject;
            return this;
        }

        @Override
        public UpdateDataStorageDeliveryRequest build() {
            return new UpdateDataStorageDeliveryRequest(this);
        } 

    } 

}
