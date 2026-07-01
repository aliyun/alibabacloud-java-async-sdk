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
 * {@link GetOperationRecordByIdRequest} extends {@link RequestModel}
 *
 * <p>GetOperationRecordByIdRequest</p>
 */
public class GetOperationRecordByIdRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DetailCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private DetailCommand detailCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private GetOperationRecordByIdRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.detailCommand = builder.detailCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOperationRecordByIdRequest create() {
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
     * @return detailCommand
     */
    public DetailCommand getDetailCommand() {
        return this.detailCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<GetOperationRecordByIdRequest, Builder> {
        private String regionId; 
        private DetailCommand detailCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetOperationRecordByIdRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.detailCommand = request.detailCommand;
            this.opTenantId = request.opTenantId;
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
         */
        public Builder detailCommand(DetailCommand detailCommand) {
            String detailCommandShrink = shrink(detailCommand, "DetailCommand", "json");
            this.putBodyParameter("DetailCommand", detailCommandShrink);
            this.detailCommand = detailCommand;
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

        @Override
        public GetOperationRecordByIdRequest build() {
            return new GetOperationRecordByIdRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetOperationRecordByIdRequest} extends {@link TeaModel}
     *
     * <p>GetOperationRecordByIdRequest</p>
     */
    public static class DetailCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OperationId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long operationId;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        private DetailCommand(Builder builder) {
            this.operationId = builder.operationId;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailCommand create() {
            return builder().build();
        }

        /**
         * @return operationId
         */
        public Long getOperationId() {
            return this.operationId;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private Long operationId; 
            private Long projectId; 

            private Builder() {
            } 

            private Builder(DetailCommand model) {
                this.operationId = model.operationId;
                this.projectId = model.projectId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>987654321</p>
             */
            public Builder operationId(Long operationId) {
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

            public DetailCommand build() {
                return new DetailCommand(this);
            } 

        } 

    }
}
