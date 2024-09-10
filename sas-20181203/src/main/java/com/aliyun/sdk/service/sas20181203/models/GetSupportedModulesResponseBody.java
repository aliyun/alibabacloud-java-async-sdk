// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSupportedModulesResponseBody} extends {@link TeaModel}
 *
 * <p>GetSupportedModulesResponseBody</p>
 */
public class GetSupportedModulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SupportedModuleResponse")
    private java.util.List < SupportedModuleResponse> supportedModuleResponse;

    private GetSupportedModulesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.supportedModuleResponse = builder.supportedModuleResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSupportedModulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return supportedModuleResponse
     */
    public java.util.List < SupportedModuleResponse> getSupportedModuleResponse() {
        return this.supportedModuleResponse;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SupportedModuleResponse> supportedModuleResponse; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The supported modules. The module information is classified by cloud service provider.
         */
        public Builder supportedModuleResponse(java.util.List < SupportedModuleResponse> supportedModuleResponse) {
            this.supportedModuleResponse = supportedModuleResponse;
            return this;
        }

        public GetSupportedModulesResponseBody build() {
            return new GetSupportedModulesResponseBody(this);
        } 

    } 

    public static class SupportedModules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Module")
        private String module;

        @com.aliyun.core.annotation.NameInMap("ModuleDisp")
        private String moduleDisp;

        private SupportedModules(Builder builder) {
            this.module = builder.module;
            this.moduleDisp = builder.moduleDisp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedModules create() {
            return builder().build();
        }

        /**
         * @return module
         */
        public String getModule() {
            return this.module;
        }

        /**
         * @return moduleDisp
         */
        public String getModuleDisp() {
            return this.moduleDisp;
        }

        public static final class Builder {
            private String module; 
            private String moduleDisp; 

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
             * The display name of the module.
             */
            public Builder moduleDisp(String moduleDisp) {
                this.moduleDisp = moduleDisp;
                return this;
            }

            public SupportedModules build() {
                return new SupportedModules(this);
            } 

        } 

    }
    public static class SupportedModuleResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedModules")
        private java.util.List < SupportedModules> supportedModules;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private String vendor;

        private SupportedModuleResponse(Builder builder) {
            this.supportedModules = builder.supportedModules;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedModuleResponse create() {
            return builder().build();
        }

        /**
         * @return supportedModules
         */
        public java.util.List < SupportedModules> getSupportedModules() {
            return this.supportedModules;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private java.util.List < SupportedModules> supportedModules; 
            private String vendor; 

            /**
             * The modules supported by the cloud service provider.
             */
            public Builder supportedModules(java.util.List < SupportedModules> supportedModules) {
                this.supportedModules = supportedModules;
                return this;
            }

            /**
             * The cloud service provider. Valid values:
             * <p>
             * 
             * *   **Tencent**: Tencent Cloud
             * *   **HUAWEICLOUD**:Huawei Cloud
             * *   **Azure**: Microsoft Azure
             * *   **AWS**: Amazon Web Services (AWS)
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public SupportedModuleResponse build() {
                return new SupportedModuleResponse(this);
            } 

        } 

    }
}
