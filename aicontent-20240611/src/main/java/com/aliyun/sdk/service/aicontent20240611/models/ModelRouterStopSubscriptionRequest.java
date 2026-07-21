// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ModelRouterStopSubscriptionRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterStopSubscriptionRequest</p>
 */
public class ModelRouterStopSubscriptionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("balanceType")
    private String balanceType;

    private ModelRouterStopSubscriptionRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.balanceType = builder.balanceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterStopSubscriptionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return balanceType
     */
    public String getBalanceType() {
        return this.balanceType;
    }

    public static final class Builder extends Request.Builder<ModelRouterStopSubscriptionRequest, Builder> {
        private Long id; 
        private String balanceType; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterStopSubscriptionRequest request) {
            super(request);
            this.id = request.id;
            this.balanceType = request.balanceType;
        } 

        /**
         * id.
         */
        public Builder id(Long id) {
            this.putPathParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * balanceType.
         */
        public Builder balanceType(String balanceType) {
            this.putBodyParameter("balanceType", balanceType);
            this.balanceType = balanceType;
            return this;
        }

        @Override
        public ModelRouterStopSubscriptionRequest build() {
            return new ModelRouterStopSubscriptionRequest(this);
        } 

    } 

}
