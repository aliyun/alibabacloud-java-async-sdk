// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RejectUserRequest} extends {@link RequestModel}
 *
 * <p>RejectUserRequest</p>
 */
public class RejectUserRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Bid")
    private String bid;

    @Body
    @NameInMap("Bizid")
    private String bizid;

    @Body
    @NameInMap("Reason")
    private String reason;

    @Body
    @NameInMap("UserName")
    private String userName;

    private RejectUserRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bid = builder.bid;
        this.bizid = builder.bizid;
        this.reason = builder.reason;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RejectUserRequest create() {
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
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<RejectUserRequest, Builder> {
        private String regionId; 
        private String bid; 
        private String bizid; 
        private String reason; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(RejectUserRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bid = request.bid;
            this.bizid = request.bizid;
            this.reason = request.reason;
            this.userName = request.userName;
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
         * Reason.
         */
        public Builder reason(String reason) {
            this.putBodyParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public RejectUserRequest build() {
            return new RejectUserRequest(this);
        } 

    } 

}
