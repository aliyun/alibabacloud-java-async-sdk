// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeImageListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageListResponseBody</p>
 */
public class DescribeImageListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeImageListResponseBody(Builder builder) {
        this.data = builder.data;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeImageListResponseBody model) {
            this.data = model.data;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The images.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l5V9uON****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>620740FF-492F-5956-B1BA-361E966C0269</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeImageListResponseBody build() {
            return new DescribeImageListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImageRegionDistributeMap")
        private java.util.Map<String, DataImageRegionDistributeMapValue> imageRegionDistributeMap;

        @com.aliyun.core.annotation.NameInMap("ImageRegionList")
        private java.util.List<String> imageRegionList;

        @com.aliyun.core.annotation.NameInMap("ImageType")
        private String imageType;

        @com.aliyun.core.annotation.NameInMap("ImageVersion")
        private String imageVersion;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("ReleaseTime")
        private String releaseTime;

        @com.aliyun.core.annotation.NameInMap("RenderingType")
        private String renderingType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SystemType")
        private String systemType;

        private Data(Builder builder) {
            this.aliUid = builder.aliUid;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.imageRegionDistributeMap = builder.imageRegionDistributeMap;
            this.imageRegionList = builder.imageRegionList;
            this.imageType = builder.imageType;
            this.imageVersion = builder.imageVersion;
            this.language = builder.language;
            this.releaseTime = builder.releaseTime;
            this.renderingType = builder.renderingType;
            this.status = builder.status;
            this.systemType = builder.systemType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return imageRegionDistributeMap
         */
        public java.util.Map<String, DataImageRegionDistributeMapValue> getImageRegionDistributeMap() {
            return this.imageRegionDistributeMap;
        }

        /**
         * @return imageRegionList
         */
        public java.util.List<String> getImageRegionList() {
            return this.imageRegionList;
        }

        /**
         * @return imageType
         */
        public String getImageType() {
            return this.imageType;
        }

        /**
         * @return imageVersion
         */
        public String getImageVersion() {
            return this.imageVersion;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return releaseTime
         */
        public String getReleaseTime() {
            return this.releaseTime;
        }

        /**
         * @return renderingType
         */
        public String getRenderingType() {
            return this.renderingType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return systemType
         */
        public String getSystemType() {
            return this.systemType;
        }

        public static final class Builder {
            private Long aliUid; 
            private String description; 
            private String gmtCreate; 
            private String gmtModified; 
            private String imageId; 
            private String imageName; 
            private java.util.Map<String, DataImageRegionDistributeMapValue> imageRegionDistributeMap; 
            private java.util.List<String> imageRegionList; 
            private String imageType; 
            private String imageVersion; 
            private String language; 
            private String releaseTime; 
            private String renderingType; 
            private String status; 
            private String systemType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aliUid = model.aliUid;
                this.description = model.description;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.imageId = model.imageId;
                this.imageName = model.imageName;
                this.imageRegionDistributeMap = model.imageRegionDistributeMap;
                this.imageRegionList = model.imageRegionList;
                this.imageType = model.imageType;
                this.imageVersion = model.imageVersion;
                this.language = model.language;
                this.releaseTime = model.releaseTime;
                this.renderingType = model.renderingType;
                this.status = model.status;
                this.systemType = model.systemType;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>117819727354****</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The description of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the image was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-02-01 10:56:36</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the image was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-02-01 10:56:36</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>imgc-075cllfeuazh****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The name of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>IMAGE</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The region where the image is distributed. The key is the region and the value is the distribution information.</p>
             */
            public Builder imageRegionDistributeMap(java.util.Map<String, DataImageRegionDistributeMapValue> imageRegionDistributeMap) {
                this.imageRegionDistributeMap = imageRegionDistributeMap;
                return this;
            }

            /**
             * <p>The list of regions.</p>
             */
            public Builder imageRegionList(java.util.List<String> imageRegionList) {
                this.imageRegionList = imageRegionList;
                return this;
            }

            /**
             * <p>The type of the image.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>User: custom images.</li>
             * <li>System: system images.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>System</p>
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * ImageVersion.
             */
            public Builder imageVersion(String imageVersion) {
                this.imageVersion = imageVersion;
                return this;
            }

            /**
             * <p>The language of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>zh</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The time when the image was published.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-25 10:06:45</p>
             */
            public Builder releaseTime(String releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * <p>The rendering type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>GPURemote</li>
             * <li>CPU</li>
             * <li>GPULocal</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CPU</p>
             */
            public Builder renderingType(String renderingType) {
                this.renderingType = renderingType;
                return this;
            }

            /**
             * <p>The state of the image.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>AVAILABLE: The image is available.</li>
             * <li>DELETE: The image is deleted.</li>
             * <li>INIT: The image is being initialized.</li>
             * <li>CREATE_FAILED: The image failed to be created.</li>
             * <li>CREATING: The image is being created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The OS type of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>Android 12</p>
             */
            public Builder systemType(String systemType) {
                this.systemType = systemType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
