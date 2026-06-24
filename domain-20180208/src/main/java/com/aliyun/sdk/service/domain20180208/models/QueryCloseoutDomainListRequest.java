// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link QueryCloseoutDomainListRequest} extends {@link RequestModel}
 *
 * <p>QueryCloseoutDomainListRequest</p>
 */
public class QueryCloseoutDomainListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentId")
    private Long currentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private QueryCloseoutDomainListRequest(Builder builder) {
        super(builder);
        this.currentId = builder.currentId;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCloseoutDomainListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentId
     */
    public Long getCurrentId() {
        return this.currentId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<QueryCloseoutDomainListRequest, Builder> {
        private Long currentId; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(QueryCloseoutDomainListRequest request) {
            super(request);
            this.currentId = request.currentId;
            this.pageSize = request.pageSize;
        } 

        /**
         * CurrentId.
         */
        public Builder currentId(Long currentId) {
            this.putQueryParameter("CurrentId", currentId);
            this.currentId = currentId;
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
        public QueryCloseoutDomainListRequest build() {
            return new QueryCloseoutDomainListRequest(this);
        } 

    } 

}
