// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link ListImagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListImagesResponseBody</p>
 */
public class ListImagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OsTags")
    private OsTags osTags;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListImagesResponseBody(Builder builder) {
        this.osTags = builder.osTags;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImagesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return osTags
     */
    public OsTags getOsTags() {
        return this.osTags;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private OsTags osTags; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListImagesResponseBody model) {
            this.osTags = model.osTags;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of images that are supported by E-HPC.</p>
         */
        public Builder osTags(OsTags osTags) {
            this.osTags = osTags;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListImagesResponseBody build() {
            return new ListImagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListImagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListImagesResponseBody</p>
     */
    public static class OsInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Architecture")
        private String architecture;

        @com.aliyun.core.annotation.NameInMap("BaseOsTag")
        private String baseOsTag;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("OSName")
        private String OSName;

        @com.aliyun.core.annotation.NameInMap("OSNameEn")
        private String OSNameEn;

        @com.aliyun.core.annotation.NameInMap("OsTag")
        private String osTag;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private OsInfo(Builder builder) {
            this.architecture = builder.architecture;
            this.baseOsTag = builder.baseOsTag;
            this.imageId = builder.imageId;
            this.OSName = builder.OSName;
            this.OSNameEn = builder.OSNameEn;
            this.osTag = builder.osTag;
            this.platform = builder.platform;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OsInfo create() {
            return builder().build();
        }

        /**
         * @return architecture
         */
        public String getArchitecture() {
            return this.architecture;
        }

        /**
         * @return baseOsTag
         */
        public String getBaseOsTag() {
            return this.baseOsTag;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return OSName
         */
        public String getOSName() {
            return this.OSName;
        }

        /**
         * @return OSNameEn
         */
        public String getOSNameEn() {
            return this.OSNameEn;
        }

        /**
         * @return osTag
         */
        public String getOsTag() {
            return this.osTag;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String architecture; 
            private String baseOsTag; 
            private String imageId; 
            private String OSName; 
            private String OSNameEn; 
            private String osTag; 
            private String platform; 
            private String version; 

            private Builder() {
            } 

            private Builder(OsInfo model) {
                this.architecture = model.architecture;
                this.baseOsTag = model.baseOsTag;
                this.imageId = model.imageId;
                this.OSName = model.OSName;
                this.OSNameEn = model.OSNameEn;
                this.osTag = model.osTag;
                this.platform = model.platform;
                this.version = model.version;
            } 

            /**
             * <p>The architecture of the operating system. Valid values:</p>
             * <ul>
             * <li>i386</li>
             * <li>x86_64</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>i386</p>
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * <p>The image tag of the operating system. The tag is used only for management nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS_7.2_64</p>
             */
            public Builder baseOsTag(String baseOsTag) {
                this.baseOsTag = baseOsTag;
                return this;
            }

            /**
             * <p>The ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>m-bp1h8aoe73p71iow****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The name of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS_7.2_64</p>
             */
            public Builder OSName(String OSName) {
                this.OSName = OSName;
                return this;
            }

            /**
             * <p>The name of the image in English.</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS_7.2_64</p>
             */
            public Builder OSNameEn(String OSNameEn) {
                this.OSNameEn = OSNameEn;
                return this;
            }

            /**
             * <p>The tag that is added to the image.</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS_7.2_64</p>
             */
            public Builder osTag(String osTag) {
                this.osTag = osTag;
                return this;
            }

            /**
             * <p>The operating system. Valid values:</p>
             * <ul>
             * <li>CentOS</li>
             * <li>windows</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CentOS</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The version of the operating system.</p>
             * 
             * <strong>example:</strong>
             * <p>7.2</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public OsInfo build() {
                return new OsInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListImagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListImagesResponseBody</p>
     */
    public static class OsTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OsInfo")
        private java.util.List<OsInfo> osInfo;

        private OsTags(Builder builder) {
            this.osInfo = builder.osInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OsTags create() {
            return builder().build();
        }

        /**
         * @return osInfo
         */
        public java.util.List<OsInfo> getOsInfo() {
            return this.osInfo;
        }

        public static final class Builder {
            private java.util.List<OsInfo> osInfo; 

            private Builder() {
            } 

            private Builder(OsTags model) {
                this.osInfo = model.osInfo;
            } 

            /**
             * OsInfo.
             */
            public Builder osInfo(java.util.List<OsInfo> osInfo) {
                this.osInfo = osInfo;
                return this;
            }

            public OsTags build() {
                return new OsTags(this);
            } 

        } 

    }
}
