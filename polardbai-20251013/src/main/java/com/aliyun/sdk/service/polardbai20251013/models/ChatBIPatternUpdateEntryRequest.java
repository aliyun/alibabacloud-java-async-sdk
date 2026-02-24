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
 * {@link ChatBIPatternUpdateEntryRequest} extends {@link RequestModel}
 *
 * <p>ChatBIPatternUpdateEntryRequest</p>
 */
public class ChatBIPatternUpdateEntryRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Id")
    private Integer id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PatternDescription")
    @com.aliyun.core.annotation.Validation(required = true)
    private String patternDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PatternParams")
    @com.aliyun.core.annotation.Validation(required = true)
    private String patternParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PatternQuestion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String patternQuestion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PatternSql")
    @com.aliyun.core.annotation.Validation(required = true)
    private String patternSql;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableName;

    private ChatBIPatternUpdateEntryRequest(Builder builder) {
        super(builder);
        this.authMessage = builder.authMessage;
        this.authType = builder.authType;
        this.dbName = builder.dbName;
        this.id = builder.id;
        this.instanceName = builder.instanceName;
        this.patternDescription = builder.patternDescription;
        this.patternParams = builder.patternParams;
        this.patternQuestion = builder.patternQuestion;
        this.patternSql = builder.patternSql;
        this.sourceRegionId = builder.sourceRegionId;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatBIPatternUpdateEntryRequest create() {
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
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return patternDescription
     */
    public String getPatternDescription() {
        return this.patternDescription;
    }

    /**
     * @return patternParams
     */
    public String getPatternParams() {
        return this.patternParams;
    }

    /**
     * @return patternQuestion
     */
    public String getPatternQuestion() {
        return this.patternQuestion;
    }

    /**
     * @return patternSql
     */
    public String getPatternSql() {
        return this.patternSql;
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

    public static final class Builder extends Request.Builder<ChatBIPatternUpdateEntryRequest, Builder> {
        private String authMessage; 
        private String authType; 
        private String dbName; 
        private Integer id; 
        private String instanceName; 
        private String patternDescription; 
        private String patternParams; 
        private String patternQuestion; 
        private String patternSql; 
        private String sourceRegionId; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(ChatBIPatternUpdateEntryRequest request) {
            super(request);
            this.authMessage = request.authMessage;
            this.authType = request.authType;
            this.dbName = request.dbName;
            this.id = request.id;
            this.instanceName = request.instanceName;
            this.patternDescription = request.patternDescription;
            this.patternParams = request.patternParams;
            this.patternQuestion = request.patternQuestion;
            this.patternSql = request.patternSql;
            this.sourceRegionId = request.sourceRegionId;
            this.tableName = request.tableName;
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
         * Id.
         */
        public Builder id(Integer id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>【课程名称】【授课状态】的课程有哪些？</p>
         */
        public Builder patternDescription(String patternDescription) {
            this.putQueryParameter("PatternDescription", patternDescription);
            this.patternDescription = patternDescription;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder patternParams(String patternParams) {
            this.putQueryParameter("PatternParams", patternParams);
            this.patternParams = patternParams;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>查询课程名称为#{courseName}授课状态为#{status}的课程</p>
         */
        public Builder patternQuestion(String patternQuestion) {
            this.putQueryParameter("PatternQuestion", patternQuestion);
            this.patternQuestion = patternQuestion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT course_name, course_time, course_location 
         * FROM courses 
         * WHERE 
         * course_name=#{courseName} 
         * AND status=#{statusCode}</p>
         */
        public Builder patternSql(String patternSql) {
            this.putQueryParameter("PatternSql", patternSql);
            this.patternSql = patternSql;
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
         * <p>polar4ai_nl2sql_pattern, polar4ai_nl2sql_pattern_1</p>
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public ChatBIPatternUpdateEntryRequest build() {
            return new ChatBIPatternUpdateEntryRequest(this);
        } 

    } 

}
