// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGrantPermissionsRequest} extends {@link RequestModel}
 *
 * <p>BatchGrantPermissionsRequest</p>
 */
public class BatchGrantPermissionsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("CatalogId")
    private String catalogId;

    @Body
    @NameInMap("GrantRevokeEntries")
    private java.util.List < GrantRevokeEntry > grantRevokeEntries;

    @Body
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private BatchGrantPermissionsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogId = builder.catalogId;
        this.grantRevokeEntries = builder.grantRevokeEntries;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGrantPermissionsRequest create() {
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

    public static final class Builder extends Request.Builder<BatchGrantPermissionsRequest, Builder> {
        private String regionId; 
        private String catalogId; 
        private java.util.List < GrantRevokeEntry > grantRevokeEntries; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(BatchGrantPermissionsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogId = request.catalogId;
            this.grantRevokeEntries = request.grantRevokeEntries;
            this.type = request.type;
        } 

        /**
         * RegionId
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
         * 待授权列表
         */
        public Builder grantRevokeEntries(java.util.List < GrantRevokeEntry > grantRevokeEntries) {
            this.putBodyParameter("GrantRevokeEntries", grantRevokeEntries);
            this.grantRevokeEntries = grantRevokeEntries;
            return this;
        }

        /**
         * 授权的类型，目前仅支持hive
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public BatchGrantPermissionsRequest build() {
            return new BatchGrantPermissionsRequest(this);
        } 

    } 

}
