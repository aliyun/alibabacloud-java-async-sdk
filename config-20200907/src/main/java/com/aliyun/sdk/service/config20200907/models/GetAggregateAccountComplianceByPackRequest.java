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
 * {@link GetAggregateAccountComplianceByPackRequest} extends {@link RequestModel}
 *
 * <p>GetAggregateAccountComplianceByPackRequest</p>
 */
public class GetAggregateAccountComplianceByPackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompliancePackId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String compliancePackId;

    private GetAggregateAccountComplianceByPackRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.compliancePackId = builder.compliancePackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateAccountComplianceByPackRequest create() {
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

    public static final class Builder extends Request.Builder<GetAggregateAccountComplianceByPackRequest, Builder> {
        private String aggregatorId; 
        private String compliancePackId; 

        private Builder() {
            super();
        } 

        private Builder(GetAggregateAccountComplianceByPackRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.compliancePackId = request.compliancePackId;
        } 

        /**
         * <p>The ID of the account group.</p>
         * <p>For more information about how to obtain the ID of the account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-04b3fd170e340007****</p>
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * <p>The ID of the compliance package.</p>
         * <p>For more information about how to obtain the ID of a compliance package, see <a href="https://help.aliyun.com/document_detail/262059.html">ListAggregateCompliancePacks</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cp-541e626622af0087****</p>
         */
        public Builder compliancePackId(String compliancePackId) {
            this.putQueryParameter("CompliancePackId", compliancePackId);
            this.compliancePackId = compliancePackId;
            return this;
        }

        @Override
        public GetAggregateAccountComplianceByPackRequest build() {
            return new GetAggregateAccountComplianceByPackRequest(this);
        } 

    } 

}
