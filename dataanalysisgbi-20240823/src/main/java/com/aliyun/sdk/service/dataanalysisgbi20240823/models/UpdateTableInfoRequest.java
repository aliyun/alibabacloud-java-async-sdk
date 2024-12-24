// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataanalysisgbi20240823.models;

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
 * {@link UpdateTableInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateTableInfoRequest</p>
 */
public class UpdateTableInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("foreignKeys")
    private java.util.List<String> foreignKeys;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("primaryKey")
    private String primaryKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tableIdKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableIdKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private UpdateTableInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.foreignKeys = builder.foreignKeys;
        this.primaryKey = builder.primaryKey;
        this.tableIdKey = builder.tableIdKey;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTableInfoRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return foreignKeys
     */
    public java.util.List<String> getForeignKeys() {
        return this.foreignKeys;
    }

    /**
     * @return primaryKey
     */
    public String getPrimaryKey() {
        return this.primaryKey;
    }

    /**
     * @return tableIdKey
     */
    public String getTableIdKey() {
        return this.tableIdKey;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateTableInfoRequest, Builder> {
        private String regionId; 
        private String description; 
        private java.util.List<String> foreignKeys; 
        private String primaryKey; 
        private String tableIdKey; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTableInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.foreignKeys = request.foreignKeys;
            this.primaryKey = request.primaryKey;
            this.tableIdKey = request.tableIdKey;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * foreignKeys.
         */
        public Builder foreignKeys(java.util.List<String> foreignKeys) {
            this.putBodyParameter("foreignKeys", foreignKeys);
            this.foreignKeys = foreignKeys;
            return this;
        }

        /**
         * primaryKey.
         */
        public Builder primaryKey(String primaryKey) {
            this.putBodyParameter("primaryKey", primaryKey);
            this.primaryKey = primaryKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>table-AAAAAAAAFQBwSLJkUj4CYg</p>
         */
        public Builder tableIdKey(String tableIdKey) {
            this.putBodyParameter("tableIdKey", tableIdKey);
            this.tableIdKey = tableIdKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-2v3934xtp49esw64</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateTableInfoRequest build() {
            return new UpdateTableInfoRequest(this);
        } 

    } 

}
