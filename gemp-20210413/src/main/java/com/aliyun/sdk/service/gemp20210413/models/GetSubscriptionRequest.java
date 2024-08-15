// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSubscriptionRequest} extends {@link RequestModel}
 *
 * <p>GetSubscriptionRequest</p>
 */
public class GetSubscriptionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("notFilterScopeObjectDeleted")
    private Boolean notFilterScopeObjectDeleted;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("subscriptionId")
    private Long subscriptionId;

    private GetSubscriptionRequest(Builder builder) {
        super(builder);
        this.notFilterScopeObjectDeleted = builder.notFilterScopeObjectDeleted;
        this.subscriptionId = builder.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubscriptionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return notFilterScopeObjectDeleted
     */
    public Boolean getNotFilterScopeObjectDeleted() {
        return this.notFilterScopeObjectDeleted;
    }

    /**
     * @return subscriptionId
     */
    public Long getSubscriptionId() {
        return this.subscriptionId;
    }

    public static final class Builder extends Request.Builder<GetSubscriptionRequest, Builder> {
        private Boolean notFilterScopeObjectDeleted; 
        private Long subscriptionId; 

        private Builder() {
            super();
        } 

        private Builder(GetSubscriptionRequest request) {
            super(request);
            this.notFilterScopeObjectDeleted = request.notFilterScopeObjectDeleted;
            this.subscriptionId = request.subscriptionId;
        } 

        /**
         * notFilterScopeObjectDeleted.
         */
        public Builder notFilterScopeObjectDeleted(Boolean notFilterScopeObjectDeleted) {
            this.putBodyParameter("notFilterScopeObjectDeleted", notFilterScopeObjectDeleted);
            this.notFilterScopeObjectDeleted = notFilterScopeObjectDeleted;
            return this;
        }

        /**
         * subscriptionId.
         */
        public Builder subscriptionId(Long subscriptionId) {
            this.putBodyParameter("subscriptionId", subscriptionId);
            this.subscriptionId = subscriptionId;
            return this;
        }

        @Override
        public GetSubscriptionRequest build() {
            return new GetSubscriptionRequest(this);
        } 

    } 

}
