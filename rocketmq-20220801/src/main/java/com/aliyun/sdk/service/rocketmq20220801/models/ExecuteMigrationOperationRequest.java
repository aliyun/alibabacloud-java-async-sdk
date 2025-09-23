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
 * {@link ExecuteMigrationOperationRequest} extends {@link RequestModel}
 *
 * <p>ExecuteMigrationOperationRequest</p>
 */
public class ExecuteMigrationOperationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("migrationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long migrationId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("stageType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stageType;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("operationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long operationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operationParam")
    private OperationParam operationParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    private ExecuteMigrationOperationRequest(Builder builder) {
        super(builder);
        this.migrationId = builder.migrationId;
        this.stageType = builder.stageType;
        this.operationId = builder.operationId;
        this.operationParam = builder.operationParam;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteMigrationOperationRequest create() {
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
     * @return operationId
     */
    public Long getOperationId() {
        return this.operationId;
    }

    /**
     * @return operationParam
     */
    public OperationParam getOperationParam() {
        return this.operationParam;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<ExecuteMigrationOperationRequest, Builder> {
        private Long migrationId; 
        private String stageType; 
        private Long operationId; 
        private OperationParam operationParam; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteMigrationOperationRequest request) {
            super(request);
            this.migrationId = request.migrationId;
            this.stageType = request.stageType;
            this.operationId = request.operationId;
            this.operationParam = request.operationParam;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>44</p>
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
         * <p>MIGRATE_METADATA</p>
         */
        public Builder stageType(String stageType) {
            this.putPathParameter("stageType", stageType);
            this.stageType = stageType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2729</p>
         */
        public Builder operationId(Long operationId) {
            this.putPathParameter("operationId", operationId);
            this.operationId = operationId;
            return this;
        }

        /**
         * operationParam.
         */
        public Builder operationParam(OperationParam operationParam) {
            this.putBodyParameter("operationParam", operationParam);
            this.operationParam = operationParam;
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
        public ExecuteMigrationOperationRequest build() {
            return new ExecuteMigrationOperationRequest(this);
        } 

    } 

    /**
     * 
     * {@link ExecuteMigrationOperationRequest} extends {@link TeaModel}
     *
     * <p>ExecuteMigrationOperationRequest</p>
     */
    public static class OperationParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("paramData")
        private Object paramData;

        private OperationParam(Builder builder) {
            this.paramData = builder.paramData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationParam create() {
            return builder().build();
        }

        /**
         * @return paramData
         */
        public Object getParamData() {
            return this.paramData;
        }

        public static final class Builder {
            private Object paramData; 

            private Builder() {
            } 

            private Builder(OperationParam model) {
                this.paramData = model.paramData;
            } 

            /**
             * paramData.
             */
            public Builder paramData(Object paramData) {
                this.paramData = paramData;
                return this;
            }

            public OperationParam build() {
                return new OperationParam(this);
            } 

        } 

    }
}
