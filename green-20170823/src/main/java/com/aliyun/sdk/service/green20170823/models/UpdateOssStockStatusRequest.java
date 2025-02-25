// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateOssStockStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateOssStockStatusRequest</p>
 */
public class UpdateOssStockStatusRequest extends Request {
    @Query
    @NameInMap("AudioAutoFreezeSceneList")
    private String audioAutoFreezeSceneList;

    @Query
    @NameInMap("AudioMaxSize")
    private Integer audioMaxSize;

    @Query
    @NameInMap("AutoFreezeType")
    private String autoFreezeType;

    @Query
    @NameInMap("BucketConfigList")
    private String bucketConfigList;

    @Query
    @NameInMap("EndDate")
    private String endDate;

    @Query
    @NameInMap("ImageAutoFreeze")
    private String imageAutoFreeze;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Operation")
    @Validation(required = true)
    private String operation;

    @Query
    @NameInMap("ResourceTypeList")
    private String resourceTypeList;

    @Query
    @NameInMap("SceneList")
    private String sceneList;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("StartDate")
    private String startDate;

    @Query
    @NameInMap("VideoAutoFreezeSceneList")
    private String videoAutoFreezeSceneList;

    @Query
    @NameInMap("VideoFrameInterval")
    private Integer videoFrameInterval;

    @Query
    @NameInMap("VideoMaxFrames")
    private Integer videoMaxFrames;

    @Query
    @NameInMap("VideoMaxSize")
    private Integer videoMaxSize;

    private UpdateOssStockStatusRequest(Builder builder) {
        super(builder);
        this.audioAutoFreezeSceneList = builder.audioAutoFreezeSceneList;
        this.audioMaxSize = builder.audioMaxSize;
        this.autoFreezeType = builder.autoFreezeType;
        this.bucketConfigList = builder.bucketConfigList;
        this.endDate = builder.endDate;
        this.imageAutoFreeze = builder.imageAutoFreeze;
        this.lang = builder.lang;
        this.operation = builder.operation;
        this.resourceTypeList = builder.resourceTypeList;
        this.sceneList = builder.sceneList;
        this.sourceIp = builder.sourceIp;
        this.startDate = builder.startDate;
        this.videoAutoFreezeSceneList = builder.videoAutoFreezeSceneList;
        this.videoFrameInterval = builder.videoFrameInterval;
        this.videoMaxFrames = builder.videoMaxFrames;
        this.videoMaxSize = builder.videoMaxSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOssStockStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audioAutoFreezeSceneList
     */
    public String getAudioAutoFreezeSceneList() {
        return this.audioAutoFreezeSceneList;
    }

    /**
     * @return audioMaxSize
     */
    public Integer getAudioMaxSize() {
        return this.audioMaxSize;
    }

    /**
     * @return autoFreezeType
     */
    public String getAutoFreezeType() {
        return this.autoFreezeType;
    }

    /**
     * @return bucketConfigList
     */
    public String getBucketConfigList() {
        return this.bucketConfigList;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return imageAutoFreeze
     */
    public String getImageAutoFreeze() {
        return this.imageAutoFreeze;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return resourceTypeList
     */
    public String getResourceTypeList() {
        return this.resourceTypeList;
    }

    /**
     * @return sceneList
     */
    public String getSceneList() {
        return this.sceneList;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return videoAutoFreezeSceneList
     */
    public String getVideoAutoFreezeSceneList() {
        return this.videoAutoFreezeSceneList;
    }

    /**
     * @return videoFrameInterval
     */
    public Integer getVideoFrameInterval() {
        return this.videoFrameInterval;
    }

    /**
     * @return videoMaxFrames
     */
    public Integer getVideoMaxFrames() {
        return this.videoMaxFrames;
    }

    /**
     * @return videoMaxSize
     */
    public Integer getVideoMaxSize() {
        return this.videoMaxSize;
    }

    public static final class Builder extends Request.Builder<UpdateOssStockStatusRequest, Builder> {
        private String audioAutoFreezeSceneList; 
        private Integer audioMaxSize; 
        private String autoFreezeType; 
        private String bucketConfigList; 
        private String endDate; 
        private String imageAutoFreeze; 
        private String lang; 
        private String operation; 
        private String resourceTypeList; 
        private String sceneList; 
        private String sourceIp; 
        private String startDate; 
        private String videoAutoFreezeSceneList; 
        private Integer videoFrameInterval; 
        private Integer videoMaxFrames; 
        private Integer videoMaxSize; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOssStockStatusRequest request) {
            super(request);
            this.audioAutoFreezeSceneList = request.audioAutoFreezeSceneList;
            this.audioMaxSize = request.audioMaxSize;
            this.autoFreezeType = request.autoFreezeType;
            this.bucketConfigList = request.bucketConfigList;
            this.endDate = request.endDate;
            this.imageAutoFreeze = request.imageAutoFreeze;
            this.lang = request.lang;
            this.operation = request.operation;
            this.resourceTypeList = request.resourceTypeList;
            this.sceneList = request.sceneList;
            this.sourceIp = request.sourceIp;
            this.startDate = request.startDate;
            this.videoAutoFreezeSceneList = request.videoAutoFreezeSceneList;
            this.videoFrameInterval = request.videoFrameInterval;
            this.videoMaxFrames = request.videoMaxFrames;
            this.videoMaxSize = request.videoMaxSize;
        } 

        /**
         * AudioAutoFreezeSceneList.
         */
        public Builder audioAutoFreezeSceneList(String audioAutoFreezeSceneList) {
            this.putQueryParameter("AudioAutoFreezeSceneList", audioAutoFreezeSceneList);
            this.audioAutoFreezeSceneList = audioAutoFreezeSceneList;
            return this;
        }

        /**
         * AudioMaxSize.
         */
        public Builder audioMaxSize(Integer audioMaxSize) {
            this.putQueryParameter("AudioMaxSize", audioMaxSize);
            this.audioMaxSize = audioMaxSize;
            return this;
        }

        /**
         * AutoFreezeType.
         */
        public Builder autoFreezeType(String autoFreezeType) {
            this.putQueryParameter("AutoFreezeType", autoFreezeType);
            this.autoFreezeType = autoFreezeType;
            return this;
        }

        /**
         * BucketConfigList.
         */
        public Builder bucketConfigList(String bucketConfigList) {
            this.putQueryParameter("BucketConfigList", bucketConfigList);
            this.bucketConfigList = bucketConfigList;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * ImageAutoFreeze.
         */
        public Builder imageAutoFreeze(String imageAutoFreeze) {
            this.putQueryParameter("ImageAutoFreeze", imageAutoFreeze);
            this.imageAutoFreeze = imageAutoFreeze;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Operation.
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * ResourceTypeList.
         */
        public Builder resourceTypeList(String resourceTypeList) {
            this.putQueryParameter("ResourceTypeList", resourceTypeList);
            this.resourceTypeList = resourceTypeList;
            return this;
        }

        /**
         * SceneList.
         */
        public Builder sceneList(String sceneList) {
            this.putQueryParameter("SceneList", sceneList);
            this.sceneList = sceneList;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * VideoAutoFreezeSceneList.
         */
        public Builder videoAutoFreezeSceneList(String videoAutoFreezeSceneList) {
            this.putQueryParameter("VideoAutoFreezeSceneList", videoAutoFreezeSceneList);
            this.videoAutoFreezeSceneList = videoAutoFreezeSceneList;
            return this;
        }

        /**
         * VideoFrameInterval.
         */
        public Builder videoFrameInterval(Integer videoFrameInterval) {
            this.putQueryParameter("VideoFrameInterval", videoFrameInterval);
            this.videoFrameInterval = videoFrameInterval;
            return this;
        }

        /**
         * VideoMaxFrames.
         */
        public Builder videoMaxFrames(Integer videoMaxFrames) {
            this.putQueryParameter("VideoMaxFrames", videoMaxFrames);
            this.videoMaxFrames = videoMaxFrames;
            return this;
        }

        /**
         * VideoMaxSize.
         */
        public Builder videoMaxSize(Integer videoMaxSize) {
            this.putQueryParameter("VideoMaxSize", videoMaxSize);
            this.videoMaxSize = videoMaxSize;
            return this;
        }

        @Override
        public UpdateOssStockStatusRequest build() {
            return new UpdateOssStockStatusRequest(this);
        } 

    } 

}
