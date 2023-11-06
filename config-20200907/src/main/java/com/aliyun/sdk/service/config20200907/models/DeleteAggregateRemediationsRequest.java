// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAggregateRemediationsRequest} extends {@link RequestModel}
 *
 * <p>DeleteAggregateRemediationsRequest</p>
 */
public class DeleteAggregateRemediationsRequest extends Request {
    @Body
    @NameInMap("AggregatorId")
    @Validation(required = true)
    private String aggregatorId;

    @Body
    @NameInMap("RemediationIds")
    @Validation(required = true)
    private String remediationIds;

    private DeleteAggregateRemediationsRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.remediationIds = builder.remediationIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAggregateRemediationsRequest create() {
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
     * @return remediationIds
     */
    public String getRemediationIds() {
        return this.remediationIds;
    }

    public static final class Builder extends Request.Builder<DeleteAggregateRemediationsRequest, Builder> {
        private String aggregatorId; 
        private String remediationIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAggregateRemediationsRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.remediationIds = request.remediationIds;
        } 

        /**
         * The ID of the account group.
         * <p>
         * 
         * For more information about how to obtain the ID of the account group, see [ListAggregators](~~255797~~).
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putBodyParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * The ID of the remediation template. Separate multiple remediation template IDs with commas (,).
         * <p>
         * 
         * For more information about how to obtain the ID of a remediation template, see [ListAggregateRemediations](~~270036~~).
         */
        public Builder remediationIds(String remediationIds) {
            this.putBodyParameter("RemediationIds", remediationIds);
            this.remediationIds = remediationIds;
            return this;
        }

        @Override
        public DeleteAggregateRemediationsRequest build() {
            return new DeleteAggregateRemediationsRequest(this);
        } 

    } 

}
