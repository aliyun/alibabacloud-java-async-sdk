// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeCoordinatePrivilegeRequest} extends {@link RequestModel}
 *
 * <p>RevokeCoordinatePrivilegeRequest</p>
 */
public class RevokeCoordinatePrivilegeRequest extends Request {
    @Query
    @NameInMap("CoId")
    @Validation(required = true)
    private String coId;

    @Query
    @NameInMap("EndUserId")
    private String endUserId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("UserType")
    @Validation(required = true)
    private String userType;

    @Query
    @NameInMap("Uuid")
    private String uuid;

    private RevokeCoordinatePrivilegeRequest(Builder builder) {
        super(builder);
        this.coId = builder.coId;
        this.endUserId = builder.endUserId;
        this.regionId = builder.regionId;
        this.userType = builder.userType;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeCoordinatePrivilegeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return coId
     */
    public String getCoId() {
        return this.coId;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return userType
     */
    public String getUserType() {
        return this.userType;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<RevokeCoordinatePrivilegeRequest, Builder> {
        private String coId; 
        private String endUserId; 
        private String regionId; 
        private String userType; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(RevokeCoordinatePrivilegeRequest request) {
            super(request);
            this.coId = request.coId;
            this.endUserId = request.endUserId;
            this.regionId = request.regionId;
            this.userType = request.userType;
            this.uuid = request.uuid;
        } 

        /**
         * CoId.
         */
        public Builder coId(String coId) {
            this.putQueryParameter("CoId", coId);
            this.coId = coId;
            return this;
        }

        /**
         * EndUserId.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * UserType.
         */
        public Builder userType(String userType) {
            this.putQueryParameter("UserType", userType);
            this.userType = userType;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public RevokeCoordinatePrivilegeRequest build() {
            return new RevokeCoordinatePrivilegeRequest(this);
        } 

    } 

}
