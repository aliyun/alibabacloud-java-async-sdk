// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.partnerintl20181227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySupplierDetailBySupplierUidRequest} extends {@link RequestModel}
 *
 * <p>QuerySupplierDetailBySupplierUidRequest</p>
 */
public class QuerySupplierDetailBySupplierUidRequest extends Request {
    @Body
    @NameInMap("PageIndex")
    private Integer pageIndex;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("RequestId")
    private String requestId;

    @Body
    @NameInMap("SupplierUids")
    private String supplierUids;

    private QuerySupplierDetailBySupplierUidRequest(Builder builder) {
        super(builder);
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.supplierUids = builder.supplierUids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySupplierDetailBySupplierUidRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return supplierUids
     */
    public String getSupplierUids() {
        return this.supplierUids;
    }

    public static final class Builder extends Request.Builder<QuerySupplierDetailBySupplierUidRequest, Builder> {
        private Integer pageIndex; 
        private Integer pageSize; 
        private String requestId; 
        private String supplierUids; 

        private Builder() {
            super();
        } 

        private Builder(QuerySupplierDetailBySupplierUidRequest request) {
            super(request);
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.requestId = request.requestId;
            this.supplierUids = request.supplierUids;
        } 

        /**
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putBodyParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * SupplierUids.
         */
        public Builder supplierUids(String supplierUids) {
            this.putBodyParameter("SupplierUids", supplierUids);
            this.supplierUids = supplierUids;
            return this;
        }

        @Override
        public QuerySupplierDetailBySupplierUidRequest build() {
            return new QuerySupplierDetailBySupplierUidRequest(this);
        } 

    } 

}
