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
 * {@link GetSupportedModulesResponseBody} extends {@link TeaModel}
 *
 * <p>GetSupportedModulesResponseBody</p>
 */
public class GetSupportedModulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SupportedModuleResponse")
    private java.util.List<SupportedModuleResponse> supportedModuleResponse;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<SupportedModuleResponse> getSupportedModuleResponse() {
        return this.supportedModuleResponse;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SupportedModuleResponse> supportedModuleResponse; 

        private Builder() {
        } 

        private Builder(GetSupportedModulesResponseBody model) {
            this.requestId = model.requestId;
            this.supportedModuleResponse = model.supportedModuleResponse;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C699E4E4-F2F4-58FC-A949-457FFE59****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The supported modules. The module information is classified by cloud service provider.</p>
         */
        public Builder supportedModuleResponse(java.util.List<SupportedModuleResponse> supportedModuleResponse) {
            this.supportedModuleResponse = supportedModuleResponse;
            return this;
        }

        public GetSupportedModulesResponseBody build() {
            return new GetSupportedModulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSupportedModulesResponseBody} extends {@link TeaModel}
     *
     * <p>GetSupportedModulesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(SupportedModules model) {
                this.module = model.module;
                this.moduleDisp = model.moduleDisp;
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
             * <p>The display name of the module.</p>
             * 
             * <strong>example:</strong>
             * <p>Configuration assessment</p>
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
    /**
     * 
     * {@link GetSupportedModulesResponseBody} extends {@link TeaModel}
     *
     * <p>GetSupportedModulesResponseBody</p>
     */
    public static class SupportedModuleResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportedModules")
        private java.util.List<SupportedModules> supportedModules;

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
        public java.util.List<SupportedModules> getSupportedModules() {
            return this.supportedModules;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private java.util.List<SupportedModules> supportedModules; 
            private String vendor; 

            private Builder() {
            } 

            private Builder(SupportedModuleResponse model) {
                this.supportedModules = model.supportedModules;
                this.vendor = model.vendor;
            } 

            /**
             * <p>The modules supported by the cloud service provider.</p>
             */
            public Builder supportedModules(java.util.List<SupportedModules> supportedModules) {
                this.supportedModules = supportedModules;
                return this;
            }

            /**
             * <p>The cloud service provider. Valid values:</p>
             * <ul>
             * <li><strong>Tencent</strong>: Tencent Cloud</li>
             * <li><strong>HUAWEICLOUD</strong>:Huawei Cloud</li>
             * <li><strong>Azure</strong>: Microsoft Azure</li>
             * <li><strong>AWS</strong>: Amazon Web Services (AWS)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Tencent</p>
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
