// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link StartDisasterRecoveryItemRequest} extends {@link RequestModel}
 *
 * <p>StartDisasterRecoveryItemRequest</p>
 */
public class StartDisasterRecoveryItemRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("planId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long planId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("itemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long itemId;

    private StartDisasterRecoveryItemRequest(Builder builder) {
        super(builder);
        this.planId = builder.planId;
        this.itemId = builder.itemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartDisasterRecoveryItemRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return planId
     */
    public Long getPlanId() {
        return this.planId;
    }

    /**
     * @return itemId
     */
    public Long getItemId() {
        return this.itemId;
    }

    public static final class Builder extends Request.Builder<StartDisasterRecoveryItemRequest, Builder> {
        private Long planId; 
        private Long itemId; 

        private Builder() {
            super();
        } 

        private Builder(StartDisasterRecoveryItemRequest request) {
            super(request);
            this.planId = request.planId;
            this.itemId = request.itemId;
        } 

        /**
         * <p>Backup plan ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1300000016</p>
         */
        public Builder planId(Long planId) {
            this.putPathParameter("planId", planId);
            this.planId = planId;
            return this;
        }

        /**
         * <p>Mapping task ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100000704</p>
         */
        public Builder itemId(Long itemId) {
            this.putPathParameter("itemId", itemId);
            this.itemId = itemId;
            return this;
        }

        @Override
        public StartDisasterRecoveryItemRequest build() {
            return new StartDisasterRecoveryItemRequest(this);
        } 

    } 

}
