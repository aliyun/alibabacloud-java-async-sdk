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
 * {@link BatchGetMediaInfosRequest} extends {@link RequestModel}
 *
 * <p>BatchGetMediaInfosRequest</p>
 */
public class BatchGetMediaInfosRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReferenceIds")
    private String referenceIds;

    private BatchGetMediaInfosRequest(Builder builder) {
        super(builder);
        this.mediaIds = builder.mediaIds;
        this.referenceIds = builder.referenceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetMediaInfosRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mediaIds
     */
    public String getMediaIds() {
        return this.mediaIds;
    }

    /**
     * @return referenceIds
     */
    public String getReferenceIds() {
        return this.referenceIds;
    }

    public static final class Builder extends Request.Builder<BatchGetMediaInfosRequest, Builder> {
        private String mediaIds; 
        private String referenceIds; 

        private Builder() {
            super();
        } 

        private Builder(BatchGetMediaInfosRequest request) {
            super(request);
            this.mediaIds = request.mediaIds;
            this.referenceIds = request.referenceIds;
        } 

        /**
         * <p>The media asset IDs, namely the audio or video IDs (VideoId). Separate multiple IDs with commas (,). A maximum of 20 IDs are supported. You can obtain the IDs by using one of the following methods:</p>
         * <ul>
         * <li>For audio or video files uploaded through the console, log on to the ApsaraVideo VOD console and choose Media Library &gt; Audio/Video to view the audio or video IDs.</li>
         * <li>When you call the operation to obtain the upload URL and credential for an audio or video file, the ID is the value of the VideoId response parameter.</li>
         * <li>After an audio or video file is uploaded, you can call the operation to search for media asset information. The ID is the value of the VideoId response parameter.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>61ccbdb06fa83012be4d8083f6****,7d2fbc380b0e08e55f****</p>
         */
        public Builder mediaIds(String mediaIds) {
            this.putQueryParameter("MediaIds", mediaIds);
            this.mediaIds = mediaIds;
            return this;
        }

        /**
         * <p>The custom ID list. It consists of one or more custom IDs. Separate multiple IDs with commas (,). A maximum of 20 IDs are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>123-123,1234-1234</p>
         */
        public Builder referenceIds(String referenceIds) {
            this.putQueryParameter("ReferenceIds", referenceIds);
            this.referenceIds = referenceIds;
            return this;
        }

        @Override
        public BatchGetMediaInfosRequest build() {
            return new BatchGetMediaInfosRequest(this);
        } 

    } 

}
