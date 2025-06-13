// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link GetServiceConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceConfigResponseBody</p>
 */
public class GetServiceConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetServiceConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String msg; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetServiceConfigResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.msg = model.msg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetServiceConfigResponseBody build() {
            return new GetServiceConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceConfigResponseBody</p>
     */
    public static class ManualMachineConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditRiskLevels")
        private java.util.List<String> auditRiskLevels;

        @com.aliyun.core.annotation.NameInMap("CallbackId")
        private Long callbackId;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("ManualService")
        private String manualService;

        private ManualMachineConfig(Builder builder) {
            this.auditRiskLevels = builder.auditRiskLevels;
            this.callbackId = builder.callbackId;
            this.enable = builder.enable;
            this.manualService = builder.manualService;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ManualMachineConfig create() {
            return builder().build();
        }

        /**
         * @return auditRiskLevels
         */
        public java.util.List<String> getAuditRiskLevels() {
            return this.auditRiskLevels;
        }

        /**
         * @return callbackId
         */
        public Long getCallbackId() {
            return this.callbackId;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return manualService
         */
        public String getManualService() {
            return this.manualService;
        }

        public static final class Builder {
            private java.util.List<String> auditRiskLevels; 
            private Long callbackId; 
            private Boolean enable; 
            private String manualService; 

            private Builder() {
            } 

            private Builder(ManualMachineConfig model) {
                this.auditRiskLevels = model.auditRiskLevels;
                this.callbackId = model.callbackId;
                this.enable = model.enable;
                this.manualService = model.manualService;
            } 

            /**
             * AuditRiskLevels.
             */
            public Builder auditRiskLevels(java.util.List<String> auditRiskLevels) {
                this.auditRiskLevels = auditRiskLevels;
                return this;
            }

            /**
             * CallbackId.
             */
            public Builder callbackId(Long callbackId) {
                this.callbackId = callbackId;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * ManualService.
             */
            public Builder manualService(String manualService) {
                this.manualService = manualService;
                return this;
            }

            public ManualMachineConfig build() {
                return new ManualMachineConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceConfigResponseBody</p>
     */
    public static class CustomServiceConf extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeywordFilterLibs")
        private java.util.List<String> keywordFilterLibs;

        @com.aliyun.core.annotation.NameInMap("KeywordHitLibs")
        private java.util.List<String> keywordHitLibs;

        @com.aliyun.core.annotation.NameInMap("ManualMachineConfig")
        private ManualMachineConfig manualMachineConfig;

        @com.aliyun.core.annotation.NameInMap("SimilarTextHitLibs")
        private java.util.List<String> similarTextHitLibs;

        private CustomServiceConf(Builder builder) {
            this.keywordFilterLibs = builder.keywordFilterLibs;
            this.keywordHitLibs = builder.keywordHitLibs;
            this.manualMachineConfig = builder.manualMachineConfig;
            this.similarTextHitLibs = builder.similarTextHitLibs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomServiceConf create() {
            return builder().build();
        }

        /**
         * @return keywordFilterLibs
         */
        public java.util.List<String> getKeywordFilterLibs() {
            return this.keywordFilterLibs;
        }

        /**
         * @return keywordHitLibs
         */
        public java.util.List<String> getKeywordHitLibs() {
            return this.keywordHitLibs;
        }

        /**
         * @return manualMachineConfig
         */
        public ManualMachineConfig getManualMachineConfig() {
            return this.manualMachineConfig;
        }

        /**
         * @return similarTextHitLibs
         */
        public java.util.List<String> getSimilarTextHitLibs() {
            return this.similarTextHitLibs;
        }

        public static final class Builder {
            private java.util.List<String> keywordFilterLibs; 
            private java.util.List<String> keywordHitLibs; 
            private ManualMachineConfig manualMachineConfig; 
            private java.util.List<String> similarTextHitLibs; 

            private Builder() {
            } 

            private Builder(CustomServiceConf model) {
                this.keywordFilterLibs = model.keywordFilterLibs;
                this.keywordHitLibs = model.keywordHitLibs;
                this.manualMachineConfig = model.manualMachineConfig;
                this.similarTextHitLibs = model.similarTextHitLibs;
            } 

            /**
             * KeywordFilterLibs.
             */
            public Builder keywordFilterLibs(java.util.List<String> keywordFilterLibs) {
                this.keywordFilterLibs = keywordFilterLibs;
                return this;
            }

            /**
             * KeywordHitLibs.
             */
            public Builder keywordHitLibs(java.util.List<String> keywordHitLibs) {
                this.keywordHitLibs = keywordHitLibs;
                return this;
            }

            /**
             * ManualMachineConfig.
             */
            public Builder manualMachineConfig(ManualMachineConfig manualMachineConfig) {
                this.manualMachineConfig = manualMachineConfig;
                return this;
            }

            /**
             * SimilarTextHitLibs.
             */
            public Builder similarTextHitLibs(java.util.List<String> similarTextHitLibs) {
                this.similarTextHitLibs = similarTextHitLibs;
                return this;
            }

            public CustomServiceConf build() {
                return new CustomServiceConf(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomServiceConf")
        private CustomServiceConf customServiceConf;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("ServiceCode")
        private String serviceCode;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        private Data(Builder builder) {
            this.customServiceConf = builder.customServiceConf;
            this.gmtModified = builder.gmtModified;
            this.resourceType = builder.resourceType;
            this.serviceCode = builder.serviceCode;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return customServiceConf
         */
        public CustomServiceConf getCustomServiceConf() {
            return this.customServiceConf;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return serviceCode
         */
        public String getServiceCode() {
            return this.serviceCode;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private CustomServiceConf customServiceConf; 
            private String gmtModified; 
            private String resourceType; 
            private String serviceCode; 
            private String uid; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.customServiceConf = model.customServiceConf;
                this.gmtModified = model.gmtModified;
                this.resourceType = model.resourceType;
                this.serviceCode = model.serviceCode;
                this.uid = model.uid;
            } 

            /**
             * CustomServiceConf.
             */
            public Builder customServiceConf(CustomServiceConf customServiceConf) {
                this.customServiceConf = customServiceConf;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * ServiceCode.
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            /**
             * <p>UID。</p>
             * 
             * <strong>example:</strong>
             * <p>165379****31937</p>
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
