// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnUserBillPredictionRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnUserBillPredictionRequest</p>
 */
public class DescribeCdnUserBillPredictionRequest extends Request {
    @Query
    @NameInMap("Area")
    private String area;

    @Query
    @NameInMap("Dimension")
    private String dimension;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private DescribeCdnUserBillPredictionRequest(Builder builder) {
        super(builder);
        this.area = builder.area;
        this.dimension = builder.dimension;
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnUserBillPredictionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return area
     */
    public String getArea() {
        return this.area;
    }

    /**
     * @return dimension
     */
    public String getDimension() {
        return this.dimension;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeCdnUserBillPredictionRequest, Builder> {
        private String area; 
        private String dimension; 
        private String endTime; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCdnUserBillPredictionRequest request) {
            super(request);
            this.area = request.area;
            this.dimension = request.dimension;
            this.endTime = request.endTime;
            this.startTime = request.startTime;
        } 

        /**
         * The billable region. Valid values:
         * <p>
         * 
         * *   **CN**: the Chinese mainland
         * *   **OverSeas**: outside the Chinese mainland
         * *   **AP1**: Asia Pacific 1
         * *   **AP2**: Asia Pacific 2
         * *   **AP3**: Asia Pacific 3
         * *   **NA**: North America
         * *   **SA**: South America
         * *   **EU**: Europe
         * *   **MEAA**: Middle East and Africa
         * 
         * By default, the value of this parameter is determined by the metering method that is currently used. Regions inside and outside the Chinese mainland are classified into the **CN** and **OverSeas** billable regions. Billable regions inside the Chinese mainland include **CN**. Billable regions outside the Chinese mainland include **AP1**, **AP2**, **AP3**, **NA**, **SA**, **EU**, and **MEAA**.
         * 
         * > For more information about billable regions, see [Billable regions](~~142221~~).
         */
        public Builder area(String area) {
            this.putQueryParameter("Area", area);
            this.area = area;
            return this;
        }

        /**
         * The billable item. A value of flow specifies bandwidth.
         */
        public Builder dimension(String dimension) {
            this.putQueryParameter("Dimension", dimension);
            this.dimension = dimension;
            return this;
        }

        /**
         * The end time of the estimation. The default value is the current time. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * <p>
         * 
         * > The end time must be later than the start time.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The start time of the estimation. The default value is 00:00 on the first day of the current month. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeCdnUserBillPredictionRequest build() {
            return new DescribeCdnUserBillPredictionRequest(this);
        } 

    } 

}
