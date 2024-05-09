// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAutoCcBlacklistRequest} extends {@link RequestModel}
 *
 * <p>AddAutoCcBlacklistRequest</p>
 */
public class AddAutoCcBlacklistRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Blacklist")
    @com.aliyun.core.annotation.Validation(required = true)
    private String blacklist;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer expireTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        @Override
        public AddAutoCcBlacklistRequest build() {
            return new AddAutoCcBlacklistRequest(this);
        } 

    } 

}
