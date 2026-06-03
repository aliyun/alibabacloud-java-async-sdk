// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypns20170620.models;

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
 * {@link UpdateSmsCodeLimitConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateSmsCodeLimitConfigRequest</p>
 */
public class UpdateSmsCodeLimitConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LimitDay")
    @com.aliyun.core.annotation.Validation(maximum = 40)
    private Integer limitDay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LimitHour")
    @com.aliyun.core.annotation.Validation(maximum = 40)
    private Integer limitHour;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LimitId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long limitId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LimitMinute")
    @com.aliyun.core.annotation.Validation(maximum = 40)
    private Integer limitMinute;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LimitOther")
    private String limitOther;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private UpdateSmsCodeLimitConfigRequest(Builder builder) {
        super(builder);
        this.limitDay = builder.limitDay;
        this.limitHour = builder.limitHour;
        this.limitId = builder.limitId;
        this.limitMinute = builder.limitMinute;
        this.limitOther = builder.limitOther;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSmsCodeLimitConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return limitDay
     */
    public Integer getLimitDay() {
        return this.limitDay;
    }

    /**
     * @return limitHour
     */
    public Integer getLimitHour() {
        return this.limitHour;
    }

    /**
     * @return limitId
     */
    public Long getLimitId() {
        return this.limitId;
    }

    /**
     * @return limitMinute
     */
    public Integer getLimitMinute() {
        return this.limitMinute;
    }

    /**
     * @return limitOther
     */
    public String getLimitOther() {
        return this.limitOther;
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

    public static final class Builder extends Request.Builder<UpdateSmsCodeLimitConfigRequest, Builder> {
        private Integer limitDay; 
        private Integer limitHour; 
        private Long limitId; 
        private Integer limitMinute; 
        private String limitOther; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSmsCodeLimitConfigRequest request) {
            super(request);
            this.limitDay = request.limitDay;
            this.limitHour = request.limitHour;
            this.limitId = request.limitId;
            this.limitMinute = request.limitMinute;
            this.limitOther = request.limitOther;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * LimitDay.
         */
        public Builder limitDay(Integer limitDay) {
            this.putQueryParameter("LimitDay", limitDay);
            this.limitDay = limitDay;
            return this;
        }

        /**
         * LimitHour.
         */
        public Builder limitHour(Integer limitHour) {
            this.putQueryParameter("LimitHour", limitHour);
            this.limitHour = limitHour;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder limitId(Long limitId) {
            this.putQueryParameter("LimitId", limitId);
            this.limitId = limitId;
            return this;
        }

        /**
         * LimitMinute.
         */
        public Builder limitMinute(Integer limitMinute) {
            this.putQueryParameter("LimitMinute", limitMinute);
            this.limitMinute = limitMinute;
            return this;
        }

        /**
         * LimitOther.
         */
        public Builder limitOther(String limitOther) {
            this.putQueryParameter("LimitOther", limitOther);
            this.limitOther = limitOther;
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

        @Override
        public UpdateSmsCodeLimitConfigRequest build() {
            return new UpdateSmsCodeLimitConfigRequest(this);
        } 

    } 

}
