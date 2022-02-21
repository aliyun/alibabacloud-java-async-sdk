// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveIpInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveIpInfoRequest</p>
 */
public class DescribeLiveIpInfoRequest extends Request {
    @Query
    @NameInMap("IP")
    @Validation(required = true)
    private String IP;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeLiveIpInfoRequest(Builder builder) {
        super(builder);
        this.IP = builder.IP;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveIpInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return IP
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeLiveIpInfoRequest, Builder> {
        private String IP; 
        private Long ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveIpInfoRequest response) {
            super(response);
            this.IP = response.IP;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
        } 

        /**
         * IP.
         */
        public Builder IP(String IP) {
            this.putQueryParameter("IP", IP);
            this.IP = IP;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
        public DescribeLiveIpInfoRequest build() {
            return new DescribeLiveIpInfoRequest(this);
        } 

    } 

}
