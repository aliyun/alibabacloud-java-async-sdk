// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMultipartUploadRequest} extends {@link RequestModel}
 *
 * <p>DeleteMultipartUploadRequest</p>
 */
public class DeleteMultipartUploadRequest extends Request {
    @Query
    @NameInMap("MediaId")
    @Validation(required = true)
    private String mediaId;

    @Query
    @NameInMap("MediaType")
    @Validation(required = true)
    private String mediaType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    private DeleteMultipartUploadRequest(Builder builder) {
        super(builder);
        this.mediaId = builder.mediaId;
        this.mediaType = builder.mediaType;
        this.ownerAccount = builder.ownerAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMultipartUploadRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return mediaType
     */
    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public static final class Builder extends Request.Builder<DeleteMultipartUploadRequest, Builder> {
        private String mediaId; 
        private String mediaType; 
        private String ownerAccount; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMultipartUploadRequest request) {
            super(request);
            this.mediaId = request.mediaId;
            this.mediaType = request.mediaType;
            this.ownerAccount = request.ownerAccount;
        } 

        /**
         * The ID of the media file, namely, the audio or video ID. You can use one of the following methods to obtain the audio or video ID:
         * <p>
         * * Log on to the [ApsaraVideo VOD](https://vod.console.aliyun.com) console. In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, you can view the audio or video ID. Use this method if the audio or video file is uploaded by using the ApsaraVideo VOD console.
         * * View the value of the VideoId parameter returned by the [CreateUploadVideo](~~55407~~) operation that you called to obtain an upload URL and credential.
         * * View the value of the VideoId parameter returned by the [SearchMedia](~~86044~~) operation that you called to query an audio or video ID after the audio or video file is uploaded.
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * The type of the media file. Set the value to **video**, which indicates audio and video files.
         */
        public Builder mediaType(String mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        @Override
        public DeleteMultipartUploadRequest build() {
            return new DeleteMultipartUploadRequest(this);
        } 

    } 

}
