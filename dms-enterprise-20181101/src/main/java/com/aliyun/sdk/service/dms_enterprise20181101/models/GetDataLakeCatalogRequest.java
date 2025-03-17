// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link GetDataLakeCatalogRequest} extends {@link RequestModel}
 *
 * <p>GetDataLakeCatalogRequest</p>
 */
public class GetDataLakeCatalogRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CatalogName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String catalogName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataRegion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private Long workspaceId;

    private GetDataLakeCatalogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogName = builder.catalogName;
        this.dataRegion = builder.dataRegion;
        this.tid = builder.tid;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataLakeCatalogRequest create() {
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
     * @return catalogName
     */
    public String getCatalogName() {
        return this.catalogName;
    }

    /**
     * @return dataRegion
     */
    public String getDataRegion() {
        return this.dataRegion;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return workspaceId
     */
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<GetDataLakeCatalogRequest, Builder> {
        private String regionId; 
        private String catalogName; 
        private String dataRegion; 
        private Long tid; 
        private Long workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetDataLakeCatalogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogName = request.catalogName;
            this.dataRegion = request.dataRegion;
            this.tid = request.tid;
            this.workspaceId = request.workspaceId;
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
         * <p>hive</p>
         */
        public Builder catalogName(String catalogName) {
            this.putQueryParameter("CatalogName", catalogName);
            this.catalogName = catalogName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder dataRegion(String dataRegion) {
            this.putQueryParameter("DataRegion", dataRegion);
            this.dataRegion = dataRegion;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(Long workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public GetDataLakeCatalogRequest build() {
            return new GetDataLakeCatalogRequest(this);
        } 

    } 

}
