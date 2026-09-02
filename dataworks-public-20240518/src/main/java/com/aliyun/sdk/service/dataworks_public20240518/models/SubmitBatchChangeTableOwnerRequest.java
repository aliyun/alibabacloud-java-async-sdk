// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link SubmitBatchChangeTableOwnerRequest} extends {@link RequestModel}
 *
 * <p>SubmitBatchChangeTableOwnerRequest</p>
 */
public class SubmitBatchChangeTableOwnerRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableCrossTenant")
    private Boolean enableCrossTenant;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Owner")
    @com.aliyun.core.annotation.Validation(required = true)
    private String owner;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TableMetaEntityIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> tableMetaEntityIds;

    private SubmitBatchChangeTableOwnerRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.enableCrossTenant = builder.enableCrossTenant;
        this.owner = builder.owner;
        this.tableMetaEntityIds = builder.tableMetaEntityIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitBatchChangeTableOwnerRequest create() {
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
     * @return enableCrossTenant
     */
    public Boolean getEnableCrossTenant() {
        return this.enableCrossTenant;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return tableMetaEntityIds
     */
    public java.util.List<String> getTableMetaEntityIds() {
        return this.tableMetaEntityIds;
    }

    public static final class Builder extends Request.Builder<SubmitBatchChangeTableOwnerRequest, Builder> {
        private String regionId; 
        private Boolean enableCrossTenant; 
        private String owner; 
        private java.util.List<String> tableMetaEntityIds; 

        private Builder() {
            super();
        } 

        private Builder(SubmitBatchChangeTableOwnerRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.enableCrossTenant = request.enableCrossTenant;
            this.owner = request.owner;
            this.tableMetaEntityIds = request.tableMetaEntityIds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * EnableCrossTenant.
         */
        public Builder enableCrossTenant(Boolean enableCrossTenant) {
            this.putBodyParameter("EnableCrossTenant", enableCrossTenant);
            this.enableCrossTenant = enableCrossTenant;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2xxxxx8146415628</p>
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder tableMetaEntityIds(java.util.List<String> tableMetaEntityIds) {
            String tableMetaEntityIdsShrink = shrink(tableMetaEntityIds, "TableMetaEntityIds", "simple");
            this.putBodyParameter("TableMetaEntityIds", tableMetaEntityIdsShrink);
            this.tableMetaEntityIds = tableMetaEntityIds;
            return this;
        }

        @Override
        public SubmitBatchChangeTableOwnerRequest build() {
            return new SubmitBatchChangeTableOwnerRequest(this);
        } 

    } 

}
