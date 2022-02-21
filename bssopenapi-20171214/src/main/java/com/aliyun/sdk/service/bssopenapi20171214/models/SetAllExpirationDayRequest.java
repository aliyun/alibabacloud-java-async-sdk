// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetAllExpirationDayRequest} extends {@link RequestModel}
 *
 * <p>SetAllExpirationDayRequest</p>
 */
public class SetAllExpirationDayRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("UnifyExpireDay")
    @Validation(required = true)
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

        private Builder(SetAllExpirationDayRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.unifyExpireDay = response.unifyExpireDay;
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
         * UnifyExpireDay.
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
