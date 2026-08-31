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
 * {@link DeleteSecurityIdentifyResultsRequest} extends {@link RequestModel}
 *
 * <p>DeleteSecurityIdentifyResultsRequest</p>
 */
public class DeleteSecurityIdentifyResultsRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    private DeleteSecurityIdentifyResultsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.deleteCommand = builder.deleteCommand;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSecurityIdentifyResultsRequest create() {
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

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    public static final class Builder extends Request.Builder<DeleteSecurityIdentifyResultsRequest, Builder> {
        private String regionId; 
        private DeleteCommand deleteCommand; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSecurityIdentifyResultsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.deleteCommand = request.deleteCommand;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
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

        /**
         * OpUserId.
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        @Override
        public DeleteSecurityIdentifyResultsRequest build() {
            return new DeleteSecurityIdentifyResultsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeleteSecurityIdentifyResultsRequest} extends {@link TeaModel}
     *
     * <p>DeleteSecurityIdentifyResultsRequest</p>
     */
    public static class DeleteCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IdentifyResultIdList")
        private java.util.List<Long> identifyResultIdList;

        private DeleteCommand(Builder builder) {
            this.identifyResultIdList = builder.identifyResultIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteCommand create() {
            return builder().build();
        }

        /**
         * @return identifyResultIdList
         */
        public java.util.List<Long> getIdentifyResultIdList() {
            return this.identifyResultIdList;
        }

        public static final class Builder {
            private java.util.List<Long> identifyResultIdList; 

            private Builder() {
            } 

            private Builder(DeleteCommand model) {
                this.identifyResultIdList = model.identifyResultIdList;
            } 

            /**
             * IdentifyResultIdList.
             */
            public Builder identifyResultIdList(java.util.List<Long> identifyResultIdList) {
                this.identifyResultIdList = identifyResultIdList;
                return this;
            }

            public DeleteCommand build() {
                return new DeleteCommand(this);
            } 

        } 

    }
}
