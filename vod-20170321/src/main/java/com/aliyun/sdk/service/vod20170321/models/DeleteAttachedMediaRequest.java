// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteAttachedMediaRequest} extends {@link RequestModel}
 *
 * <p>DeleteAttachedMediaRequest</p>
 */
public class DeleteAttachedMediaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaIds;

    private DeleteAttachedMediaRequest(Builder builder) {
        super(builder);
        this.mediaIds = builder.mediaIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAttachedMediaRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteAttachedMediaRequest, Builder> {
        private String mediaIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAttachedMediaRequest request) {
            super(request);
            this.mediaIds = request.mediaIds;
        } 

        /**
         * <p>The ID of the auxiliary media asset that you want to delete.</p>
         * <ul>
         * <li>Separate multiple IDs with commas (,). You can specify up to 20 IDs.</li>
         * <li>You can obtain the ID from the response to the <a href="~~CreateUploadAttachedMedia~~">CreateUploadAttachedMedia</a> operation that you call to obtain the upload URL and credential.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8bc8e94fe4e55abde85718****,eb186180e989dd56****</p>
         */
        public Builder mediaIds(String mediaIds) {
            this.putQueryParameter("MediaIds", mediaIds);
            this.mediaIds = mediaIds;
            return this;
        }

        @Override
        public DeleteAttachedMediaRequest build() {
            return new DeleteAttachedMediaRequest(this);
        } 

    } 

}
