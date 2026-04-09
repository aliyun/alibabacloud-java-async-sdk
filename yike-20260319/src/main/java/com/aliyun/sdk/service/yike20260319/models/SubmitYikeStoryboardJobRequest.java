// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260319.models;

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
 * {@link SubmitYikeStoryboardJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitYikeStoryboardJobRequest</p>
 */
public class SubmitYikeStoryboardJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AspectRatio")
    private String aspectRatio;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecMode")
    private String execMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileURL")
    private String fileURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelParams")
    private String modelParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NarrationVoiceId")
    private String narrationVoiceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resolution")
    private String resolution;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShotPromptMode")
    private String shotPromptMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShotSplitMode")
    private String shotSplitMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkipFailureShot")
    private Boolean skipFailureShot;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StyleId")
    private String styleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoModel")
    private String videoModel;

    private SubmitYikeStoryboardJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.aspectRatio = builder.aspectRatio;
        this.execMode = builder.execMode;
        this.fileURL = builder.fileURL;
        this.modelParams = builder.modelParams;
        this.narrationVoiceId = builder.narrationVoiceId;
        this.resolution = builder.resolution;
        this.shotPromptMode = builder.shotPromptMode;
        this.shotSplitMode = builder.shotSplitMode;
        this.skipFailureShot = builder.skipFailureShot;
        this.sourceType = builder.sourceType;
        this.styleId = builder.styleId;
        this.title = builder.title;
        this.userData = builder.userData;
        this.videoModel = builder.videoModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitYikeStoryboardJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return aspectRatio
     */
    public String getAspectRatio() {
        return this.aspectRatio;
    }

    /**
     * @return execMode
     */
    public String getExecMode() {
        return this.execMode;
    }

    /**
     * @return fileURL
     */
    public String getFileURL() {
        return this.fileURL;
    }

    /**
     * @return modelParams
     */
    public String getModelParams() {
        return this.modelParams;
    }

    /**
     * @return narrationVoiceId
     */
    public String getNarrationVoiceId() {
        return this.narrationVoiceId;
    }

    /**
     * @return resolution
     */
    public String getResolution() {
        return this.resolution;
    }

    /**
     * @return shotPromptMode
     */
    public String getShotPromptMode() {
        return this.shotPromptMode;
    }

    /**
     * @return shotSplitMode
     */
    public String getShotSplitMode() {
        return this.shotSplitMode;
    }

    /**
     * @return skipFailureShot
     */
    public Boolean getSkipFailureShot() {
        return this.skipFailureShot;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return styleId
     */
    public String getStyleId() {
        return this.styleId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return videoModel
     */
    public String getVideoModel() {
        return this.videoModel;
    }

    public static final class Builder extends Request.Builder<SubmitYikeStoryboardJobRequest, Builder> {
        private String regionId; 
        private String aspectRatio; 
        private String execMode; 
        private String fileURL; 
        private String modelParams; 
        private String narrationVoiceId; 
        private String resolution; 
        private String shotPromptMode; 
        private String shotSplitMode; 
        private Boolean skipFailureShot; 
        private String sourceType; 
        private String styleId; 
        private String title; 
        private String userData; 
        private String videoModel; 

        private Builder() {
            super();
        } 

        private Builder(SubmitYikeStoryboardJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.aspectRatio = request.aspectRatio;
            this.execMode = request.execMode;
            this.fileURL = request.fileURL;
            this.modelParams = request.modelParams;
            this.narrationVoiceId = request.narrationVoiceId;
            this.resolution = request.resolution;
            this.shotPromptMode = request.shotPromptMode;
            this.shotSplitMode = request.shotSplitMode;
            this.skipFailureShot = request.skipFailureShot;
            this.sourceType = request.sourceType;
            this.styleId = request.styleId;
            this.title = request.title;
            this.userData = request.userData;
            this.videoModel = request.videoModel;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AspectRatio.
         */
        public Builder aspectRatio(String aspectRatio) {
            this.putQueryParameter("AspectRatio", aspectRatio);
            this.aspectRatio = aspectRatio;
            return this;
        }

        /**
         * ExecMode.
         */
        public Builder execMode(String execMode) {
            this.putQueryParameter("ExecMode", execMode);
            this.execMode = execMode;
            return this;
        }

        /**
         * FileURL.
         */
        public Builder fileURL(String fileURL) {
            this.putBodyParameter("FileURL", fileURL);
            this.fileURL = fileURL;
            return this;
        }

        /**
         * ModelParams.
         */
        public Builder modelParams(String modelParams) {
            this.putQueryParameter("ModelParams", modelParams);
            this.modelParams = modelParams;
            return this;
        }

        /**
         * NarrationVoiceId.
         */
        public Builder narrationVoiceId(String narrationVoiceId) {
            this.putQueryParameter("NarrationVoiceId", narrationVoiceId);
            this.narrationVoiceId = narrationVoiceId;
            return this;
        }

        /**
         * Resolution.
         */
        public Builder resolution(String resolution) {
            this.putQueryParameter("Resolution", resolution);
            this.resolution = resolution;
            return this;
        }

        /**
         * ShotPromptMode.
         */
        public Builder shotPromptMode(String shotPromptMode) {
            this.putQueryParameter("ShotPromptMode", shotPromptMode);
            this.shotPromptMode = shotPromptMode;
            return this;
        }

        /**
         * ShotSplitMode.
         */
        public Builder shotSplitMode(String shotSplitMode) {
            this.putBodyParameter("ShotSplitMode", shotSplitMode);
            this.shotSplitMode = shotSplitMode;
            return this;
        }

        /**
         * SkipFailureShot.
         */
        public Builder skipFailureShot(Boolean skipFailureShot) {
            this.putQueryParameter("SkipFailureShot", skipFailureShot);
            this.skipFailureShot = skipFailureShot;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putBodyParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * StyleId.
         */
        public Builder styleId(String styleId) {
            this.putBodyParameter("StyleId", styleId);
            this.styleId = styleId;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * VideoModel.
         */
        public Builder videoModel(String videoModel) {
            this.putQueryParameter("VideoModel", videoModel);
            this.videoModel = videoModel;
            return this;
        }

        @Override
        public SubmitYikeStoryboardJobRequest build() {
            return new SubmitYikeStoryboardJobRequest(this);
        } 

    } 

}
