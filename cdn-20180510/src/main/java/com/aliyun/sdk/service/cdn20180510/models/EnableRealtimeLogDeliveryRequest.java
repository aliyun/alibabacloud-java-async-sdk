// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableRealtimeLogDeliveryRequest} extends {@link RequestModel}
 *
 * <p>EnableRealtimeLogDeliveryRequest</p>
 */
public class EnableRealtimeLogDeliveryRequest extends Request {
    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private EnableRealtimeLogDeliveryRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableRealtimeLogDeliveryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<EnableRealtimeLogDeliveryRequest, Builder> {
        private String domain; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(EnableRealtimeLogDeliveryRequest response) {
            super(response);
            this.domain = response.domain;
            this.ownerId = response.ownerId;
        } 

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public EnableRealtimeLogDeliveryRequest build() {
            return new EnableRealtimeLogDeliveryRequest(this);
        } 

    } 

}
