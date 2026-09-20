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
         * <p>The list of data diagnoses.</p>
         */
        public Builder dataDiagnoses(java.util.List<DataDiagnoses> dataDiagnoses) {
            this.dataDiagnoses = dataDiagnoses;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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
             * <p>The configuration for the data diagnosis task, in JSON format. The required fields depend on the <code>Type</code> value:<br></p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;AnalysisField&quot;: &quot;userid&quot;,&quot;PartitionFieldFormat&quot;: &quot;yyyymmdd&quot;}</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The time at which the task is scheduled to run periodically. If this parameter is empty, the task runs only once.</p>
             * 
             * <strong>example:</strong>
             * <p>08:00</p>
             */
            public Builder cycleTime(String cycleTime) {
                this.cycleTime = cycleTime;
                return this;
            }

            /**
             * <p>The data diagnosis ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder dataDiagnosisId(String dataDiagnosisId) {
                this.dataDiagnosisId = dataDiagnosisId;
                return this;
            }

            /**
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-15T23:24:33.132+08:00</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>The time when the task was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-15T23:24:33.132+08:00</p>
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * <p>The ID of the left data table.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder leftTableMetaId(String leftTableMetaId) {
                this.leftTableMetaId = leftTableMetaId;
                return this;
            }

            /**
             * <p>The partition field of the left table.</p>
             * 
             * <strong>example:</strong>
             * <p>dt</p>
             */
            public Builder leftTablePartitionField(String leftTablePartitionField) {
                this.leftTablePartitionField = leftTablePartitionField;
                return this;
            }

            /**
             * <p>The name of the data diagnosis.</p>
             * 
             * <strong>example:</strong>
             * <p>data_diagnosis_job1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The partition field.</p>
             * 
             * <strong>example:</strong>
             * <p>dt</p>
             */
            public Builder partitionField(String partitionField) {
                this.partitionField = partitionField;
                return this;
            }

            /**
             * <p>The ID of the right data table.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder rightTableMetaId(String rightTableMetaId) {
                this.rightTableMetaId = rightTableMetaId;
                return this;
            }

            /**
             * <p>The partition field of the right table.</p>
             * 
             * <strong>example:</strong>
             * <p>dt</p>
             */
            public Builder rightTablePartitionField(String rightTablePartitionField) {
                this.rightTablePartitionField = rightTablePartitionField;
                return this;
            }

            /**
             * <p>The data table ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder tableMetaId(String tableMetaId) {
                this.tableMetaId = tableMetaId;
                return this;
            }

            /**
             * <p>The name of the data table.</p>
             * 
             * <strong>example:</strong>
             * <p>table_meta_1</p>
             */
            public Builder tableMetaName(String tableMetaName) {
                this.tableMetaName = tableMetaName;
                return this;
            }

            /**
             * <p>The number of top results to return.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder topNQuantity(Long topNQuantity) {
                this.topNQuantity = topNQuantity;
                return this;
            }

            /**
             * <p>The type of data diagnosis. Valid values:</p>
             * <ul>
             * <li><p><code>ChangeRate</code>: Change Rate Analysis.</p>
             * </li>
             * <li><p><code>PreferenceStatisticsCycle</code>: Preference Statistics Cycle Analysis.</p>
             * </li>
             * <li><p><code>JoinTables</code>: Join Tables Analysis.</p>
             * </li>
             * <li><p><code>BaseStatistics</code>: Base Statistics Analysis.</p>
             * </li>
             * <li><p><code>AbnormalBehavior</code>: Abnormal Behavior Analysis.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ChangeRate</p>
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
