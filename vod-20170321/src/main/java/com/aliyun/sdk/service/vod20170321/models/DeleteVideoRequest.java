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
 * {@link DeleteVideoRequest} extends {@link RequestModel}
 *
 * <p>DeleteVideoRequest</p>
 */
public class DeleteVideoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReferenceIds")
    private String referenceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoIds")
    private String videoIds;

    private DeleteVideoRequest(Builder builder) {
        super(builder);
        this.referenceIds = builder.referenceIds;
        this.videoIds = builder.videoIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVideoRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteVideoRequest, Builder> {
        private String referenceIds; 
        private String videoIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVideoRequest request) {
            super(request);
            this.referenceIds = request.referenceIds;
            this.videoIds = request.videoIds;
        } 

        /**
         * <p>The list of custom IDs. Separate multiple IDs with commas (,). A maximum of 20 IDs are supported.</p>
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
         * <p>The list of video IDs. Separate multiple IDs with commas (,). A maximum of 20 IDs are supported. You can obtain video IDs by using the following methods:</p>
         * <ul>
         * <li>For videos uploaded through the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the video ID.</li>
         * <li>When you upload a video by calling the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation, the video ID is the value of the VideoId parameter in the response.</li>
         * <li>After a video is uploaded, you can call the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation to query the video ID, which is the value of the VideoId parameter in the response.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>e44ebf1147hdsa2d2adbea8b****,e44ebf11oj984adbea8****,73ab850b4f6f4b6e91d24d81d54****</p>
         */
        public Builder videoIds(String videoIds) {
            this.putQueryParameter("VideoIds", videoIds);
            this.videoIds = videoIds;
            return this;
        }

        @Override
        public DeleteVideoRequest build() {
            return new DeleteVideoRequest(this);
        } 

    } 

}
