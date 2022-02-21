// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeComplianceSummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribeComplianceSummaryRequest</p>
 */
public class DescribeComplianceSummaryRequest extends Request {
    @Query
    @NameInMap("MemberId")
    private Long memberId;

    @Query
    @NameInMap("MultiAccount")
    private Boolean multiAccount;

    private DescribeComplianceSummaryRequest(Builder builder) {
        super(builder);
        this.memberId = builder.memberId;
        this.multiAccount = builder.multiAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeComplianceSummaryRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeComplianceSummaryRequest, Builder> {
        private Long memberId; 
        private Boolean multiAccount; 

        private Builder() {
            super();
        } 

        private Builder(DescribeComplianceSummaryRequest response) {
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
        public DescribeComplianceSummaryRequest build() {
            return new DescribeComplianceSummaryRequest(this);
        } 

    } 

}
