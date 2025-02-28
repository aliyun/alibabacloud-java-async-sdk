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
 * {@link GetDisasterRecoveryItemRequest} extends {@link RequestModel}
 *
 * <p>GetDisasterRecoveryItemRequest</p>
 */
public class GetDisasterRecoveryItemRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("planId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long planId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("itemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long itemId;

    private GetDisasterRecoveryItemRequest(Builder builder) {
        super(builder);
        this.planId = builder.planId;
        this.itemId = builder.itemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDisasterRecoveryItemRequest create() {
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

    public static final class Builder extends Request.Builder<GetDisasterRecoveryItemRequest, Builder> {
        private Long planId; 
        private Long itemId; 

        private Builder() {
            super();
        } 

        private Builder(GetDisasterRecoveryItemRequest request) {
            super(request);
            this.planId = request.planId;
            this.itemId = request.itemId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder planId(Long planId) {
            this.putPathParameter("planId", planId);
            this.planId = planId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder itemId(Long itemId) {
            this.putPathParameter("itemId", itemId);
            this.itemId = itemId;
            return this;
        }

        @Override
        public GetDisasterRecoveryItemRequest build() {
            return new GetDisasterRecoveryItemRequest(this);
        } 

    } 

}
