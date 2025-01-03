// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_cnp20230828.models;

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
 * {@link ListExperimentPlansRequest} extends {@link RequestModel}
 *
 * <p>ListExperimentPlansRequest</p>
 */
public class ListExperimentPlansRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreatTimeOrder")
    private String creatTimeOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTimeOrder")
    private String endTimeOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlanTaskStatus")
    private java.util.List<String> planTaskStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceName")
    private java.util.List<String> resourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTimeOrder")
    private String startTimeOrder;

    private ListExperimentPlansRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.creatTimeOrder = builder.creatTimeOrder;
        this.endTimeOrder = builder.endTimeOrder;
        this.page = builder.page;
        this.planTaskStatus = builder.planTaskStatus;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceName = builder.resourceName;
        this.size = builder.size;
        this.startTimeOrder = builder.startTimeOrder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExperimentPlansRequest create() {
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
     * @return creatTimeOrder
     */
    public String getCreatTimeOrder() {
        return this.creatTimeOrder;
    }

    /**
     * @return endTimeOrder
     */
    public String getEndTimeOrder() {
        return this.endTimeOrder;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return planTaskStatus
     */
    public java.util.List<String> getPlanTaskStatus() {
        return this.planTaskStatus;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceName
     */
    public java.util.List<String> getResourceName() {
        return this.resourceName;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return startTimeOrder
     */
    public String getStartTimeOrder() {
        return this.startTimeOrder;
    }

    public static final class Builder extends Request.Builder<ListExperimentPlansRequest, Builder> {
        private String regionId; 
        private String creatTimeOrder; 
        private String endTimeOrder; 
        private Integer page; 
        private java.util.List<String> planTaskStatus; 
        private String resourceGroupId; 
        private java.util.List<String> resourceName; 
        private Integer size; 
        private String startTimeOrder; 

        private Builder() {
            super();
        } 

        private Builder(ListExperimentPlansRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.creatTimeOrder = request.creatTimeOrder;
            this.endTimeOrder = request.endTimeOrder;
            this.page = request.page;
            this.planTaskStatus = request.planTaskStatus;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceName = request.resourceName;
            this.size = request.size;
            this.startTimeOrder = request.startTimeOrder;
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
         * <p>Creation Time Sorting Rule</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder creatTimeOrder(String creatTimeOrder) {
            this.putQueryParameter("CreatTimeOrder", creatTimeOrder);
            this.creatTimeOrder = creatTimeOrder;
            return this;
        }

        /**
         * <p>End Time Sorting Rule</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder endTimeOrder(String endTimeOrder) {
            this.putQueryParameter("EndTimeOrder", endTimeOrder);
            this.endTimeOrder = endTimeOrder;
            return this;
        }

        /**
         * <p>Page Number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>Execution Status</p>
         */
        public Builder planTaskStatus(java.util.List<String> planTaskStatus) {
            String planTaskStatusShrink = shrink(planTaskStatus, "PlanTaskStatus", "json");
            this.putBodyParameter("PlanTaskStatus", planTaskStatusShrink);
            this.planTaskStatus = planTaskStatus;
            return this;
        }

        /**
         * <p>Resource Group ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzij65sf2rr5i</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Resource</p>
         */
        public Builder resourceName(java.util.List<String> resourceName) {
            String resourceNameShrink = shrink(resourceName, "ResourceName", "json");
            this.putBodyParameter("ResourceName", resourceNameShrink);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * <p>Number of Items</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>Start Time Sorting Rule</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder startTimeOrder(String startTimeOrder) {
            this.putQueryParameter("StartTimeOrder", startTimeOrder);
            this.startTimeOrder = startTimeOrder;
            return this;
        }

        @Override
        public ListExperimentPlansRequest build() {
            return new ListExperimentPlansRequest(this);
        } 

    } 

}
