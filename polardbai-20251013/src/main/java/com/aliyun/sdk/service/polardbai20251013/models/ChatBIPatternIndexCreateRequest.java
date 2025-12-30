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
    @com.aliyun.core.annotation.NameInMap("TableNameSuffix")
    private String tableNameSuffix;

    private ChatBIPatternIndexCreateRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.instanceName = builder.instanceName;
        this.patternTableName = builder.patternTableName;
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
     * @return tableNameSuffix
     */
    public String getTableNameSuffix() {
        return this.tableNameSuffix;
    }

    public static final class Builder extends Request.Builder<ChatBIPatternIndexCreateRequest, Builder> {
        private String dbName; 
        private String instanceName; 
        private String patternTableName; 
        private String tableNameSuffix; 

        private Builder() {
            super();
        } 

        private Builder(ChatBIPatternIndexCreateRequest request) {
            super(request);
            this.dbName = request.dbName;
            this.instanceName = request.instanceName;
            this.patternTableName = request.patternTableName;
            this.tableNameSuffix = request.tableNameSuffix;
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
