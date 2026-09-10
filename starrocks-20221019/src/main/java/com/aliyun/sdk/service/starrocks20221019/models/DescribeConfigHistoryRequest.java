// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link DescribeConfigHistoryRequest} extends {@link RequestModel}
 *
 * <p>DescribeConfigHistoryRequest</p>
 */
public class DescribeConfigHistoryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectStatuses")
    private String effectStatuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedTotal")
    private Boolean needTotal;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private DescribeConfigHistoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.effectStatuses = builder.effectStatuses;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.needTotal = builder.needTotal;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfigHistoryRequest create() {
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
     * @return effectStatuses
     */
    public String getEffectStatuses() {
        return this.effectStatuses;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return needTotal
     */
    public Boolean getNeedTotal() {
        return this.needTotal;
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
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeConfigHistoryRequest, Builder> {
        private String regionId; 
        private String effectStatuses; 
        private Long endTime; 
        private String instanceId; 
        private Boolean needTotal; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeConfigHistoryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.effectStatuses = request.effectStatuses;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.needTotal = request.needTotal;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Filters the results by the effective status of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>effective</p>
         */
        public Builder effectStatuses(String effectStatuses) {
            this.putQueryParameter("EffectStatuses", effectStatuses);
            this.effectStatuses = effectStatuses;
            return this;
        }

        /**
         * <p>The end time for the query, specified as a Unix timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1742178604000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b25e21e24388****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Specifies whether to return the total number of configuration history records.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder needTotal(Boolean needTotal) {
            this.putQueryParameter("NeedTotal", needTotal);
            this.needTotal = needTotal;
            return this;
        }

        /**
         * <p>The page number. The default value is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. The default value is 10.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The start time for the query, specified as a Unix timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1742178604000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeConfigHistoryRequest build() {
            return new DescribeConfigHistoryRequest(this);
        } 

    } 

}
