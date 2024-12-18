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
 * {@link ListAggregateConfigRuleEvaluationStatisticsRequest} extends {@link RequestModel}
 *
 * <p>ListAggregateConfigRuleEvaluationStatisticsRequest</p>
 */
public class ListAggregateConfigRuleEvaluationStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    private ListAggregateConfigRuleEvaluationStatisticsRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAggregateConfigRuleEvaluationStatisticsRequest create() {
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

    public static final class Builder extends Request.Builder<ListAggregateConfigRuleEvaluationStatisticsRequest, Builder> {
        private String aggregatorId; 

        private Builder() {
            super();
        } 

        private Builder(ListAggregateConfigRuleEvaluationStatisticsRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
        } 

        /**
         * <p>The ID of the account group.</p>
         * <p>For more information about how to obtain the ID of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-edd3626622af00b3****</p>
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        @Override
        public ListAggregateConfigRuleEvaluationStatisticsRequest build() {
            return new ListAggregateConfigRuleEvaluationStatisticsRequest(this);
        } 

    } 

}
