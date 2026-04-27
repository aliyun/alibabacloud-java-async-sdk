// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ModifySupabaseProjectResourceRequest} extends {@link RequestModel}
 *
 * <p>ModifySupabaseProjectResourceRequest</p>
 */
public class ModifySupabaseProjectResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modifyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectSpec")
    private String projectSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageSize")
    private Long storageSize;

    private ModifySupabaseProjectResourceRequest(Builder builder) {
        super(builder);
        this.modifyType = builder.modifyType;
        this.projectId = builder.projectId;
        this.projectSpec = builder.projectSpec;
        this.regionId = builder.regionId;
        this.storageSize = builder.storageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySupabaseProjectResourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modifyType
     */
    public String getModifyType() {
        return this.modifyType;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectSpec
     */
    public String getProjectSpec() {
        return this.projectSpec;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return storageSize
     */
    public Long getStorageSize() {
        return this.storageSize;
    }

    public static final class Builder extends Request.Builder<ModifySupabaseProjectResourceRequest, Builder> {
        private String modifyType; 
        private String projectId; 
        private String projectSpec; 
        private String regionId; 
        private Long storageSize; 

        private Builder() {
            super();
        } 

        private Builder(ModifySupabaseProjectResourceRequest request) {
            super(request);
            this.modifyType = request.modifyType;
            this.projectId = request.projectId;
            this.projectSpec = request.projectSpec;
            this.regionId = request.regionId;
            this.storageSize = request.storageSize;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UPGRADE,DOWNGRADE</p>
         */
        public Builder modifyType(String modifyType) {
            this.putQueryParameter("ModifyType", modifyType);
            this.modifyType = modifyType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sbp-tyarplz****</p>
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * ProjectSpec.
         */
        public Builder projectSpec(String projectSpec) {
            this.putQueryParameter("ProjectSpec", projectSpec);
            this.projectSpec = projectSpec;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * StorageSize.
         */
        public Builder storageSize(Long storageSize) {
            this.putQueryParameter("StorageSize", storageSize);
            this.storageSize = storageSize;
            return this;
        }

        @Override
        public ModifySupabaseProjectResourceRequest build() {
            return new ModifySupabaseProjectResourceRequest(this);
        } 

    } 

}
