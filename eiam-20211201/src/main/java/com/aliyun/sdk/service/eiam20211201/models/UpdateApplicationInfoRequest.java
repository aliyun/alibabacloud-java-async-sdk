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
 * {@link UpdateApplicationInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationInfoRequest</p>
 */
public class UpdateApplicationInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String applicationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationOwner")
    private ApplicationOwner applicationOwner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationVisibility")
    private java.util.List<String> applicationVisibility;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomFields")
    private java.util.List<CustomFields> customFields;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogoUrl")
    @com.aliyun.core.annotation.Validation(maxLength = 512)
    private String logoUrl;

    private UpdateApplicationInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationId = builder.applicationId;
        this.applicationName = builder.applicationName;
        this.applicationOwner = builder.applicationOwner;
        this.applicationVisibility = builder.applicationVisibility;
        this.clientToken = builder.clientToken;
        this.customFields = builder.customFields;
        this.instanceId = builder.instanceId;
        this.logoUrl = builder.logoUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationInfoRequest create() {
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
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
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
     * @return applicationVisibility
     */
    public java.util.List<String> getApplicationVisibility() {
        return this.applicationVisibility;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return logoUrl
     */
    public String getLogoUrl() {
        return this.logoUrl;
    }

    public static final class Builder extends Request.Builder<UpdateApplicationInfoRequest, Builder> {
        private String regionId; 
        private String applicationId; 
        private String applicationName; 
        private ApplicationOwner applicationOwner; 
        private java.util.List<String> applicationVisibility; 
        private String clientToken; 
        private java.util.List<CustomFields> customFields; 
        private String instanceId; 
        private String logoUrl; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApplicationInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationId = request.applicationId;
            this.applicationName = request.applicationName;
            this.applicationOwner = request.applicationOwner;
            this.applicationVisibility = request.applicationVisibility;
            this.clientToken = request.clientToken;
            this.customFields = request.customFields;
            this.instanceId = request.instanceId;
            this.logoUrl = request.logoUrl;
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
         * <p>IDaaS的应用主键id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>应用的表示名称</p>
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
         * ApplicationVisibility.
         */
        public Builder applicationVisibility(java.util.List<String> applicationVisibility) {
            this.putQueryParameter("ApplicationVisibility", applicationVisibility);
            this.applicationVisibility = applicationVisibility;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * <p>IDaaS EIAM的实例id</p>
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
         * <p>应用Logo地址</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.aliyuncs.com/logo.png">https://example.aliyuncs.com/logo.png</a></p>
         */
        public Builder logoUrl(String logoUrl) {
            this.putQueryParameter("LogoUrl", logoUrl);
            this.logoUrl = logoUrl;
            return this;
        }

        @Override
        public UpdateApplicationInfoRequest build() {
            return new UpdateApplicationInfoRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateApplicationInfoRequest} extends {@link TeaModel}
     *
     * <p>UpdateApplicationInfoRequest</p>
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
     * {@link UpdateApplicationInfoRequest} extends {@link TeaModel}
     *
     * <p>UpdateApplicationInfoRequest</p>
     */
    public static class CustomFields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldName")
        @com.aliyun.core.annotation.Validation(maxLength = 64)
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("FieldValue")
        private String fieldValue;

        @com.aliyun.core.annotation.NameInMap("Operation")
        @com.aliyun.core.annotation.Validation(maxLength = 32)
        private String operation;

        private CustomFields(Builder builder) {
            this.fieldName = builder.fieldName;
            this.fieldValue = builder.fieldValue;
            this.operation = builder.operation;
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

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        public static final class Builder {
            private String fieldName; 
            private String fieldValue; 
            private String operation; 

            private Builder() {
            } 

            private Builder(CustomFields model) {
                this.fieldName = model.fieldName;
                this.fieldValue = model.fieldValue;
                this.operation = model.operation;
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

            /**
             * Operation.
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            public CustomFields build() {
                return new CustomFields(this);
            } 

        } 

    }
}
