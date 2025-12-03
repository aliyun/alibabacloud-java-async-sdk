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
         * ReferenceIds.
         */
        public Builder referenceIds(String referenceIds) {
            this.putQueryParameter("ReferenceIds", referenceIds);
            this.referenceIds = referenceIds;
            return this;
        }

        /**
         * <p>The list of video IDs. Separate multiple IDs with commas (,). A maximum of 20 IDs can be specified.</p>
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
