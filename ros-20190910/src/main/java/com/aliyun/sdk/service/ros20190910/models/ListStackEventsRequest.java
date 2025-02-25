// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListStackEventsRequest} extends {@link RequestModel}
 *
 * <p>ListStackEventsRequest</p>
 */
public class ListStackEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicalResourceId")
    private java.util.List < String > logicalResourceId;

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
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private java.util.List < String > resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stackId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private java.util.List < String > status;

    private ListStackEventsRequest(Builder builder) {
        super(builder);
        this.logicalResourceId = builder.logicalResourceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceType = builder.resourceType;
        this.stackId = builder.stackId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStackEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logicalResourceId
     */
    public java.util.List < String > getLogicalResourceId() {
        return this.logicalResourceId;
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
     * @return resourceType
     */
    public java.util.List < String > getResourceType() {
        return this.resourceType;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    /**
     * @return status
     */
    public java.util.List < String > getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListStackEventsRequest, Builder> {
        private java.util.List < String > logicalResourceId; 
        private Long pageNumber; 
        private Long pageSize; 
        private String regionId; 
        private java.util.List < String > resourceType; 
        private String stackId; 
        private java.util.List < String > status; 

        private Builder() {
            super();
        } 

        private Builder(ListStackEventsRequest request) {
            super(request);
            this.logicalResourceId = request.logicalResourceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceType = request.resourceType;
            this.stackId = request.stackId;
            this.status = request.status;
        } 

        /**
         * <p>The logical IDs of the resources.</p>
         * 
         * <strong>example:</strong>
         * <p>WebServer</p>
         */
        public Builder logicalResourceId(java.util.List < String > logicalResourceId) {
            this.putQueryParameter("LogicalResourceId", logicalResourceId);
            this.logicalResourceId = logicalResourceId;
            return this;
        }

        /**
         * <p>The number of the page to return.<br>Pages start from page 1.<br>Default value: 1.</p>
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
         * <p>The number of entries to return on each page.<br>Maximum value: 50.<br>Default value: 10.</p>
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
         * <p>The region ID of the stack. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The resource types.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::ECS::Instance</p>
         */
        public Builder resourceType(java.util.List < String > resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The stack ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        /**
         * <p>The status of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE_IN_PROGRESS</p>
         */
        public Builder status(java.util.List < String > status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListStackEventsRequest build() {
            return new ListStackEventsRequest(this);
        } 

    } 

}
