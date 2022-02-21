// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIndicatorDetailsRequest} extends {@link RequestModel}
 *
 * <p>GetIndicatorDetailsRequest</p>
 */
public class GetIndicatorDetailsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("dateRange")
    private String dateRange;

    @Body
    @NameInMap("indicatorCodeList")
    private java.util.List < String > indicatorCodeList;

    @Body
    @NameInMap("timeUnit")
    private String timeUnit;

    private GetIndicatorDetailsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dateRange = builder.dateRange;
        this.indicatorCodeList = builder.indicatorCodeList;
        this.timeUnit = builder.timeUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIndicatorDetailsRequest create() {
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
     * @return dateRange
     */
    public String getDateRange() {
        return this.dateRange;
    }

    /**
     * @return indicatorCodeList
     */
    public java.util.List < String > getIndicatorCodeList() {
        return this.indicatorCodeList;
    }

    /**
     * @return timeUnit
     */
    public String getTimeUnit() {
        return this.timeUnit;
    }

    public static final class Builder extends Request.Builder<GetIndicatorDetailsRequest, Builder> {
        private String regionId; 
        private String dateRange; 
        private java.util.List < String > indicatorCodeList; 
        private String timeUnit; 

        private Builder() {
            super();
        } 

        private Builder(GetIndicatorDetailsRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.dateRange = response.dateRange;
            this.indicatorCodeList = response.indicatorCodeList;
            this.timeUnit = response.timeUnit;
        } 

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * dateRange.
         */
        public Builder dateRange(String dateRange) {
            this.putBodyParameter("dateRange", dateRange);
            this.dateRange = dateRange;
            return this;
        }

        /**
         * indicatorCodeList.
         */
        public Builder indicatorCodeList(java.util.List < String > indicatorCodeList) {
            this.putBodyParameter("indicatorCodeList", indicatorCodeList);
            this.indicatorCodeList = indicatorCodeList;
            return this;
        }

        /**
         * timeUnit.
         */
        public Builder timeUnit(String timeUnit) {
            this.putBodyParameter("timeUnit", timeUnit);
            this.timeUnit = timeUnit;
            return this;
        }

        @Override
        public GetIndicatorDetailsRequest build() {
            return new GetIndicatorDetailsRequest(this);
        } 

    } 

}
