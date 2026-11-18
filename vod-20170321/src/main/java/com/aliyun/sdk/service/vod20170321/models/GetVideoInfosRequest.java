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
 * {@link GetVideoInfosRequest} extends {@link RequestModel}
 *
 * <p>GetVideoInfosRequest</p>
 */
public class GetVideoInfosRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReferenceIds")
    private String referenceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoIds")
    private String videoIds;

    private GetVideoInfosRequest(Builder builder) {
        super(builder);
        this.referenceIds = builder.referenceIds;
        this.videoIds = builder.videoIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoInfosRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return referenceIds
     */
    public String getReferenceIds() {
        return this.referenceIds;
    }

    /**
     * @return videoIds
     */
    public String getVideoIds() {
        return this.videoIds;
    }

    public static final class Builder extends Request.Builder<GetVideoInfosRequest, Builder> {
        private String referenceIds; 
        private String videoIds; 

        private Builder() {
            super();
        } 

        private Builder(GetVideoInfosRequest request) {
            super(request);
            this.referenceIds = request.referenceIds;
            this.videoIds = request.videoIds;
        } 

        /**
         * <p>The list of custom IDs. Separate multiple IDs with commas (,). You can specify a maximum of 20 IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>123-123,1234-1234</p>
         */
        public Builder referenceIds(String referenceIds) {
            this.putQueryParameter("ReferenceIds", referenceIds);
            this.referenceIds = referenceIds;
            return this;
        }

        /**
         * <p>The list of audio or video IDs. Separate multiple IDs with commas (,). You can specify a maximum of 20 IDs. You can obtain the audio or video ID by using the following methods:</p>
         * <ul>
         * <li>If the video is uploaded by using the ApsaraVideo VOD console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the audio or video ID.</li>
         * <li>Obtain the audio or video ID from the value of the VideoId response parameter when you call the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation to obtain the upload URL and credential.</li>
         * <li>After the audio or video file is uploaded, you can call the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation to query the audio or video ID, which is the value of the VideoId response parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7753d144efd8e649c6c45fe0579****,7753d144efd74d6c45fe0570****</p>
         */
        public Builder videoIds(String videoIds) {
            this.putQueryParameter("VideoIds", videoIds);
            this.videoIds = videoIds;
            return this;
        }

        @Override
        public GetVideoInfosRequest build() {
            return new GetVideoInfosRequest(this);
        } 

    } 

}
