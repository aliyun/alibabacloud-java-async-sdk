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
 * {@link RunDataAnalysisResponseBody} extends {@link TeaModel}
 *
 * <p>RunDataAnalysisResponseBody</p>
 */
public class RunDataAnalysisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    private RunDataAnalysisResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunDataAnalysisResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Long httpStatusCode; 
        private String message; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public RunDataAnalysisResponseBody build() {
            return new RunDataAnalysisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunDataAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunDataAnalysisResponseBody</p>
     */
    public static class SqlData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("column")
        private java.util.List<String> column;

        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List<java.util.Map<String, ?>> data;

        private SqlData(Builder builder) {
            this.column = builder.column;
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SqlData create() {
            return builder().build();
        }

        /**
         * @return column
         */
        public java.util.List<String> getColumn() {
            return this.column;
        }

        /**
         * @return data
         */
        public java.util.List<java.util.Map<String, ?>> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List<String> column; 
            private java.util.List<java.util.Map<String, ?>> data; 

            /**
             * column.
             */
            public Builder column(java.util.List<String> column) {
                this.column = column;
                return this;
            }

            /**
             * data.
             */
            public Builder data(java.util.List<java.util.Map<String, ?>> data) {
                this.data = data;
                return this;
            }

            public SqlData build() {
                return new SqlData(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunDataAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunDataAnalysisResponseBody</p>
     */
    public static class VisualizationData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("plotType")
        private String plotType;

        @com.aliyun.core.annotation.NameInMap("xAxis")
        private java.util.List<String> xAxis;

        @com.aliyun.core.annotation.NameInMap("yAxis")
        private java.util.List<String> yAxis;

        private VisualizationData(Builder builder) {
            this.plotType = builder.plotType;
            this.xAxis = builder.xAxis;
            this.yAxis = builder.yAxis;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VisualizationData create() {
            return builder().build();
        }

        /**
         * @return plotType
         */
        public String getPlotType() {
            return this.plotType;
        }

        /**
         * @return xAxis
         */
        public java.util.List<String> getXAxis() {
            return this.xAxis;
        }

        /**
         * @return yAxis
         */
        public java.util.List<String> getYAxis() {
            return this.yAxis;
        }

        public static final class Builder {
            private String plotType; 
            private java.util.List<String> xAxis; 
            private java.util.List<String> yAxis; 

            /**
             * plotType.
             */
            public Builder plotType(String plotType) {
                this.plotType = plotType;
                return this;
            }

            /**
             * xAxis.
             */
            public Builder xAxis(java.util.List<String> xAxis) {
                this.xAxis = xAxis;
                return this;
            }

            /**
             * yAxis.
             */
            public Builder yAxis(java.util.List<String> yAxis) {
                this.yAxis = yAxis;
                return this;
            }

            public VisualizationData build() {
                return new VisualizationData(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunDataAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunDataAnalysisResponseBody</p>
     */
    public static class Visualization extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private VisualizationData data;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        private Visualization(Builder builder) {
            this.data = builder.data;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Visualization create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public VisualizationData getData() {
            return this.data;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private VisualizationData data; 
            private String text; 

            /**
             * data.
             */
            public Builder data(VisualizationData data) {
                this.data = data;
                return this;
            }

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Visualization build() {
                return new Visualization(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunDataAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunDataAnalysisResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("evidence")
        private String evidence;

        @com.aliyun.core.annotation.NameInMap("httpStatusCode")
        private Long httpStatusCode;

        @com.aliyun.core.annotation.NameInMap("requestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("rewrite")
        private String rewrite;

        @com.aliyun.core.annotation.NameInMap("selector")
        private java.util.List<String> selector;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("sql")
        private String sql;

        @com.aliyun.core.annotation.NameInMap("sqlData")
        private SqlData sqlData;

        @com.aliyun.core.annotation.NameInMap("sqlError")
        private String sqlError;

        @com.aliyun.core.annotation.NameInMap("visualization")
        private Visualization visualization;

        private Data(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.event = builder.event;
            this.evidence = builder.evidence;
            this.httpStatusCode = builder.httpStatusCode;
            this.requestId = builder.requestId;
            this.rewrite = builder.rewrite;
            this.selector = builder.selector;
            this.sessionId = builder.sessionId;
            this.sql = builder.sql;
            this.sqlData = builder.sqlData;
            this.sqlError = builder.sqlError;
            this.visualization = builder.visualization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return evidence
         */
        public String getEvidence() {
            return this.evidence;
        }

        /**
         * @return httpStatusCode
         */
        public Long getHttpStatusCode() {
            return this.httpStatusCode;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return rewrite
         */
        public String getRewrite() {
            return this.rewrite;
        }

        /**
         * @return selector
         */
        public java.util.List<String> getSelector() {
            return this.selector;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return sql
         */
        public String getSql() {
            return this.sql;
        }

        /**
         * @return sqlData
         */
        public SqlData getSqlData() {
            return this.sqlData;
        }

        /**
         * @return sqlError
         */
        public String getSqlError() {
            return this.sqlError;
        }

        /**
         * @return visualization
         */
        public Visualization getVisualization() {
            return this.visualization;
        }

        public static final class Builder {
            private String errorMessage; 
            private String event; 
            private String evidence; 
            private Long httpStatusCode; 
            private String requestId; 
            private String rewrite; 
            private java.util.List<String> selector; 
            private String sessionId; 
            private String sql; 
            private SqlData sqlData; 
            private String sqlError; 
            private Visualization visualization; 

            /**
             * errorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * evidence.
             */
            public Builder evidence(String evidence) {
                this.evidence = evidence;
                return this;
            }

            /**
             * httpStatusCode.
             */
            public Builder httpStatusCode(Long httpStatusCode) {
                this.httpStatusCode = httpStatusCode;
                return this;
            }

            /**
             * requestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * rewrite.
             */
            public Builder rewrite(String rewrite) {
                this.rewrite = rewrite;
                return this;
            }

            /**
             * selector.
             */
            public Builder selector(java.util.List<String> selector) {
                this.selector = selector;
                return this;
            }

            /**
             * sessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * sql.
             */
            public Builder sql(String sql) {
                this.sql = sql;
                return this;
            }

            /**
             * sqlData.
             */
            public Builder sqlData(SqlData sqlData) {
                this.sqlData = sqlData;
                return this;
            }

            /**
             * sqlError.
             */
            public Builder sqlError(String sqlError) {
                this.sqlError = sqlError;
                return this;
            }

            /**
             * visualization.
             */
            public Builder visualization(Visualization visualization) {
                this.visualization = visualization;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
