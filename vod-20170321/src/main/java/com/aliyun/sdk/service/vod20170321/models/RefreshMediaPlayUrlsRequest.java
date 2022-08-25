// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshMediaPlayUrlsRequest} extends {@link RequestModel}
 *
 * <p>RefreshMediaPlayUrlsRequest</p>
 */
public class RefreshMediaPlayUrlsRequest extends Request {
    @Query
    @NameInMap("Definitions")
    private String definitions;

    @Query
    @NameInMap("Formats")
    private String formats;

    @Query
    @NameInMap("MediaIds")
    @Validation(required = true)
    private String mediaIds;

    @Query
    @NameInMap("ResultType")
    private String resultType;

    @Query
    @NameInMap("SliceCount")
    private Integer sliceCount;

    @Query
    @NameInMap("SliceFlag")
    private Boolean sliceFlag;

    @Query
    @NameInMap("StreamType")
    private String streamType;

    @Query
    @NameInMap("TaskType")
    @Validation(required = true)
    private String taskType;

    @Query
    @NameInMap("UserData")
    private String userData;

    private RefreshMediaPlayUrlsRequest(Builder builder) {
        super(builder);
        this.definitions = builder.definitions;
        this.formats = builder.formats;
        this.mediaIds = builder.mediaIds;
        this.resultType = builder.resultType;
        this.sliceCount = builder.sliceCount;
        this.sliceFlag = builder.sliceFlag;
        this.streamType = builder.streamType;
        this.taskType = builder.taskType;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshMediaPlayUrlsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return definitions
     */
    public String getDefinitions() {
        return this.definitions;
    }

    /**
     * @return formats
     */
    public String getFormats() {
        return this.formats;
    }

    /**
     * @return mediaIds
     */
    public String getMediaIds() {
        return this.mediaIds;
    }

    /**
     * @return resultType
     */
    public String getResultType() {
        return this.resultType;
    }

    /**
     * @return sliceCount
     */
    public Integer getSliceCount() {
        return this.sliceCount;
    }

    /**
     * @return sliceFlag
     */
    public Boolean getSliceFlag() {
        return this.sliceFlag;
    }

    /**
     * @return streamType
     */
    public String getStreamType() {
        return this.streamType;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<RefreshMediaPlayUrlsRequest, Builder> {
        private String definitions; 
        private String formats; 
        private String mediaIds; 
        private String resultType; 
        private Integer sliceCount; 
        private Boolean sliceFlag; 
        private String streamType; 
        private String taskType; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(RefreshMediaPlayUrlsRequest request) {
            super(request);
            this.definitions = request.definitions;
            this.formats = request.formats;
            this.mediaIds = request.mediaIds;
            this.resultType = request.resultType;
            this.sliceCount = request.sliceCount;
            this.sliceFlag = request.sliceFlag;
            this.streamType = request.streamType;
            this.taskType = request.taskType;
            this.userData = request.userData;
        } 

        /**
         * 播放流清晰度
         */
        public Builder definitions(String definitions) {
            this.putQueryParameter("Definitions", definitions);
            this.definitions = definitions;
            return this;
        }

        /**
         * 播放流格式
         */
        public Builder formats(String formats) {
            this.putQueryParameter("Formats", formats);
            this.formats = formats;
            return this;
        }

        /**
         * 媒资ID列表
         */
        public Builder mediaIds(String mediaIds) {
            this.putQueryParameter("MediaIds", mediaIds);
            this.mediaIds = mediaIds;
            return this;
        }

        /**
         * 结果类型：Single或Multiple
         */
        public Builder resultType(String resultType) {
            this.putQueryParameter("ResultType", resultType);
            this.resultType = resultType;
            return this;
        }

        /**
         * M3U8文件的ts链接数量
         */
        public Builder sliceCount(Integer sliceCount) {
            this.putQueryParameter("SliceCount", sliceCount);
            this.sliceCount = sliceCount;
            return this;
        }

        /**
         * M3U8文件是否获取ts链接
         */
        public Builder sliceFlag(Boolean sliceFlag) {
            this.putQueryParameter("SliceFlag", sliceFlag);
            this.sliceFlag = sliceFlag;
            return this;
        }

        /**
         * 播放流类型：视频或音频
         */
        public Builder streamType(String streamType) {
            this.putQueryParameter("StreamType", streamType);
            this.streamType = streamType;
            return this;
        }

        /**
         * Refresh: 刷新。Preload: 预热
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * 回调设置
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public RefreshMediaPlayUrlsRequest build() {
            return new RefreshMediaPlayUrlsRequest(this);
        } 

    } 

}
