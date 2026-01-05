// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListConsumerAuthorizationRulesRequest} extends {@link RequestModel}
 *
 * <p>ListConsumerAuthorizationRulesRequest</p>
 */
public class ListConsumerAuthorizationRulesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("consumerId")
    private String consumerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("apiNameLike")
    private String apiNameLike;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    private ListConsumerAuthorizationRulesRequest(Builder builder) {
        super(builder);
        this.consumerId = builder.consumerId;
        this.apiNameLike = builder.apiNameLike;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConsumerAuthorizationRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerId
     */
    public String getConsumerId() {
        return this.consumerId;
    }

    /**
     * @return apiNameLike
     */
    public String getApiNameLike() {
        return this.apiNameLike;
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

    public static final class Builder extends Request.Builder<ListConsumerAuthorizationRulesRequest, Builder> {
        private String consumerId; 
        private String apiNameLike; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListConsumerAuthorizationRulesRequest request) {
            super(request);
            this.consumerId = request.consumerId;
            this.apiNameLike = request.apiNameLike;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * consumerId.
         */
        public Builder consumerId(String consumerId) {
            this.putPathParameter("consumerId", consumerId);
            this.consumerId = consumerId;
            return this;
        }

        /**
         * apiNameLike.
         */
        public Builder apiNameLike(String apiNameLike) {
            this.putQueryParameter("apiNameLike", apiNameLike);
            this.apiNameLike = apiNameLike;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListConsumerAuthorizationRulesRequest build() {
            return new ListConsumerAuthorizationRulesRequest(this);
        } 

    } 

}
