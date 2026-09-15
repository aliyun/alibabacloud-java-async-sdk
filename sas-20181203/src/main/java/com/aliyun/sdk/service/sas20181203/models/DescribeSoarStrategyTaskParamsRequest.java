// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeSoarStrategyTaskParamsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSoarStrategyTaskParamsRequest</p>
 */
public class DescribeSoarStrategyTaskParamsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyTaskId")
    private Long strategyTaskId;

    private DescribeSoarStrategyTaskParamsRequest(Builder builder) {
        super(builder);
        this.strategyTaskId = builder.strategyTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSoarStrategyTaskParamsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return strategyTaskId
     */
    public Long getStrategyTaskId() {
        return this.strategyTaskId;
    }

    public static final class Builder extends Request.Builder<DescribeSoarStrategyTaskParamsRequest, Builder> {
        private Long strategyTaskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSoarStrategyTaskParamsRequest request) {
            super(request);
            this.strategyTaskId = request.strategyTaskId;
        } 

        /**
         * <p>The ID of the policy task.</p>
         * <blockquote>
         * <p>Call the <a href="~~DescribeSoarStrategyTasks~~">DescribeSoarStrategyTasks</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder strategyTaskId(Long strategyTaskId) {
            this.putQueryParameter("StrategyTaskId", strategyTaskId);
            this.strategyTaskId = strategyTaskId;
            return this;
        }

        @Override
        public DescribeSoarStrategyTaskParamsRequest build() {
            return new DescribeSoarStrategyTaskParamsRequest(this);
        } 

    } 

}
