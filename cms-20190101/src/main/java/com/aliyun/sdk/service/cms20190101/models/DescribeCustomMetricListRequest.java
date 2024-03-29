// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomMetricListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCustomMetricListRequest</p>
 */
public class DescribeCustomMetricListRequest extends Request {
    @Query
    @NameInMap("Dimension")
    private String dimension;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("Md5")
    private String md5;

    @Query
    @NameInMap("MetricName")
    private String metricName;

    @Query
    @NameInMap("PageNumber")
    private String pageNumber;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    private DescribeCustomMetricListRequest(Builder builder) {
        super(builder);
        this.dimension = builder.dimension;
        this.groupId = builder.groupId;
        this.md5 = builder.md5;
        this.metricName = builder.metricName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomMetricListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dimension
     */
    public String getDimension() {
        return this.dimension;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return md5
     */
    public String getMd5() {
        return this.md5;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeCustomMetricListRequest, Builder> {
        private String dimension; 
        private String groupId; 
        private String md5; 
        private String metricName; 
        private String pageNumber; 
        private String pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCustomMetricListRequest request) {
            super(request);
            this.dimension = request.dimension;
            this.groupId = request.groupId;
            this.md5 = request.md5;
            this.metricName = request.metricName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * The dimensions that specify the resources for which you want to query custom metrics.
         */
        public Builder dimension(String dimension) {
            this.putQueryParameter("Dimension", dimension);
            this.dimension = dimension;
            return this;
        }

        /**
         * The ID of the application group.
         * <p>
         * 
         * For more information, see [DescribeMonitorGroups](~~115032~~).
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The MD5 value of the HTTP request body. The MD5 value is a 128-bit hash value used to verify the uniqueness of the reported custom metrics.
         */
        public Builder md5(String md5) {
            this.putQueryParameter("Md5", md5);
            this.md5 = md5;
            return this;
        }

        /**
         * The name of the custom metric.
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * The number of the page to return.
         * <p>
         * 
         * Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Pages start from page 1. Default value: 10.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeCustomMetricListRequest build() {
            return new DescribeCustomMetricListRequest(this);
        } 

    } 

}
