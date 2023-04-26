// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVodTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>ListVodTemplateResponseBody</p>
 */
public class ListVodTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VodTemplateInfoList")
    private java.util.List < VodTemplateInfoList> vodTemplateInfoList;

    private ListVodTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vodTemplateInfoList = builder.vodTemplateInfoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVodTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vodTemplateInfoList
     */
    public java.util.List < VodTemplateInfoList> getVodTemplateInfoList() {
        return this.vodTemplateInfoList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < VodTemplateInfoList> vodTemplateInfoList; 

        /**
         * The time when the template was modified. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **ListVodTemplate**.
         */
        public Builder vodTemplateInfoList(java.util.List < VodTemplateInfoList> vodTemplateInfoList) {
            this.vodTemplateInfoList = vodTemplateInfoList;
            return this;
        }

        public ListVodTemplateResponseBody build() {
            return new ListVodTemplateResponseBody(this);
        } 

    } 

    public static class VodTemplateInfoList extends TeaModel {
        @NameInMap("AppId")
        private String appId;

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

        private VodTemplateInfoList(Builder builder) {
            this.appId = builder.appId;
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

        public static VodTemplateInfoList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
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
            private String appId; 
            private String creationTime; 
            private String isDefault; 
            private String modifyTime; 
            private String name; 
            private String templateConfig; 
            private String templateType; 
            private String vodTemplateId; 

            /**
             * The name of the template.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The ID of the application.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The type of the template. Set the value to **Snapshot**.
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
             * Queries snapshot templates.
             */
            public Builder templateConfig(String templateConfig) {
                this.templateConfig = templateConfig;
                return this;
            }

            /**
             * The detailed configurations of the template. The value is a JSON-formatted string. For more information about the data structure, see the "SnapshotTemplateConfig" section of the [Media processing parameters](~~98618~~) topic.
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder vodTemplateId(String vodTemplateId) {
                this.vodTemplateId = vodTemplateId;
                return this;
            }

            public VodTemplateInfoList build() {
                return new VodTemplateInfoList(this);
            } 

        } 

    }
}
