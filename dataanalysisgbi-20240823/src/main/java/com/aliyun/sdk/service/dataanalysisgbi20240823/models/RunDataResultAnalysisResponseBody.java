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
 * {@link RunDataResultAnalysisResponseBody} extends {@link TeaModel}
 *
 * <p>RunDataResultAnalysisResponseBody</p>
 */
public class RunDataResultAnalysisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    private RunDataResultAnalysisResponseBody(Builder builder) {
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunDataResultAnalysisResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    public static final class Builder {
        private Data data; 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public RunDataResultAnalysisResponseBody build() {
            return new RunDataResultAnalysisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunDataResultAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunDataResultAnalysisResponseBody</p>
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
     * {@link RunDataResultAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunDataResultAnalysisResponseBody</p>
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
     * {@link RunDataResultAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>RunDataResultAnalysisResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("requestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("rewrite")
        private String rewrite;

        @com.aliyun.core.annotation.NameInMap("sql")
        private String sql;

        @com.aliyun.core.annotation.NameInMap("visualization")
        private Visualization visualization;

        private Data(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.event = builder.event;
            this.requestId = builder.requestId;
            this.rewrite = builder.rewrite;
            this.sql = builder.sql;
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
         * @return sql
         */
        public String getSql() {
            return this.sql;
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
            private String requestId; 
            private String rewrite; 
            private String sql; 
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
             * sql.
             */
            public Builder sql(String sql) {
                this.sql = sql;
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
