// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeSDKDownloadListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSDKDownloadListResponseBody</p>
 */
public class DescribeSDKDownloadListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List<ResultObject> resultObject;

    private DescribeSDKDownloadListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSDKDownloadListResponseBody create() {
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
     * @return resultObject
     */
    public java.util.List<ResultObject> getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ResultObject> resultObject; 

        private Builder() {
        } 

        private Builder(DescribeSDKDownloadListResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return object</p>
         */
        public Builder resultObject(java.util.List<ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeSDKDownloadListResponseBody build() {
            return new DescribeSDKDownloadListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSDKDownloadListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSDKDownloadListResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("developer")
        private String developer;

        @com.aliyun.core.annotation.NameInMap("deviceType")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("downloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("packageName")
        private String packageName;

        @com.aliyun.core.annotation.NameInMap("privacyLink")
        private String privacyLink;

        @com.aliyun.core.annotation.NameInMap("pushTime")
        private String pushTime;

        @com.aliyun.core.annotation.NameInMap("sdkVersion")
        private String sdkVersion;

        @com.aliyun.core.annotation.NameInMap("size")
        private String size;

        private ResultObject(Builder builder) {
            this.description = builder.description;
            this.developer = builder.developer;
            this.deviceType = builder.deviceType;
            this.downloadUrl = builder.downloadUrl;
            this.md5 = builder.md5;
            this.packageName = builder.packageName;
            this.privacyLink = builder.privacyLink;
            this.pushTime = builder.pushTime;
            this.sdkVersion = builder.sdkVersion;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return developer
         */
        public String getDeveloper() {
            return this.developer;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return packageName
         */
        public String getPackageName() {
            return this.packageName;
        }

        /**
         * @return privacyLink
         */
        public String getPrivacyLink() {
            return this.privacyLink;
        }

        /**
         * @return pushTime
         */
        public String getPushTime() {
            return this.pushTime;
        }

        /**
         * @return sdkVersion
         */
        public String getSdkVersion() {
            return this.sdkVersion;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        public static final class Builder {
            private String description; 
            private String developer; 
            private String deviceType; 
            private String downloadUrl; 
            private String md5; 
            private String packageName; 
            private String privacyLink; 
            private String pushTime; 
            private String sdkVersion; 
            private String size; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.description = model.description;
                this.developer = model.developer;
                this.deviceType = model.deviceType;
                this.downloadUrl = model.downloadUrl;
                this.md5 = model.md5;
                this.packageName = model.packageName;
                this.privacyLink = model.privacyLink;
                this.pushTime = model.pushTime;
                this.sdkVersion = model.sdkVersion;
                this.size = model.size;
            } 

            /**
             * <p>Description information.</p>
             * 
             * <strong>example:</strong>
             * <p>描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Developer</p>
             * 
             * <strong>example:</strong>
             * <p>阿里云安全-风险识别</p>
             */
            public Builder developer(String developer) {
                this.developer = developer;
                return this;
            }

            /**
             * <p>Device type.</p>
             * 
             * <strong>example:</strong>
             * <p>ANDROID</p>
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * <p>Download URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://aliyun-xxxx.oss-cn-xxx.xxx.com/sdk/xxx/10056.1/Android-AliyunDeviceEnhance-10056.1-20250611.tgz">https://aliyun-xxxx.oss-cn-xxx.xxx.com/sdk/xxx/10056.1/Android-AliyunDeviceEnhance-10056.1-20250611.tgz</a></p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>File MD5.</p>
             * 
             * <strong>example:</strong>
             * <p>E582EEB6B4BC9B5CB168AA5A7DD0EE93</p>
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * <p>Package name</p>
             * 
             * <strong>example:</strong>
             * <p>net.security.device</p>
             */
            public Builder packageName(String packageName) {
                this.packageName = packageName;
                return this;
            }

            /**
             * <p>Risk recognition SDK privacy policy link</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud202111120818_92724.html">https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud202111120818_92724.html</a></p>
             */
            public Builder privacyLink(String privacyLink) {
                this.privacyLink = privacyLink;
                return this;
            }

            /**
             * <p>Release time</p>
             * 
             * <strong>example:</strong>
             * <p>1751212800000</p>
             */
            public Builder pushTime(String pushTime) {
                this.pushTime = pushTime;
                return this;
            }

            /**
             * <p>SDK version.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sdkVersion(String sdkVersion) {
                this.sdkVersion = sdkVersion;
                return this;
            }

            /**
             * <p>Size</p>
             * 
             * <strong>example:</strong>
             * <p>4.12 MB</p>
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
