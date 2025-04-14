// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link SmartqQueryAbilityResponseBody} extends {@link TeaModel}
 *
 * <p>SmartqQueryAbilityResponseBody</p>
 */
public class SmartqQueryAbilityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean success;

    private SmartqQueryAbilityResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SmartqQueryAbilityResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(SmartqQueryAbilityResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SmartqQueryAbilityResponseBody build() {
            return new SmartqQueryAbilityResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SmartqQueryAbilityResponseBody} extends {@link TeaModel}
     *
     * <p>SmartqQueryAbilityResponseBody</p>
     */
    public static class MetaType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private MetaType(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetaType create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(MetaType model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public MetaType build() {
                return new MetaType(this);
            } 

        } 

    }
    /**
     * 
     * {@link SmartqQueryAbilityResponseBody} extends {@link TeaModel}
     *
     * <p>SmartqQueryAbilityResponseBody</p>
     */
    public static class Values extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Row")
        private java.util.List<String> row;

        private Values(Builder builder) {
            this.row = builder.row;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Values create() {
            return builder().build();
        }

        /**
         * @return row
         */
        public java.util.List<String> getRow() {
            return this.row;
        }

        public static final class Builder {
            private java.util.List<String> row; 

            private Builder() {
            } 

            private Builder(Values model) {
                this.row = model.row;
            } 

            /**
             * Row.
             */
            public Builder row(java.util.List<String> row) {
                this.row = row;
                return this;
            }

            public Values build() {
                return new Values(this);
            } 

        } 

    }
    /**
     * 
     * {@link SmartqQueryAbilityResponseBody} extends {@link TeaModel}
     *
     * <p>SmartqQueryAbilityResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChartType")
        private String chartType;

        @com.aliyun.core.annotation.NameInMap("ConclusionText")
        private String conclusionText;

        @com.aliyun.core.annotation.NameInMap("LogicSql")
        private String logicSql;

        @com.aliyun.core.annotation.NameInMap("MetaType")
        private java.util.List<MetaType> metaType;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<Values> values;

        private Result(Builder builder) {
            this.chartType = builder.chartType;
            this.conclusionText = builder.conclusionText;
            this.logicSql = builder.logicSql;
            this.metaType = builder.metaType;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return chartType
         */
        public String getChartType() {
            return this.chartType;
        }

        /**
         * @return conclusionText
         */
        public String getConclusionText() {
            return this.conclusionText;
        }

        /**
         * @return logicSql
         */
        public String getLogicSql() {
            return this.logicSql;
        }

        /**
         * @return metaType
         */
        public java.util.List<MetaType> getMetaType() {
            return this.metaType;
        }

        /**
         * @return values
         */
        public java.util.List<Values> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String chartType; 
            private String conclusionText; 
            private String logicSql; 
            private java.util.List<MetaType> metaType; 
            private java.util.List<Values> values; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.chartType = model.chartType;
                this.conclusionText = model.conclusionText;
                this.logicSql = model.logicSql;
                this.metaType = model.metaType;
                this.values = model.values;
            } 

            /**
             * ChartType.
             */
            public Builder chartType(String chartType) {
                this.chartType = chartType;
                return this;
            }

            /**
             * ConclusionText.
             */
            public Builder conclusionText(String conclusionText) {
                this.conclusionText = conclusionText;
                return this;
            }

            /**
             * LogicSql.
             */
            public Builder logicSql(String logicSql) {
                this.logicSql = logicSql;
                return this;
            }

            /**
             * MetaType.
             */
            public Builder metaType(java.util.List<MetaType> metaType) {
                this.metaType = metaType;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(java.util.List<Values> values) {
                this.values = values;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
