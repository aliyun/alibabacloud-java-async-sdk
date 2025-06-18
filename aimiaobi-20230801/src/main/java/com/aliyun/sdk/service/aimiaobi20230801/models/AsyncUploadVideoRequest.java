// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link AsyncUploadVideoRequest} extends {@link RequestModel}
 *
 * <p>AsyncUploadVideoRequest</p>
 */
public class AsyncUploadVideoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AnlysisPrompt")
    private String anlysisPrompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceVideos")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<SourceVideos> sourceVideos;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private AsyncUploadVideoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.anlysisPrompt = builder.anlysisPrompt;
        this.sourceVideos = builder.sourceVideos;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsyncUploadVideoRequest create() {
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
     * @return anlysisPrompt
     */
    public String getAnlysisPrompt() {
        return this.anlysisPrompt;
    }

    /**
     * @return sourceVideos
     */
    public java.util.List<SourceVideos> getSourceVideos() {
        return this.sourceVideos;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<AsyncUploadVideoRequest, Builder> {
        private String regionId; 
        private String anlysisPrompt; 
        private java.util.List<SourceVideos> sourceVideos; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(AsyncUploadVideoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.anlysisPrompt = request.anlysisPrompt;
            this.sourceVideos = request.sourceVideos;
            this.workspaceId = request.workspaceId;
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
         * AnlysisPrompt.
         */
        public Builder anlysisPrompt(String anlysisPrompt) {
            this.putBodyParameter("AnlysisPrompt", anlysisPrompt);
            this.anlysisPrompt = anlysisPrompt;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sourceVideos(java.util.List<SourceVideos> sourceVideos) {
            String sourceVideosShrink = shrink(sourceVideos, "SourceVideos", "json");
            this.putBodyParameter("SourceVideos", sourceVideosShrink);
            this.sourceVideos = sourceVideos;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public AsyncUploadVideoRequest build() {
            return new AsyncUploadVideoRequest(this);
        } 

    } 

    /**
     * 
     * {@link AsyncUploadVideoRequest} extends {@link TeaModel}
     *
     * <p>AsyncUploadVideoRequest</p>
     */
    public static class SourceVideos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VideoExtraInfo")
        private String videoExtraInfo;

        @com.aliyun.core.annotation.NameInMap("VideoName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String videoName;

        @com.aliyun.core.annotation.NameInMap("VideoUrl")
        @com.aliyun.core.annotation.Validation(required = true)
        private String videoUrl;

        private SourceVideos(Builder builder) {
            this.videoExtraInfo = builder.videoExtraInfo;
            this.videoName = builder.videoName;
            this.videoUrl = builder.videoUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceVideos create() {
            return builder().build();
        }

        /**
         * @return videoExtraInfo
         */
        public String getVideoExtraInfo() {
            return this.videoExtraInfo;
        }

        /**
         * @return videoName
         */
        public String getVideoName() {
            return this.videoName;
        }

        /**
         * @return videoUrl
         */
        public String getVideoUrl() {
            return this.videoUrl;
        }

        public static final class Builder {
            private String videoExtraInfo; 
            private String videoName; 
            private String videoUrl; 

            private Builder() {
            } 

            private Builder(SourceVideos model) {
                this.videoExtraInfo = model.videoExtraInfo;
                this.videoName = model.videoName;
                this.videoUrl = model.videoUrl;
            } 

            /**
             * VideoExtraInfo.
             */
            public Builder videoExtraInfo(String videoExtraInfo) {
                this.videoExtraInfo = videoExtraInfo;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123.mp4</p>
             */
            public Builder videoName(String videoName) {
                this.videoName = videoName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder videoUrl(String videoUrl) {
                this.videoUrl = videoUrl;
                return this;
            }

            public SourceVideos build() {
                return new SourceVideos(this);
            } 

        } 

    }
}
