// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link ListWatermarkResponseBody} extends {@link TeaModel}
 *
 * <p>ListWatermarkResponseBody</p>
 */
public class ListWatermarkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WatermarkInfos")
    private java.util.List<WatermarkInfos> watermarkInfos;

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
     * @return watermarkInfos
     */
    public java.util.List<WatermarkInfos> getWatermarkInfos() {
        return this.watermarkInfos;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<WatermarkInfos> watermarkInfos; 

        private Builder() {
        } 

        private Builder(ListWatermarkResponseBody model) {
            this.requestId = model.requestId;
            this.watermarkInfos = model.watermarkInfos;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4A*****F6-D7393642CA58</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the watermark template.</p>
         */
        public Builder watermarkInfos(java.util.List<WatermarkInfos> watermarkInfos) {
            this.watermarkInfos = watermarkInfos;
            return this;
        }

        public ListWatermarkResponseBody build() {
            return new ListWatermarkResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWatermarkResponseBody} extends {@link TeaModel}
     *
     * <p>ListWatermarkResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(WatermarkInfos model) {
                this.appId = model.appId;
                this.creationTime = model.creationTime;
                this.fileUrl = model.fileUrl;
                this.isDefault = model.isDefault;
                this.name = model.name;
                this.type = model.type;
                this.watermarkConfig = model.watermarkConfig;
                this.watermarkId = model.watermarkId;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>app-****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The time when the watermark template was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-11-07T09:05:52Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The URL of the watermark file. The URL is an Object Storage Service (OSS) URL or an Alibaba Cloud CDN URL.</p>
             * <blockquote>
             * <p> This parameter is returned only for image watermark templates.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="https://outin-3262681cd*****89f4b3e7.oss-cn-shanghai.aliyuncs.com/image/cover/8CC8B715E6F8A72EC6B-6-2.png?Expires=1541600583&OSSAccessKeyId=****&Signature=gmf1eYMoDVg%2BHQCb4UGozB">https://outin-3262681cd*****89f4b3e7.oss-cn-shanghai.aliyuncs.com/image/cover/8CC8B715E6F8A72EC6B-6-2.png?Expires=1541600583&amp;OSSAccessKeyId=****&amp;Signature=gmf1eYMoDVg%2BHQCb4UGozB</a>****</p>
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * <p>Indicates whether the watermark template is the default one. Valid values:</p>
             * <ul>
             * <li><strong>Default</strong></li>
             * <li><strong>NotDefault</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NotDefault</p>
             */
            public Builder isDefault(String isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The name of the watermark template.</p>
             * 
             * <strong>example:</strong>
             * <p>testName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the watermark template.</p>
             * <ul>
             * <li><strong>Image</strong>: image watermark template</li>
             * <li><strong>Text</strong>: text watermark template</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Text</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The configuration information of the watermark such as the display position and special effects. The value is a JSON string. The configuration parameters for image and text watermarks are different. For more information about the parameter structure, see <a href="~~98618#section-h01-44s-2lr~~">WatermarkConfig</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;FontColor&quot;: &quot;Blue&quot;,&quot;FontSize&quot;: 80,&quot;Content&quot;: &quot;test watermark&quot;}</p>
             */
            public Builder watermarkConfig(String watermarkConfig) {
                this.watermarkConfig = watermarkConfig;
                return this;
            }

            /**
             * <p>The ID of the watermark template.</p>
             * 
             * <strong>example:</strong>
             * <p>9bcc8bfadb843*****109a2671d0df97</p>
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
