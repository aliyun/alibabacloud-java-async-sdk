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
 * {@link ChatBIPredictSseRequest} extends {@link RequestModel}
 *
 * <p>ChatBIPredictSseRequest</p>
 */
public class ChatBIPredictSseRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("GenerateChart")
    private Boolean generateChart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GenerateSummary")
    private Boolean generateSummary;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private Parameters parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PatternIndexTableName")
    private String patternIndexTableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Question")
    @com.aliyun.core.annotation.Validation(required = true)
    private String question;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchemaIndexTableName")
    private String schemaIndexTableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelectData")
    private Boolean selectData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThinkingMode")
    private Boolean thinkingMode;

    private ChatBIPredictSseRequest(Builder builder) {
        super(builder);
        this.authMessage = builder.authMessage;
        this.authType = builder.authType;
        this.dbName = builder.dbName;
        this.generateChart = builder.generateChart;
        this.generateSummary = builder.generateSummary;
        this.instanceName = builder.instanceName;
        this.parameters = builder.parameters;
        this.patternIndexTableName = builder.patternIndexTableName;
        this.question = builder.question;
        this.schemaIndexTableName = builder.schemaIndexTableName;
        this.selectData = builder.selectData;
        this.thinkingMode = builder.thinkingMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatBIPredictSseRequest create() {
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
     * @return generateChart
     */
    public Boolean getGenerateChart() {
        return this.generateChart;
    }

    /**
     * @return generateSummary
     */
    public Boolean getGenerateSummary() {
        return this.generateSummary;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return parameters
     */
    public Parameters getParameters() {
        return this.parameters;
    }

    /**
     * @return patternIndexTableName
     */
    public String getPatternIndexTableName() {
        return this.patternIndexTableName;
    }

    /**
     * @return question
     */
    public String getQuestion() {
        return this.question;
    }

    /**
     * @return schemaIndexTableName
     */
    public String getSchemaIndexTableName() {
        return this.schemaIndexTableName;
    }

    /**
     * @return selectData
     */
    public Boolean getSelectData() {
        return this.selectData;
    }

    /**
     * @return thinkingMode
     */
    public Boolean getThinkingMode() {
        return this.thinkingMode;
    }

    public static final class Builder extends Request.Builder<ChatBIPredictSseRequest, Builder> {
        private String authMessage; 
        private String authType; 
        private String dbName; 
        private Boolean generateChart; 
        private Boolean generateSummary; 
        private String instanceName; 
        private Parameters parameters; 
        private String patternIndexTableName; 
        private String question; 
        private String schemaIndexTableName; 
        private Boolean selectData; 
        private Boolean thinkingMode; 

        private Builder() {
            super();
        } 

        private Builder(ChatBIPredictSseRequest request) {
            super(request);
            this.authMessage = request.authMessage;
            this.authType = request.authType;
            this.dbName = request.dbName;
            this.generateChart = request.generateChart;
            this.generateSummary = request.generateSummary;
            this.instanceName = request.instanceName;
            this.parameters = request.parameters;
            this.patternIndexTableName = request.patternIndexTableName;
            this.question = request.question;
            this.schemaIndexTableName = request.schemaIndexTableName;
            this.selectData = request.selectData;
            this.thinkingMode = request.thinkingMode;
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
         * GenerateChart.
         */
        public Builder generateChart(Boolean generateChart) {
            this.putQueryParameter("GenerateChart", generateChart);
            this.generateChart = generateChart;
            return this;
        }

        /**
         * GenerateSummary.
         */
        public Builder generateSummary(Boolean generateSummary) {
            this.putQueryParameter("GenerateSummary", generateSummary);
            this.generateSummary = generateSummary;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2ze7smdi2f*******</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(Parameters parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putQueryParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        /**
         * PatternIndexTableName.
         */
        public Builder patternIndexTableName(String patternIndexTableName) {
            this.putQueryParameter("PatternIndexTableName", patternIndexTableName);
            this.patternIndexTableName = patternIndexTableName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>查询2023年10月1日至2023年10月3日期间开课的课程名称和上课地点。</p>
         */
        public Builder question(String question) {
            this.putQueryParameter("Question", question);
            this.question = question;
            return this;
        }

        /**
         * SchemaIndexTableName.
         */
        public Builder schemaIndexTableName(String schemaIndexTableName) {
            this.putQueryParameter("SchemaIndexTableName", schemaIndexTableName);
            this.schemaIndexTableName = schemaIndexTableName;
            return this;
        }

        /**
         * SelectData.
         */
        public Builder selectData(Boolean selectData) {
            this.putQueryParameter("SelectData", selectData);
            this.selectData = selectData;
            return this;
        }

        /**
         * ThinkingMode.
         */
        public Builder thinkingMode(Boolean thinkingMode) {
            this.putQueryParameter("ThinkingMode", thinkingMode);
            this.thinkingMode = thinkingMode;
            return this;
        }

        @Override
        public ChatBIPredictSseRequest build() {
            return new ChatBIPredictSseRequest(this);
        } 

    } 

    /**
     * 
     * {@link ChatBIPredictSseRequest} extends {@link TeaModel}
     *
     * <p>ChatBIPredictSseRequest</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PatternIndexThreshold")
        private Double patternIndexThreshold;

        @com.aliyun.core.annotation.NameInMap("PatternIndexTop")
        private Integer patternIndexTop;

        @com.aliyun.core.annotation.NameInMap("ResultType")
        private String resultType;

        private Parameters(Builder builder) {
            this.patternIndexThreshold = builder.patternIndexThreshold;
            this.patternIndexTop = builder.patternIndexTop;
            this.resultType = builder.resultType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return patternIndexThreshold
         */
        public Double getPatternIndexThreshold() {
            return this.patternIndexThreshold;
        }

        /**
         * @return patternIndexTop
         */
        public Integer getPatternIndexTop() {
            return this.patternIndexTop;
        }

        /**
         * @return resultType
         */
        public String getResultType() {
            return this.resultType;
        }

        public static final class Builder {
            private Double patternIndexThreshold; 
            private Integer patternIndexTop; 
            private String resultType; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.patternIndexThreshold = model.patternIndexThreshold;
                this.patternIndexTop = model.patternIndexTop;
                this.resultType = model.resultType;
            } 

            /**
             * PatternIndexThreshold.
             */
            public Builder patternIndexThreshold(Double patternIndexThreshold) {
                this.patternIndexThreshold = patternIndexThreshold;
                return this;
            }

            /**
             * PatternIndexTop.
             */
            public Builder patternIndexTop(Integer patternIndexTop) {
                this.patternIndexTop = patternIndexTop;
                return this;
            }

            /**
             * ResultType.
             */
            public Builder resultType(String resultType) {
                this.resultType = resultType;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
}
