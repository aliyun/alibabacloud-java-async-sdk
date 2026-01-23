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
 * {@link DeleteSecurityClassifyCatalogRequest} extends {@link RequestModel}
 *
 * <p>DeleteSecurityClassifyCatalogRequest</p>
 */
public class DeleteSecurityClassifyCatalogRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeleteCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private DeleteCommand deleteCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private DeleteSecurityClassifyCatalogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.deleteCommand = builder.deleteCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSecurityClassifyCatalogRequest create() {
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
     * @return deleteCommand
     */
    public DeleteCommand getDeleteCommand() {
        return this.deleteCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<DeleteSecurityClassifyCatalogRequest, Builder> {
        private String regionId; 
        private DeleteCommand deleteCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSecurityClassifyCatalogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.deleteCommand = request.deleteCommand;
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
        public Builder deleteCommand(DeleteCommand deleteCommand) {
            String deleteCommandShrink = shrink(deleteCommand, "DeleteCommand", "json");
            this.putBodyParameter("DeleteCommand", deleteCommandShrink);
            this.deleteCommand = deleteCommand;
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
        public DeleteSecurityClassifyCatalogRequest build() {
            return new DeleteSecurityClassifyCatalogRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeleteSecurityClassifyCatalogRequest} extends {@link TeaModel}
     *
     * <p>DeleteSecurityClassifyCatalogRequest</p>
     */
    public static class DeleteCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Path")
        @com.aliyun.core.annotation.Validation(required = true)
        private String path;

        @com.aliyun.core.annotation.NameInMap("ReturnRemovedDetails")
        private Boolean returnRemovedDetails;

        private DeleteCommand(Builder builder) {
            this.path = builder.path;
            this.returnRemovedDetails = builder.returnRemovedDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteCommand create() {
            return builder().build();
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return returnRemovedDetails
         */
        public Boolean getReturnRemovedDetails() {
            return this.returnRemovedDetails;
        }

        public static final class Builder {
            private String path; 
            private Boolean returnRemovedDetails; 

            private Builder() {
            } 

            private Builder(DeleteCommand model) {
                this.path = model.path;
                this.returnRemovedDetails = model.returnRemovedDetails;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>/d1/d2/</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * ReturnRemovedDetails.
             */
            public Builder returnRemovedDetails(Boolean returnRemovedDetails) {
                this.returnRemovedDetails = returnRemovedDetails;
                return this;
            }

            public DeleteCommand build() {
                return new DeleteCommand(this);
            } 

        } 

    }
}
