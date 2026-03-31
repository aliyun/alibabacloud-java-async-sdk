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
 * {@link CreateApplicationRequest} extends {@link RequestModel}
 *
 * <p>CreateApplicationRequest</p>
 */
public class CreateApplicationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationIdentityType")
    private String applicationIdentityType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationOwner")
    private ApplicationOwner applicationOwner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationSourceType")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationSourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationTemplateId")
    private String applicationTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomFields")
    private java.util.List<CustomFields> customFields;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogoUrl")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String logoUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SsoType")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String ssoType;

    private CreateApplicationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationIdentityType = builder.applicationIdentityType;
        this.applicationName = builder.applicationName;
        this.applicationOwner = builder.applicationOwner;
        this.applicationSourceType = builder.applicationSourceType;
        this.applicationTemplateId = builder.applicationTemplateId;
        this.customFields = builder.customFields;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.logoUrl = builder.logoUrl;
        this.ssoType = builder.ssoType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationRequest create() {
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
     * @return applicationIdentityType
     */
    public String getApplicationIdentityType() {
        return this.applicationIdentityType;
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return applicationOwner
     */
    public ApplicationOwner getApplicationOwner() {
        return this.applicationOwner;
    }

    /**
     * @return applicationSourceType
     */
    public String getApplicationSourceType() {
        return this.applicationSourceType;
    }

    /**
     * @return applicationTemplateId
     */
    public String getApplicationTemplateId() {
        return this.applicationTemplateId;
    }

    /**
     * @return customFields
     */
    public java.util.List<CustomFields> getCustomFields() {
        return this.customFields;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return logoUrl
     */
    public String getLogoUrl() {
        return this.logoUrl;
    }

    /**
     * @return ssoType
     */
    public String getSsoType() {
        return this.ssoType;
    }

    public static final class Builder extends Request.Builder<CreateApplicationRequest, Builder> {
        private String regionId; 
        private String applicationIdentityType; 
        private String applicationName; 
        private ApplicationOwner applicationOwner; 
        private String applicationSourceType; 
        private String applicationTemplateId; 
        private java.util.List<CustomFields> customFields; 
        private String description; 
        private String instanceId; 
        private String logoUrl; 
        private String ssoType; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationIdentityType = request.applicationIdentityType;
            this.applicationName = request.applicationName;
            this.applicationOwner = request.applicationOwner;
            this.applicationSourceType = request.applicationSourceType;
            this.applicationTemplateId = request.applicationTemplateId;
            this.customFields = request.customFields;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.logoUrl = request.logoUrl;
            this.ssoType = request.ssoType;
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
         * ApplicationIdentityType.
         */
        public Builder applicationIdentityType(String applicationIdentityType) {
            this.putQueryParameter("ApplicationIdentityType", applicationIdentityType);
            this.applicationIdentityType = applicationIdentityType;
            return this;
        }

        /**
         * <p>The name of the application.</p>
         * <p>This parameter is required.</p>
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
         * ApplicationOwner.
         */
        public Builder applicationOwner(ApplicationOwner applicationOwner) {
            this.putQueryParameter("ApplicationOwner", applicationOwner);
            this.applicationOwner = applicationOwner;
            return this;
        }

        /**
         * <p>The type of the application source. Valid values:</p>
         * <ul>
         * <li>urn:alibaba:idaas:app:source:template: application template</li>
         * <li>urn:alibaba:idaas:app:source:standard: standard protocol</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:app:source:standard</p>
         */
        public Builder applicationSourceType(String applicationSourceType) {
            this.putQueryParameter("ApplicationSourceType", applicationSourceType);
            this.applicationSourceType = applicationSourceType;
            return this;
        }

        /**
         * <p>The ID of the application template. This parameter is required if you set the ApplicationSourceType parameter to urn:alibaba:idaas:app:source:template.</p>
         * 
         * <strong>example:</strong>
         * <p>template_cloud_ram</p>
         */
        public Builder applicationTemplateId(String applicationTemplateId) {
            this.putQueryParameter("ApplicationTemplateId", applicationTemplateId);
            this.applicationTemplateId = applicationTemplateId;
            return this;
        }

        /**
         * CustomFields.
         */
        public Builder customFields(java.util.List<CustomFields> customFields) {
            this.putQueryParameter("CustomFields", customFields);
            this.customFields = customFields;
            return this;
        }

        /**
         * <p>The description of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>RAM user SSO application</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk2676xxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The URL of the application logo.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oss.cn-hangzhou.aliyuncs.com/logo.png">https://oss.cn-hangzhou.aliyuncs.com/logo.png</a></p>
         */
        public Builder logoUrl(String logoUrl) {
            this.putQueryParameter("LogoUrl", logoUrl);
            this.logoUrl = logoUrl;
            return this;
        }

        /**
         * <p>The SSO protocol. Valid values:</p>
         * <ul>
         * <li>saml2: the SAML 2.0 protocol.</li>
         * <li>oidc: the OpenID Connect protocol.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>saml2</p>
         */
        public Builder ssoType(String ssoType) {
            this.putQueryParameter("SsoType", ssoType);
            this.ssoType = ssoType;
            return this;
        }

        @Override
        public CreateApplicationRequest build() {
            return new CreateApplicationRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateApplicationRequest} extends {@link TeaModel}
     *
     * <p>CreateApplicationRequest</p>
     */
    public static class ApplicationOwner extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupIds")
        private java.util.List<String> groupIds;

        @com.aliyun.core.annotation.NameInMap("UserIds")
        private java.util.List<String> userIds;

        private ApplicationOwner(Builder builder) {
            this.groupIds = builder.groupIds;
            this.userIds = builder.userIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationOwner create() {
            return builder().build();
        }

        /**
         * @return groupIds
         */
        public java.util.List<String> getGroupIds() {
            return this.groupIds;
        }

        /**
         * @return userIds
         */
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

        public static final class Builder {
            private java.util.List<String> groupIds; 
            private java.util.List<String> userIds; 

            private Builder() {
            } 

            private Builder(ApplicationOwner model) {
                this.groupIds = model.groupIds;
                this.userIds = model.userIds;
            } 

            /**
             * GroupIds.
             */
            public Builder groupIds(java.util.List<String> groupIds) {
                this.groupIds = groupIds;
                return this;
            }

            /**
             * UserIds.
             */
            public Builder userIds(java.util.List<String> userIds) {
                this.userIds = userIds;
                return this;
            }

            public ApplicationOwner build() {
                return new ApplicationOwner(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateApplicationRequest} extends {@link TeaModel}
     *
     * <p>CreateApplicationRequest</p>
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
             * FieldName.
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * FieldValue.
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
