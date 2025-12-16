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
 * {@link UpdateApplicationAdvancedConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationAdvancedConfigRequest</p>
 */
public class UpdateApplicationAdvancedConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScimServerAdvancedConfig")
    private ScimServerAdvancedConfig scimServerAdvancedConfig;

    private UpdateApplicationAdvancedConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationId = builder.applicationId;
        this.instanceId = builder.instanceId;
        this.scimServerAdvancedConfig = builder.scimServerAdvancedConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationAdvancedConfigRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return scimServerAdvancedConfig
     */
    public ScimServerAdvancedConfig getScimServerAdvancedConfig() {
        return this.scimServerAdvancedConfig;
    }

    public static final class Builder extends Request.Builder<UpdateApplicationAdvancedConfigRequest, Builder> {
        private String regionId; 
        private String applicationId; 
        private String instanceId; 
        private ScimServerAdvancedConfig scimServerAdvancedConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApplicationAdvancedConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationId = request.applicationId;
            this.instanceId = request.instanceId;
            this.scimServerAdvancedConfig = request.scimServerAdvancedConfig;
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
         * <p>IDaaS的应用资源ID。</p>
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
         * <p>IDaaS EIAM实例的ID。</p>
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
         * <p>Scim Server 高阶配置</p>
         */
        public Builder scimServerAdvancedConfig(ScimServerAdvancedConfig scimServerAdvancedConfig) {
            this.putQueryParameter("ScimServerAdvancedConfig", scimServerAdvancedConfig);
            this.scimServerAdvancedConfig = scimServerAdvancedConfig;
            return this;
        }

        @Override
        public UpdateApplicationAdvancedConfigRequest build() {
            return new UpdateApplicationAdvancedConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateApplicationAdvancedConfigRequest} extends {@link TeaModel}
     *
     * <p>UpdateApplicationAdvancedConfigRequest</p>
     */
    public static class ScimServerAdvancedConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedUserCustomFieldIds")
        private java.util.List<String> supportedUserCustomFieldIds;

        @com.aliyun.core.annotation.NameInMap("UserCustomFieldNamespace")
        private String userCustomFieldNamespace;

        private ScimServerAdvancedConfig(Builder builder) {
            this.supportedUserCustomFieldIds = builder.supportedUserCustomFieldIds;
            this.userCustomFieldNamespace = builder.userCustomFieldNamespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScimServerAdvancedConfig create() {
            return builder().build();
        }

        /**
         * @return supportedUserCustomFieldIds
         */
        public java.util.List<String> getSupportedUserCustomFieldIds() {
            return this.supportedUserCustomFieldIds;
        }

        /**
         * @return userCustomFieldNamespace
         */
        public String getUserCustomFieldNamespace() {
            return this.userCustomFieldNamespace;
        }

        public static final class Builder {
            private java.util.List<String> supportedUserCustomFieldIds; 
            private String userCustomFieldNamespace; 

            private Builder() {
            } 

            private Builder(ScimServerAdvancedConfig model) {
                this.supportedUserCustomFieldIds = model.supportedUserCustomFieldIds;
                this.userCustomFieldNamespace = model.userCustomFieldNamespace;
            } 

            /**
             * <p>支持的用户自定义字段ID列表。</p>
             */
            public Builder supportedUserCustomFieldIds(java.util.List<String> supportedUserCustomFieldIds) {
                this.supportedUserCustomFieldIds = supportedUserCustomFieldIds;
                return this;
            }

            /**
             * <p>用户扩展字段的命名空间。</p>
             * 
             * <strong>example:</strong>
             * <p>urn:ietf:params:scim:schemas:extension:customfield:2.0:User</p>
             */
            public Builder userCustomFieldNamespace(String userCustomFieldNamespace) {
                this.userCustomFieldNamespace = userCustomFieldNamespace;
                return this;
            }

            public ScimServerAdvancedConfig build() {
                return new ScimServerAdvancedConfig(this);
            } 

        } 

    }
}
