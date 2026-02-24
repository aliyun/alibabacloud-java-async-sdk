// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbai20251013.models;

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
 * {@link ChatBISchemaIndexCreateRequest} extends {@link RequestModel}
 *
 * <p>ChatBISchemaIndexCreateRequest</p>
 */
public class ChatBISchemaIndexCreateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthMessage")
    private String authMessage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthType")
    private String authType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColumnsExcluded")
    private String columnsExcluded;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableNameSuffix")
    private String tableNameSuffix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TablesIncluded")
    private String tablesIncluded;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ToSample")
    private Integer toSample;

    private ChatBISchemaIndexCreateRequest(Builder builder) {
        super(builder);
        this.authMessage = builder.authMessage;
        this.authType = builder.authType;
        this.columnsExcluded = builder.columnsExcluded;
        this.dbName = builder.dbName;
        this.instanceName = builder.instanceName;
        this.sourceRegionId = builder.sourceRegionId;
        this.tableNameSuffix = builder.tableNameSuffix;
        this.tablesIncluded = builder.tablesIncluded;
        this.toSample = builder.toSample;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatBISchemaIndexCreateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authMessage
     */
    public String getAuthMessage() {
        return this.authMessage;
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return columnsExcluded
     */
    public String getColumnsExcluded() {
        return this.columnsExcluded;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return tableNameSuffix
     */
    public String getTableNameSuffix() {
        return this.tableNameSuffix;
    }

    /**
     * @return tablesIncluded
     */
    public String getTablesIncluded() {
        return this.tablesIncluded;
    }

    /**
     * @return toSample
     */
    public Integer getToSample() {
        return this.toSample;
    }

    public static final class Builder extends Request.Builder<ChatBISchemaIndexCreateRequest, Builder> {
        private String authMessage; 
        private String authType; 
        private String columnsExcluded; 
        private String dbName; 
        private String instanceName; 
        private String sourceRegionId; 
        private String tableNameSuffix; 
        private String tablesIncluded; 
        private Integer toSample; 

        private Builder() {
            super();
        } 

        private Builder(ChatBISchemaIndexCreateRequest request) {
            super(request);
            this.authMessage = request.authMessage;
            this.authType = request.authType;
            this.columnsExcluded = request.columnsExcluded;
            this.dbName = request.dbName;
            this.instanceName = request.instanceName;
            this.sourceRegionId = request.sourceRegionId;
            this.tableNameSuffix = request.tableNameSuffix;
            this.tablesIncluded = request.tablesIncluded;
            this.toSample = request.toSample;
        } 

        /**
         * AuthMessage.
         */
        public Builder authMessage(String authMessage) {
            this.putQueryParameter("AuthMessage", authMessage);
            this.authMessage = authMessage;
            return this;
        }

        /**
         * AuthType.
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * ColumnsExcluded.
         */
        public Builder columnsExcluded(String columnsExcluded) {
            this.putQueryParameter("ColumnsExcluded", columnsExcluded);
            this.columnsExcluded = columnsExcluded;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>db_test</p>
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2ze454l20me07****</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putQueryParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * TableNameSuffix.
         */
        public Builder tableNameSuffix(String tableNameSuffix) {
            this.putQueryParameter("TableNameSuffix", tableNameSuffix);
            this.tableNameSuffix = tableNameSuffix;
            return this;
        }

        /**
         * TablesIncluded.
         */
        public Builder tablesIncluded(String tablesIncluded) {
            this.putQueryParameter("TablesIncluded", tablesIncluded);
            this.tablesIncluded = tablesIncluded;
            return this;
        }

        /**
         * ToSample.
         */
        public Builder toSample(Integer toSample) {
            this.putQueryParameter("ToSample", toSample);
            this.toSample = toSample;
            return this;
        }

        @Override
        public ChatBISchemaIndexCreateRequest build() {
            return new ChatBISchemaIndexCreateRequest(this);
        } 

    } 

}
