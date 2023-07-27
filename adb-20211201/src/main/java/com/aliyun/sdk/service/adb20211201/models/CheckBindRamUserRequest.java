// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckBindRamUserRequest} extends {@link RequestModel}
 *
 * <p>CheckBindRamUserRequest</p>
 */
public class CheckBindRamUserRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    private String DBClusterId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private CheckBindRamUserRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckBindRamUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CheckBindRamUserRequest, Builder> {
        private String DBClusterId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CheckBindRamUserRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.regionId = request.regionId;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
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

        @Override
        public CheckBindRamUserRequest build() {
            return new CheckBindRamUserRequest(this);
        } 

    } 

}
