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
 * {@link SyncRemoteTablesRequest} extends {@link RequestModel}
 *
 * <p>SyncRemoteTablesRequest</p>
 */
public class SyncRemoteTablesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("keepTableNames")
    private java.util.List<String> keepTableNames;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("noModifiedTableNames")
    private java.util.List<String> noModifiedTableNames;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pullSamples")
    private Boolean pullSamples;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tableNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> tableNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private SyncRemoteTablesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.keepTableNames = builder.keepTableNames;
        this.noModifiedTableNames = builder.noModifiedTableNames;
        this.pullSamples = builder.pullSamples;
        this.tableNames = builder.tableNames;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncRemoteTablesRequest create() {
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
     * @return keepTableNames
     */
    public java.util.List<String> getKeepTableNames() {
        return this.keepTableNames;
    }

    /**
     * @return noModifiedTableNames
     */
    public java.util.List<String> getNoModifiedTableNames() {
        return this.noModifiedTableNames;
    }

    /**
     * @return pullSamples
     */
    public Boolean getPullSamples() {
        return this.pullSamples;
    }

    /**
     * @return tableNames
     */
    public java.util.List<String> getTableNames() {
        return this.tableNames;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<SyncRemoteTablesRequest, Builder> {
        private String regionId; 
        private java.util.List<String> keepTableNames; 
        private java.util.List<String> noModifiedTableNames; 
        private Boolean pullSamples; 
        private java.util.List<String> tableNames; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(SyncRemoteTablesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.keepTableNames = request.keepTableNames;
            this.noModifiedTableNames = request.noModifiedTableNames;
            this.pullSamples = request.pullSamples;
            this.tableNames = request.tableNames;
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
         * keepTableNames.
         */
        public Builder keepTableNames(java.util.List<String> keepTableNames) {
            this.putBodyParameter("keepTableNames", keepTableNames);
            this.keepTableNames = keepTableNames;
            return this;
        }

        /**
         * noModifiedTableNames.
         */
        public Builder noModifiedTableNames(java.util.List<String> noModifiedTableNames) {
            this.putBodyParameter("noModifiedTableNames", noModifiedTableNames);
            this.noModifiedTableNames = noModifiedTableNames;
            return this;
        }

        /**
         * pullSamples.
         */
        public Builder pullSamples(Boolean pullSamples) {
            this.putBodyParameter("pullSamples", pullSamples);
            this.pullSamples = pullSamples;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder tableNames(java.util.List<String> tableNames) {
            this.putBodyParameter("tableNames", tableNames);
            this.tableNames = tableNames;
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
        public SyncRemoteTablesRequest build() {
            return new SyncRemoteTablesRequest(this);
        } 

    } 

}
