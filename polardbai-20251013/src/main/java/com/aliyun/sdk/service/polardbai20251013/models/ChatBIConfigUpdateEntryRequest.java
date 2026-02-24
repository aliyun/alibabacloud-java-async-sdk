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
 * {@link ChatBIConfigUpdateEntryRequest} extends {@link RequestModel}
 *
 * <p>ChatBIConfigUpdateEntryRequest</p>
 */
public class ChatBIConfigUpdateEntryRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("FormulaFunction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String formulaFunction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Integer id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsFunctional")
    private Integer isFunctional;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryFunction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queryFunction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlCondition")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sqlCondition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlFunction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sqlFunction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TextCondition")
    @com.aliyun.core.annotation.Validation(required = true)
    private String textCondition;

    private ChatBIConfigUpdateEntryRequest(Builder builder) {
        super(builder);
        this.authMessage = builder.authMessage;
        this.authType = builder.authType;
        this.dbName = builder.dbName;
        this.formulaFunction = builder.formulaFunction;
        this.id = builder.id;
        this.instanceName = builder.instanceName;
        this.isFunctional = builder.isFunctional;
        this.queryFunction = builder.queryFunction;
        this.sourceRegionId = builder.sourceRegionId;
        this.sqlCondition = builder.sqlCondition;
        this.sqlFunction = builder.sqlFunction;
        this.textCondition = builder.textCondition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatBIConfigUpdateEntryRequest create() {
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
     * @return formulaFunction
     */
    public String getFormulaFunction() {
        return this.formulaFunction;
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
     * @return isFunctional
     */
    public Integer getIsFunctional() {
        return this.isFunctional;
    }

    /**
     * @return queryFunction
     */
    public String getQueryFunction() {
        return this.queryFunction;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return sqlCondition
     */
    public String getSqlCondition() {
        return this.sqlCondition;
    }

    /**
     * @return sqlFunction
     */
    public String getSqlFunction() {
        return this.sqlFunction;
    }

    /**
     * @return textCondition
     */
    public String getTextCondition() {
        return this.textCondition;
    }

    public static final class Builder extends Request.Builder<ChatBIConfigUpdateEntryRequest, Builder> {
        private String authMessage; 
        private String authType; 
        private String dbName; 
        private String formulaFunction; 
        private Integer id; 
        private String instanceName; 
        private Integer isFunctional; 
        private String queryFunction; 
        private String sourceRegionId; 
        private String sqlCondition; 
        private String sqlFunction; 
        private String textCondition; 

        private Builder() {
            super();
        } 

        private Builder(ChatBIConfigUpdateEntryRequest request) {
            super(request);
            this.authMessage = request.authMessage;
            this.authType = request.authType;
            this.dbName = request.dbName;
            this.formulaFunction = request.formulaFunction;
            this.id = request.id;
            this.instanceName = request.instanceName;
            this.isFunctional = request.isFunctional;
            this.queryFunction = request.queryFunction;
            this.sourceRegionId = request.sourceRegionId;
            this.sqlCondition = request.sqlCondition;
            this.sqlFunction = request.sqlFunction;
            this.textCondition = request.textCondition;
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
         * <p>若formula_function为总销售额：SUM(销售额)，则在最终处理时，问题中的总销售额将采用SUM(销售额)公式作为附加信息一并进行处理。</p>
         */
        public Builder formulaFunction(String formulaFunction) {
            this.putQueryParameter("FormulaFunction", formulaFunction);
            this.formulaFunction = formulaFunction;
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
         * IsFunctional.
         */
        public Builder isFunctional(Integer isFunctional) {
            this.putQueryParameter("IsFunctional", isFunctional);
            this.isFunctional = isFunctional;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>若query_function为{&quot;append&quot;:[&quot;一&quot;,&quot;二&quot;],&quot;delete&quot;:[&quot;？&quot;],&quot;replace&quot;:{&quot;张三&quot;:&quot;a&quot;,&quot;李四&quot;:&quot;b&quot;}}，则表示：当text_condition匹配时，在问题的结尾添加一和二，并删除问题中的？。最后，将问题中的张三替换为a，将李四替换为b。</p>
         * <p>例如：
         * 问题张三今年总销售额是多少？：在text_condition匹配时，会最终被处理为a今年总销售额是多少一二。
         * 问题李四今年总销售额多少？：在text_condition匹配时，会最终被处理为b今年总销售额是多少一二。</p>
         */
        public Builder queryFunction(String queryFunction) {
            this.putQueryParameter("QueryFunction", queryFunction);
            this.queryFunction = queryFunction;
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
         * <p>若sql_condition=students||student_courses&amp;&amp;!!courses，则表示：如果表students或表student_courses在SQL中，且表courses不在SQL中，则条件匹配。</p>
         * <p>例如：
         * SQL语句SELECT * FROM student_courses：条件匹配。
         * SQL语句SELECT c.course_name FROM student_courses sc JOIN courses c ON sc.courses_id = c.id;：条件不匹配。</p>
         */
        public Builder sqlCondition(String sqlCondition) {
            this.putQueryParameter("SqlCondition", sqlCondition);
            this.sqlCondition = sqlCondition;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>若sql_function={&quot;replace&quot;:{&quot;status = &quot;请假&quot;&quot;:&quot;status = 0&quot;,&quot;status = &quot;出勤&quot;&quot;:&quot;status = 1&quot;}}，则表示：在sql_condition匹配的情况下，将SQL中的status = &quot;请假&quot;替换为status = 0，status = &quot;出勤&quot;替换为status = 1。</p>
         */
        public Builder sqlFunction(String sqlFunction) {
            this.putQueryParameter("SqlFunction", sqlFunction);
            this.sqlFunction = sqlFunction;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>若text_condition为张三||李四&amp;&amp;!!王五，则表示当问题包含张三，或者包含李四且不包含王五时，条件匹配。</p>
         * <p>例如：
         * 张三今年总销售额多少？：条件匹配。
         * 李四今年总销售额多少？：条件匹配。
         * 李四王五今年总销售额多少？：条件不匹配。</p>
         */
        public Builder textCondition(String textCondition) {
            this.putQueryParameter("TextCondition", textCondition);
            this.textCondition = textCondition;
            return this;
        }

        @Override
        public ChatBIConfigUpdateEntryRequest build() {
            return new ChatBIConfigUpdateEntryRequest(this);
        } 

    } 

}
