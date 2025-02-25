// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListTargetByBatchRequest} extends {@link RequestModel}
 *
 * <p>ListTargetByBatchRequest</p>
 */
public class ListTargetByBatchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchId")
    private Long batchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationBase")
    private Integer operationBase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    private ListTargetByBatchRequest(Builder builder) {
        super(builder);
        this.batchId = builder.batchId;
        this.currentPage = builder.currentPage;
        this.operationBase = builder.operationBase;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTargetByBatchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchId
     */
    public Long getBatchId() {
        return this.batchId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return operationBase
     */
    public Integer getOperationBase() {
        return this.operationBase;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListTargetByBatchRequest, Builder> {
        private Long batchId; 
        private Integer currentPage; 
        private Integer operationBase; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListTargetByBatchRequest request) {
            super(request);
            this.batchId = request.batchId;
            this.currentPage = request.currentPage;
            this.operationBase = request.operationBase;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The ID of the release batch.</p>
         * 
         * <strong>example:</strong>
         * <p>1371</p>
         */
        public Builder batchId(Long batchId) {
            this.putQueryParameter("BatchId", batchId);
            this.batchId = batchId;
            return this;
        }

        /**
         * <p>The page number of the current page in a paginated query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Asset selection dimension. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Machine instance</li>
         * <li><strong>1</strong>: Machine group</li>
         * <li><strong>2</strong>: VPC instance ID</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder operationBase(Integer operationBase) {
            this.putQueryParameter("OperationBase", operationBase);
            this.operationBase = operationBase;
            return this;
        }

        /**
         * <p>The maximum number of items to return per page in a paginated query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListTargetByBatchRequest build() {
            return new ListTargetByBatchRequest(this);
        } 

    } 

}
