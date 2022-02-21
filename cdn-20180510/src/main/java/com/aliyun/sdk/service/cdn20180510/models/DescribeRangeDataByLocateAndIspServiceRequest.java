// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRangeDataByLocateAndIspServiceRequest} extends {@link RequestModel}
 *
 * <p>DescribeRangeDataByLocateAndIspServiceRequest</p>
 */
public class DescribeRangeDataByLocateAndIspServiceRequest extends Request {
    @Query
    @NameInMap("DomainNames")
    @Validation(required = true)
    private String domainNames;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("IspNames")
    private String ispNames;

    @Query
    @NameInMap("LocationNames")
    private String locationNames;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private DescribeRangeDataByLocateAndIspServiceRequest(Builder builder) {
        super(builder);
        this.domainNames = builder.domainNames;
        this.endTime = builder.endTime;
        this.ispNames = builder.ispNames;
        this.locationNames = builder.locationNames;
        this.ownerId = builder.ownerId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRangeDataByLocateAndIspServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainNames
     */
    public String getDomainNames() {
        return this.domainNames;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeRangeDataByLocateAndIspServiceRequest, Builder> {
        private String domainNames; 
        private String endTime; 
        private String ispNames; 
        private String locationNames; 
        private Long ownerId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRangeDataByLocateAndIspServiceRequest response) {
            super(response);
            this.domainNames = response.domainNames;
            this.endTime = response.endTime;
            this.ispNames = response.ispNames;
            this.locationNames = response.locationNames;
            this.ownerId = response.ownerId;
            this.startTime = response.startTime;
        } 

        /**
         * DomainNames.
         */
        public Builder domainNames(String domainNames) {
            this.putQueryParameter("DomainNames", domainNames);
            this.domainNames = domainNames;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeRangeDataByLocateAndIspServiceRequest build() {
            return new DescribeRangeDataByLocateAndIspServiceRequest(this);
        } 

    } 

}
