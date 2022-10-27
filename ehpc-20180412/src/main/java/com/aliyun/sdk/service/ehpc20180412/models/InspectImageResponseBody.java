// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InspectImageResponseBody} extends {@link TeaModel}
 *
 * <p>InspectImageResponseBody</p>
 */
public class InspectImageResponseBody extends TeaModel {
    @NameInMap("ImageStatus")
    private ImageStatus imageStatus;

    @NameInMap("RequestId")
    private String requestId;

    private InspectImageResponseBody(Builder builder) {
        this.imageStatus = builder.imageStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InspectImageResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageStatus
     */
    public ImageStatus getImageStatus() {
        return this.imageStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ImageStatus imageStatus; 
        private String requestId; 

        /**
         * ImageStatus.
         */
        public Builder imageStatus(ImageStatus imageStatus) {
            this.imageStatus = imageStatus;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InspectImageResponseBody build() {
            return new InspectImageResponseBody(this);
        } 

    } 

    public static class ImageInspectInfo extends TeaModel {
        @NameInMap("BootStrap")
        private String bootStrap;

        @NameInMap("BuildArch")
        private String buildArch;

        @NameInMap("BuildDate")
        private String buildDate;

        @NameInMap("ContainerVersion")
        private String containerVersion;

        @NameInMap("DefFrom")
        private String defFrom;

        @NameInMap("SchemaVersion")
        private String schemaVersion;

        private ImageInspectInfo(Builder builder) {
            this.bootStrap = builder.bootStrap;
            this.buildArch = builder.buildArch;
            this.buildDate = builder.buildDate;
            this.containerVersion = builder.containerVersion;
            this.defFrom = builder.defFrom;
            this.schemaVersion = builder.schemaVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageInspectInfo create() {
            return builder().build();
        }

        /**
         * @return bootStrap
         */
        public String getBootStrap() {
            return this.bootStrap;
        }

        /**
         * @return buildArch
         */
        public String getBuildArch() {
            return this.buildArch;
        }

        /**
         * @return buildDate
         */
        public String getBuildDate() {
            return this.buildDate;
        }

        /**
         * @return containerVersion
         */
        public String getContainerVersion() {
            return this.containerVersion;
        }

        /**
         * @return defFrom
         */
        public String getDefFrom() {
            return this.defFrom;
        }

        /**
         * @return schemaVersion
         */
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public static final class Builder {
            private String bootStrap; 
            private String buildArch; 
            private String buildDate; 
            private String containerVersion; 
            private String defFrom; 
            private String schemaVersion; 

            /**
             * BootStrap.
             */
            public Builder bootStrap(String bootStrap) {
                this.bootStrap = bootStrap;
                return this;
            }

            /**
             * BuildArch.
             */
            public Builder buildArch(String buildArch) {
                this.buildArch = buildArch;
                return this;
            }

            /**
             * BuildDate.
             */
            public Builder buildDate(String buildDate) {
                this.buildDate = buildDate;
                return this;
            }

            /**
             * ContainerVersion.
             */
            public Builder containerVersion(String containerVersion) {
                this.containerVersion = containerVersion;
                return this;
            }

            /**
             * DefFrom.
             */
            public Builder defFrom(String defFrom) {
                this.defFrom = defFrom;
                return this;
            }

            /**
             * SchemaVersion.
             */
            public Builder schemaVersion(String schemaVersion) {
                this.schemaVersion = schemaVersion;
                return this;
            }

            public ImageInspectInfo build() {
                return new ImageInspectInfo(this);
            } 

        } 

    }
    public static class ImageStatus extends TeaModel {
        @NameInMap("ImageInspectInfo")
        private ImageInspectInfo imageInspectInfo;

        private ImageStatus(Builder builder) {
            this.imageInspectInfo = builder.imageInspectInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageStatus create() {
            return builder().build();
        }

        /**
         * @return imageInspectInfo
         */
        public ImageInspectInfo getImageInspectInfo() {
            return this.imageInspectInfo;
        }

        public static final class Builder {
            private ImageInspectInfo imageInspectInfo; 

            /**
             * ImageInspectInfo.
             */
            public Builder imageInspectInfo(ImageInspectInfo imageInspectInfo) {
                this.imageInspectInfo = imageInspectInfo;
                return this;
            }

            public ImageStatus build() {
                return new ImageStatus(this);
            } 

        } 

    }
}
