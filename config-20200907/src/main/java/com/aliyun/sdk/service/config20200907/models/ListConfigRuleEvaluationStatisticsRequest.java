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
 * {@link ListConfigRuleEvaluationStatisticsRequest} extends {@link RequestModel}
 *
 * <p>ListConfigRuleEvaluationStatisticsRequest</p>
 */
public class ListConfigRuleEvaluationStatisticsRequest extends Request {
    private ListConfigRuleEvaluationStatisticsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConfigRuleEvaluationStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListConfigRuleEvaluationStatisticsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListConfigRuleEvaluationStatisticsRequest request) {
            super(request);
        } 

        @Override
        public ListConfigRuleEvaluationStatisticsRequest build() {
            return new ListConfigRuleEvaluationStatisticsRequest(this);
        } 

    } 

}
