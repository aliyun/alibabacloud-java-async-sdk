// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link SyncThirdUserMappingRequest} extends {@link RequestModel}
 *
 * <p>SyncThirdUserMappingRequest</p>
 */
public class SyncThirdUserMappingRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("third_channel_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String thirdChannelType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("third_user_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String thirdUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Integer status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>weCom</p>
         */
        public Builder thirdChannelType(String thirdChannelType) {
            this.putBodyParameter("third_channel_type", thirdChannelType);
            this.thirdChannelType = thirdChannelType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder thirdUserId(String thirdUserId) {
            this.putBodyParameter("third_user_id", thirdUserId);
            this.thirdUserId = thirdUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
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
