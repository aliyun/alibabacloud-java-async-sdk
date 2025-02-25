// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InviteUserRequest} extends {@link RequestModel}
 *
 * <p>InviteUserRequest</p>
 */
public class InviteUserRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bid")
    private String bid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bizid")
    private String bizid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserEmail")
    private String userEmail;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserId")
    private Long userId;

    private InviteUserRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bid = builder.bid;
        this.bizid = builder.bizid;
        this.userEmail = builder.userEmail;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InviteUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bid
     */
    public String getBid() {
        return this.bid;
    }

    /**
     * @return bizid
     */
    public String getBizid() {
        return this.bizid;
    }

    /**
     * @return userEmail
     */
    public String getUserEmail() {
        return this.userEmail;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<InviteUserRequest, Builder> {
        private String regionId; 
        private String bid; 
        private String bizid; 
        private String userEmail; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(InviteUserRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bid = request.bid;
            this.bizid = request.bizid;
            this.userEmail = request.userEmail;
            this.userId = request.userId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Bid.
         */
        public Builder bid(String bid) {
            this.putBodyParameter("Bid", bid);
            this.bid = bid;
            return this;
        }

        /**
         * Bizid.
         */
        public Builder bizid(String bizid) {
            this.putBodyParameter("Bizid", bizid);
            this.bizid = bizid;
            return this;
        }

        /**
         * UserEmail.
         */
        public Builder userEmail(String userEmail) {
            this.putBodyParameter("UserEmail", userEmail);
            this.userEmail = userEmail;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(Long userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public InviteUserRequest build() {
            return new InviteUserRequest(this);
        } 

    } 

}
