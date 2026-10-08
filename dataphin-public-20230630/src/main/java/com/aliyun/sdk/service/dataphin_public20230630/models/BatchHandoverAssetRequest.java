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
 * {@link BatchHandoverAssetRequest} extends {@link RequestModel}
 *
 * <p>BatchHandoverAssetRequest</p>
 */
public class BatchHandoverAssetRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HandoverCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private HandoverCommand handoverCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    private BatchHandoverAssetRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.handoverCommand = builder.handoverCommand;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchHandoverAssetRequest create() {
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
     * @return handoverCommand
     */
    public HandoverCommand getHandoverCommand() {
        return this.handoverCommand;
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

    public static final class Builder extends Request.Builder<BatchHandoverAssetRequest, Builder> {
        private String regionId; 
        private HandoverCommand handoverCommand; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(BatchHandoverAssetRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.handoverCommand = request.handoverCommand;
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
        public Builder handoverCommand(HandoverCommand handoverCommand) {
            String handoverCommandShrink = shrink(handoverCommand, "HandoverCommand", "json");
            this.putBodyParameter("HandoverCommand", handoverCommandShrink);
            this.handoverCommand = handoverCommand;
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
        public BatchHandoverAssetRequest build() {
            return new BatchHandoverAssetRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchHandoverAssetRequest} extends {@link TeaModel}
     *
     * <p>BatchHandoverAssetRequest</p>
     */
    public static class HandoverCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GuidList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> guidList;

        @com.aliyun.core.annotation.NameInMap("TargetUserId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String targetUserId;

        private HandoverCommand(Builder builder) {
            this.guidList = builder.guidList;
            this.targetUserId = builder.targetUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HandoverCommand create() {
            return builder().build();
        }

        /**
         * @return guidList
         */
        public java.util.List<String> getGuidList() {
            return this.guidList;
        }

        /**
         * @return targetUserId
         */
        public String getTargetUserId() {
            return this.targetUserId;
        }

        public static final class Builder {
            private java.util.List<String> guidList; 
            private String targetUserId; 

            private Builder() {
            } 

            private Builder(HandoverCommand model) {
                this.guidList = model.guidList;
                this.targetUserId = model.targetUserId;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder guidList(java.util.List<String> guidList) {
                this.guidList = guidList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>300004567</p>
             */
            public Builder targetUserId(String targetUserId) {
                this.targetUserId = targetUserId;
                return this;
            }

            public HandoverCommand build() {
                return new HandoverCommand(this);
            } 

        } 

    }
}
