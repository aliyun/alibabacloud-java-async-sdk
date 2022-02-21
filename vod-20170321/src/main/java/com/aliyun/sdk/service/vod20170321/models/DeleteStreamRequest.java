// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteStreamRequest} extends {@link RequestModel}
 *
 * <p>DeleteStreamRequest</p>
 */
public class DeleteStreamRequest extends Request {
    @Query
    @NameInMap("JobIds")
    @Validation(required = true)
    private String jobIds;

    @Query
    @NameInMap("VideoId")
    @Validation(required = true)
    private String videoId;

    private DeleteStreamRequest(Builder builder) {
        super(builder);
        this.jobIds = builder.jobIds;
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
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<DeleteStreamRequest, Builder> {
        private String jobIds; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteStreamRequest response) {
            super(response);
            this.jobIds = response.jobIds;
            this.videoId = response.videoId;
        } 

        /**
         * JobIds.
         */
        public Builder jobIds(String jobIds) {
            this.putQueryParameter("JobIds", jobIds);
            this.jobIds = jobIds;
            return this;
        }

        /**
         * VideoId.
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
