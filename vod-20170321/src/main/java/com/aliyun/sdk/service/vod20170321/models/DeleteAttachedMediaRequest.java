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
         * <p>The auxiliary media asset IDs.</p>
         * <ul>
         * <li>Separate multiple IDs with commas (,). A maximum of 20 IDs are supported.</li>
         * <li>The IDs are returned after you call the <a href="~~CreateUploadAttachedMedia~~">CreateUploadAttachedMedia</a> operation to obtain the upload URL and credential for auxiliary media assets.</li>
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
