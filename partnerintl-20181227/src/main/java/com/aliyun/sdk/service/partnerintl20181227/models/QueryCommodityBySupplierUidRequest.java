// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.partnerintl20181227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCommodityBySupplierUidRequest} extends {@link RequestModel}
 *
 * <p>QueryCommodityBySupplierUidRequest</p>
 */
public class QueryCommodityBySupplierUidRequest extends Request {
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
    @NameInMap("SupplierUid")
    private String supplierUid;

    private QueryCommodityBySupplierUidRequest(Builder builder) {
        super(builder);
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.supplierUid = builder.supplierUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCommodityBySupplierUidRequest create() {
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
     * @return supplierUid
     */
    public String getSupplierUid() {
        return this.supplierUid;
    }

    public static final class Builder extends Request.Builder<QueryCommodityBySupplierUidRequest, Builder> {
        private Integer pageIndex; 
        private Integer pageSize; 
        private String requestId; 
        private String supplierUid; 

        private Builder() {
            super();
        } 

        private Builder(QueryCommodityBySupplierUidRequest request) {
            super(request);
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.requestId = request.requestId;
            this.supplierUid = request.supplierUid;
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
         * SupplierUid.
         */
        public Builder supplierUid(String supplierUid) {
            this.putBodyParameter("SupplierUid", supplierUid);
            this.supplierUid = supplierUid;
            return this;
        }

        @Override
        public QueryCommodityBySupplierUidRequest build() {
            return new QueryCommodityBySupplierUidRequest(this);
        } 

    } 

}
