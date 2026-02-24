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
 * {@link ChatBIPatternIndexCreateRequest} extends {@link RequestModel}
 *
 * <p>ChatBIPatternIndexCreateRequest</p>
 */
public class ChatBIPatternIndexCreateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthMessage")
    private String authMessage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthType")
    private String authType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PatternTableName")
    private String patternTableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableNameSuffix")
    private String tableNameSuffix;

    private ChatBIPatternIndexCreateRequest(Builder builder) {
        super(builder);
        this.authMessage = builder.authMessage;
        this.authType = builder.authType;
        this.dbName = builder.dbName;
        this.instanceName = builder.instanceName;
        this.patternTableName = builder.patternTableName;
        this.sourceRegionId = builder.sourceRegionId;
        this.tableNameSuffix = builder.tableNameSuffix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatBIPatternIndexCreateRequest create() {
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
     * @return patternTableName
     */
    public String getPatternTableName() {
        return this.patternTableName;
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

    public static final class Builder extends Request.Builder<ChatBIPatternIndexCreateRequest, Builder> {
        private String authMessage; 
        private String authType; 
        private String dbName; 
        private String instanceName; 
        private String patternTableName; 
        private String sourceRegionId; 
        private String tableNameSuffix; 

        private Builder() {
            super();
        } 

        private Builder(ChatBIPatternIndexCreateRequest request) {
            super(request);
            this.authMessage = request.authMessage;
            this.authType = request.authType;
            this.dbName = request.dbName;
            this.instanceName = request.instanceName;
            this.patternTableName = request.patternTableName;
            this.sourceRegionId = request.sourceRegionId;
            this.tableNameSuffix = request.tableNameSuffix;
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
         * PatternTableName.
         */
        public Builder patternTableName(String patternTableName) {
            this.putQueryParameter("PatternTableName", patternTableName);
            this.patternTableName = patternTableName;
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

        @Override
        public ChatBIPatternIndexCreateRequest build() {
            return new ChatBIPatternIndexCreateRequest(this);
        } 

    } 

}
