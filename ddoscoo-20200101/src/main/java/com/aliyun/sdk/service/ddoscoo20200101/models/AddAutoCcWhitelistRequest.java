// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAutoCcWhitelistRequest} extends {@link RequestModel}
 *
 * <p>AddAutoCcWhitelistRequest</p>
 */
public class AddAutoCcWhitelistRequest extends Request {
    @Query
    @NameInMap("ExpireTime")
    private Integer expireTime;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Whitelist")
    @Validation(required = true)
    private String whitelist;

    private AddAutoCcWhitelistRequest(Builder builder) {
        super(builder);
        this.expireTime = builder.expireTime;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.whitelist = builder.whitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAutoCcWhitelistRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return whitelist
     */
    public String getWhitelist() {
        return this.whitelist;
    }

    public static final class Builder extends Request.Builder<AddAutoCcWhitelistRequest, Builder> {
        private Integer expireTime; 
        private String instanceId; 
        private String regionId; 
        private String whitelist; 

        private Builder() {
            super();
        } 

        private Builder(AddAutoCcWhitelistRequest response) {
            super(response);
            this.expireTime = response.expireTime;
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
            this.whitelist = response.whitelist;
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

        /**
         * Whitelist.
         */
        public Builder whitelist(String whitelist) {
            this.putQueryParameter("Whitelist", whitelist);
            this.whitelist = whitelist;
            return this;
        }

        @Override
        public AddAutoCcWhitelistRequest build() {
            return new AddAutoCcWhitelistRequest(this);
        } 

    } 

}
