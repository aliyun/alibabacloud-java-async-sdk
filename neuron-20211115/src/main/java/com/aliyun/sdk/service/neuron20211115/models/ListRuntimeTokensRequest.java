// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link ListRuntimeTokensRequest} extends {@link RequestModel}
 *
 * <p>ListRuntimeTokensRequest</p>
 */
public class ListRuntimeTokensRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("enterpriseId")
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderDirection")
    private String orderDirection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pbcId")
    private Long pbcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceGroupId")
    private Long serviceGroupId;

    private ListRuntimeTokensRequest(Builder builder) {
        super(builder);
        this.enterpriseId = builder.enterpriseId;
        this.orderBy = builder.orderBy;
        this.orderDirection = builder.orderDirection;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pbcId = builder.pbcId;
        this.serviceGroupId = builder.serviceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRuntimeTokensRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orderDirection
     */
    public String getOrderDirection() {
        return this.orderDirection;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pbcId
     */
    public Long getPbcId() {
        return this.pbcId;
    }

    /**
     * @return serviceGroupId
     */
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    public static final class Builder extends Request.Builder<ListRuntimeTokensRequest, Builder> {
        private Long enterpriseId; 
        private String orderBy; 
        private String orderDirection; 
        private String pageNumber; 
        private String pageSize; 
        private Long pbcId; 
        private Long serviceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListRuntimeTokensRequest request) {
            super(request);
            this.enterpriseId = request.enterpriseId;
            this.orderBy = request.orderBy;
            this.orderDirection = request.orderDirection;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.pbcId = request.pbcId;
            this.serviceGroupId = request.serviceGroupId;
        } 

        /**
         * enterpriseId.
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("enterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * orderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("orderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * orderDirection.
         */
        public Builder orderDirection(String orderDirection) {
            this.putQueryParameter("orderDirection", orderDirection);
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * pbcId.
         */
        public Builder pbcId(Long pbcId) {
            this.putQueryParameter("pbcId", pbcId);
            this.pbcId = pbcId;
            return this;
        }

        /**
         * serviceGroupId.
         */
        public Builder serviceGroupId(Long serviceGroupId) {
            this.putQueryParameter("serviceGroupId", serviceGroupId);
            this.serviceGroupId = serviceGroupId;
            return this;
        }

        @Override
        public ListRuntimeTokensRequest build() {
            return new ListRuntimeTokensRequest(this);
        } 

    } 

}
