// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFCTriggerRequest} extends {@link RequestModel}
 *
 * <p>DescribeFCTriggerRequest</p>
 */
public class DescribeFCTriggerRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("TriggerARN")
    @Validation(required = true)
    private String triggerARN;

    private DescribeFCTriggerRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.triggerARN = builder.triggerARN;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFCTriggerRequest create() {
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
     * @return triggerARN
     */
    public String getTriggerARN() {
        return this.triggerARN;
    }

    public static final class Builder extends Request.Builder<DescribeFCTriggerRequest, Builder> {
        private Long ownerId; 
        private String triggerARN; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFCTriggerRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.triggerARN = response.triggerARN;
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
         * TriggerARN.
         */
        public Builder triggerARN(String triggerARN) {
            this.putQueryParameter("TriggerARN", triggerARN);
            this.triggerARN = triggerARN;
            return this;
        }

        @Override
        public DescribeFCTriggerRequest build() {
            return new DescribeFCTriggerRequest(this);
        } 

    } 

}
