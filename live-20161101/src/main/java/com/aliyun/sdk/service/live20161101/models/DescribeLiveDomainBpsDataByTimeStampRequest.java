// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveDomainBpsDataByTimeStampRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveDomainBpsDataByTimeStampRequest</p>
 */
public class DescribeLiveDomainBpsDataByTimeStampRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("IspNames")
    @Validation(required = true)
    private String ispNames;

    @Query
    @NameInMap("LocationNames")
    @Validation(required = true)
    private String locationNames;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TimePoint")
    @Validation(required = true)
    private String timePoint;

    private DescribeLiveDomainBpsDataByTimeStampRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.ispNames = builder.ispNames;
        this.locationNames = builder.locationNames;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.timePoint = builder.timePoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainBpsDataByTimeStampRequest create() {
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
     * @return ispNames
     */
    public String getIspNames() {
        return this.ispNames;
    }

    /**
     * @return locationNames
     */
    public String getLocationNames() {
        return this.locationNames;
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

    /**
     * @return timePoint
     */
    public String getTimePoint() {
        return this.timePoint;
    }

    public static final class Builder extends Request.Builder<DescribeLiveDomainBpsDataByTimeStampRequest, Builder> {
        private String domainName; 
        private String ispNames; 
        private String locationNames; 
        private Long ownerId; 
        private String regionId; 
        private String timePoint; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveDomainBpsDataByTimeStampRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.ispNames = response.ispNames;
            this.locationNames = response.locationNames;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.timePoint = response.timePoint;
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
         * IspNames.
         */
        public Builder ispNames(String ispNames) {
            this.putQueryParameter("IspNames", ispNames);
            this.ispNames = ispNames;
            return this;
        }

        /**
         * LocationNames.
         */
        public Builder locationNames(String locationNames) {
            this.putQueryParameter("LocationNames", locationNames);
            this.locationNames = locationNames;
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

        /**
         * TimePoint.
         */
        public Builder timePoint(String timePoint) {
            this.putQueryParameter("TimePoint", timePoint);
            this.timePoint = timePoint;
            return this;
        }

        @Override
        public DescribeLiveDomainBpsDataByTimeStampRequest build() {
            return new DescribeLiveDomainBpsDataByTimeStampRequest(this);
        } 

    } 

}
