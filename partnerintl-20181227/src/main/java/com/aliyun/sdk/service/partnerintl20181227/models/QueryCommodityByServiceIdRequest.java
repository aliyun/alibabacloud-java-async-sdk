// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.partnerintl20181227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCommodityByServiceIdRequest} extends {@link RequestModel}
 *
 * <p>QueryCommodityByServiceIdRequest</p>
 */
public class QueryCommodityByServiceIdRequest extends Request {
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
    @NameInMap("ServiceIds")
    private String serviceIds;

    private QueryCommodityByServiceIdRequest(Builder builder) {
        super(builder);
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.serviceIds = builder.serviceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCommodityByServiceIdRequest create() {
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
     * @return serviceIds
     */
    public String getServiceIds() {
        return this.serviceIds;
    }

    public static final class Builder extends Request.Builder<QueryCommodityByServiceIdRequest, Builder> {
        private Integer pageIndex; 
        private Integer pageSize; 
        private String requestId; 
        private String serviceIds; 

        private Builder() {
            super();
        } 

        private Builder(QueryCommodityByServiceIdRequest request) {
            super(request);
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.requestId = request.requestId;
            this.serviceIds = request.serviceIds;
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
         * ServiceIds.
         */
        public Builder serviceIds(String serviceIds) {
            this.putBodyParameter("ServiceIds", serviceIds);
            this.serviceIds = serviceIds;
            return this;
        }

        @Override
        public QueryCommodityByServiceIdRequest build() {
            return new QueryCommodityByServiceIdRequest(this);
        } 

    } 

}
