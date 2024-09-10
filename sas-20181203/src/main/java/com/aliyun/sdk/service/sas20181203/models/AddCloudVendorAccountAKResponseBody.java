// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * The information about the AccessKey pair that is added.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddCloudVendorAccountAKResponseBody build() {
            return new AddCloudVendorAccountAKResponseBody(this);
        } 

    } 

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

            /**
             * The error message of the module.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The code of the module. Valid values:
             * <p>
             * 
             * *   **HOST**: host
             * *   **CSPM**: configuration assessment
             * *   **SIEM**: CloudSiem
             * *   **TRIAL**: log audit
             */
            public Builder module(String module) {
                this.module = module;
                return this;
            }

            /**
             * The cloud asset that is associated with the module.
             */
            public Builder moduleAssetType(String moduleAssetType) {
                this.moduleAssetType = moduleAssetType;
                return this;
            }

            /**
             * The display name of the module.
             */
            public Builder moduleDisp(String moduleDisp) {
                this.moduleDisp = moduleDisp;
                return this;
            }

            /**
             * The service status of the module. Valid values:
             * <p>
             * 
             * *   **0**: being used
             * *   **1**: exception occurred
             * *   **2**: being validated
             * *   **3**: validation timed out
             */
            public Builder moduleServiceStatus(Integer moduleServiceStatus) {
                this.moduleServiceStatus = moduleServiceStatus;
                return this;
            }

            /**
             * The permission description of the module.
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AkType")
        private String akType;

        @com.aliyun.core.annotation.NameInMap("AuthId")
        private Long authId;

        @com.aliyun.core.annotation.NameInMap("AuthModules")
        private java.util.List < AuthModules> authModules;

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

        private Data(Builder builder) {
            this.akType = builder.akType;
            this.authId = builder.authId;
            this.authModules = builder.authModules;
            this.message = builder.message;
            this.secretId = builder.secretId;
            this.serviceStatus = builder.serviceStatus;
            this.status = builder.status;
            this.vendor = builder.vendor;
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
        public java.util.List < AuthModules> getAuthModules() {
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

        public static final class Builder {
            private String akType; 
            private Long authId; 
            private java.util.List < AuthModules> authModules; 
            private String message; 
            private String secretId; 
            private Integer serviceStatus; 
            private Integer status; 
            private String vendor; 

            /**
             * The type of the account to which the AccessKey pair belongs. Valid values:
             * <p>
             * 
             * *   **primary**: a primary account
             * *   **sub**: a sub-account
             */
            public Builder akType(String akType) {
                this.akType = akType;
                return this;
            }

            /**
             * The unique ID of the AccessKey pair.
             */
            public Builder authId(Long authId) {
                this.authId = authId;
                return this;
            }

            /**
             * The modules that are associated with the AccessKey pair.
             */
            public Builder authModules(java.util.List < AuthModules> authModules) {
                this.authModules = authModules;
                return this;
            }

            /**
             * The error message of the AccessKey pair.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The AccessKey ID.
             */
            public Builder secretId(String secretId) {
                this.secretId = secretId;
                return this;
            }

            /**
             * The service status of the AccessKey pair. Valid values:
             * <p>
             * 
             * *   **0**: being used
             * *   **1**: exception occurred
             * *   **2**: being validated
             * *   **3**: validation timed out
             */
            public Builder serviceStatus(Integer serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            /**
             * The status of the AccessKey pair. Valid values:
             * <p>
             * 
             * *   **0**: enabled
             * *   **1**: disabled
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The cloud service provider. Valid values:
             * <p>
             * 
             * *   **Tencent**: Tencent Cloud
             * *   **HUAWEICLOUD**: Huawei Cloud
             * *   **Azure**: Microsoft Azure
             * *   **AWS**: AWS
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
