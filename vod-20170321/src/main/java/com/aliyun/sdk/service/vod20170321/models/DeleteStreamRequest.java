// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DeleteStreamRequest} extends {@link RequestModel}
 *
 * <p>DeleteStreamRequest</p>
 */
public class DeleteStreamRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReferenceId")
    private String referenceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoId")
    private String videoId;

    private DeleteStreamRequest(Builder builder) {
        super(builder);
        this.jobIds = builder.jobIds;
        this.referenceId = builder.referenceId;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteStreamRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobIds
     */
    public String getJobIds() {
        return this.jobIds;
    }

    /**
     * @return referenceId
     */
    public String getReferenceId() {
        return this.referenceId;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<DeleteStreamRequest, Builder> {
        private String jobIds; 
        private String referenceId; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteStreamRequest request) {
            super(request);
            this.jobIds = request.jobIds;
            this.referenceId = request.referenceId;
            this.videoId = request.videoId;
        } 

        /**
         * <p>The list of job IDs for media stream transcoding, which consists of one or more job IDs.</p>
         * <ul>
         * <li>Separate multiple IDs with commas (,). A maximum of 20 job IDs under the same video are supported.</li>
         * <li>You can obtain the JobId from the PlayInfo struct returned by the <a href="https://help.aliyun.com/document_detail/56124.html">GetPlayInfo</a> operation. Each media stream has a different JobId.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>35eb4dbda18c49cc0025df374b46****</p>
         */
        public Builder jobIds(String jobIds) {
            this.putQueryParameter("JobIds", jobIds);
            this.jobIds = jobIds;
            return this;
        }

        /**
         * <p>The custom ID. Only lowercase letters, uppercase letters, digits, hyphens (-), and underscores (_) are supported. The value must be 6 to 64 characters in length. The value is unique per user.</p>
         * 
         * <strong>example:</strong>
         * <p>123-123</p>
         */
        public Builder referenceId(String referenceId) {
            this.putQueryParameter("ReferenceId", referenceId);
            this.referenceId = referenceId;
            return this;
        }

        /**
         * <p>The video ID. You can obtain the video ID by using one of the following methods:</p>
         * <ul>
         * <li>For videos uploaded by using the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the video ID.</li>
         * <li>When you upload a video by calling the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation, the video ID is the value of the VideoId parameter in the response.</li>
         * <li>After a video is uploaded, you can call the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation to query the video ID, which is the value of the VideoId parameter in the response.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>95948ddba24446b6aed5db985e78****</p>
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        @Override
        public DeleteStreamRequest build() {
            return new DeleteStreamRequest(this);
        } 

    } 

}
