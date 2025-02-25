// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The end of the time range to query. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1600066800000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The time interval between the data shards to be queried. Unit: milliseconds. Minimum value: 60000. Maximum value: 2147483647.</p>
         * 
         * <strong>example:</strong>
         * <p>60000</p>
         */
        public Builder intervalMills(Integer intervalMills) {
            this.putQueryParameter("IntervalMills", intervalMills);
            this.intervalMills = intervalMills;
            return this;
        }

        /**
         * <p>The process identifier (PID) of the application. For information about how to obtain a PID, see <a href="https://www.alibabacloud.com/help/zh/doc-detail/186100.htm?spm=a2cdw.13409063.0.0.7a72281f0bkTfx#title-imy-7gj-qhr">Obtain the PID of an application</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a2n80plglh@745eddxxx</p>
         */
        public Builder pId(String pId) {
            this.putQueryParameter("PId", pId);
            this.pId = pId;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. This parameter is no longer supported. The number of entries to return on each page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1600063200000</p>
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
