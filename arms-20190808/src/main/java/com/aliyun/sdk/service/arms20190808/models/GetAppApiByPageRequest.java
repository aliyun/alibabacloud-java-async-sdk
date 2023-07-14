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
         * The number of entries to return on each page.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to `GetAppApiByPage`.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The time interval between the data shards to be queried. Unit: milliseconds. Minimum value: 60000.
         */
        public Builder intervalMills(Integer intervalMills) {
            this.putQueryParameter("IntervalMills", intervalMills);
            this.intervalMills = intervalMills;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder pId(String pId) {
            this.putQueryParameter("PId", pId);
            this.pId = pId;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The process identifier (PID) of the application. For more information about how to obtain the PID, see [Obtain the PID of an application](https://www.alibabacloud.com/help/zh/doc-detail/186100.htm?spm=a2cdw.13409063.0.0.7a72281f0bkTfx#title-imy-7gj-qhr).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The HTTP status code returned for the request. Valid values:
         * <p>
         * 
         * *   2XX: The request is successful.
         * *   3XX: A redirection message is returned.
         * *   4XX: The request is invalid.
         * *   5XX: A server error occurs.
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
