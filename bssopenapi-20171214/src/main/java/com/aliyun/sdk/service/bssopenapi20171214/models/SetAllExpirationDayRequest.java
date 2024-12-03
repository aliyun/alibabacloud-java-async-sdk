// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetAllExpirationDayRequest} extends {@link RequestModel}
 *
 * <p>SetAllExpirationDayRequest</p>
 */
public class SetAllExpirationDayRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnifyExpireDay")
    @com.aliyun.core.annotation.Validation(required = true)
    private String unifyExpireDay;

    private SetAllExpirationDayRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.unifyExpireDay = builder.unifyExpireDay;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAllExpirationDayRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return unifyExpireDay
     */
    public String getUnifyExpireDay() {
        return this.unifyExpireDay;
    }

    public static final class Builder extends Request.Builder<SetAllExpirationDayRequest, Builder> {
        private Long ownerId; 
        private String unifyExpireDay; 

        private Builder() {
            super();
        } 

        private Builder(SetAllExpirationDayRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.unifyExpireDay = request.unifyExpireDay;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The expiration date. You can set an expiration date only for ECS instances that have not expired. The expiration date that you specify do not take effect on expired ECS instances. After the expiration date is set, the expiration date is used when you renew ECS instances.</p>
         * <p>You can set the expiration date to a day from the 1st to the 28th of each month.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder unifyExpireDay(String unifyExpireDay) {
            this.putQueryParameter("UnifyExpireDay", unifyExpireDay);
            this.unifyExpireDay = unifyExpireDay;
            return this;
        }

        @Override
        public SetAllExpirationDayRequest build() {
            return new SetAllExpirationDayRequest(this);
        } 

    } 

}
