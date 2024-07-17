// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchRevokePermissionsRequest} extends {@link RequestModel}
 *
 * <p>BatchRevokePermissionsRequest</p>
 */
public class BatchRevokePermissionsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CatalogId")
    private String catalogId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GrantRevokeEntries")
    private java.util.List < GrantRevokeEntry > grantRevokeEntries;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private BatchRevokePermissionsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogId = builder.catalogId;
        this.grantRevokeEntries = builder.grantRevokeEntries;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchRevokePermissionsRequest create() {
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
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return grantRevokeEntries
     */
    public java.util.List < GrantRevokeEntry > getGrantRevokeEntries() {
        return this.grantRevokeEntries;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<BatchRevokePermissionsRequest, Builder> {
        private String regionId; 
        private String catalogId; 
        private java.util.List < GrantRevokeEntry > grantRevokeEntries; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(BatchRevokePermissionsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogId = request.catalogId;
            this.grantRevokeEntries = request.grantRevokeEntries;
            this.type = request.type;
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
         * catalogId
         */
        public Builder catalogId(String catalogId) {
            this.putBodyParameter("CatalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * GrantRevokeEntries.
         */
        public Builder grantRevokeEntries(java.util.List < GrantRevokeEntry > grantRevokeEntries) {
            this.putBodyParameter("GrantRevokeEntries", grantRevokeEntries);
            this.grantRevokeEntries = grantRevokeEntries;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public BatchRevokePermissionsRequest build() {
            return new BatchRevokePermissionsRequest(this);
        } 

    } 

}
