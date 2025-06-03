// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link ScheduleKeyDeletionRequest} extends {@link RequestModel}
 *
 * <p>ScheduleKeyDeletionRequest</p>
 */
public class ScheduleKeyDeletionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PendingWindowInDays")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 366, minimum = 7)
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
         * <p>The ID of the customer master key (CMK). The ID must be globally unique.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7906979c-8e06-46a2-be2d-68e3ccbc****</p>
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        /**
         * <p>The scheduled period after which the CMK is deleted. During this period, the CMK is in the PendingDeletion state. After this period ends, you cannot cancel the key deletion task.</p>
         * <p>Valid values: 7 to 366.</p>
         * <p>Unit: days.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
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
