// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link GetChangeOrderMetricRequest} extends {@link RequestModel}
 *
 * <p>GetChangeOrderMetricRequest</p>
 */
public class GetChangeOrderMetricRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppSource")
    private String appSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuStrategy")
    private String cpuStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String createTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetChangeOrderMetricRequest(Builder builder) {
        super(builder);
        this.appSource = builder.appSource;
        this.cpuStrategy = builder.cpuStrategy;
        this.createTime = builder.createTime;
        this.limit = builder.limit;
        this.orderBy = builder.orderBy;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChangeOrderMetricRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appSource
     */
    public String getAppSource() {
        return this.appSource;
    }

    /**
     * @return cpuStrategy
     */
    public String getCpuStrategy() {
        return this.cpuStrategy;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetChangeOrderMetricRequest, Builder> {
        private String appSource; 
        private String cpuStrategy; 
        private String createTime; 
        private Long limit; 
        private String orderBy; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetChangeOrderMetricRequest request) {
            super(request);
            this.appSource = request.appSource;
            this.cpuStrategy = request.cpuStrategy;
            this.createTime = request.createTime;
            this.limit = request.limit;
            this.orderBy = request.orderBy;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The SAE application type. Valid values:</p>
         * <ul>
         * <li><strong>micro_service</strong></li>
         * <li><strong>web</strong></li>
         * <li><strong>job</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>micro_service</p>
         */
        public Builder appSource(String appSource) {
            this.putQueryParameter("AppSource", appSource);
            this.appSource = appSource;
            return this;
        }

        /**
         * <p>The CPU allocation policy. Valid values:</p>
         * <ul>
         * <li><strong>request</strong>: CPU cores are allocated only when a request is initiated.</li>
         * <li><strong>always</strong>: Fixed CPU cores are always allocated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>always</p>
         */
        public Builder cpuStrategy(String cpuStrategy) {
            this.putQueryParameter("CpuStrategy", cpuStrategy);
            this.cpuStrategy = cpuStrategy;
            return this;
        }

        /**
         * <p>The start time when the change order was created.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1661152748883</p>
         */
        public Builder createTime(String createTime) {
            this.putQueryParameter("CreateTime", createTime);
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The number of entries to return. Valid values: 0 to 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(Long limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The field based on which you want to sort the returned entries.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>errorPercent</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetChangeOrderMetricRequest build() {
            return new GetChangeOrderMetricRequest(this);
        } 

    } 

}
