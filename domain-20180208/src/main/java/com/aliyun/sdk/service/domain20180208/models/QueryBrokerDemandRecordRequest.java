// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBrokerDemandRecordRequest} extends {@link RequestModel}
 *
 * <p>QueryBrokerDemandRecordRequest</p>
 */
public class QueryBrokerDemandRecordRequest extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private QueryBrokerDemandRecordRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBrokerDemandRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<QueryBrokerDemandRecordRequest, Builder> {
        private String bizId; 
        private Integer currentPage; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(QueryBrokerDemandRecordRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
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

        @Override
        public QueryBrokerDemandRecordRequest build() {
            return new QueryBrokerDemandRecordRequest(this);
        } 

    } 

}
