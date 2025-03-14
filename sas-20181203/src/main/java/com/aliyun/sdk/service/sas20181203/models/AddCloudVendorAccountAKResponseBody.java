// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link AddCloudVendorAccountAKResponseBody} extends {@link TeaModel}
 *
 * <p>AddCloudVendorAccountAKResponseBody</p>
 */
public class AddCloudVendorAccountAKResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddCloudVendorAccountAKResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCloudVendorAccountAKResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AddCloudVendorAccountAKResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the AccessKey pair that is added.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A60DA4EC-7CD8-577D-AD73-***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddCloudVendorAccountAKResponseBody build() {
            return new AddCloudVendorAccountAKResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddCloudVendorAccountAKResponseBody} extends {@link TeaModel}
     *
     * <p>AddCloudVendorAccountAKResponseBody</p>
     */
    public static class AuthModules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Module")
        private String module;

        @com.aliyun.core.annotation.NameInMap("ModuleAssetType")
        private String moduleAssetType;

        @com.aliyun.core.annotation.NameInMap("ModuleDisp")
        private String moduleDisp;

        @com.aliyun.core.annotation.NameInMap("ModuleServiceStatus")
        private Integer moduleServiceStatus;

        @com.aliyun.core.annotation.NameInMap("ModuleStatement")
        private String moduleStatement;

        private AuthModules(Builder builder) {
            this.message = builder.message;
            this.module = builder.module;
            this.moduleAssetType = builder.moduleAssetType;
            this.moduleDisp = builder.moduleDisp;
            this.moduleServiceStatus = builder.moduleServiceStatus;
            this.moduleStatement = builder.moduleStatement;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthModules create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return module
         */
        public String getModule() {
            return this.module;
        }

        /**
         * @return moduleAssetType
         */
        public String getModuleAssetType() {
            return this.moduleAssetType;
        }

        /**
         * @return moduleDisp
         */
        public String getModuleDisp() {
            return this.moduleDisp;
        }

        /**
         * @return moduleServiceStatus
         */
        public Integer getModuleServiceStatus() {
            return this.moduleServiceStatus;
        }

        /**
         * @return moduleStatement
         */
        public String getModuleStatement() {
            return this.moduleStatement;
        }

        public static final class Builder {
            private String message; 
            private String module; 
            private String moduleAssetType; 
            private String moduleDisp; 
            private Integer moduleServiceStatus; 
            private String moduleStatement; 

            private Builder() {
            } 

            private Builder(AuthModules model) {
                this.message = model.message;
                this.module = model.module;
                this.moduleAssetType = model.moduleAssetType;
                this.moduleDisp = model.moduleDisp;
                this.moduleServiceStatus = model.moduleServiceStatus;
                this.moduleStatement = model.moduleStatement;
            } 

            /**
             * <p>The error message of the module.</p>
             * 
             * <strong>example:</strong>
             * <p>ak_domain_error</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The code of the module. Valid values:</p>
             * <ul>
             * <li><strong>HOST</strong>: host</li>
             * <li><strong>CSPM</strong>: configuration assessment</li>
             * <li><strong>SIEM</strong>: CloudSiem</li>
             * <li><strong>TRIAL</strong>: log audit</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HOST</p>
             */
            public Builder module(String module) {
                this.module = module;
                return this;
            }

            /**
             * <p>The cloud asset that is associated with the module.</p>
             * 
             * <strong>example:</strong>
             * <p>Cloud server or virtual machine</p>
             */
            public Builder moduleAssetType(String moduleAssetType) {
                this.moduleAssetType = moduleAssetType;
                return this;
            }

            /**
             * <p>The display name of the module.</p>
             * 
             * <strong>example:</strong>
             * <p>Host Assets</p>
             */
            public Builder moduleDisp(String moduleDisp) {
                this.moduleDisp = moduleDisp;
                return this;
            }

            /**
             * <p>The service status of the module. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: being used</li>
             * <li><strong>1</strong>: exception occurred</li>
             * <li><strong>2</strong>: being validated</li>
             * <li><strong>3</strong>: validation timed out</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder moduleServiceStatus(Integer moduleServiceStatus) {
                this.moduleServiceStatus = moduleServiceStatus;
                return this;
            }

            /**
             * <p>The permission description of the module.</p>
             * 
             * <strong>example:</strong>
             * <p>Read permission of the cloud server or virtual machine</p>
             */
            public Builder moduleStatement(String moduleStatement) {
                this.moduleStatement = moduleStatement;
                return this;
            }

            public AuthModules build() {
                return new AuthModules(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddCloudVendorAccountAKResponseBody} extends {@link TeaModel}
     *
     * <p>AddCloudVendorAccountAKResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AkType")
        private String akType;

        @com.aliyun.core.annotation.NameInMap("AuthId")
        private Long authId;

        @com.aliyun.core.annotation.NameInMap("AuthModules")
        private java.util.List<AuthModules> authModules;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("SecretId")
        private String secretId;

        @com.aliyun.core.annotation.NameInMap("ServiceStatus")
        private Integer serviceStatus;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private String vendor;

        @com.aliyun.core.annotation.NameInMap("VendorAuthAlias")
        private String vendorAuthAlias;

        private Data(Builder builder) {
            this.akType = builder.akType;
            this.authId = builder.authId;
            this.authModules = builder.authModules;
            this.message = builder.message;
            this.secretId = builder.secretId;
            this.serviceStatus = builder.serviceStatus;
            this.status = builder.status;
            this.vendor = builder.vendor;
            this.vendorAuthAlias = builder.vendorAuthAlias;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return akType
         */
        public String getAkType() {
            return this.akType;
        }

        /**
         * @return authId
         */
        public Long getAuthId() {
            return this.authId;
        }

        /**
         * @return authModules
         */
        public java.util.List<AuthModules> getAuthModules() {
            return this.authModules;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return secretId
         */
        public String getSecretId() {
            return this.secretId;
        }

        /**
         * @return serviceStatus
         */
        public Integer getServiceStatus() {
            return this.serviceStatus;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        /**
         * @return vendorAuthAlias
         */
        public String getVendorAuthAlias() {
            return this.vendorAuthAlias;
        }

        public static final class Builder {
            private String akType; 
            private Long authId; 
            private java.util.List<AuthModules> authModules; 
            private String message; 
            private String secretId; 
            private Integer serviceStatus; 
            private Integer status; 
            private String vendor; 
            private String vendorAuthAlias; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.akType = model.akType;
                this.authId = model.authId;
                this.authModules = model.authModules;
                this.message = model.message;
                this.secretId = model.secretId;
                this.serviceStatus = model.serviceStatus;
                this.status = model.status;
                this.vendor = model.vendor;
                this.vendorAuthAlias = model.vendorAuthAlias;
            } 

            /**
             * <p>The type of the account to which the AccessKey pair belongs. Valid values:</p>
             * <ul>
             * <li><strong>primary</strong>: a primary account</li>
             * <li><strong>sub</strong>: a sub-account</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sub</p>
             */
            public Builder akType(String akType) {
                this.akType = akType;
                return this;
            }

            /**
             * <p>The unique ID of the AccessKey pair.</p>
             * 
             * <strong>example:</strong>
             * <p>2158</p>
             */
            public Builder authId(Long authId) {
                this.authId = authId;
                return this;
            }

            /**
             * <p>The modules that are associated with the AccessKey pair.</p>
             */
            public Builder authModules(java.util.List<AuthModules> authModules) {
                this.authModules = authModules;
                return this;
            }

            /**
             * <p>The error message of the AccessKey pair.</p>
             * 
             * <strong>example:</strong>
             * <p>The IAM user is forbidden in the currently selected region</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The AccessKey ID.</p>
             * 
             * <strong>example:</strong>
             * <p>AE6SLd****</p>
             */
            public Builder secretId(String secretId) {
                this.secretId = secretId;
                return this;
            }

            /**
             * <p>The service status of the AccessKey pair. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: being used</li>
             * <li><strong>1</strong>: exception occurred</li>
             * <li><strong>2</strong>: being validated</li>
             * <li><strong>3</strong>: validation timed out</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder serviceStatus(Integer serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            /**
             * <p>The status of the AccessKey pair. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: enabled</li>
             * <li><strong>1</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The cloud service provider. Valid values:</p>
             * <ul>
             * <li><strong>Tencent</strong>: Tencent Cloud</li>
             * <li><strong>HUAWEICLOUD</strong>: Huawei Cloud</li>
             * <li><strong>Azure</strong>: Microsoft Azure</li>
             * <li><strong>AWS</strong>: AWS</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Tencent</p>
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            /**
             * <p>The name of the AccessKey pair.</p>
             * <blockquote>
             * <p> The account information of the third-party cloud servers.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder vendorAuthAlias(String vendorAuthAlias) {
                this.vendorAuthAlias = vendorAuthAlias;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
