// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDiscoveredResourceCountsRequest} extends {@link RequestModel}
 *
 * <p>GetDiscoveredResourceCountsRequest</p>
 */
public class GetDiscoveredResourceCountsRequest extends Request {
    @Query
    @NameInMap("GroupByKey")
    private String groupByKey;

    @Query
    @NameInMap("MemberId")
    private Long memberId;

    @Query
    @NameInMap("MultiAccount")
    private Boolean multiAccount;

    private GetDiscoveredResourceCountsRequest(Builder builder) {
        super(builder);
        this.groupByKey = builder.groupByKey;
        this.memberId = builder.memberId;
        this.multiAccount = builder.multiAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDiscoveredResourceCountsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupByKey
     */
    public String getGroupByKey() {
        return this.groupByKey;
    }

    /**
     * @return memberId
     */
    public Long getMemberId() {
        return this.memberId;
    }

    /**
     * @return multiAccount
     */
    public Boolean getMultiAccount() {
        return this.multiAccount;
    }

    public static final class Builder extends Request.Builder<GetDiscoveredResourceCountsRequest, Builder> {
        private String groupByKey; 
        private Long memberId; 
        private Boolean multiAccount; 

        private Builder() {
            super();
        } 

        private Builder(GetDiscoveredResourceCountsRequest response) {
            super(response);
            this.groupByKey = response.groupByKey;
            this.memberId = response.memberId;
            this.multiAccount = response.multiAccount;
        } 

        /**
         * GroupByKey.
         */
        public Builder groupByKey(String groupByKey) {
            this.putQueryParameter("GroupByKey", groupByKey);
            this.groupByKey = groupByKey;
            return this;
        }

        /**
         * MemberId.
         */
        public Builder memberId(Long memberId) {
            this.putQueryParameter("MemberId", memberId);
            this.memberId = memberId;
            return this;
        }

        /**
         * MultiAccount.
         */
        public Builder multiAccount(Boolean multiAccount) {
            this.putQueryParameter("MultiAccount", multiAccount);
            this.multiAccount = multiAccount;
            return this;
        }

        @Override
        public GetDiscoveredResourceCountsRequest build() {
            return new GetDiscoveredResourceCountsRequest(this);
        } 

    } 

}
