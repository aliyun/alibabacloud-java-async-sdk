// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStackGroupOperationResultsRequest} extends {@link RequestModel}
 *
 * <p>ListStackGroupOperationResultsRequest</p>
 */
public class ListStackGroupOperationResultsRequest extends Request {
    @Query
    @NameInMap("OperationId")
    @Validation(required = true)
    private String operationId;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ListStackGroupOperationResultsRequest(Builder builder) {
        super(builder);
        this.operationId = builder.operationId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStackGroupOperationResultsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operationId
     */
    public String getOperationId() {
        return this.operationId;
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

    public static final class Builder extends Request.Builder<ListStackGroupOperationResultsRequest, Builder> {
        private String operationId; 
        private Long pageNumber; 
        private Long pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListStackGroupOperationResultsRequest request) {
            super(request);
            this.operationId = request.operationId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the operation.
         * <p>
         * 
         * You can call the [ListStackGroupOperations](~~151342~~) operation to query the operation ID.
         */
        public Builder operationId(String operationId) {
            this.putQueryParameter("OperationId", operationId);
            this.operationId = operationId;
            return this;
        }

        /**
         * The number of the page to return.
         * <p>
         * 
         * *   Pages start from page 1.
         * *   Default value: 1.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * *   Valid values: 1 to 50.
         * *   Default value: 10.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the stack group.
         * <p>
         * 
         * You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListStackGroupOperationResultsRequest build() {
            return new ListStackGroupOperationResultsRequest(this);
        } 

    } 

}
