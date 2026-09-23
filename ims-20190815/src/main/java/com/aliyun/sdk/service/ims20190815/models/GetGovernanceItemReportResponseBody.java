// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link GetGovernanceItemReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetGovernanceItemReportResponseBody</p>
 */
public class GetGovernanceItemReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ColumnsSchema")
    private ColumnsSchema columnsSchema;

    @com.aliyun.core.annotation.NameInMap("ColumnsValue")
    private ColumnsValue columnsValue;

    @com.aliyun.core.annotation.NameInMap("GenerateTime")
    private String generateTime;

    @com.aliyun.core.annotation.NameInMap("IsTruncated")
    private Boolean isTruncated;

    @com.aliyun.core.annotation.NameInMap("Marker")
    private String marker;

    @com.aliyun.core.annotation.NameInMap("MetricType")
    private String metricType;

    @com.aliyun.core.annotation.NameInMap("MetricValue")
    private Object metricValue;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetGovernanceItemReportResponseBody(Builder builder) {
        this.columnsSchema = builder.columnsSchema;
        this.columnsValue = builder.columnsValue;
        this.generateTime = builder.generateTime;
        this.isTruncated = builder.isTruncated;
        this.marker = builder.marker;
        this.metricType = builder.metricType;
        this.metricValue = builder.metricValue;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGovernanceItemReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return columnsSchema
     */
    public ColumnsSchema getColumnsSchema() {
        return this.columnsSchema;
    }

    /**
     * @return columnsValue
     */
    public ColumnsValue getColumnsValue() {
        return this.columnsValue;
    }

    /**
     * @return generateTime
     */
    public String getGenerateTime() {
        return this.generateTime;
    }

    /**
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return metricType
     */
    public String getMetricType() {
        return this.metricType;
    }

    /**
     * @return metricValue
     */
    public Object getMetricValue() {
        return this.metricValue;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ColumnsSchema columnsSchema; 
        private ColumnsValue columnsValue; 
        private String generateTime; 
        private Boolean isTruncated; 
        private String marker; 
        private String metricType; 
        private Object metricValue; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetGovernanceItemReportResponseBody model) {
            this.columnsSchema = model.columnsSchema;
            this.columnsValue = model.columnsValue;
            this.generateTime = model.generateTime;
            this.isTruncated = model.isTruncated;
            this.marker = model.marker;
            this.metricType = model.metricType;
            this.metricValue = model.metricValue;
            this.requestId = model.requestId;
        } 

        /**
         * ColumnsSchema.
         */
        public Builder columnsSchema(ColumnsSchema columnsSchema) {
            this.columnsSchema = columnsSchema;
            return this;
        }

        /**
         * ColumnsValue.
         */
        public Builder columnsValue(ColumnsValue columnsValue) {
            this.columnsValue = columnsValue;
            return this;
        }

        /**
         * <p>The time when the report for the check item was generated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-19T15:06:52Z</p>
         */
        public Builder generateTime(String generateTime) {
            this.generateTime = generateTime;
            return this;
        }

        /**
         * <p>Indicates whether the response is truncated. Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * <p>This parameter is returned only when <code>IsTruncated</code> is set to true. Use this parameter to retrieve the truncated content.</p>
         * 
         * <strong>example:</strong>
         * <p>EXAMPLE</p>
         */
        public Builder marker(String marker) {
            this.marker = marker;
            return this;
        }

        /**
         * <p>The data type of the metric value. Valid values:</p>
         * <ul>
         * <li><p>Number: the numeric type.</p>
         * </li>
         * <li><p>String: the string type.</p>
         * </li>
         * <li><p>Boolean: the Boolean type.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Number</p>
         */
        public Builder metricType(String metricType) {
            this.metricType = metricType;
            return this;
        }

        /**
         * <p>The metric value.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder metricValue(Object metricValue) {
            this.metricValue = metricValue;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F2CE9688-AA85-5F23-8C22-0EC23473405F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetGovernanceItemReportResponseBody build() {
            return new GetGovernanceItemReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGovernanceItemReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetGovernanceItemReportResponseBody</p>
     */
    public static class ColumnSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("ColumnType")
        private String columnType;

        private ColumnSchema(Builder builder) {
            this.columnName = builder.columnName;
            this.columnType = builder.columnType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColumnSchema create() {
            return builder().build();
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return columnType
         */
        public String getColumnType() {
            return this.columnType;
        }

        public static final class Builder {
            private String columnName; 
            private String columnType; 

            private Builder() {
            } 

            private Builder(ColumnSchema model) {
                this.columnName = model.columnName;
                this.columnType = model.columnType;
            } 

            /**
             * ColumnName.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * ColumnType.
             */
            public Builder columnType(String columnType) {
                this.columnType = columnType;
                return this;
            }

            public ColumnSchema build() {
                return new ColumnSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGovernanceItemReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetGovernanceItemReportResponseBody</p>
     */
    public static class ColumnsSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnSchema")
        private java.util.List<ColumnSchema> columnSchema;

        private ColumnsSchema(Builder builder) {
            this.columnSchema = builder.columnSchema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColumnsSchema create() {
            return builder().build();
        }

        /**
         * @return columnSchema
         */
        public java.util.List<ColumnSchema> getColumnSchema() {
            return this.columnSchema;
        }

        public static final class Builder {
            private java.util.List<ColumnSchema> columnSchema; 

            private Builder() {
            } 

            private Builder(ColumnsSchema model) {
                this.columnSchema = model.columnSchema;
            } 

            /**
             * ColumnSchema.
             */
            public Builder columnSchema(java.util.List<ColumnSchema> columnSchema) {
                this.columnSchema = columnSchema;
                return this;
            }

            public ColumnsSchema build() {
                return new ColumnsSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGovernanceItemReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetGovernanceItemReportResponseBody</p>
     */
    public static class ColumnRow extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnValue")
        private java.util.List<?> columnValue;

        private ColumnRow(Builder builder) {
            this.columnValue = builder.columnValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColumnRow create() {
            return builder().build();
        }

        /**
         * @return columnValue
         */
        public java.util.List<?> getColumnValue() {
            return this.columnValue;
        }

        public static final class Builder {
            private java.util.List<?> columnValue; 

            private Builder() {
            } 

            private Builder(ColumnRow model) {
                this.columnValue = model.columnValue;
            } 

            /**
             * ColumnValue.
             */
            public Builder columnValue(java.util.List<?> columnValue) {
                this.columnValue = columnValue;
                return this;
            }

            public ColumnRow build() {
                return new ColumnRow(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGovernanceItemReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetGovernanceItemReportResponseBody</p>
     */
    public static class ColumnsValue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnRow")
        private java.util.List<ColumnRow> columnRow;

        private ColumnsValue(Builder builder) {
            this.columnRow = builder.columnRow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColumnsValue create() {
            return builder().build();
        }

        /**
         * @return columnRow
         */
        public java.util.List<ColumnRow> getColumnRow() {
            return this.columnRow;
        }

        public static final class Builder {
            private java.util.List<ColumnRow> columnRow; 

            private Builder() {
            } 

            private Builder(ColumnsValue model) {
                this.columnRow = model.columnRow;
            } 

            /**
             * ColumnRow.
             */
            public Builder columnRow(java.util.List<ColumnRow> columnRow) {
                this.columnRow = columnRow;
                return this;
            }

            public ColumnsValue build() {
                return new ColumnsValue(this);
            } 

        } 

    }
}
