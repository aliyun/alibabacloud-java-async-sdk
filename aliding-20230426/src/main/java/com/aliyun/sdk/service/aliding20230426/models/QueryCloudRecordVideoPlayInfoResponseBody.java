// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link QueryCloudRecordVideoPlayInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCloudRecordVideoPlayInfoResponseBody</p>
 */
public class QueryCloudRecordVideoPlayInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("duration")
    private Long duration;

    @com.aliyun.core.annotation.NameInMap("fileSize")
    private Long fileSize;

    @com.aliyun.core.annotation.NameInMap("mp4FileUrl")
    private String mp4FileUrl;

    @com.aliyun.core.annotation.NameInMap("playUrl")
    private String playUrl;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private Long status;

    private QueryCloudRecordVideoPlayInfoResponseBody(Builder builder) {
        this.duration = builder.duration;
        this.fileSize = builder.fileSize;
        this.mp4FileUrl = builder.mp4FileUrl;
        this.playUrl = builder.playUrl;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCloudRecordVideoPlayInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return duration
     */
    public Long getDuration() {
        return this.duration;
    }

    /**
     * @return fileSize
     */
    public Long getFileSize() {
        return this.fileSize;
    }

    /**
     * @return mp4FileUrl
     */
    public String getMp4FileUrl() {
        return this.mp4FileUrl;
    }

    /**
     * @return playUrl
     */
    public String getPlayUrl() {
        return this.playUrl;
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
    public Long getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Long duration; 
        private Long fileSize; 
        private String mp4FileUrl; 
        private String playUrl; 
        private String requestId; 
        private Long status; 

        /**
         * duration.
         */
        public Builder duration(Long duration) {
            this.duration = duration;
            return this;
        }

        /**
         * fileSize.
         */
        public Builder fileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        /**
         * mp4FileUrl.
         */
        public Builder mp4FileUrl(String mp4FileUrl) {
            this.mp4FileUrl = mp4FileUrl;
            return this;
        }

        /**
         * playUrl.
         */
        public Builder playUrl(String playUrl) {
            this.playUrl = playUrl;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Long status) {
            this.status = status;
            return this;
        }

        public QueryCloudRecordVideoPlayInfoResponseBody build() {
            return new QueryCloudRecordVideoPlayInfoResponseBody(this);
        } 

    } 

}
