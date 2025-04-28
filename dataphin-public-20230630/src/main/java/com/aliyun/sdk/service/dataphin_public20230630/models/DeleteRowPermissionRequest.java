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
 * {@link DeleteRowPermissionRequest} extends {@link RequestModel}
 *
 * <p>DeleteRowPermissionRequest</p>
 */
public class DeleteRowPermissionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeleteRowPermissionCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private DeleteRowPermissionCommand deleteRowPermissionCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private DeleteRowPermissionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.deleteRowPermissionCommand = builder.deleteRowPermissionCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRowPermissionRequest create() {
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
     * @return deleteRowPermissionCommand
     */
    public DeleteRowPermissionCommand getDeleteRowPermissionCommand() {
        return this.deleteRowPermissionCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<DeleteRowPermissionRequest, Builder> {
        private String regionId; 
        private DeleteRowPermissionCommand deleteRowPermissionCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRowPermissionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.deleteRowPermissionCommand = request.deleteRowPermissionCommand;
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
        public Builder deleteRowPermissionCommand(DeleteRowPermissionCommand deleteRowPermissionCommand) {
            String deleteRowPermissionCommandShrink = shrink(deleteRowPermissionCommand, "DeleteRowPermissionCommand", "json");
            this.putBodyParameter("DeleteRowPermissionCommand", deleteRowPermissionCommandShrink);
            this.deleteRowPermissionCommand = deleteRowPermissionCommand;
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
        public DeleteRowPermissionRequest build() {
            return new DeleteRowPermissionRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeleteRowPermissionRequest} extends {@link TeaModel}
     *
     * <p>DeleteRowPermissionRequest</p>
     */
    public static class DeleteRowPermissionCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RowPermissionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long rowPermissionId;

        private DeleteRowPermissionCommand(Builder builder) {
            this.rowPermissionId = builder.rowPermissionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteRowPermissionCommand create() {
            return builder().build();
        }

        /**
         * @return rowPermissionId
         */
        public Long getRowPermissionId() {
            return this.rowPermissionId;
        }

        public static final class Builder {
            private Long rowPermissionId; 

            private Builder() {
            } 

            private Builder(DeleteRowPermissionCommand model) {
                this.rowPermissionId = model.rowPermissionId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>300001234</p>
             */
            public Builder rowPermissionId(Long rowPermissionId) {
                this.rowPermissionId = rowPermissionId;
                return this;
            }

            public DeleteRowPermissionCommand build() {
                return new DeleteRowPermissionCommand(this);
            } 

        } 

    }
}
