// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAutoCcWhitelistRequest} extends {@link RequestModel}
 *
 * <p>AddAutoCcWhitelistRequest</p>
 */
public class AddAutoCcWhitelistRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private Integer expireTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Whitelist")
    @com.aliyun.core.annotation.Validation(required = true)
    private String whitelist;

    private AddAutoCcWhitelistRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.expireTime = builder.expireTime;
        this.instanceId = builder.instanceId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return whitelist
     */
    public String getWhitelist() {
        return this.whitelist;
    }

    public static final class Builder extends Request.Builder<AddAutoCcWhitelistRequest, Builder> {
        private String regionId; 
        private Integer expireTime; 
        private String instanceId; 
        private String whitelist; 

        private Builder() {
            super();
        } 

        private Builder(AddAutoCcWhitelistRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.expireTime = request.expireTime;
            this.instanceId = request.instanceId;
            this.whitelist = request.whitelist;
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
         * This parameter is deprecated.
         * <p>
         * 
         * > This parameter indicates the validity period of the IP address blacklist. By default, the traffic from the IP addresses that you add to the whitelist is always allowed. You do not need to set this parameter.
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
         * > You can call the [DescribeInstanceIds](~~157459~~) operation to query the IDs of all instances.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The configuration of the IP addresses that you want to add to the whitelist. The value is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that contains the following fields:
         * <p>
         * 
         * *   **src**: the IP address that you want to add. This parameter is required. Data type: string.
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
