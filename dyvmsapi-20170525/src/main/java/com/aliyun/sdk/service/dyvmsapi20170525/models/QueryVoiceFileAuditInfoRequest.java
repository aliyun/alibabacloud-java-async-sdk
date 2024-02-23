// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryVoiceFileAuditInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryVoiceFileAuditInfoRequest</p>
 */
public class QueryVoiceFileAuditInfoRequest extends Request {
    @Query
    @NameInMap("BusinessType")
    private Integer businessType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("VoiceCodes")
    @Validation(required = true)
    private String voiceCodes;

    private QueryVoiceFileAuditInfoRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.voiceCodes = builder.voiceCodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryVoiceFileAuditInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessType
     */
    public Integer getBusinessType() {
        return this.businessType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
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
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return voiceCodes
     */
    public String getVoiceCodes() {
        return this.voiceCodes;
    }

    public static final class Builder extends Request.Builder<QueryVoiceFileAuditInfoRequest, Builder> {
        private Integer businessType; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String voiceCodes; 

        private Builder() {
            super();
        } 

        private Builder(QueryVoiceFileAuditInfoRequest request) {
            super(request);
            this.businessType = request.businessType;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.voiceCodes = request.voiceCodes;
        } 

        /**
         * The type of the voice file. Valid values:
         * <p>
         * 
         * *   **0** (default): the voice notification file.
         * *   **2**: the recording file.
         */
        public Builder businessType(Integer businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
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
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the voice file. You can log on to the [Voice Messaging Service console](https://dyvms.console.aliyun.com/overview/home), choose **Voice Messages** > **Voice Notifications** or **Voice File Management**, and then click the **Voice Notification Files** tab to view the **voice ID**.
         * <p>
         * 
         * > You can query up to 10 voice files each time. Separate the voice file names with commas (,).
         */
        public Builder voiceCodes(String voiceCodes) {
            this.putQueryParameter("VoiceCodes", voiceCodes);
            this.voiceCodes = voiceCodes;
            return this;
        }

        @Override
        public QueryVoiceFileAuditInfoRequest build() {
            return new QueryVoiceFileAuditInfoRequest(this);
        } 

    } 

}
