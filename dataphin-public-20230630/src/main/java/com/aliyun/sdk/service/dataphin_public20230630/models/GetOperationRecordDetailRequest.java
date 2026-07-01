// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetOperationRecordDetailRequest} extends {@link RequestModel}
 *
 * <p>GetOperationRecordDetailRequest</p>
 */
public class GetOperationRecordDetailRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecordDetailCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private RecordDetailCommand recordDetailCommand;

    private GetOperationRecordDetailRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.recordDetailCommand = builder.recordDetailCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOperationRecordDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return recordDetailCommand
     */
    public RecordDetailCommand getRecordDetailCommand() {
        return this.recordDetailCommand;
    }

    public static final class Builder extends Request.Builder<GetOperationRecordDetailRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private RecordDetailCommand recordDetailCommand; 

        private Builder() {
            super();
        } 

        private Builder(GetOperationRecordDetailRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.recordDetailCommand = request.recordDetailCommand;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder recordDetailCommand(RecordDetailCommand recordDetailCommand) {
            String recordDetailCommandShrink = shrink(recordDetailCommand, "RecordDetailCommand", "json");
            this.putBodyParameter("RecordDetailCommand", recordDetailCommandShrink);
            this.recordDetailCommand = recordDetailCommand;
            return this;
        }

        @Override
        public GetOperationRecordDetailRequest build() {
            return new GetOperationRecordDetailRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetOperationRecordDetailRequest} extends {@link TeaModel}
     *
     * <p>GetOperationRecordDetailRequest</p>
     */
    public static class RecordDetailCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OperationId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String operationId;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        private RecordDetailCommand(Builder builder) {
            this.operationId = builder.operationId;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordDetailCommand create() {
            return builder().build();
        }

        /**
         * @return operationId
         */
        public String getOperationId() {
            return this.operationId;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private String operationId; 
            private Long projectId; 

            private Builder() {
            } 

            private Builder(RecordDetailCommand model) {
                this.operationId = model.operationId;
                this.projectId = model.projectId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>987654321</p>
             */
            public Builder operationId(String operationId) {
                this.operationId = operationId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>131211211</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            public RecordDetailCommand build() {
                return new RecordDetailCommand(this);
            } 

        } 

    }
}
