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
 * {@link UpdateEnumMappingRequest} extends {@link RequestModel}
 *
 * <p>UpdateEnumMappingRequest</p>
 */
public class UpdateEnumMappingRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("columnIdKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String columnIdKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enumMapping")
    private java.util.Map<String, java.util.List<String>> enumMapping;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tableIdKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableIdKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private UpdateEnumMappingRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.columnIdKey = builder.columnIdKey;
        this.enumMapping = builder.enumMapping;
        this.tableIdKey = builder.tableIdKey;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEnumMappingRequest create() {
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
     * @return columnIdKey
     */
    public String getColumnIdKey() {
        return this.columnIdKey;
    }

    /**
     * @return enumMapping
     */
    public java.util.Map<String, java.util.List<String>> getEnumMapping() {
        return this.enumMapping;
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

    public static final class Builder extends Request.Builder<UpdateEnumMappingRequest, Builder> {
        private String regionId; 
        private String columnIdKey; 
        private java.util.Map<String, java.util.List<String>> enumMapping; 
        private String tableIdKey; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEnumMappingRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.columnIdKey = request.columnIdKey;
            this.enumMapping = request.enumMapping;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>column-AAAAAAAAh6cWOUPagYstkg</p>
         */
        public Builder columnIdKey(String columnIdKey) {
            this.putBodyParameter("columnIdKey", columnIdKey);
            this.columnIdKey = columnIdKey;
            return this;
        }

        /**
         * enumMapping.
         */
        public Builder enumMapping(java.util.Map<String, java.util.List<String>> enumMapping) {
            this.putBodyParameter("enumMapping", enumMapping);
            this.enumMapping = enumMapping;
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
        public UpdateEnumMappingRequest build() {
            return new UpdateEnumMappingRequest(this);
        } 

    } 

}
