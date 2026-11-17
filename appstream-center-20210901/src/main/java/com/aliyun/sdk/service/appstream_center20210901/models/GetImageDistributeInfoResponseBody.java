// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetImageDistributeInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetImageDistributeInfoResponseBody</p>
 */
public class GetImageDistributeInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetImageDistributeInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageDistributeInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetImageDistributeInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The return code of the API. A value of 200 indicates success. If the call fails, the corresponding error code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The image information returned by the query.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The processing message returned by the API.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8737D130-BFD0-5D51-96F6-C08EB1139A25</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API call is successful. Valid values: true: Successful. false: Failed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetImageDistributeInfoResponseBody build() {
            return new GetImageDistributeInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetImageDistributeInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageDistributeInfoResponseBody</p>
     */
    public static class ImageRegionDistributeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("EcsImageId")
        private String ecsImageId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UnitImageId")
        private String unitImageId;

        @com.aliyun.core.annotation.NameInMap("VersionId")
        private String versionId;

        private ImageRegionDistributeList(Builder builder) {
            this.aliUid = builder.aliUid;
            this.ecsImageId = builder.ecsImageId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.imageId = builder.imageId;
            this.message = builder.message;
            this.progress = builder.progress;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.unitImageId = builder.unitImageId;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageRegionDistributeList create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return ecsImageId
         */
        public String getEcsImageId() {
            return this.ecsImageId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return unitImageId
         */
        public String getUnitImageId() {
            return this.unitImageId;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private Long aliUid; 
            private String ecsImageId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String imageId; 
            private String message; 
            private String progress; 
            private String regionId; 
            private String status; 
            private String unitImageId; 
            private String versionId; 

            private Builder() {
            } 

            private Builder(ImageRegionDistributeList model) {
                this.aliUid = model.aliUid;
                this.ecsImageId = model.ecsImageId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.imageId = model.imageId;
                this.message = model.message;
                this.progress = model.progress;
                this.regionId = model.regionId;
                this.status = model.status;
                this.unitImageId = model.unitImageId;
                this.versionId = model.versionId;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account to which the image belongs. The account ID for a system image is 0.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The ID of the ECS image corresponding to the region.</p>
             * 
             * <strong>example:</strong>
             * <p>m-bp1example****</p>
             */
            public Builder ecsImageId(String ecsImageId) {
                this.ecsImageId = ecsImageId;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-25 15:13:57</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The last update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-25 15:13:57</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>imgc-xxxx</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The processing information reported by the region distribution task.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The distribution progress of the image in the region, expressed as a percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The ID of the region to which the image is distributed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The region distribution status.</p>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The logical ID of the image on the unit side, which can be different from the central image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>m-1bdedef****</p>
             */
            public Builder unitImageId(String unitImageId) {
                this.unitImageId = unitImageId;
                return this;
            }

            /**
             * <p>The image version ID.</p>
             * 
             * <strong>example:</strong>
             * <p>iv-xxx</p>
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            public ImageRegionDistributeList build() {
                return new ImageRegionDistributeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageDistributeInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageDistributeInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageRegionDistributeList")
        private java.util.List<ImageRegionDistributeList> imageRegionDistributeList;

        @com.aliyun.core.annotation.NameInMap("ImageRegionList")
        private java.util.List<String> imageRegionList;

        @com.aliyun.core.annotation.NameInMap("ImageSource")
        private String imageSource;

        private Data(Builder builder) {
            this.imageRegionDistributeList = builder.imageRegionDistributeList;
            this.imageRegionList = builder.imageRegionList;
            this.imageSource = builder.imageSource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return imageRegionDistributeList
         */
        public java.util.List<ImageRegionDistributeList> getImageRegionDistributeList() {
            return this.imageRegionDistributeList;
        }

        /**
         * @return imageRegionList
         */
        public java.util.List<String> getImageRegionList() {
            return this.imageRegionList;
        }

        /**
         * @return imageSource
         */
        public String getImageSource() {
            return this.imageSource;
        }

        public static final class Builder {
            private java.util.List<ImageRegionDistributeList> imageRegionDistributeList; 
            private java.util.List<String> imageRegionList; 
            private String imageSource; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.imageRegionDistributeList = model.imageRegionDistributeList;
                this.imageRegionList = model.imageRegionList;
                this.imageSource = model.imageSource;
            } 

            /**
             * <p>The list of region distribution information for the image version.</p>
             */
            public Builder imageRegionDistributeList(java.util.List<ImageRegionDistributeList> imageRegionDistributeList) {
                this.imageRegionDistributeList = imageRegionDistributeList;
                return this;
            }

            /**
             * <p>The list of region IDs supported by the image.</p>
             */
            public Builder imageRegionList(java.util.List<String> imageRegionList) {
                this.imageRegionList = imageRegionList;
                return this;
            }

            /**
             * <p>The source of the image. For example, center indicates the central image service.</p>
             * 
             * <strong>example:</strong>
             * <p>center</p>
             */
            public Builder imageSource(String imageSource) {
                this.imageSource = imageSource;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
