// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDigitalWatermarkExtractResultRequest} extends {@link RequestModel}
 *
 * <p>GetDigitalWatermarkExtractResultRequest</p>
 */
public class GetDigitalWatermarkExtractResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtractType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String extractType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private String resourceOwnerId;

    private GetDigitalWatermarkExtractResultRequest(Builder builder) {
        super(builder);
        this.extractType = builder.extractType;
        this.jobId = builder.jobId;
        this.mediaId = builder.mediaId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDigitalWatermarkExtractResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extractType
     */
    public String getExtractType() {
        return this.extractType;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<GetDigitalWatermarkExtractResultRequest, Builder> {
        private String extractType; 
        private String jobId; 
        private String mediaId; 
        private String ownerAccount; 
        private String ownerId; 
        private String resourceOwnerAccount; 
        private String resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(GetDigitalWatermarkExtractResultRequest request) {
            super(request);
            this.extractType = request.extractType;
            this.jobId = request.jobId;
            this.mediaId = request.mediaId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The type of the watermark. Valid values:
         * <p>
         * 
         * *   **TraceMark**: user-tracing watermark
         * *   **CopyrightMark**: copyright watermark
         */
        public Builder extractType(String extractType) {
            this.putQueryParameter("ExtractType", extractType);
            this.extractType = extractType;
            return this;
        }

        /**
         * The ID of the watermark extraction job.
         * <p>
         * 
         * *   You can obtain the ID from the response to the [SubmitDigitalWatermarkExtractJob](~~SubmitDigitalWatermarkExtractJob~~) operation.
         * *   If you specify this parameter, the result of the specified watermark extraction job is returned. If you leave this parameter empty, the results of all watermark extraction jobs submitted for the video are returned.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * The ID of the video from which you want to query the watermark content. You can specify only one ID. You can use one of the following methods to obtain the ID:
         * <p>
         * 
         * *   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Media Files** > **Audio/Video** to view the video ID.
         * *   Obtain the VideoId from the response to the [SearchMedia](~~SearchMedia~~) operation.
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
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

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(String resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public GetDigitalWatermarkExtractResultRequest build() {
            return new GetDigitalWatermarkExtractResultRequest(this);
        } 

    } 

}
