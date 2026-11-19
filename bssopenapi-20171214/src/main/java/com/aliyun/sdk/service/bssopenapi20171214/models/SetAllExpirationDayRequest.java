// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
         * <p>The current unified expiration date settings only support unexpired ECS instances. Expired instances cannot be aligned to the unified expiration date. After the settings are complete, you can align the renewal time with the configured unified expiration time.</p>
         * <p>Valid values: 1 to 28, representing the 1st to the 28th day of each month.</p>
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
