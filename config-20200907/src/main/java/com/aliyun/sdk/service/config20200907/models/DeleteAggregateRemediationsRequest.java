// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link DeleteAggregateRemediationsRequest} extends {@link RequestModel}
 *
 * <p>DeleteAggregateRemediationsRequest</p>
 */
public class DeleteAggregateRemediationsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RemediationIds")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the account group.</p>
         * <p>For more information about how to obtain the ID of the account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-6b4a626622af0012****</p>
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putBodyParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * <p>The ID of the remediation template. Separate multiple remediation template IDs with commas (,).</p>
         * <p>For more information about how to obtain the ID of a remediation template, see <a href="https://help.aliyun.com/document_detail/270036.html">ListAggregateRemediations</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-909ba2d4716700eb****</p>
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
