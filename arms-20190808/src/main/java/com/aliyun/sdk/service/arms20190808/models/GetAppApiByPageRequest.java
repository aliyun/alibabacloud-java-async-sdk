// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppApiByPageRequest} extends {@link RequestModel}
 *
 * <p>GetAppApiByPageRequest</p>
 */
public class GetAppApiByPageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation()
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntervalMills")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647)
    private Integer intervalMills;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation()
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
         * The page number of the returned page.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The end of the time range to query. Unit: milliseconds.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The time interval between the data shards to be queried. Unit: milliseconds. Minimum value: 60000. Maximum value: 2147483647.
         */
        public Builder intervalMills(Integer intervalMills) {
            this.putQueryParameter("IntervalMills", intervalMills);
            this.intervalMills = intervalMills;
            return this;
        }

        /**
         * The process identifier (PID) of the application. For information about how to obtain a PID, see [Obtain the PID of an application](https://www.alibabacloud.com/help/zh/doc-detail/186100.htm?spm=a2cdw.13409063.0.0.7a72281f0bkTfx#title-imy-7gj-qhr).
         */
        public Builder pId(String pId) {
            this.putQueryParameter("PId", pId);
            this.pId = pId;
            return this;
        }

        /**
         * The number of entries to return on each page. This parameter is no longer supported. The number of entries to return on each page. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The beginning of the time range to query. Unit: milliseconds.
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
