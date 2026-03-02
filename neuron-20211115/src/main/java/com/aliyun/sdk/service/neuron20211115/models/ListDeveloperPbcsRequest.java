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
 * {@link ListDeveloperPbcsRequest} extends {@link RequestModel}
 *
 * <p>ListDeveloperPbcsRequest</p>
 */
public class ListDeveloperPbcsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("marketId")
    private Long marketId;

    private ListDeveloperPbcsRequest(Builder builder) {
        super(builder);
        this.companyId = builder.companyId;
        this.marketId = builder.marketId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeveloperPbcsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return marketId
     */
    public Long getMarketId() {
        return this.marketId;
    }

    public static final class Builder extends Request.Builder<ListDeveloperPbcsRequest, Builder> {
        private Long companyId; 
        private Long marketId; 

        private Builder() {
            super();
        } 

        private Builder(ListDeveloperPbcsRequest request) {
            super(request);
            this.companyId = request.companyId;
            this.marketId = request.marketId;
        } 

        /**
         * companyId.
         */
        public Builder companyId(Long companyId) {
            this.putQueryParameter("companyId", companyId);
            this.companyId = companyId;
            return this;
        }

        /**
         * marketId.
         */
        public Builder marketId(Long marketId) {
            this.putQueryParameter("marketId", marketId);
            this.marketId = marketId;
            return this;
        }

        @Override
        public ListDeveloperPbcsRequest build() {
            return new ListDeveloperPbcsRequest(this);
        } 

    } 

}
