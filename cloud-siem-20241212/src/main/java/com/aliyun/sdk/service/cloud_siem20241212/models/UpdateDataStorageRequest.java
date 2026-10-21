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
 * {@link UpdateDataStorageRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataStorageRequest</p>
 */
public class UpdateDataStorageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigurationVersion")
    private Long configurationVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataStorageRegionId")
    private String dataStorageRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeliveryStatus")
    @com.aliyun.core.annotation.Validation(maxLength = 1000)
    private String deliveryStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MultiAccountDeliveryEnabled")
    private Boolean multiAccountDeliveryEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetProject")
    private String targetProject;

    private UpdateDataStorageRequest(Builder builder) {
        super(builder);
        this.configurationVersion = builder.configurationVersion;
        this.dataStorageRegionId = builder.dataStorageRegionId;
        this.deliveryStatus = builder.deliveryStatus;
        this.lang = builder.lang;
        this.multiAccountDeliveryEnabled = builder.multiAccountDeliveryEnabled;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.targetProject = builder.targetProject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataStorageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configurationVersion
     */
    public Long getConfigurationVersion() {
        return this.configurationVersion;
    }

    /**
     * @return dataStorageRegionId
     */
    public String getDataStorageRegionId() {
        return this.dataStorageRegionId;
    }

    /**
     * @return deliveryStatus
     */
    public String getDeliveryStatus() {
        return this.deliveryStatus;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return multiAccountDeliveryEnabled
     */
    public Boolean getMultiAccountDeliveryEnabled() {
        return this.multiAccountDeliveryEnabled;
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
     * @return targetProject
     */
    public String getTargetProject() {
        return this.targetProject;
    }

    public static final class Builder extends Request.Builder<UpdateDataStorageRequest, Builder> {
        private Long configurationVersion; 
        private String dataStorageRegionId; 
        private String deliveryStatus; 
        private String lang; 
        private Boolean multiAccountDeliveryEnabled; 
        private String regionId; 
        private Long roleFor; 
        private String targetProject; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataStorageRequest request) {
            super(request);
            this.configurationVersion = request.configurationVersion;
            this.dataStorageRegionId = request.dataStorageRegionId;
            this.deliveryStatus = request.deliveryStatus;
            this.lang = request.lang;
            this.multiAccountDeliveryEnabled = request.multiAccountDeliveryEnabled;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.targetProject = request.targetProject;
        } 

        /**
         * <p>The version of the delivery settings on which this modification is based. Call GetDataStorage first and pass the original value of Data.DeliverySettings.ConfigurationVersion. Example 1 only demonstrates the format and cannot be used as a fixed version. This parameter is required when modifying the global switch, account selection, automatic inclusion settings, or specified member delivery. If the version is missing or has changed, the OperationDenied.CentralizedDeliveryConfigChanged error is returned. In this case, re-query the data and then submit the request.</p>
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
         * <p>The region where logs are stored.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder dataStorageRegionId(String dataStorageRegionId) {
            this.putBodyParameter("DataStorageRegionId", dataStorageRegionId);
            this.dataStorageRegionId = dataStorageRegionId;
            return this;
        }

        /**
         * <p>The global delivery switch for log management. This switch is not available for configuration. Valid values:</p>
         * <ul>
         * <li>enable: Enables all delivery.</li>
         * <li>disable: Disables all delivery.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        public Builder deliveryStatus(String deliveryStatus) {
            this.putBodyParameter("DeliveryStatus", deliveryStatus);
            this.deliveryStatus = deliveryStatus;
            return this;
        }

        /**
         * <p>The language of the response message. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.
         * Note: This parameter is actually required. If it is not specified, the API returns a 400 error: \&quot;The specified Lang can not be empty.\&quot; Specify zh or en.</li>
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
         * <p>The global switch for multi-account centralized delivery. A value of true indicates that centralized delivery from members to the current account is enabled. A value of false indicates that centralized delivery from members to the current account is disabled. When disabled, the account selection and automatic inclusion settings are retained, and the original log type switches for the current account are independently retained. When this parameter is specified, you must also specify ConfigurationVersion and TargetProject, and omit DataStorageRegionId and DeliveryStatus. If this parameter is omitted, the storage region modification process is used. Enabling this switch for the first time initializes the account scope for log types and the automatic inclusion settings.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder multiAccountDeliveryEnabled(Boolean multiAccountDeliveryEnabled) {
            this.putBodyParameter("MultiAccountDeliveryEnabled", multiAccountDeliveryEnabled);
            this.multiAccountDeliveryEnabled = multiAccountDeliveryEnabled;
            return this;
        }

        /**
         * <p>The region of the data management center for threat analysis. Select the region of the management center based on the region where your assets are located. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Assets are located in the Chinese mainland.</li>
         * <li>ap-southeast-1: Assets are located outside the Chinese mainland.</li>
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
         * <p>The ID of the member whose perspective the administrator switches to.</p>
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
         * <p>The name of the current Simple Log Service project for log delivery. First invoke GetDataStorage and pass the original value of Data.DeliverySettings.TargetProject. This parameter is used to verify the target of this modification, not to specify a new project. This parameter is required when modifying the global switch, account selection, automatic inclusion settings, or specified member delivery. If this parameter is missing or differs from the current target, the OperationDenied.CentralizedDeliveryConfigChanged error is returned. Replace the account UID and region in the example with the query results.</p>
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
        public UpdateDataStorageRequest build() {
            return new UpdateDataStorageRequest(this);
        } 

    } 

}
