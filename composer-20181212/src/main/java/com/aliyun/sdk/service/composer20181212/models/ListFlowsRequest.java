// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowsRequest} extends {@link RequestModel}
 *
 * <p>ListFlowsRequest</p>
 */
public class ListFlowsRequest extends Request {
    @Body
    @NameInMap("Filter")
    private String filter;

    @Body
    @NameInMap("FlowName")
    private String flowName;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private ListFlowsRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.flowName = builder.flowName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<ListFlowsRequest, Builder> {
        private String filter; 
        private String flowName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListFlowsRequest request) {
            super(request);
            this.filter = request.filter;
            this.flowName = request.flowName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * The filter condition, which is in the JSON format of {"key":"value"}. Example: {"key1":"value1"}
         */
        public Builder filter(String filter) {
            this.putBodyParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * The name of the workflow.
         */
        public Builder flowName(String flowName) {
            this.putBodyParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * The page number of the current page. Minimum value: 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * Specifies the number of workflows to return on each page. A page can contain a maximum of 100 workflows. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ListFlowsRequest build() {
            return new ListFlowsRequest(this);
        } 

    } 

}
