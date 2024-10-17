// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The details of the extension.</p>
         */
        public Builder extensions(java.util.List < Extensions> extensions) {
            this.extensions = extensions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4F2CA7ED-27E5-59EA-A8C4-F1F7A1FF0B22</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListEnabledExtensionsForProjectResponseBody build() {
            return new ListEnabledExtensionsForProjectResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEnabledExtensionsForProjectResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnabledExtensionsForProjectResponseBody</p>
     */
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
             * <p>The creator of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>3444434343555</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>The unique code of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>a94a8e23bc0b4dfab9a5e4d2f374d645</p>
             */
            public Builder extensionCode(String extensionCode) {
                this.extensionCode = extensionCode;
                return this;
            }

            /**
             * <p>The description of the extension.</p>
             */
            public Builder extensionDesc(String extensionDesc) {
                this.extensionDesc = extensionDesc;
                return this;
            }

            /**
             * <p>The name of the extension.</p>
             */
            public Builder extensionName(String extensionName) {
                this.extensionName = extensionName;
                return this;
            }

            /**
             * <p>The modifier of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>34452335611988</p>
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * <p>The owner ID.</p>
             * 
             * <strong>example:</strong>
             * <p>21323672*******55500</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The parameter settings of the extension. For more information, see <a href="https://help.aliyun.com/document_detail/405354.html">Configure extension parameters</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>extension.fileType.23.deploy-file.enabled=true</p>
             */
            public Builder parameterSetting(String parameterSetting) {
                this.parameterSetting = parameterSetting;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>529889518659842</p>
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
