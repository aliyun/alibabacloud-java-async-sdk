// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link LiveUpstreamQosDataRequest} extends {@link RequestModel}
 *
 * <p>LiveUpstreamQosDataRequest</p>
 */
public class LiveUpstreamQosDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CdnDomains")
    private java.util.List<String> cdnDomains;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CdnIsps")
    private java.util.List<String> cdnIsps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CdnProvinces")
    private java.util.List<String> cdnProvinces;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KwaiSidcs")
    private java.util.List<String> kwaiSidcs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KwaiTsc")
    private java.util.List<Integer> kwaiTsc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpstreamDomains")
    private java.util.List<String> upstreamDomains;

    private LiveUpstreamQosDataRequest(Builder builder) {
        super(builder);
        this.cdnDomains = builder.cdnDomains;
        this.cdnIsps = builder.cdnIsps;
        this.cdnProvinces = builder.cdnProvinces;
        this.endTime = builder.endTime;
        this.kwaiSidcs = builder.kwaiSidcs;
        this.kwaiTsc = builder.kwaiTsc;
        this.ownerId = builder.ownerId;
        this.region = builder.region;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
        this.upstreamDomains = builder.upstreamDomains;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LiveUpstreamQosDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cdnDomains
     */
    public java.util.List<String> getCdnDomains() {
        return this.cdnDomains;
    }

    /**
     * @return cdnIsps
     */
    public java.util.List<String> getCdnIsps() {
        return this.cdnIsps;
    }

    /**
     * @return cdnProvinces
     */
    public java.util.List<String> getCdnProvinces() {
        return this.cdnProvinces;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return kwaiSidcs
     */
    public java.util.List<String> getKwaiSidcs() {
        return this.kwaiSidcs;
    }

    /**
     * @return kwaiTsc
     */
    public java.util.List<Integer> getKwaiTsc() {
        return this.kwaiTsc;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return upstreamDomains
     */
    public java.util.List<String> getUpstreamDomains() {
        return this.upstreamDomains;
    }

    public static final class Builder extends Request.Builder<LiveUpstreamQosDataRequest, Builder> {
        private java.util.List<String> cdnDomains; 
        private java.util.List<String> cdnIsps; 
        private java.util.List<String> cdnProvinces; 
        private String endTime; 
        private java.util.List<String> kwaiSidcs; 
        private java.util.List<Integer> kwaiTsc; 
        private Long ownerId; 
        private String region; 
        private String regionId; 
        private String startTime; 
        private java.util.List<String> upstreamDomains; 

        private Builder() {
            super();
        } 

        private Builder(LiveUpstreamQosDataRequest request) {
            super(request);
            this.cdnDomains = request.cdnDomains;
            this.cdnIsps = request.cdnIsps;
            this.cdnProvinces = request.cdnProvinces;
            this.endTime = request.endTime;
            this.kwaiSidcs = request.kwaiSidcs;
            this.kwaiTsc = request.kwaiTsc;
            this.ownerId = request.ownerId;
            this.region = request.region;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
            this.upstreamDomains = request.upstreamDomains;
        } 

        /**
         * CdnDomains.
         */
        public Builder cdnDomains(java.util.List<String> cdnDomains) {
            String cdnDomainsShrink = shrink(cdnDomains, "CdnDomains", "json");
            this.putQueryParameter("CdnDomains", cdnDomainsShrink);
            this.cdnDomains = cdnDomains;
            return this;
        }

        /**
         * CdnIsps.
         */
        public Builder cdnIsps(java.util.List<String> cdnIsps) {
            String cdnIspsShrink = shrink(cdnIsps, "CdnIsps", "json");
            this.putQueryParameter("CdnIsps", cdnIspsShrink);
            this.cdnIsps = cdnIsps;
            return this;
        }

        /**
         * CdnProvinces.
         */
        public Builder cdnProvinces(java.util.List<String> cdnProvinces) {
            String cdnProvincesShrink = shrink(cdnProvinces, "CdnProvinces", "json");
            this.putQueryParameter("CdnProvinces", cdnProvincesShrink);
            this.cdnProvinces = cdnProvinces;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * KwaiSidcs.
         */
        public Builder kwaiSidcs(java.util.List<String> kwaiSidcs) {
            String kwaiSidcsShrink = shrink(kwaiSidcs, "KwaiSidcs", "json");
            this.putQueryParameter("KwaiSidcs", kwaiSidcsShrink);
            this.kwaiSidcs = kwaiSidcs;
            return this;
        }

        /**
         * KwaiTsc.
         */
        public Builder kwaiTsc(java.util.List<Integer> kwaiTsc) {
            String kwaiTscShrink = shrink(kwaiTsc, "KwaiTsc", "json");
            this.putQueryParameter("KwaiTsc", kwaiTscShrink);
            this.kwaiTsc = kwaiTsc;
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
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
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

        /**
         * <p>This parameter is required.</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * UpstreamDomains.
         */
        public Builder upstreamDomains(java.util.List<String> upstreamDomains) {
            String upstreamDomainsShrink = shrink(upstreamDomains, "UpstreamDomains", "json");
            this.putQueryParameter("UpstreamDomains", upstreamDomainsShrink);
            this.upstreamDomains = upstreamDomains;
            return this;
        }

        @Override
        public LiveUpstreamQosDataRequest build() {
            return new LiveUpstreamQosDataRequest(this);
        } 

    } 

}
