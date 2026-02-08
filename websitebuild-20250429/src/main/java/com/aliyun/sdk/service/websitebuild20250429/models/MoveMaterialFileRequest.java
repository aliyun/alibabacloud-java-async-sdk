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
 * {@link MoveMaterialFileRequest} extends {@link RequestModel}
 *
 * <p>MoveMaterialFileRequest</p>
 */
public class MoveMaterialFileRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> fileIds;

    private MoveMaterialFileRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.directoryId = builder.directoryId;
        this.fileIds = builder.fileIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveMaterialFileRequest create() {
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
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return fileIds
     */
    public java.util.List<String> getFileIds() {
        return this.fileIds;
    }

    public static final class Builder extends Request.Builder<MoveMaterialFileRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String directoryId; 
        private java.util.List<String> fileIds; 

        private Builder() {
            super();
        } 

        private Builder(MoveMaterialFileRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.directoryId = request.directoryId;
            this.fileIds = request.fileIds;
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
         * <p>WD20250703155602000001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>68157a0a-769a-4364-bbdc-a0e2cf3d5ad</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
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

        @Override
        public MoveMaterialFileRequest build() {
            return new MoveMaterialFileRequest(this);
        } 

    } 

}
