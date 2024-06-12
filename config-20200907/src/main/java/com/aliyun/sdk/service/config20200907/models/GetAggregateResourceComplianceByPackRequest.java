// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAggregateResourceComplianceByPackRequest} extends {@link RequestModel}
 *
 * <p>GetAggregateResourceComplianceByPackRequest</p>
 */
public class GetAggregateResourceComplianceByPackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompliancePackId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String compliancePackId;

    private GetAggregateResourceComplianceByPackRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.compliancePackId = builder.compliancePackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateResourceComplianceByPackRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    /**
     * @return compliancePackId
     */
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

    public static final class Builder extends Request.Builder<GetAggregateResourceComplianceByPackRequest, Builder> {
        private String aggregatorId; 
        private String compliancePackId; 

        private Builder() {
            super();
        } 

        private Builder(GetAggregateResourceComplianceByPackRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.compliancePackId = request.compliancePackId;
        } 

        /**
         * The ID of the account group.
         * <p>
         * 
         * For more information about how to obtain the ID of the account group, see [ListAggregators](~~255797~~).
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * The ID of the compliance package.
         * <p>
         * 
         * For more information about how to obtain the ID of a compliance package, see [ListAggregateCompliancePacks](~~262059~~).
         */
        public Builder compliancePackId(String compliancePackId) {
            this.putQueryParameter("CompliancePackId", compliancePackId);
            this.compliancePackId = compliancePackId;
            return this;
        }

        @Override
        public GetAggregateResourceComplianceByPackRequest build() {
            return new GetAggregateResourceComplianceByPackRequest(this);
        } 

    } 

}
