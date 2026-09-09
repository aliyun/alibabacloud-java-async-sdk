// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListApplicationsRequest} extends {@link RequestModel}
 *
 * <p>ListApplicationsRequest</p>
 */
public class ListApplicationsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationCreationType")
    private String applicationCreationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationIdentityType")
    private String applicationIdentityType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationIds")
    private java.util.List<String> applicationIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String applicationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationTemplateId")
    private String applicationTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationType")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String authorizationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomFields")
    private java.util.List<CustomFields> customFields;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("M2MClientStatus")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String m2MClientStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ManagedServiceCode")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String managedServiceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceServerStatus")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String resourceServerStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceManaged")
    private Boolean serviceManaged;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SsoType")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String ssoType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String status;

    private ListApplicationsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationCreationType = builder.applicationCreationType;
        this.applicationIdentityType = builder.applicationIdentityType;
        this.applicationIds = builder.applicationIds;
        this.applicationName = builder.applicationName;
        this.applicationTemplateId = builder.applicationTemplateId;
        this.authorizationType = builder.authorizationType;
        this.customFields = builder.customFields;
        this.instanceId = builder.instanceId;
        this.m2MClientStatus = builder.m2MClientStatus;
        this.managedServiceCode = builder.managedServiceCode;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceServerStatus = builder.resourceServerStatus;
        this.serviceManaged = builder.serviceManaged;
        this.ssoType = builder.ssoType;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return applicationCreationType
     */
    public String getApplicationCreationType() {
        return this.applicationCreationType;
    }

    /**
     * @return applicationIdentityType
     */
    public String getApplicationIdentityType() {
        return this.applicationIdentityType;
    }

    /**
     * @return applicationIds
     */
    public java.util.List<String> getApplicationIds() {
        return this.applicationIds;
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return applicationTemplateId
     */
    public String getApplicationTemplateId() {
        return this.applicationTemplateId;
    }

    /**
     * @return authorizationType
     */
    public String getAuthorizationType() {
        return this.authorizationType;
    }

    /**
     * @return customFields
     */
    public java.util.List<CustomFields> getCustomFields() {
        return this.customFields;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return m2MClientStatus
     */
    public String getM2MClientStatus() {
        return this.m2MClientStatus;
    }

    /**
     * @return managedServiceCode
     */
    public String getManagedServiceCode() {
        return this.managedServiceCode;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceServerStatus
     */
    public String getResourceServerStatus() {
        return this.resourceServerStatus;
    }

    /**
     * @return serviceManaged
     */
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    /**
     * @return ssoType
     */
    public String getSsoType() {
        return this.ssoType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListApplicationsRequest, Builder> {
        private String regionId; 
        private String applicationCreationType; 
        private String applicationIdentityType; 
        private java.util.List<String> applicationIds; 
        private String applicationName; 
        private String applicationTemplateId; 
        private String authorizationType; 
        private java.util.List<CustomFields> customFields; 
        private String instanceId; 
        private String m2MClientStatus; 
        private String managedServiceCode; 
        private Long pageNumber; 
        private Long pageSize; 
        private String resourceServerStatus; 
        private Boolean serviceManaged; 
        private String ssoType; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListApplicationsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationCreationType = request.applicationCreationType;
            this.applicationIdentityType = request.applicationIdentityType;
            this.applicationIds = request.applicationIds;
            this.applicationName = request.applicationName;
            this.applicationTemplateId = request.applicationTemplateId;
            this.authorizationType = request.authorizationType;
            this.customFields = request.customFields;
            this.instanceId = request.instanceId;
            this.m2MClientStatus = request.m2MClientStatus;
            this.managedServiceCode = request.managedServiceCode;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceServerStatus = request.resourceServerStatus;
            this.serviceManaged = request.serviceManaged;
            this.ssoType = request.ssoType;
            this.status = request.status;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The application creation type. If this parameter is left empty, applications of the user_custom type are queried by default. To query applications of all types, set this parameter to all.</p>
         * 
         * <strong>example:</strong>
         * <p>system_init</p>
         */
        public Builder applicationCreationType(String applicationCreationType) {
            this.putQueryParameter("ApplicationCreationType", applicationCreationType);
            this.applicationCreationType = applicationCreationType;
            return this;
        }

        /**
         * <p>The application identity type. If this parameter is left empty, applications of the application type are queried by default. To query applications of all identity types, set this parameter to all.</p>
         * 
         * <strong>example:</strong>
         * <p>application</p>
         */
        public Builder applicationIdentityType(String applicationIdentityType) {
            this.putQueryParameter("ApplicationIdentityType", applicationIdentityType);
            this.applicationIdentityType = applicationIdentityType;
            return this;
        }

        /**
         * <p>The list of application IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>Ram Account SSO</p>
         */
        public Builder applicationIds(java.util.List<String> applicationIds) {
            this.putQueryParameter("ApplicationIds", applicationIds);
            this.applicationIds = applicationIds;
            return this;
        }

        /**
         * <p>The application name. Only left fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Ram Account SSO</p>
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * <p>The application template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>apt_ramuser_xxxx</p>
         */
        public Builder applicationTemplateId(String applicationTemplateId) {
            this.putQueryParameter("ApplicationTemplateId", applicationTemplateId);
            this.applicationTemplateId = applicationTemplateId;
            return this;
        }

        /**
         * <p>The application access authorization type. Valid values:</p>
         * <ul>
         * <li>authorize_required: Explicit authorization is required for access.</li>
         * <li>default_all: All members have access permissions by default.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>authorize_required</p>
         */
        public Builder authorizationType(String authorizationType) {
            this.putQueryParameter("AuthorizationType", authorizationType);
            this.authorizationType = authorizationType;
            return this;
        }

        /**
         * <p>The list of custom fields.</p>
         */
        public Builder customFields(java.util.List<CustomFields> customFields) {
            this.putQueryParameter("CustomFields", customFields);
            this.customFields = customFields;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Specifies whether the M2M Client identity is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder m2MClientStatus(String m2MClientStatus) {
            this.putQueryParameter("M2MClientStatus", m2MClientStatus);
            this.m2MClientStatus = m2MClientStatus;
            return this;
        }

        /**
         * <p>The ServiceCode of the cloud service that manages the application template.</p>
         * 
         * <strong>example:</strong>
         * <p>waf</p>
         */
        public Builder managedServiceCode(String managedServiceCode) {
            this.putQueryParameter("ManagedServiceCode", managedServiceCode);
            this.managedServiceCode = managedServiceCode;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Specifies whether the ResourceServer capability is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder resourceServerStatus(String resourceServerStatus) {
            this.putQueryParameter("ResourceServerStatus", resourceServerStatus);
            this.resourceServerStatus = resourceServerStatus;
            return this;
        }

        /**
         * <p>Specifies whether the application template is managed by a cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder serviceManaged(Boolean serviceManaged) {
            this.putQueryParameter("ServiceManaged", serviceManaged);
            this.serviceManaged = serviceManaged;
            return this;
        }

        /**
         * <p>The SSO type filter condition. Multiple types can be separated by commas. Example: oauth2/m2m,oidc+oauth2/m2m.</p>
         * 
         * <strong>example:</strong>
         * <p>oauth2/m2m</p>
         */
        public Builder ssoType(String ssoType) {
            this.putQueryParameter("SsoType", ssoType);
            this.ssoType = ssoType;
            return this;
        }

        /**
         * <p>The application status. Valid values:</p>
         * <ul>
         * <li>enabled: Enabled.</li>
         * <li>disabled: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListApplicationsRequest build() {
            return new ListApplicationsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListApplicationsRequest} extends {@link TeaModel}
     *
     * <p>ListApplicationsRequest</p>
     */
    public static class CustomFields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldName")
        @com.aliyun.core.annotation.Validation(maxLength = 64)
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("FieldValue")
        private String fieldValue;

        private CustomFields(Builder builder) {
            this.fieldName = builder.fieldName;
            this.fieldValue = builder.fieldValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomFields create() {
            return builder().build();
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return fieldValue
         */
        public String getFieldValue() {
            return this.fieldValue;
        }

        public static final class Builder {
            private String fieldName; 
            private String fieldValue; 

            private Builder() {
            } 

            private Builder(CustomFields model) {
                this.fieldName = model.fieldName;
                this.fieldValue = model.fieldValue;
            } 

            /**
             * <p>The custom field identifier. Valid values:</p>
             * <ul>
             * <li>agent_type: The agent type.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>agent_type</p>
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * <p>The custom field value.</p>
             * 
             * <strong>example:</strong>
             * <p>x-claw</p>
             */
            public Builder fieldValue(String fieldValue) {
                this.fieldValue = fieldValue;
                return this;
            }

            public CustomFields build() {
                return new CustomFields(this);
            } 

        } 

    }
}
