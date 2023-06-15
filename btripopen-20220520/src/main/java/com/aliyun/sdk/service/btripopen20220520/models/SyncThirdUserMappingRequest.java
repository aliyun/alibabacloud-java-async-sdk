// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncThirdUserMappingRequest} extends {@link RequestModel}
 *
 * <p>SyncThirdUserMappingRequest</p>
 */
public class SyncThirdUserMappingRequest extends Request {
    @Body
    @NameInMap("status")
    @Validation(required = true)
    private Integer status;

    @Body
    @NameInMap("third_channel_type")
    @Validation(required = true)
    private String thirdChannelType;

    @Body
    @NameInMap("third_user_id")
    @Validation(required = true)
    private String thirdUserId;

    @Body
    @NameInMap("user_id")
    @Validation(required = true)
    private String userId;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private SyncThirdUserMappingRequest(Builder builder) {
        super(builder);
        this.status = builder.status;
        this.thirdChannelType = builder.thirdChannelType;
        this.thirdUserId = builder.thirdUserId;
        this.userId = builder.userId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncThirdUserMappingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return thirdChannelType
     */
    public String getThirdChannelType() {
        return this.thirdChannelType;
    }

    /**
     * @return thirdUserId
     */
    public String getThirdUserId() {
        return this.thirdUserId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<SyncThirdUserMappingRequest, Builder> {
        private Integer status; 
        private String thirdChannelType; 
        private String thirdUserId; 
        private String userId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(SyncThirdUserMappingRequest request) {
            super(request);
            this.status = request.status;
            this.thirdChannelType = request.thirdChannelType;
            this.thirdUserId = request.thirdUserId;
            this.userId = request.userId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * status.
         */
        public Builder status(Integer status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * third_channel_type.
         */
        public Builder thirdChannelType(String thirdChannelType) {
            this.putBodyParameter("third_channel_type", thirdChannelType);
            this.thirdChannelType = thirdChannelType;
            return this;
        }

        /**
         * third_user_id.
         */
        public Builder thirdUserId(String thirdUserId) {
            this.putBodyParameter("third_user_id", thirdUserId);
            this.thirdUserId = thirdUserId;
            return this;
        }

        /**
         * user_id.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public SyncThirdUserMappingRequest build() {
            return new SyncThirdUserMappingRequest(this);
        } 

    } 

}
