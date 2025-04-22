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

    private BatchGetMediaInfosRequest(Builder builder) {
        super(builder);
        this.mediaIds = builder.mediaIds;
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

    public static final class Builder extends Request.Builder<BatchGetMediaInfosRequest, Builder> {
        private String mediaIds; 

        private Builder() {
            super();
        } 

        private Builder(BatchGetMediaInfosRequest request) {
            super(request);
            this.mediaIds = request.mediaIds;
        } 

        /**
         * <p>The ID of the media asset. The ID can be the video ID or audio ID. Separate IDs with commas (,). You can specify a maximum of 20 IDs. You can use one of the following methods to obtain the ID of the media asset:</p>
         * <ul>
         * <li>Log on to the ApsaraVideo VOD console. In the left-side navigation pane, choose Media Files &gt; Audio/Video. On the Video and Audio page, view the ID of the media asset. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.</li>
         * <li>Obtain the value of VideoId from the response to the CreateUploadVideo operation that you call to upload media assets.</li>
         * <li>Obtain the value of VideoId from the response to the SearchMedia operation that you call to query the media ID after the media asset is uploaded.</li>
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

        @Override
        public BatchGetMediaInfosRequest build() {
            return new BatchGetMediaInfosRequest(this);
        } 

    } 

}
