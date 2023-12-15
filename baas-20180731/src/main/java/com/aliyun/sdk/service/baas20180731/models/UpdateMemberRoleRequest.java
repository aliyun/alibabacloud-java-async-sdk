// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMemberRoleRequest} extends {@link RequestModel}
 *
 * <p>UpdateMemberRoleRequest</p>
 */
public class UpdateMemberRoleRequest extends Request {
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
    @NameInMap("Role")
    private Integer role;

    @Body
    @NameInMap("UserId")
    private Long userId;

    private UpdateMemberRoleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bid = builder.bid;
        this.bizid = builder.bizid;
        this.role = builder.role;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMemberRoleRequest create() {
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
     * @return role
     */
    public Integer getRole() {
        return this.role;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<UpdateMemberRoleRequest, Builder> {
        private String regionId; 
        private String bid; 
        private String bizid; 
        private Integer role; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMemberRoleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bid = request.bid;
            this.bizid = request.bizid;
            this.role = request.role;
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
         * Role.
         */
        public Builder role(Integer role) {
            this.putBodyParameter("Role", role);
            this.role = role;
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
        public UpdateMemberRoleRequest build() {
            return new UpdateMemberRoleRequest(this);
        } 

    } 

}
