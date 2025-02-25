// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wss20211221.models;

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
 * {@link DescribePackageDeductionsRequest} extends {@link RequestModel}
 *
 * <p>DescribePackageDeductionsRequest</p>
 */
public class DescribePackageDeductionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageIds")
    private java.util.List<String> packageIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private DescribePackageDeductionsRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.instanceIds = builder.instanceIds;
        this.packageIds = builder.packageIds;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.resourceType = builder.resourceType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePackageDeductionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return packageIds
     */
    public java.util.List<String> getPackageIds() {
        return this.packageIds;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribePackageDeductionsRequest, Builder> {
        private Long endTime; 
        private java.util.List<String> instanceIds; 
        private java.util.List<String> packageIds; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String resourceType; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribePackageDeductionsRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.instanceIds = request.instanceIds;
            this.packageIds = request.packageIds;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.resourceType = request.resourceType;
            this.startTime = request.startTime;
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
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * PackageIds.
         */
        public Builder packageIds(java.util.List<String> packageIds) {
            this.putQueryParameter("PackageIds", packageIds);
            this.packageIds = packageIds;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CorePackage</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
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
        public DescribePackageDeductionsRequest build() {
            return new DescribePackageDeductionsRequest(this);
        } 

    } 

}
