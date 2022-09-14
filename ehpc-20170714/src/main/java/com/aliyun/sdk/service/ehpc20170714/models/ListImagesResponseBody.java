// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

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
         * OsTags.
         */
        public Builder osTags(OsTags osTags) {
            this.osTags = osTags;
            return this;
        }

        /**
         * RequestId.
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

        @NameInMap("OsTag")
        private String osTag;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("Version")
        private String version;

        private OsInfo(Builder builder) {
            this.architecture = builder.architecture;
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
            private String osTag; 
            private String platform; 
            private String version; 

            /**
             * Architecture.
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * OsTag.
             */
            public Builder osTag(String osTag) {
                this.osTag = osTag;
                return this;
            }

            /**
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * Version.
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
