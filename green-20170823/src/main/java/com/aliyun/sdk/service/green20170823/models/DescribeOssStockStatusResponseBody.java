// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOssStockStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOssStockStatusResponseBody</p>
 */
public class DescribeOssStockStatusResponseBody extends TeaModel {
    @NameInMap("AudioAntispamCount")
    private Integer audioAntispamCount;

    @NameInMap("AudioTotalCount")
    private Integer audioTotalCount;

    @NameInMap("BucketList")
    private java.util.List < BucketList> bucketList;

    @NameInMap("FinishedTime")
    private String finishedTime;

    @NameInMap("ImageAdCount")
    private Integer imageAdCount;

    @NameInMap("ImageLiveCount")
    private Integer imageLiveCount;

    @NameInMap("ImagePornCount")
    private Integer imagePornCount;

    @NameInMap("ImageTerrorismCount")
    private Integer imageTerrorismCount;

    @NameInMap("ImageTotalCount")
    private Integer imageTotalCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResouceTypeList")
    private java.util.List < String > resouceTypeList;

    @NameInMap("SceneList")
    private java.util.List < String > sceneList;

    @NameInMap("StockStatus")
    private Integer stockStatus;

    @NameInMap("VideoAdCount")
    private Integer videoAdCount;

    @NameInMap("VideoLiveCount")
    private Integer videoLiveCount;

    @NameInMap("VideoPornCount")
    private Integer videoPornCount;

    @NameInMap("VideoTerrorismCount")
    private Integer videoTerrorismCount;

    @NameInMap("VideoTotalCount")
    private Integer videoTotalCount;

    @NameInMap("VideoVoiceAntispamCount")
    private Integer videoVoiceAntispamCount;

    private DescribeOssStockStatusResponseBody(Builder builder) {
        this.audioAntispamCount = builder.audioAntispamCount;
        this.audioTotalCount = builder.audioTotalCount;
        this.bucketList = builder.bucketList;
        this.finishedTime = builder.finishedTime;
        this.imageAdCount = builder.imageAdCount;
        this.imageLiveCount = builder.imageLiveCount;
        this.imagePornCount = builder.imagePornCount;
        this.imageTerrorismCount = builder.imageTerrorismCount;
        this.imageTotalCount = builder.imageTotalCount;
        this.requestId = builder.requestId;
        this.resouceTypeList = builder.resouceTypeList;
        this.sceneList = builder.sceneList;
        this.stockStatus = builder.stockStatus;
        this.videoAdCount = builder.videoAdCount;
        this.videoLiveCount = builder.videoLiveCount;
        this.videoPornCount = builder.videoPornCount;
        this.videoTerrorismCount = builder.videoTerrorismCount;
        this.videoTotalCount = builder.videoTotalCount;
        this.videoVoiceAntispamCount = builder.videoVoiceAntispamCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssStockStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return audioAntispamCount
     */
    public Integer getAudioAntispamCount() {
        return this.audioAntispamCount;
    }

    /**
     * @return audioTotalCount
     */
    public Integer getAudioTotalCount() {
        return this.audioTotalCount;
    }

    /**
     * @return bucketList
     */
    public java.util.List < BucketList> getBucketList() {
        return this.bucketList;
    }

    /**
     * @return finishedTime
     */
    public String getFinishedTime() {
        return this.finishedTime;
    }

    /**
     * @return imageAdCount
     */
    public Integer getImageAdCount() {
        return this.imageAdCount;
    }

    /**
     * @return imageLiveCount
     */
    public Integer getImageLiveCount() {
        return this.imageLiveCount;
    }

    /**
     * @return imagePornCount
     */
    public Integer getImagePornCount() {
        return this.imagePornCount;
    }

    /**
     * @return imageTerrorismCount
     */
    public Integer getImageTerrorismCount() {
        return this.imageTerrorismCount;
    }

    /**
     * @return imageTotalCount
     */
    public Integer getImageTotalCount() {
        return this.imageTotalCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resouceTypeList
     */
    public java.util.List < String > getResouceTypeList() {
        return this.resouceTypeList;
    }

    /**
     * @return sceneList
     */
    public java.util.List < String > getSceneList() {
        return this.sceneList;
    }

    /**
     * @return stockStatus
     */
    public Integer getStockStatus() {
        return this.stockStatus;
    }

    /**
     * @return videoAdCount
     */
    public Integer getVideoAdCount() {
        return this.videoAdCount;
    }

    /**
     * @return videoLiveCount
     */
    public Integer getVideoLiveCount() {
        return this.videoLiveCount;
    }

    /**
     * @return videoPornCount
     */
    public Integer getVideoPornCount() {
        return this.videoPornCount;
    }

    /**
     * @return videoTerrorismCount
     */
    public Integer getVideoTerrorismCount() {
        return this.videoTerrorismCount;
    }

    /**
     * @return videoTotalCount
     */
    public Integer getVideoTotalCount() {
        return this.videoTotalCount;
    }

    /**
     * @return videoVoiceAntispamCount
     */
    public Integer getVideoVoiceAntispamCount() {
        return this.videoVoiceAntispamCount;
    }

    public static final class Builder {
        private Integer audioAntispamCount; 
        private Integer audioTotalCount; 
        private java.util.List < BucketList> bucketList; 
        private String finishedTime; 
        private Integer imageAdCount; 
        private Integer imageLiveCount; 
        private Integer imagePornCount; 
        private Integer imageTerrorismCount; 
        private Integer imageTotalCount; 
        private String requestId; 
        private java.util.List < String > resouceTypeList; 
        private java.util.List < String > sceneList; 
        private Integer stockStatus; 
        private Integer videoAdCount; 
        private Integer videoLiveCount; 
        private Integer videoPornCount; 
        private Integer videoTerrorismCount; 
        private Integer videoTotalCount; 
        private Integer videoVoiceAntispamCount; 

        /**
         * AudioAntispamCount.
         */
        public Builder audioAntispamCount(Integer audioAntispamCount) {
            this.audioAntispamCount = audioAntispamCount;
            return this;
        }

        /**
         * AudioTotalCount.
         */
        public Builder audioTotalCount(Integer audioTotalCount) {
            this.audioTotalCount = audioTotalCount;
            return this;
        }

        /**
         * BucketList.
         */
        public Builder bucketList(java.util.List < BucketList> bucketList) {
            this.bucketList = bucketList;
            return this;
        }

        /**
         * FinishedTime.
         */
        public Builder finishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }

        /**
         * ImageAdCount.
         */
        public Builder imageAdCount(Integer imageAdCount) {
            this.imageAdCount = imageAdCount;
            return this;
        }

        /**
         * ImageLiveCount.
         */
        public Builder imageLiveCount(Integer imageLiveCount) {
            this.imageLiveCount = imageLiveCount;
            return this;
        }

        /**
         * ImagePornCount.
         */
        public Builder imagePornCount(Integer imagePornCount) {
            this.imagePornCount = imagePornCount;
            return this;
        }

        /**
         * ImageTerrorismCount.
         */
        public Builder imageTerrorismCount(Integer imageTerrorismCount) {
            this.imageTerrorismCount = imageTerrorismCount;
            return this;
        }

        /**
         * ImageTotalCount.
         */
        public Builder imageTotalCount(Integer imageTotalCount) {
            this.imageTotalCount = imageTotalCount;
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
         * ResouceTypeList.
         */
        public Builder resouceTypeList(java.util.List < String > resouceTypeList) {
            this.resouceTypeList = resouceTypeList;
            return this;
        }

        /**
         * SceneList.
         */
        public Builder sceneList(java.util.List < String > sceneList) {
            this.sceneList = sceneList;
            return this;
        }

        /**
         * StockStatus.
         */
        public Builder stockStatus(Integer stockStatus) {
            this.stockStatus = stockStatus;
            return this;
        }

        /**
         * VideoAdCount.
         */
        public Builder videoAdCount(Integer videoAdCount) {
            this.videoAdCount = videoAdCount;
            return this;
        }

        /**
         * VideoLiveCount.
         */
        public Builder videoLiveCount(Integer videoLiveCount) {
            this.videoLiveCount = videoLiveCount;
            return this;
        }

        /**
         * VideoPornCount.
         */
        public Builder videoPornCount(Integer videoPornCount) {
            this.videoPornCount = videoPornCount;
            return this;
        }

        /**
         * VideoTerrorismCount.
         */
        public Builder videoTerrorismCount(Integer videoTerrorismCount) {
            this.videoTerrorismCount = videoTerrorismCount;
            return this;
        }

        /**
         * VideoTotalCount.
         */
        public Builder videoTotalCount(Integer videoTotalCount) {
            this.videoTotalCount = videoTotalCount;
            return this;
        }

        /**
         * VideoVoiceAntispamCount.
         */
        public Builder videoVoiceAntispamCount(Integer videoVoiceAntispamCount) {
            this.videoVoiceAntispamCount = videoVoiceAntispamCount;
            return this;
        }

        public DescribeOssStockStatusResponseBody build() {
            return new DescribeOssStockStatusResponseBody(this);
        } 

    } 

    public static class BucketList extends TeaModel {
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("Prefixes")
        private java.util.List < String > prefixes;

        @NameInMap("Selected")
        private Boolean selected;

        private BucketList(Builder builder) {
            this.bucket = builder.bucket;
            this.prefixes = builder.prefixes;
            this.selected = builder.selected;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BucketList create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return prefixes
         */
        public java.util.List < String > getPrefixes() {
            return this.prefixes;
        }

        /**
         * @return selected
         */
        public Boolean getSelected() {
            return this.selected;
        }

        public static final class Builder {
            private String bucket; 
            private java.util.List < String > prefixes; 
            private Boolean selected; 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * Prefixes.
             */
            public Builder prefixes(java.util.List < String > prefixes) {
                this.prefixes = prefixes;
                return this;
            }

            /**
             * Selected.
             */
            public Builder selected(Boolean selected) {
                this.selected = selected;
                return this;
            }

            public BucketList build() {
                return new BucketList(this);
            } 

        } 

    }
}
