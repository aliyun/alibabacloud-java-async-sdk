// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveDomainLimitRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveDomainLimitRequest</p>
 */
public class DescribeLiveDomainLimitRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("LiveapiRequestFrom")
    private String liveapiRequestFrom;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeLiveDomainLimitRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.liveapiRequestFrom = builder.liveapiRequestFrom;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainLimitRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return liveapiRequestFrom
     */
    public String getLiveapiRequestFrom() {
        return this.liveapiRequestFrom;
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

    public static final class Builder extends Request.Builder<DescribeLiveDomainLimitRequest, Builder> {
        private String domainName; 
        private String liveapiRequestFrom; 
        private Long ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveDomainLimitRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.liveapiRequestFrom = response.liveapiRequestFrom;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * LiveapiRequestFrom.
         */
        public Builder liveapiRequestFrom(String liveapiRequestFrom) {
            this.putQueryParameter("LiveapiRequestFrom", liveapiRequestFrom);
            this.liveapiRequestFrom = liveapiRequestFrom;
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
        public DescribeLiveDomainLimitRequest build() {
            return new DescribeLiveDomainLimitRequest(this);
        } 

    } 

}
