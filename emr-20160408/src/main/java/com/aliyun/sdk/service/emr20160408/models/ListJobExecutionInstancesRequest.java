// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobExecutionInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListJobExecutionInstancesRequest</p>
 */
public class ListJobExecutionInstancesRequest extends Request {
    @Query
    @NameInMap("ExecutionPlanInstanceId")
    @Validation(required = true)
    private String executionPlanInstanceId;

    @Query
    @NameInMap("IsDesc")
    private Boolean isDesc;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 500, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ListJobExecutionInstancesRequest(Builder builder) {
        super(builder);
        this.executionPlanInstanceId = builder.executionPlanInstanceId;
        this.isDesc = builder.isDesc;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobExecutionInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return executionPlanInstanceId
     */
    public String getExecutionPlanInstanceId() {
        return this.executionPlanInstanceId;
    }

    /**
     * @return isDesc
     */
    public Boolean getIsDesc() {
        return this.isDesc;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<ListJobExecutionInstancesRequest, Builder> {
        private String executionPlanInstanceId; 
        private Boolean isDesc; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ListJobExecutionInstancesRequest response) {
            super(response);
            this.executionPlanInstanceId = response.executionPlanInstanceId;
            this.isDesc = response.isDesc;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * ExecutionPlanInstanceId.
         */
        public Builder executionPlanInstanceId(String executionPlanInstanceId) {
            this.putQueryParameter("ExecutionPlanInstanceId", executionPlanInstanceId);
            this.executionPlanInstanceId = executionPlanInstanceId;
            return this;
        }

        /**
         * IsDesc.
         */
        public Builder isDesc(Boolean isDesc) {
            this.putQueryParameter("IsDesc", isDesc);
            this.isDesc = isDesc;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public ListJobExecutionInstancesRequest build() {
            return new ListJobExecutionInstancesRequest(this);
        } 

    } 

}
