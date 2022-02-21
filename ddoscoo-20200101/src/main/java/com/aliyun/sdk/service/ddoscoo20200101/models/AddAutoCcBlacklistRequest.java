// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAutoCcBlacklistRequest} extends {@link RequestModel}
 *
 * <p>AddAutoCcBlacklistRequest</p>
 */
public class AddAutoCcBlacklistRequest extends Request {
    @Query
    @NameInMap("Blacklist")
    @Validation(required = true)
    private String blacklist;

    @Query
    @NameInMap("ExpireTime")
    @Validation(required = true)
    private Integer expireTime;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private AddAutoCcBlacklistRequest(Builder builder) {
        super(builder);
        this.blacklist = builder.blacklist;
        this.expireTime = builder.expireTime;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAutoCcBlacklistRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blacklist
     */
    public String getBlacklist() {
        return this.blacklist;
    }

    /**
     * @return expireTime
     */
    public Integer getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AddAutoCcBlacklistRequest, Builder> {
        private String blacklist; 
        private Integer expireTime; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddAutoCcBlacklistRequest response) {
            super(response);
            this.blacklist = response.blacklist;
            this.expireTime = response.expireTime;
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
        } 

        /**
         * Blacklist.
         */
        public Builder blacklist(String blacklist) {
            this.putQueryParameter("Blacklist", blacklist);
            this.blacklist = blacklist;
            return this;
        }

        /**
         * ExpireTime.
         */
        public Builder expireTime(Integer expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AddAutoCcBlacklistRequest build() {
            return new AddAutoCcBlacklistRequest(this);
        } 

    } 

}
