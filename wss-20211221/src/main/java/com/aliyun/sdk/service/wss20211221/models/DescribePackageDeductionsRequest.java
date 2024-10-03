// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wss20211221.models;

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
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageIds")
    private java.util.List < String > packageIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    private DescribePackageDeductionsRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.packageIds = builder.packageIds;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.resourceType = builder.resourceType;
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
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return packageIds
     */
    public java.util.List < String > getPackageIds() {
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

    public static final class Builder extends Request.Builder<DescribePackageDeductionsRequest, Builder> {
        private java.util.List < String > instanceIds; 
        private java.util.List < String > packageIds; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribePackageDeductionsRequest request) {
            super(request);
            this.instanceIds = request.instanceIds;
            this.packageIds = request.packageIds;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.resourceType = request.resourceType;
        } 

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * PackageIds.
         */
        public Builder packageIds(java.util.List < String > packageIds) {
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
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public DescribePackageDeductionsRequest build() {
            return new DescribePackageDeductionsRequest(this);
        } 

    } 

}
