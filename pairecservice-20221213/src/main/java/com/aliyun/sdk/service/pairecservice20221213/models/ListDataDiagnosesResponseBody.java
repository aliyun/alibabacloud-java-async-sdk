// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListDataDiagnosesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataDiagnosesResponseBody</p>
 */
public class ListDataDiagnosesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataDiagnoses")
    private java.util.List<DataDiagnoses> dataDiagnoses;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListDataDiagnosesResponseBody(Builder builder) {
        this.dataDiagnoses = builder.dataDiagnoses;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataDiagnosesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataDiagnoses
     */
    public java.util.List<DataDiagnoses> getDataDiagnoses() {
        return this.dataDiagnoses;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<DataDiagnoses> dataDiagnoses; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListDataDiagnosesResponseBody model) {
            this.dataDiagnoses = model.dataDiagnoses;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * DataDiagnoses.
         */
        public Builder dataDiagnoses(java.util.List<DataDiagnoses> dataDiagnoses) {
            this.dataDiagnoses = dataDiagnoses;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDataDiagnosesResponseBody build() {
            return new ListDataDiagnosesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataDiagnosesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataDiagnosesResponseBody</p>
     */
    public static class DataDiagnoses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("CycleTime")
        private String cycleTime;

        @com.aliyun.core.annotation.NameInMap("DataDiagnosisId")
        private String dataDiagnosisId;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("LeftTableMetaId")
        private String leftTableMetaId;

        @com.aliyun.core.annotation.NameInMap("LeftTablePartitionField")
        private String leftTablePartitionField;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PartitionField")
        private String partitionField;

        @com.aliyun.core.annotation.NameInMap("RightTableMetaId")
        private String rightTableMetaId;

        @com.aliyun.core.annotation.NameInMap("RightTablePartitionField")
        private String rightTablePartitionField;

        @com.aliyun.core.annotation.NameInMap("TableMetaId")
        private String tableMetaId;

        @com.aliyun.core.annotation.NameInMap("TableMetaName")
        private String tableMetaName;

        @com.aliyun.core.annotation.NameInMap("TopNQuantity")
        private Long topNQuantity;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DataDiagnoses(Builder builder) {
            this.config = builder.config;
            this.cycleTime = builder.cycleTime;
            this.dataDiagnosisId = builder.dataDiagnosisId;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.leftTableMetaId = builder.leftTableMetaId;
            this.leftTablePartitionField = builder.leftTablePartitionField;
            this.name = builder.name;
            this.partitionField = builder.partitionField;
            this.rightTableMetaId = builder.rightTableMetaId;
            this.rightTablePartitionField = builder.rightTablePartitionField;
            this.tableMetaId = builder.tableMetaId;
            this.tableMetaName = builder.tableMetaName;
            this.topNQuantity = builder.topNQuantity;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDiagnoses create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return cycleTime
         */
        public String getCycleTime() {
            return this.cycleTime;
        }

        /**
         * @return dataDiagnosisId
         */
        public String getDataDiagnosisId() {
            return this.dataDiagnosisId;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return leftTableMetaId
         */
        public String getLeftTableMetaId() {
            return this.leftTableMetaId;
        }

        /**
         * @return leftTablePartitionField
         */
        public String getLeftTablePartitionField() {
            return this.leftTablePartitionField;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return partitionField
         */
        public String getPartitionField() {
            return this.partitionField;
        }

        /**
         * @return rightTableMetaId
         */
        public String getRightTableMetaId() {
            return this.rightTableMetaId;
        }

        /**
         * @return rightTablePartitionField
         */
        public String getRightTablePartitionField() {
            return this.rightTablePartitionField;
        }

        /**
         * @return tableMetaId
         */
        public String getTableMetaId() {
            return this.tableMetaId;
        }

        /**
         * @return tableMetaName
         */
        public String getTableMetaName() {
            return this.tableMetaName;
        }

        /**
         * @return topNQuantity
         */
        public Long getTopNQuantity() {
            return this.topNQuantity;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String config; 
            private String cycleTime; 
            private String dataDiagnosisId; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String leftTableMetaId; 
            private String leftTablePartitionField; 
            private String name; 
            private String partitionField; 
            private String rightTableMetaId; 
            private String rightTablePartitionField; 
            private String tableMetaId; 
            private String tableMetaName; 
            private Long topNQuantity; 
            private String type; 

            private Builder() {
            } 

            private Builder(DataDiagnoses model) {
                this.config = model.config;
                this.cycleTime = model.cycleTime;
                this.dataDiagnosisId = model.dataDiagnosisId;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.leftTableMetaId = model.leftTableMetaId;
                this.leftTablePartitionField = model.leftTablePartitionField;
                this.name = model.name;
                this.partitionField = model.partitionField;
                this.rightTableMetaId = model.rightTableMetaId;
                this.rightTablePartitionField = model.rightTablePartitionField;
                this.tableMetaId = model.tableMetaId;
                this.tableMetaName = model.tableMetaName;
                this.topNQuantity = model.topNQuantity;
                this.type = model.type;
            } 

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * CycleTime.
             */
            public Builder cycleTime(String cycleTime) {
                this.cycleTime = cycleTime;
                return this;
            }

            /**
             * DataDiagnosisId.
             */
            public Builder dataDiagnosisId(String dataDiagnosisId) {
                this.dataDiagnosisId = dataDiagnosisId;
                return this;
            }

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * LeftTableMetaId.
             */
            public Builder leftTableMetaId(String leftTableMetaId) {
                this.leftTableMetaId = leftTableMetaId;
                return this;
            }

            /**
             * LeftTablePartitionField.
             */
            public Builder leftTablePartitionField(String leftTablePartitionField) {
                this.leftTablePartitionField = leftTablePartitionField;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PartitionField.
             */
            public Builder partitionField(String partitionField) {
                this.partitionField = partitionField;
                return this;
            }

            /**
             * RightTableMetaId.
             */
            public Builder rightTableMetaId(String rightTableMetaId) {
                this.rightTableMetaId = rightTableMetaId;
                return this;
            }

            /**
             * RightTablePartitionField.
             */
            public Builder rightTablePartitionField(String rightTablePartitionField) {
                this.rightTablePartitionField = rightTablePartitionField;
                return this;
            }

            /**
             * TableMetaId.
             */
            public Builder tableMetaId(String tableMetaId) {
                this.tableMetaId = tableMetaId;
                return this;
            }

            /**
             * TableMetaName.
             */
            public Builder tableMetaName(String tableMetaName) {
                this.tableMetaName = tableMetaName;
                return this;
            }

            /**
             * TopNQuantity.
             */
            public Builder topNQuantity(Long topNQuantity) {
                this.topNQuantity = topNQuantity;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DataDiagnoses build() {
                return new DataDiagnoses(this);
            } 

        } 

    }
}
