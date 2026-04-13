// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link UpdateTableFromAuthorizedOssRequest} extends {@link RequestModel}
 *
 * <p>UpdateTableFromAuthorizedOssRequest</p>
 */
public class UpdateTableFromAuthorizedOssRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TableId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OssBucket")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossBucket;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OssKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OssRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String updateMode;

    private UpdateTableFromAuthorizedOssRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.regionId = builder.regionId;
        this.tableId = builder.tableId;
        this.ossBucket = builder.ossBucket;
        this.ossKey = builder.ossKey;
        this.ossRegionId = builder.ossRegionId;
        this.updateMode = builder.updateMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTableFromAuthorizedOssRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tableId
     */
    public String getTableId() {
        return this.tableId;
    }

    /**
     * @return ossBucket
     */
    public String getOssBucket() {
        return this.ossBucket;
    }

    /**
     * @return ossKey
     */
    public String getOssKey() {
        return this.ossKey;
    }

    /**
     * @return ossRegionId
     */
    public String getOssRegionId() {
        return this.ossRegionId;
    }

    /**
     * @return updateMode
     */
    public String getUpdateMode() {
        return this.updateMode;
    }

    public static final class Builder extends Request.Builder<UpdateTableFromAuthorizedOssRequest, Builder> {
        private String workspaceId; 
        private String regionId; 
        private String tableId; 
        private String ossBucket; 
        private String ossKey; 
        private String ossRegionId; 
        private String updateMode; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTableFromAuthorizedOssRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.regionId = request.regionId;
            this.tableId = request.tableId;
            this.ossBucket = request.ossBucket;
            this.ossKey = request.ossKey;
            this.ossRegionId = request.ossRegionId;
            this.updateMode = request.updateMode;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-3z7uw7fwz0vxxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * <p>table_100b51399c404966b7d49f71e388a3fd_12738336</p>
         */
        public Builder tableId(String tableId) {
            this.putPathParameter("TableId", tableId);
            this.tableId = tableId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yinghuo-ai</p>
         */
        public Builder ossBucket(String ossBucket) {
            this.putBodyParameter("OssBucket", ossBucket);
            this.ossBucket = ossBucket;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a0deedbce4a8162b8d66c63ace28330c</p>
         */
        public Builder ossKey(String ossKey) {
            this.putBodyParameter("OssKey", ossKey);
            this.ossKey = ossKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder ossRegionId(String ossRegionId) {
            this.putBodyParameter("OssRegionId", ossRegionId);
            this.ossRegionId = ossRegionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OVERWRITE</p>
         */
        public Builder updateMode(String updateMode) {
            this.putBodyParameter("UpdateMode", updateMode);
            this.updateMode = updateMode;
            return this;
        }

        @Override
        public UpdateTableFromAuthorizedOssRequest build() {
            return new UpdateTableFromAuthorizedOssRequest(this);
        } 

    } 

}
