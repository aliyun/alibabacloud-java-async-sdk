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
 * {@link ChatBIFileUploadCallbackRequest} extends {@link RequestModel}
 *
 * <p>ChatBIFileUploadCallbackRequest</p>
 */
public class ChatBIFileUploadCallbackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthMessage")
    private String authMessage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthType")
    private String authType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CharacterSetName")
    private String characterSetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableType;

    private ChatBIFileUploadCallbackRequest(Builder builder) {
        super(builder);
        this.authMessage = builder.authMessage;
        this.authType = builder.authType;
        this.characterSetName = builder.characterSetName;
        this.dbName = builder.dbName;
        this.fileName = builder.fileName;
        this.instanceName = builder.instanceName;
        this.sourceRegionId = builder.sourceRegionId;
        this.tableName = builder.tableName;
        this.tableType = builder.tableType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatBIFileUploadCallbackRequest create() {
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
     * @return characterSetName
     */
    public String getCharacterSetName() {
        return this.characterSetName;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
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
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return tableType
     */
    public String getTableType() {
        return this.tableType;
    }

    public static final class Builder extends Request.Builder<ChatBIFileUploadCallbackRequest, Builder> {
        private String authMessage; 
        private String authType; 
        private String characterSetName; 
        private String dbName; 
        private String fileName; 
        private String instanceName; 
        private String sourceRegionId; 
        private String tableName; 
        private String tableType; 

        private Builder() {
            super();
        } 

        private Builder(ChatBIFileUploadCallbackRequest request) {
            super(request);
            this.authMessage = request.authMessage;
            this.authType = request.authType;
            this.characterSetName = request.characterSetName;
            this.dbName = request.dbName;
            this.fileName = request.fileName;
            this.instanceName = request.instanceName;
            this.sourceRegionId = request.sourceRegionId;
            this.tableName = request.tableName;
            this.tableType = request.tableType;
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
         * CharacterSetName.
         */
        public Builder characterSetName(String characterSetName) {
            this.putQueryParameter("CharacterSetName", characterSetName);
            this.characterSetName = characterSetName;
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
         * <p>1778851887351348/record_1746670038342.xlsx</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>polar4ai_nl2sql_pattern</p>
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MANAGED_TABLE</p>
         */
        public Builder tableType(String tableType) {
            this.putQueryParameter("TableType", tableType);
            this.tableType = tableType;
            return this;
        }

        @Override
        public ChatBIFileUploadCallbackRequest build() {
            return new ChatBIFileUploadCallbackRequest(this);
        } 

    } 

}
