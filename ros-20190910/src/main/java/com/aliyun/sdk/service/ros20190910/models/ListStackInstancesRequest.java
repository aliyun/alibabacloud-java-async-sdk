// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListStackInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListStackInstancesRequest</p>
 */
public class ListStackInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stackGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackInstanceAccountId")
    private String stackInstanceAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackInstanceRegionId")
    private String stackInstanceRegionId;

    private ListStackInstancesRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.stackGroupName = builder.stackGroupName;
        this.stackInstanceAccountId = builder.stackInstanceAccountId;
        this.stackInstanceRegionId = builder.stackInstanceRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStackInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return stackGroupName
     */
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    /**
     * @return stackInstanceAccountId
     */
    public String getStackInstanceAccountId() {
        return this.stackInstanceAccountId;
    }

    /**
     * @return stackInstanceRegionId
     */
    public String getStackInstanceRegionId() {
        return this.stackInstanceRegionId;
    }

    public static final class Builder extends Request.Builder<ListStackInstancesRequest, Builder> {
        private Long pageNumber; 
        private Long pageSize; 
        private String regionId; 
        private String stackGroupName; 
        private String stackInstanceAccountId; 
        private String stackInstanceRegionId; 

        private Builder() {
            super();
        } 

        private Builder(ListStackInstancesRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.stackGroupName = request.stackGroupName;
            this.stackInstanceAccountId = request.stackInstanceAccountId;
            this.stackInstanceRegionId = request.stackInstanceRegionId;
        } 

        /**
         * <p>The number of the page to return.</p>
         * <ul>
         * <li>Pages start from page 1.</li>
         * <li>Default value: 1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * <ul>
         * <li>Valid values: 1 to 50.</li>
         * <li>Default value: 10.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of the stack group. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The name of the stack group. The name must be unique within a region.<br>The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyStackGroup</p>
         */
        public Builder stackGroupName(String stackGroupName) {
            this.putQueryParameter("StackGroupName", stackGroupName);
            this.stackGroupName = stackGroupName;
            return this;
        }

        /**
         * <p>The ID of the destination account to which the stack belongs.</p>
         * <ul>
         * <li>If the stack group is granted self-managed permissions, the stack belongs to an Alibaba Cloud account.</li>
         * <li>If the stack group is granted service-managed permissions, the stack belongs to a member in a resource directory.</li>
         * </ul>
         * <blockquote>
         * <p>For more information about the destination account, see <a href="https://help.aliyun.com/document_detail/154578.html">Overview</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>156552876021****</p>
         */
        public Builder stackInstanceAccountId(String stackInstanceAccountId) {
            this.putQueryParameter("StackInstanceAccountId", stackInstanceAccountId);
            this.stackInstanceAccountId = stackInstanceAccountId;
            return this;
        }

        /**
         * <p>The region ID of the stack.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder stackInstanceRegionId(String stackInstanceRegionId) {
            this.putQueryParameter("StackInstanceRegionId", stackInstanceRegionId);
            this.stackInstanceRegionId = stackInstanceRegionId;
            return this;
        }

        @Override
        public ListStackInstancesRequest build() {
            return new ListStackInstancesRequest(this);
        } 

    } 

}
