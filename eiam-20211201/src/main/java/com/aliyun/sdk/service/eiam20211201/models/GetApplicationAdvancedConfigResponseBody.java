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
 * {@link GetApplicationAdvancedConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationAdvancedConfigResponseBody</p>
 */
public class GetApplicationAdvancedConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationAdvancedConfig")
    private ApplicationAdvancedConfig applicationAdvancedConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetApplicationAdvancedConfigResponseBody(Builder builder) {
        this.applicationAdvancedConfig = builder.applicationAdvancedConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationAdvancedConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationAdvancedConfig
     */
    public ApplicationAdvancedConfig getApplicationAdvancedConfig() {
        return this.applicationAdvancedConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApplicationAdvancedConfig applicationAdvancedConfig; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetApplicationAdvancedConfigResponseBody model) {
            this.applicationAdvancedConfig = model.applicationAdvancedConfig;
            this.requestId = model.requestId;
        } 

        /**
         * ApplicationAdvancedConfig.
         */
        public Builder applicationAdvancedConfig(ApplicationAdvancedConfig applicationAdvancedConfig) {
            this.applicationAdvancedConfig = applicationAdvancedConfig;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApplicationAdvancedConfigResponseBody build() {
            return new GetApplicationAdvancedConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetApplicationAdvancedConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationAdvancedConfigResponseBody</p>
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
    /**
     * 
     * {@link GetApplicationAdvancedConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationAdvancedConfigResponseBody</p>
     */
    public static class ApplicationAdvancedConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ScimServerAdvancedConfig")
        private ScimServerAdvancedConfig scimServerAdvancedConfig;

        private ApplicationAdvancedConfig(Builder builder) {
            this.applicationId = builder.applicationId;
            this.instanceId = builder.instanceId;
            this.scimServerAdvancedConfig = builder.scimServerAdvancedConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationAdvancedConfig create() {
            return builder().build();
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

        public static final class Builder {
            private String applicationId; 
            private String instanceId; 
            private ScimServerAdvancedConfig scimServerAdvancedConfig; 

            private Builder() {
            } 

            private Builder(ApplicationAdvancedConfig model) {
                this.applicationId = model.applicationId;
                this.instanceId = model.instanceId;
                this.scimServerAdvancedConfig = model.scimServerAdvancedConfig;
            } 

            /**
             * <p>IDaaS EIAM 应用Id</p>
             * 
             * <strong>example:</strong>
             * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>IDaaS EIAM 实例Id</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Scim Server 高阶配置</p>
             */
            public Builder scimServerAdvancedConfig(ScimServerAdvancedConfig scimServerAdvancedConfig) {
                this.scimServerAdvancedConfig = scimServerAdvancedConfig;
                return this;
            }

            public ApplicationAdvancedConfig build() {
                return new ApplicationAdvancedConfig(this);
            } 

        } 

    }
}
