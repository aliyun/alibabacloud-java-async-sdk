// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdmeter20210425.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeterRtcPeakUserCntDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeMeterRtcPeakUserCntDataRequest</p>
 */
public class DescribeMeterRtcPeakUserCntDataRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("EndTs")
    private Long endTs;

    @Query
    @NameInMap("Interval")
    private Long interval;

    @Query
    @NameInMap("ServiceArea")
    private String serviceArea;

    @Query
    @NameInMap("StartTs")
    private Long startTs;

    private DescribeMeterRtcPeakUserCntDataRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.endTs = builder.endTs;
        this.interval = builder.interval;
        this.serviceArea = builder.serviceArea;
        this.startTs = builder.startTs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeterRtcPeakUserCntDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return endTs
     */
    public Long getEndTs() {
        return this.endTs;
    }

    /**
     * @return interval
     */
    public Long getInterval() {
        return this.interval;
    }

    /**
     * @return serviceArea
     */
    public String getServiceArea() {
        return this.serviceArea;
    }

    /**
     * @return startTs
     */
    public Long getStartTs() {
        return this.startTs;
    }

    public static final class Builder extends Request.Builder<DescribeMeterRtcPeakUserCntDataRequest, Builder> {
        private String appId; 
        private Long endTs; 
        private Long interval; 
        private String serviceArea; 
        private Long startTs; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMeterRtcPeakUserCntDataRequest request) {
            super(request);
            this.appId = request.appId;
            this.endTs = request.endTs;
            this.interval = request.interval;
            this.serviceArea = request.serviceArea;
            this.startTs = request.startTs;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * EndTs.
         */
        public Builder endTs(Long endTs) {
            this.putQueryParameter("EndTs", endTs);
            this.endTs = endTs;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(Long interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * ServiceArea.
         */
        public Builder serviceArea(String serviceArea) {
            this.putQueryParameter("ServiceArea", serviceArea);
            this.serviceArea = serviceArea;
            return this;
        }

        /**
         * StartTs.
         */
        public Builder startTs(Long startTs) {
            this.putQueryParameter("StartTs", startTs);
            this.startTs = startTs;
            return this;
        }

        @Override
        public DescribeMeterRtcPeakUserCntDataRequest build() {
            return new DescribeMeterRtcPeakUserCntDataRequest(this);
        } 

    } 

}
