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
 * {@link DeleteSoarStrategyTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteSoarStrategyTaskRequest</p>
 */
public class DeleteSoarStrategyTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long strategyTaskId;

    private DeleteSoarStrategyTaskRequest(Builder builder) {
        super(builder);
        this.strategyTaskId = builder.strategyTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSoarStrategyTaskRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteSoarStrategyTaskRequest, Builder> {
        private Long strategyTaskId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSoarStrategyTaskRequest request) {
            super(request);
            this.strategyTaskId = request.strategyTaskId;
        } 

        /**
         * <p>The ID of the policy task that is in the waiting state.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeSoarStrategyTasks~~">DescribeSoarStrategyTasks</a> operation to obtain the ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11082</p>
         */
        public Builder strategyTaskId(Long strategyTaskId) {
            this.putQueryParameter("StrategyTaskId", strategyTaskId);
            this.strategyTaskId = strategyTaskId;
            return this;
        }

        @Override
        public DeleteSoarStrategyTaskRequest build() {
            return new DeleteSoarStrategyTaskRequest(this);
        } 

    } 

}
