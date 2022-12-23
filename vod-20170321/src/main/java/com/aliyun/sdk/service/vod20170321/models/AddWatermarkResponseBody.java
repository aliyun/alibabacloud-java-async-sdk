// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddWatermarkResponseBody} extends {@link TeaModel}
 *
 * <p>AddWatermarkResponseBody</p>
 */
public class AddWatermarkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("WatermarkInfo")
    private WatermarkInfo watermarkInfo;

    private AddWatermarkResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.watermarkInfo = builder.watermarkInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddWatermarkResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return watermarkInfo
     */
    public WatermarkInfo getWatermarkInfo() {
        return this.watermarkInfo;
    }

    public static final class Builder {
        private String requestId; 
        private WatermarkInfo watermarkInfo; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the watermark.
         */
        public Builder watermarkInfo(WatermarkInfo watermarkInfo) {
            this.watermarkInfo = watermarkInfo;
            return this;
        }

        public AddWatermarkResponseBody build() {
            return new AddWatermarkResponseBody(this);
        } 

    } 

    public static class WatermarkInfo extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("FileUrl")
        private String fileUrl;

        @NameInMap("IsDefault")
        private String isDefault;

        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
        private String type;

        @NameInMap("WatermarkConfig")
        private String watermarkConfig;

        @NameInMap("WatermarkId")
        private String watermarkId;

        private WatermarkInfo(Builder builder) {
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

        public static WatermarkInfo create() {
            return builder().build();
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
            private String creationTime; 
            private String fileUrl; 
            private String isDefault; 
            private String name; 
            private String type; 
            private String watermarkConfig; 
            private String watermarkId; 

            /**
             * The time when the watermark was added. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The OSS URL or Content Delivery Network (CDN) URL of the watermark file. A text watermark does not have a file URL.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * Indicates whether the watermark is the default one. Valid values:
             * <p>
             * *   **Default**: The watermark is the default one.
             * *   **NotDefault**: The watermark is not the default one.
             */
            public Builder isDefault(String isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * The name of the watermark.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the watermark. Valid values:
             * <p>
             * *   **Image**: This is the default value.
             * *   **Text**
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The configurations such as the position and effect of the text watermark or image watermark. The value is a JSON-formatted string.
             * <p>
             * > The value of this parameter varies with the watermark type. For more information about the data structure, see the "WatermarkConfig" section of the [Media processing parameters](~~98618~~) topic.
             */
            public Builder watermarkConfig(String watermarkConfig) {
                this.watermarkConfig = watermarkConfig;
                return this;
            }

            /**
             * The ID of the watermark.
             */
            public Builder watermarkId(String watermarkId) {
                this.watermarkId = watermarkId;
                return this;
            }

            public WatermarkInfo build() {
                return new WatermarkInfo(this);
            } 

        } 

    }
}
