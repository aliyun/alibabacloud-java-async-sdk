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
 * {@link TransferOwnershipForAllObjectRequest} extends {@link RequestModel}
 *
 * <p>TransferOwnershipForAllObjectRequest</p>
 */
public class TransferOwnershipForAllObjectRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PrivilegeTransferRecord")
    private PrivilegeTransferRecord privilegeTransferRecord;

    private TransferOwnershipForAllObjectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.privilegeTransferRecord = builder.privilegeTransferRecord;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferOwnershipForAllObjectRequest create() {
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
     * @return privilegeTransferRecord
     */
    public PrivilegeTransferRecord getPrivilegeTransferRecord() {
        return this.privilegeTransferRecord;
    }

    public static final class Builder extends Request.Builder<TransferOwnershipForAllObjectRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private PrivilegeTransferRecord privilegeTransferRecord; 

        private Builder() {
            super();
        } 

        private Builder(TransferOwnershipForAllObjectRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.privilegeTransferRecord = request.privilegeTransferRecord;
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
         * PrivilegeTransferRecord.
         */
        public Builder privilegeTransferRecord(PrivilegeTransferRecord privilegeTransferRecord) {
            String privilegeTransferRecordShrink = shrink(privilegeTransferRecord, "PrivilegeTransferRecord", "json");
            this.putBodyParameter("PrivilegeTransferRecord", privilegeTransferRecordShrink);
            this.privilegeTransferRecord = privilegeTransferRecord;
            return this;
        }

        @Override
        public TransferOwnershipForAllObjectRequest build() {
            return new TransferOwnershipForAllObjectRequest(this);
        } 

    } 

    /**
     * 
     * {@link TransferOwnershipForAllObjectRequest} extends {@link TeaModel}
     *
     * <p>TransferOwnershipForAllObjectRequest</p>
     */
    public static class PrivilegeTransferRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NewOwner")
        @com.aliyun.core.annotation.Validation(required = true)
        private String newOwner;

        @com.aliyun.core.annotation.NameInMap("OldOwner")
        @com.aliyun.core.annotation.Validation(required = true)
        private String oldOwner;

        @com.aliyun.core.annotation.NameInMap("TransferComment")
        private String transferComment;

        private PrivilegeTransferRecord(Builder builder) {
            this.newOwner = builder.newOwner;
            this.oldOwner = builder.oldOwner;
            this.transferComment = builder.transferComment;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivilegeTransferRecord create() {
            return builder().build();
        }

        /**
         * @return newOwner
         */
        public String getNewOwner() {
            return this.newOwner;
        }

        /**
         * @return oldOwner
         */
        public String getOldOwner() {
            return this.oldOwner;
        }

        /**
         * @return transferComment
         */
        public String getTransferComment() {
            return this.transferComment;
        }

        public static final class Builder {
            private String newOwner; 
            private String oldOwner; 
            private String transferComment; 

            private Builder() {
            } 

            private Builder(PrivilegeTransferRecord model) {
                this.newOwner = model.newOwner;
                this.oldOwner = model.oldOwner;
                this.transferComment = model.transferComment;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>30000002</p>
             */
            public Builder newOwner(String newOwner) {
                this.newOwner = newOwner;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>30000001</p>
             */
            public Builder oldOwner(String oldOwner) {
                this.oldOwner = oldOwner;
                return this;
            }

            /**
             * TransferComment.
             */
            public Builder transferComment(String transferComment) {
                this.transferComment = transferComment;
                return this;
            }

            public PrivilegeTransferRecord build() {
                return new PrivilegeTransferRecord(this);
            } 

        } 

    }
}
