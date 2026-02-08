// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link ModifyMaterialFileStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyMaterialFileStatusRequest</p>
 */
public class ModifyMaterialFileStatusRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> fileIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    private ModifyMaterialFileStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.fileIds = builder.fileIds;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMaterialFileStatusRequest create() {
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
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return fileIds
     */
    public java.util.List<String> getFileIds() {
        return this.fileIds;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModifyMaterialFileStatusRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private java.util.List<String> fileIds; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ModifyMaterialFileStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.fileIds = request.fileIds;
            this.status = request.status;
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
         * <p>WS12345678</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder fileIds(java.util.List<String> fileIds) {
            String fileIdsShrink = shrink(fileIds, "FileIds", "json");
            this.putQueryParameter("FileIds", fileIdsShrink);
            this.fileIds = fileIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ModifyMaterialFileStatusRequest build() {
            return new ModifyMaterialFileStatusRequest(this);
        } 

    } 

}
