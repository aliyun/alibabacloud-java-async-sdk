// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVodTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetVodTemplateResponseBody</p>
 */
public class GetVodTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VodTemplateInfo")
    private VodTemplateInfo vodTemplateInfo;

    private GetVodTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vodTemplateInfo = builder.vodTemplateInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVodTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vodTemplateInfo
     */
    public VodTemplateInfo getVodTemplateInfo() {
        return this.vodTemplateInfo;
    }

    public static final class Builder {
        private String requestId; 
        private VodTemplateInfo vodTemplateInfo; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VodTemplateInfo.
         */
        public Builder vodTemplateInfo(VodTemplateInfo vodTemplateInfo) {
            this.vodTemplateInfo = vodTemplateInfo;
            return this;
        }

        public GetVodTemplateResponseBody build() {
            return new GetVodTemplateResponseBody(this);
        } 

    } 

    public static class VodTemplateInfo extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("IsDefault")
        private String isDefault;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("TemplateConfig")
        private String templateConfig;

        @NameInMap("TemplateType")
        private String templateType;

        @NameInMap("VodTemplateId")
        private String vodTemplateId;

        private VodTemplateInfo(Builder builder) {
            this.creationTime = builder.creationTime;
            this.isDefault = builder.isDefault;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.templateConfig = builder.templateConfig;
            this.templateType = builder.templateType;
            this.vodTemplateId = builder.vodTemplateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VodTemplateInfo create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return isDefault
         */
        public String getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return templateConfig
         */
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        /**
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
        }

        /**
         * @return vodTemplateId
         */
        public String getVodTemplateId() {
            return this.vodTemplateId;
        }

        public static final class Builder {
            private String creationTime; 
            private String isDefault; 
            private String modifyTime; 
            private String name; 
            private String templateConfig; 
            private String templateType; 
            private String vodTemplateId; 

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(String isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * TemplateConfig.
             */
            public Builder templateConfig(String templateConfig) {
                this.templateConfig = templateConfig;
                return this;
            }

            /**
             * TemplateType.
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * VodTemplateId.
             */
            public Builder vodTemplateId(String vodTemplateId) {
                this.vodTemplateId = vodTemplateId;
                return this;
            }

            public VodTemplateInfo build() {
                return new VodTemplateInfo(this);
            } 

        } 

    }
}
