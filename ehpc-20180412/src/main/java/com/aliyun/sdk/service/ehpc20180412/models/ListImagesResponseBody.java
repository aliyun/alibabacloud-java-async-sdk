// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListImagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListImagesResponseBody</p>
 */
public class ListImagesResponseBody extends TeaModel {
    @NameInMap("OsTags")
    private OsTags osTags;

    @NameInMap("RequestId")
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

        /**
         * The list of images that are supported by E-HPC.
         */
        public Builder osTags(OsTags osTags) {
            this.osTags = osTags;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListImagesResponseBody build() {
            return new ListImagesResponseBody(this);
        } 

    } 

    public static class OsInfo extends TeaModel {
        @NameInMap("Architecture")
        private String architecture;

        @NameInMap("BaseOsTag")
        private String baseOsTag;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("OSName")
        private String OSName;

        @NameInMap("OSNameEn")
        private String OSNameEn;

        @NameInMap("OsTag")
        private String osTag;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("Version")
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

            /**
             * The architecture of the operating system. Valid values:
             * <p>
             * 
             * *   i386
             * *   x86\_64
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * The image tag of the operating system. The tag is used only for management nodes.
             */
            public Builder baseOsTag(String baseOsTag) {
                this.baseOsTag = baseOsTag;
                return this;
            }

            /**
             * The ID of the image.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * OSName.
             */
            public Builder OSName(String OSName) {
                this.OSName = OSName;
                return this;
            }

            /**
             * OSNameEn.
             */
            public Builder OSNameEn(String OSNameEn) {
                this.OSNameEn = OSNameEn;
                return this;
            }

            /**
             * The image tag of the cluster.
             */
            public Builder osTag(String osTag) {
                this.osTag = osTag;
                return this;
            }

            /**
             * The operating system. Valid values:
             * <p>
             * 
             * *   CentOS
             * *   windows
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * The version of the operating system.
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
    public static class OsTags extends TeaModel {
        @NameInMap("OsInfo")
        private java.util.List < OsInfo> osInfo;

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
        public java.util.List < OsInfo> getOsInfo() {
            return this.osInfo;
        }

        public static final class Builder {
            private java.util.List < OsInfo> osInfo; 

            /**
             * OsInfo.
             */
            public Builder osInfo(java.util.List < OsInfo> osInfo) {
                this.osInfo = osInfo;
                return this;
            }

            public OsTags build() {
                return new OsTags(this);
            } 

        } 

    }
}
