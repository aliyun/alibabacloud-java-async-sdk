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
 * {@link FinishMigrationStageRequest} extends {@link RequestModel}
 *
 * <p>FinishMigrationStageRequest</p>
 */
public class FinishMigrationStageRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("migrationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long migrationId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("stageType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    private FinishMigrationStageRequest(Builder builder) {
        super(builder);
        this.migrationId = builder.migrationId;
        this.stageType = builder.stageType;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FinishMigrationStageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return migrationId
     */
    public Long getMigrationId() {
        return this.migrationId;
    }

    /**
     * @return stageType
     */
    public String getStageType() {
        return this.stageType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<FinishMigrationStageRequest, Builder> {
        private Long migrationId; 
        private String stageType; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(FinishMigrationStageRequest request) {
            super(request);
            this.migrationId = request.migrationId;
            this.stageType = request.stageType;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder migrationId(Long migrationId) {
            this.putPathParameter("migrationId", migrationId);
            this.migrationId = migrationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CONNECT_NETWORK</p>
         */
        public Builder stageType(String stageType) {
            this.putPathParameter("stageType", stageType);
            this.stageType = stageType;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public FinishMigrationStageRequest build() {
            return new FinishMigrationStageRequest(this);
        } 

    } 

}
