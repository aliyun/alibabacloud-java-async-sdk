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
 * {@link SubmitAssetsOffShelveRequest} extends {@link RequestModel}
 *
 * <p>SubmitAssetsOffShelveRequest</p>
 */
public class SubmitAssetsOffShelveRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubmitCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private SubmitCommand submitCommand;

    private SubmitAssetsOffShelveRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.submitCommand = builder.submitCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAssetsOffShelveRequest create() {
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
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    /**
     * @return submitCommand
     */
    public SubmitCommand getSubmitCommand() {
        return this.submitCommand;
    }

    public static final class Builder extends Request.Builder<SubmitAssetsOffShelveRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private String opUserId; 
        private SubmitCommand submitCommand; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAssetsOffShelveRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
            this.submitCommand = request.submitCommand;
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
         * OpUserId.
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder submitCommand(SubmitCommand submitCommand) {
            String submitCommandShrink = shrink(submitCommand, "SubmitCommand", "json");
            this.putBodyParameter("SubmitCommand", submitCommandShrink);
            this.submitCommand = submitCommand;
            return this;
        }

        @Override
        public SubmitAssetsOffShelveRequest build() {
            return new SubmitAssetsOffShelveRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitAssetsOffShelveRequest} extends {@link TeaModel}
     *
     * <p>SubmitAssetsOffShelveRequest</p>
     */
    public static class SubmitCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GuidList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> guidList;

        @com.aliyun.core.annotation.NameInMap("OffShelveDescription")
        @com.aliyun.core.annotation.Validation(required = true)
        private String offShelveDescription;

        private SubmitCommand(Builder builder) {
            this.guidList = builder.guidList;
            this.offShelveDescription = builder.offShelveDescription;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubmitCommand create() {
            return builder().build();
        }

        /**
         * @return guidList
         */
        public java.util.List<String> getGuidList() {
            return this.guidList;
        }

        /**
         * @return offShelveDescription
         */
        public String getOffShelveDescription() {
            return this.offShelveDescription;
        }

        public static final class Builder {
            private java.util.List<String> guidList; 
            private String offShelveDescription; 

            private Builder() {
            } 

            private Builder(SubmitCommand model) {
                this.guidList = model.guidList;
                this.offShelveDescription = model.offShelveDescription;
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
             */
            public Builder offShelveDescription(String offShelveDescription) {
                this.offShelveDescription = offShelveDescription;
                return this;
            }

            public SubmitCommand build() {
                return new SubmitCommand(this);
            } 

        } 

    }
}
