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
    @Host
    @NameInMap("RegionId")
    private String regionId;

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

    private AddAutoCcBlacklistRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.blacklist = builder.blacklist;
        this.expireTime = builder.expireTime;
        this.instanceId = builder.instanceId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<AddAutoCcBlacklistRequest, Builder> {
        private String regionId; 
        private String blacklist; 
        private Integer expireTime; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(AddAutoCcBlacklistRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.blacklist = request.blacklist;
            this.expireTime = request.expireTime;
            this.instanceId = request.instanceId;
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
         * The IP addresses that you want to manage. This parameter is a JSON string. The string contains the following field:
         * <p>
         * 
         * *   **src**: the IP address. This field is required and must be of the STRING type.
         */
        public Builder blacklist(String blacklist) {
            this.putQueryParameter("Blacklist", blacklist);
            this.blacklist = blacklist;
            return this;
        }

        /**
         * The expiration time. You can specify a custom expiration time. Valid values: **300** to **604800**. Unit: seconds.
         */
        public Builder expireTime(Integer expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * The ID of the instance.
         * <p>
         * 
         * > You can call the **DescribeInstanceIds** operation to query the IDs of all instances.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public AddAutoCcBlacklistRequest build() {
            return new AddAutoCcBlacklistRequest(this);
        } 

    } 

}
