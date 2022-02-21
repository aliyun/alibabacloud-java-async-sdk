// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExecutionPlanInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListExecutionPlanInstancesRequest</p>
 */
public class ListExecutionPlanInstancesRequest extends Request {
    @Query
    @NameInMap("ExecutionPlanIdList")
    @Validation(required = true)
    private java.util.List < String > executionPlanIdList;

    @Query
    @NameInMap("IsDesc")
    private Boolean isDesc;

    @Query
    @NameInMap("OnlyLastInstance")
    private Boolean onlyLastInstance;

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

    @Query
    @NameInMap("StatusList")
    private java.util.List < String > statusList;

    private ListExecutionPlanInstancesRequest(Builder builder) {
        super(builder);
        this.executionPlanIdList = builder.executionPlanIdList;
        this.isDesc = builder.isDesc;
        this.onlyLastInstance = builder.onlyLastInstance;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.statusList = builder.statusList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExecutionPlanInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return executionPlanIdList
     */
    public java.util.List < String > getExecutionPlanIdList() {
        return this.executionPlanIdList;
    }

    /**
     * @return isDesc
     */
    public Boolean getIsDesc() {
        return this.isDesc;
    }

    /**
     * @return onlyLastInstance
     */
    public Boolean getOnlyLastInstance() {
        return this.onlyLastInstance;
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

    /**
     * @return statusList
     */
    public java.util.List < String > getStatusList() {
        return this.statusList;
    }

    public static final class Builder extends Request.Builder<ListExecutionPlanInstancesRequest, Builder> {
        private java.util.List < String > executionPlanIdList; 
        private Boolean isDesc; 
        private Boolean onlyLastInstance; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private Long resourceOwnerId; 
        private java.util.List < String > statusList; 

        private Builder() {
            super();
        } 

        private Builder(ListExecutionPlanInstancesRequest response) {
            super(response);
            this.executionPlanIdList = response.executionPlanIdList;
            this.isDesc = response.isDesc;
            this.onlyLastInstance = response.onlyLastInstance;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.statusList = response.statusList;
        } 

        /**
         * ExecutionPlanIdList.
         */
        public Builder executionPlanIdList(java.util.List < String > executionPlanIdList) {
            this.putQueryParameter("ExecutionPlanIdList", executionPlanIdList);
            this.executionPlanIdList = executionPlanIdList;
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
         * OnlyLastInstance.
         */
        public Builder onlyLastInstance(Boolean onlyLastInstance) {
            this.putQueryParameter("OnlyLastInstance", onlyLastInstance);
            this.onlyLastInstance = onlyLastInstance;
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

        /**
         * StatusList.
         */
        public Builder statusList(java.util.List < String > statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        @Override
        public ListExecutionPlanInstancesRequest build() {
            return new ListExecutionPlanInstancesRequest(this);
        } 

    } 

}
