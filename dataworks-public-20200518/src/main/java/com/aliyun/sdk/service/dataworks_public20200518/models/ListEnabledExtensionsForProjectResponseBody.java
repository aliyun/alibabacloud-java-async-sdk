// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnabledExtensionsForProjectResponseBody} extends {@link TeaModel}
 *
 * <p>ListEnabledExtensionsForProjectResponseBody</p>
 */
public class ListEnabledExtensionsForProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Extensions")
    private java.util.List < Extensions> extensions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListEnabledExtensionsForProjectResponseBody(Builder builder) {
        this.extensions = builder.extensions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnabledExtensionsForProjectResponseBody create() {
        return builder().build();
    }

    /**
     * @return extensions
     */
    public java.util.List < Extensions> getExtensions() {
        return this.extensions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Extensions> extensions; 
        private String requestId; 

        /**
         * The details of the extension.
         */
        public Builder extensions(java.util.List < Extensions> extensions) {
            this.extensions = extensions;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListEnabledExtensionsForProjectResponseBody build() {
            return new ListEnabledExtensionsForProjectResponseBody(this);
        } 

    } 

    public static class Extensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("ExtensionCode")
        private String extensionCode;

        @com.aliyun.core.annotation.NameInMap("ExtensionDesc")
        private String extensionDesc;

        @com.aliyun.core.annotation.NameInMap("ExtensionName")
        private String extensionName;

        @com.aliyun.core.annotation.NameInMap("ModifyUser")
        private String modifyUser;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ParameterSetting")
        private String parameterSetting;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private Long tenantId;

        private Extensions(Builder builder) {
            this.createUser = builder.createUser;
            this.extensionCode = builder.extensionCode;
            this.extensionDesc = builder.extensionDesc;
            this.extensionName = builder.extensionName;
            this.modifyUser = builder.modifyUser;
            this.owner = builder.owner;
            this.parameterSetting = builder.parameterSetting;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extensions create() {
            return builder().build();
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return extensionCode
         */
        public String getExtensionCode() {
            return this.extensionCode;
        }

        /**
         * @return extensionDesc
         */
        public String getExtensionDesc() {
            return this.extensionDesc;
        }

        /**
         * @return extensionName
         */
        public String getExtensionName() {
            return this.extensionName;
        }

        /**
         * @return modifyUser
         */
        public String getModifyUser() {
            return this.modifyUser;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return parameterSetting
         */
        public String getParameterSetting() {
            return this.parameterSetting;
        }

        /**
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String createUser; 
            private String extensionCode; 
            private String extensionDesc; 
            private String extensionName; 
            private String modifyUser; 
            private String owner; 
            private String parameterSetting; 
            private Long tenantId; 

            /**
             * The creator of the extension.
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * The unique code of the extension.
             */
            public Builder extensionCode(String extensionCode) {
                this.extensionCode = extensionCode;
                return this;
            }

            /**
             * The description of the extension.
             */
            public Builder extensionDesc(String extensionDesc) {
                this.extensionDesc = extensionDesc;
                return this;
            }

            /**
             * The name of the extension.
             */
            public Builder extensionName(String extensionName) {
                this.extensionName = extensionName;
                return this;
            }

            /**
             * The modifier of the extension.
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * The owner ID.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The parameter settings of the extension. For more information, see [Configure extension parameters](~~405354~~).
             */
            public Builder parameterSetting(String parameterSetting) {
                this.parameterSetting = parameterSetting;
                return this;
            }

            /**
             * The tenant ID.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public Extensions build() {
                return new Extensions(this);
            } 

        } 

    }
}
