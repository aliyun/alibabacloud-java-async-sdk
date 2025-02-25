// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryVoiceFileAuditInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryVoiceFileAuditInfoRequest</p>
 */
public class QueryVoiceFileAuditInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private Integer businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VoiceCodes")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The type of the voice file. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> (default): the voice notification file.</li>
         * <li><strong>2</strong>: the recording file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>The ID of the voice file. You can log on to the <a href="https://dyvms.console.aliyun.com/overview/home">Voice Messaging Service console</a>, choose <strong>Voice Messages</strong> &gt; <strong>Voice Notifications</strong> or <strong>Voice File Management</strong>, and then click the <strong>Voice Notification Files</strong> tab to view the <strong>voice ID</strong>.</p>
         * <blockquote>
         * <p>You can query up to 10 voice files each time. Separate the voice file names with commas (,).</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8501d2eb-efbb-471f-xxx8-****.wav</p>
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
