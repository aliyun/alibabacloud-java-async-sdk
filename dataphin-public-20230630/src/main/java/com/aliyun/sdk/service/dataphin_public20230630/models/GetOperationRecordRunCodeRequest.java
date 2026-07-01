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
 * {@link GetOperationRecordRunCodeRequest} extends {@link RequestModel}
 *
 * <p>GetOperationRecordRunCodeRequest</p>
 */
public class GetOperationRecordRunCodeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CodeCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private CodeCommand codeCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private GetOperationRecordRunCodeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.codeCommand = builder.codeCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOperationRecordRunCodeRequest create() {
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
     * @return codeCommand
     */
    public CodeCommand getCodeCommand() {
        return this.codeCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<GetOperationRecordRunCodeRequest, Builder> {
        private String regionId; 
        private CodeCommand codeCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetOperationRecordRunCodeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.codeCommand = request.codeCommand;
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
        public Builder codeCommand(CodeCommand codeCommand) {
            String codeCommandShrink = shrink(codeCommand, "CodeCommand", "json");
            this.putBodyParameter("CodeCommand", codeCommandShrink);
            this.codeCommand = codeCommand;
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
        public GetOperationRecordRunCodeRequest build() {
            return new GetOperationRecordRunCodeRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetOperationRecordRunCodeRequest} extends {@link TeaModel}
     *
     * <p>GetOperationRecordRunCodeRequest</p>
     */
    public static class CodeCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OperationId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long operationId;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        private CodeCommand(Builder builder) {
            this.operationId = builder.operationId;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CodeCommand create() {
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

            private Builder(CodeCommand model) {
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

            public CodeCommand build() {
                return new CodeCommand(this);
            } 

        } 

    }
}
