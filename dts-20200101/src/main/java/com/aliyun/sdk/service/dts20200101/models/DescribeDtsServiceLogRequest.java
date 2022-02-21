// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDtsServiceLogRequest} extends {@link RequestModel}
 *
 * <p>DescribeDtsServiceLogRequest</p>
 */
public class DescribeDtsServiceLogRequest extends Request {
    @Query
    @NameInMap("DtsJobId")
    private String dtsJobId;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("SubJobType")
    private String subJobType;

    private DescribeDtsServiceLogRequest(Builder builder) {
        super(builder);
        this.dtsJobId = builder.dtsJobId;
        this.endTime = builder.endTime;
        this.keyword = builder.keyword;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.subJobType = builder.subJobType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDtsServiceLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return subJobType
     */
    public String getSubJobType() {
        return this.subJobType;
    }

    public static final class Builder extends Request.Builder<DescribeDtsServiceLogRequest, Builder> {
        private String dtsJobId; 
        private Long endTime; 
        private String keyword; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private Long startTime; 
        private String status; 
        private String subJobType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDtsServiceLogRequest response) {
            super(response);
            this.dtsJobId = response.dtsJobId;
            this.endTime = response.endTime;
            this.keyword = response.keyword;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.startTime = response.startTime;
            this.status = response.status;
            this.subJobType = response.subJobType;
        } 

        /**
         * DtsJobId.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * SubJobType.
         */
        public Builder subJobType(String subJobType) {
            this.putQueryParameter("SubJobType", subJobType);
            this.subJobType = subJobType;
            return this;
        }

        @Override
        public DescribeDtsServiceLogRequest build() {
            return new DescribeDtsServiceLogRequest(this);
        } 

    } 

}
