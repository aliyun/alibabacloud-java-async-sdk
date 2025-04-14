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
 * {@link SyncDisasterRecoveryCheckpointRequest} extends {@link RequestModel}
 *
 * <p>SyncDisasterRecoveryCheckpointRequest</p>
 */
public class SyncDisasterRecoveryCheckpointRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("planId")
    private Long planId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("itemId")
    private Long itemId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("checkpointId")
    private Long checkpointId;

    private SyncDisasterRecoveryCheckpointRequest(Builder builder) {
        super(builder);
        this.planId = builder.planId;
        this.itemId = builder.itemId;
        this.checkpointId = builder.checkpointId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncDisasterRecoveryCheckpointRequest create() {
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

    /**
     * @return checkpointId
     */
    public Long getCheckpointId() {
        return this.checkpointId;
    }

    public static final class Builder extends Request.Builder<SyncDisasterRecoveryCheckpointRequest, Builder> {
        private Long planId; 
        private Long itemId; 
        private Long checkpointId; 

        private Builder() {
            super();
        } 

        private Builder(SyncDisasterRecoveryCheckpointRequest request) {
            super(request);
            this.planId = request.planId;
            this.itemId = request.itemId;
            this.checkpointId = request.checkpointId;
        } 

        /**
         * <p>Backup Plan ID</p>
         * 
         * <strong>example:</strong>
         * <p>13000000xx</p>
         */
        public Builder planId(Long planId) {
            this.putPathParameter("planId", planId);
            this.planId = planId;
            return this;
        }

        /**
         * <p>Mapping ID</p>
         * 
         * <strong>example:</strong>
         * <p>13000000xx</p>
         */
        public Builder itemId(Long itemId) {
            this.putPathParameter("itemId", itemId);
            this.itemId = itemId;
            return this;
        }

        /**
         * <p>Consumption Progress ID</p>
         * 
         * <strong>example:</strong>
         * <p>13000000xx</p>
         */
        public Builder checkpointId(Long checkpointId) {
            this.putPathParameter("checkpointId", checkpointId);
            this.checkpointId = checkpointId;
            return this;
        }

        @Override
        public SyncDisasterRecoveryCheckpointRequest build() {
            return new SyncDisasterRecoveryCheckpointRequest(this);
        } 

    } 

}
