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
         * GenerateTime.
         */
        public Builder generateTime(String generateTime) {
            this.generateTime = generateTime;
            return this;
        }

        /**
         * IsTruncated.
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * Marker.
         */
        public Builder marker(String marker) {
            this.marker = marker;
            return this;
        }

        /**
         * MetricType.
         */
        public Builder metricType(String metricType) {
            this.metricType = metricType;
            return this;
        }

        /**
         * MetricValue.
         */
        public Builder metricValue(Object metricValue) {
            this.metricValue = metricValue;
            return this;
        }

        /**
         * RequestId.
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
