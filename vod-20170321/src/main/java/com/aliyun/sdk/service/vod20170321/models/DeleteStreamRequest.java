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
         * <p>The job IDs for deleting media streams.</p>
         * <ul>
         * <li>Separate multiple IDs with commas (,). A maximum of 20 IDs can be specified for one video.</li>
         * <li>You can obtain job IDs from the PlayInfo parameter that is returned after you call the <a href="https://help.aliyun.com/document_detail/56124.html">GetPlayInfo</a> operation. Each media stream has a unique job ID.</li>
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
         * ReferenceId.
         */
        public Builder referenceId(String referenceId) {
            this.putQueryParameter("ReferenceId", referenceId);
            this.referenceId = referenceId;
            return this;
        }

        /**
         * <p>The ID of the video.</p>
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
