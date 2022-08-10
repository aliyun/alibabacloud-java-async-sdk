// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketplaceintl20220726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomImagesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomImagesResponseBody</p>
 */
public class DescribeCustomImagesResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Msg")
    private String msg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeCustomImagesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomImagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List < Data> data; 
        private String errorCode; 
        private String msg; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeCustomImagesResponseBody build() {
            return new DescribeCustomImagesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CreatedOn")
        private Long createdOn;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageName")
        private String imageName;

        @NameInMap("ImageSize")
        private Integer imageSize;

        @NameInMap("Osname")
        private String osname;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("PlatformBit")
        private String platformBit;

        @NameInMap("PlatformType")
        private String platformType;

        @NameInMap("Region")
        private String region;

        @NameInMap("TrackId")
        private String trackId;

        private Data(Builder builder) {
            this.createdOn = builder.createdOn;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.imageSize = builder.imageSize;
            this.osname = builder.osname;
            this.platform = builder.platform;
            this.platformBit = builder.platformBit;
            this.platformType = builder.platformType;
            this.region = builder.region;
            this.trackId = builder.trackId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createdOn
         */
        public Long getCreatedOn() {
            return this.createdOn;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return imageSize
         */
        public Integer getImageSize() {
            return this.imageSize;
        }

        /**
         * @return osname
         */
        public String getOsname() {
            return this.osname;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return platformBit
         */
        public String getPlatformBit() {
            return this.platformBit;
        }

        /**
         * @return platformType
         */
        public String getPlatformType() {
            return this.platformType;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return trackId
         */
        public String getTrackId() {
            return this.trackId;
        }

        public static final class Builder {
            private Long createdOn; 
            private String imageId; 
            private String imageName; 
            private Integer imageSize; 
            private String osname; 
            private String platform; 
            private String platformBit; 
            private String platformType; 
            private String region; 
            private String trackId; 

            /**
             * CreatedOn.
             */
            public Builder createdOn(Long createdOn) {
                this.createdOn = createdOn;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * ImageName.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * ImageSize.
             */
            public Builder imageSize(Integer imageSize) {
                this.imageSize = imageSize;
                return this;
            }

            /**
             * Osname.
             */
            public Builder osname(String osname) {
                this.osname = osname;
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
             * PlatformBit.
             */
            public Builder platformBit(String platformBit) {
                this.platformBit = platformBit;
                return this;
            }

            /**
             * PlatformType.
             */
            public Builder platformType(String platformType) {
                this.platformType = platformType;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * TrackId.
             */
            public Builder trackId(String trackId) {
                this.trackId = trackId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
