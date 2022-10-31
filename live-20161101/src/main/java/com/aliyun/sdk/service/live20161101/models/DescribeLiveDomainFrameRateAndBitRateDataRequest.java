// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveDomainFrameRateAndBitRateDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveDomainFrameRateAndBitRateDataRequest</p>
 */
public class DescribeLiveDomainFrameRateAndBitRateDataRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("QueryTime")
    @Validation(required = true)
    private String queryTime;

    private DescribeLiveDomainFrameRateAndBitRateDataRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.queryTime = builder.queryTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainFrameRateAndBitRateDataRequest create() {
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
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return queryTime
     */
    public String getQueryTime() {
        return this.queryTime;
    }

    public static final class Builder extends Request.Builder<DescribeLiveDomainFrameRateAndBitRateDataRequest, Builder> {
        private String regionId; 
        private String domainName; 
        private Long ownerId; 
        private String queryTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveDomainFrameRateAndBitRateDataRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
            this.queryTime = request.queryTime;
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
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
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
         * QueryTime.
         */
        public Builder queryTime(String queryTime) {
            this.putQueryParameter("QueryTime", queryTime);
            this.queryTime = queryTime;
            return this;
        }

        @Override
        public DescribeLiveDomainFrameRateAndBitRateDataRequest build() {
            return new DescribeLiveDomainFrameRateAndBitRateDataRequest(this);
        } 

    } 

}
