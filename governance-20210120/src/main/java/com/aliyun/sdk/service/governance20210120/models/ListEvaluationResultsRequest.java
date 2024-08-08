// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEvaluationResultsRequest} extends {@link RequestModel}
 *
 * <p>ListEvaluationResultsRequest</p>
 */
public class ListEvaluationResultsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private Long accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ListEvaluationResultsRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEvaluationResultsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public Long getAccountId() {
        return this.accountId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListEvaluationResultsRequest, Builder> {
        private Long accountId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListEvaluationResultsRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.regionId = request.regionId;
        } 

        /**
         * AccountId.
         */
        public Builder accountId(Long accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListEvaluationResultsRequest build() {
            return new ListEvaluationResultsRequest(this);
        } 

    } 

}
