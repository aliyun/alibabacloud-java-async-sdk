// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDiscoveredResourceSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetDiscoveredResourceSummaryRequest</p>
 */
public class GetDiscoveredResourceSummaryRequest extends Request {
    @Query
    @NameInMap("MemberId")
    private Long memberId;

    @Query
    @NameInMap("MultiAccount")
    private Boolean multiAccount;

    private GetDiscoveredResourceSummaryRequest(Builder builder) {
        super(builder);
        this.memberId = builder.memberId;
        this.multiAccount = builder.multiAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDiscoveredResourceSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<GetDiscoveredResourceSummaryRequest, Builder> {
        private Long memberId; 
        private Boolean multiAccount; 

        private Builder() {
            super();
        } 

        private Builder(GetDiscoveredResourceSummaryRequest response) {
            super(response);
            this.memberId = response.memberId;
            this.multiAccount = response.multiAccount;
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
        public GetDiscoveredResourceSummaryRequest build() {
            return new GetDiscoveredResourceSummaryRequest(this);
        } 

    } 

}
