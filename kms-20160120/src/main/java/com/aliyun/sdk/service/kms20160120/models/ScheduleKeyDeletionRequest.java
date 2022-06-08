// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScheduleKeyDeletionRequest} extends {@link RequestModel}
 *
 * <p>ScheduleKeyDeletionRequest</p>
 */
public class ScheduleKeyDeletionRequest extends Request {
    @Query
    @NameInMap("KeyId")
    @Validation(required = true)
    private String keyId;

    @Query
    @NameInMap("PendingWindowInDays")
    private Integer pendingWindowInDays;

    private ScheduleKeyDeletionRequest(Builder builder) {
        super(builder);
        this.keyId = builder.keyId;
        this.pendingWindowInDays = builder.pendingWindowInDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScheduleKeyDeletionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * @return pendingWindowInDays
     */
    public Integer getPendingWindowInDays() {
        return this.pendingWindowInDays;
    }

    public static final class Builder extends Request.Builder<ScheduleKeyDeletionRequest, Builder> {
        private String keyId; 
        private Integer pendingWindowInDays; 

        private Builder() {
            super();
        } 

        private Builder(ScheduleKeyDeletionRequest request) {
            super(request);
            this.keyId = request.keyId;
            this.pendingWindowInDays = request.pendingWindowInDays;
        } 

        /**
         * KeyId.
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        /**
         * PendingWindowInDays.
         */
        public Builder pendingWindowInDays(Integer pendingWindowInDays) {
            this.putQueryParameter("PendingWindowInDays", pendingWindowInDays);
            this.pendingWindowInDays = pendingWindowInDays;
            return this;
        }

        @Override
        public ScheduleKeyDeletionRequest build() {
            return new ScheduleKeyDeletionRequest(this);
        } 

    } 

}
