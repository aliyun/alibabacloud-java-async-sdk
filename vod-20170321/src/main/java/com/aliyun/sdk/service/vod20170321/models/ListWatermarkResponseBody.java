// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWatermarkResponseBody} extends {@link TeaModel}
 *
 * <p>ListWatermarkResponseBody</p>
 */
public class ListWatermarkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WatermarkInfos")
    private java.util.List < WatermarkInfos> watermarkInfos;

    private ListWatermarkResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.watermarkInfos = builder.watermarkInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWatermarkResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return watermarkInfos
     */
    public java.util.List < WatermarkInfos> getWatermarkInfos() {
        return this.watermarkInfos;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < WatermarkInfos> watermarkInfos; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the watermark template.
         */
        public Builder watermarkInfos(java.util.List < WatermarkInfos> watermarkInfos) {
            this.watermarkInfos = watermarkInfos;
            return this;
        }

        public ListWatermarkResponseBody build() {
            return new ListWatermarkResponseBody(this);
        } 

    } 

    public static class WatermarkInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private String isDefault;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("WatermarkConfig")
        private String watermarkConfig;

        @com.aliyun.core.annotation.NameInMap("WatermarkId")
        private String watermarkId;

        private WatermarkInfos(Builder builder) {
            this.appId = builder.appId;
            this.creationTime = builder.creationTime;
            this.fileUrl = builder.fileUrl;
            this.isDefault = builder.isDefault;
            this.name = builder.name;
            this.type = builder.type;
            this.watermarkConfig = builder.watermarkConfig;
            this.watermarkId = builder.watermarkId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WatermarkInfos create() {
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
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return isDefault
         */
        public String getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return watermarkConfig
         */
        public String getWatermarkConfig() {
            return this.watermarkConfig;
        }

        /**
         * @return watermarkId
         */
        public String getWatermarkId() {
            return this.watermarkId;
        }

        public static final class Builder {
            private String appId; 
            private String creationTime; 
            private String fileUrl; 
            private String isDefault; 
            private String name; 
            private String type; 
            private String watermarkConfig; 
            private String watermarkId; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The time when the watermark template was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The URL of the watermark file. The URL is an Object Storage Service (OSS) URL or an Alibaba Cloud CDN URL.
             * <p>
             * 
             * >  This parameter is returned only for image watermark templates.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * Indicates whether the watermark template is the default one. Valid values:
             * <p>
             * 
             * *   **Default**
             * *   **NotDefault**
             */
            public Builder isDefault(String isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * The name of the watermark template.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the watermark template.
             * <p>
             * 
             * *   **Image**: image watermark template
             * *   **Text**: text watermark template
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The configuration information of the watermark such as the display position and special effects. The value is a JSON string. The configuration parameters for image and text watermarks are different. For more information about the parameter structure, see [WatermarkConfig](~~98618#section-h01-44s-2lr~~).
             */
            public Builder watermarkConfig(String watermarkConfig) {
                this.watermarkConfig = watermarkConfig;
                return this;
            }

            /**
             * The ID of the watermark template.
             */
            public Builder watermarkId(String watermarkId) {
                this.watermarkId = watermarkId;
                return this;
            }

            public WatermarkInfos build() {
                return new WatermarkInfos(this);
            } 

        } 

    }
}
