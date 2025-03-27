// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link GetProjectTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetProjectTaskResponseBody</p>
 */
public class GetProjectTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("videoDownloadUrl")
    private String videoDownloadUrl;

    @com.aliyun.core.annotation.NameInMap("videoDuration")
    private Integer videoDuration;

    @com.aliyun.core.annotation.NameInMap("videoUrl")
    private String videoUrl;

    private GetProjectTaskResponseBody(Builder builder) {
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.videoDownloadUrl = builder.videoDownloadUrl;
        this.videoDuration = builder.videoDuration;
        this.videoUrl = builder.videoUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return videoDownloadUrl
     */
    public String getVideoDownloadUrl() {
        return this.videoDownloadUrl;
    }

    /**
     * @return videoDuration
     */
    public Integer getVideoDuration() {
        return this.videoDuration;
    }

    /**
     * @return videoUrl
     */
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public static final class Builder {
        private String errorMsg; 
        private String requestId; 
        private String status; 
        private String videoDownloadUrl; 
        private Integer videoDuration; 
        private String videoUrl; 

        private Builder() {
        } 

        private Builder(GetProjectTaskResponseBody model) {
            this.errorMsg = model.errorMsg;
            this.requestId = model.requestId;
            this.status = model.status;
            this.videoDownloadUrl = model.videoDownloadUrl;
            this.videoDuration = model.videoDuration;
            this.videoUrl = model.videoUrl;
        } 

        /**
         * errorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * videoDownloadUrl.
         */
        public Builder videoDownloadUrl(String videoDownloadUrl) {
            this.videoDownloadUrl = videoDownloadUrl;
            return this;
        }

        /**
         * videoDuration.
         */
        public Builder videoDuration(Integer videoDuration) {
            this.videoDuration = videoDuration;
            return this;
        }

        /**
         * videoUrl.
         */
        public Builder videoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }

        public GetProjectTaskResponseBody build() {
            return new GetProjectTaskResponseBody(this);
        } 

    } 

}
