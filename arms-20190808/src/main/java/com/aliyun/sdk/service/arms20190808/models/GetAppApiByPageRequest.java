// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppApiByPageRequest} extends {@link RequestModel}
 *
 * <p>GetAppApiByPageRequest</p>
 */
public class GetAppApiByPageRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    @Validation(maximum = 2147483647, minimum = 1)
    private Integer currentPage;

    @Query
    @NameInMap("EndTime")
    @Validation()
    private Long endTime;

    @Query
    @NameInMap("IntervalMills")
    @Validation(maximum = 2147483647)
    private Integer intervalMills;

    @Query
    @NameInMap("PId")
    @Validation(required = true)
    private String pId;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 2147483647, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StartTime")
    @Validation()
    private Long startTime;

    private GetAppApiByPageRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.intervalMills = builder.intervalMills;
        this.pId = builder.pId;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppApiByPageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return intervalMills
     */
    public Integer getIntervalMills() {
        return this.intervalMills;
    }

    /**
     * @return pId
     */
    public String getPId() {
        return this.pId;
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

    public static final class Builder extends Request.Builder<GetAppApiByPageRequest, Builder> {
        private Integer currentPage; 
        private Long endTime; 
        private Integer intervalMills; 
        private String pId; 
        private Integer pageSize; 
        private String regionId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetAppApiByPageRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.intervalMills = request.intervalMills;
            this.pId = request.pId;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
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
         * IntervalMills.
         */
        public Builder intervalMills(Integer intervalMills) {
            this.putQueryParameter("IntervalMills", intervalMills);
            this.intervalMills = intervalMills;
            return this;
        }

        /**
         * PId.
         */
        public Builder pId(String pId) {
            this.putQueryParameter("PId", pId);
            this.pId = pId;
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

        @Override
        public GetAppApiByPageRequest build() {
            return new GetAppApiByPageRequest(this);
        } 

    } 

}
