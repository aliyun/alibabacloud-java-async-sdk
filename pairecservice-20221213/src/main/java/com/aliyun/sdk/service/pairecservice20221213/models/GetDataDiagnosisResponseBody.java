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
 * {@link GetDataDiagnosisResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataDiagnosisResponseBody</p>
 */
public class GetDataDiagnosisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("CycleTime")
    private String cycleTime;

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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

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

    private GetDataDiagnosisResponseBody(Builder builder) {
        this.config = builder.config;
        this.cycleTime = builder.cycleTime;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.leftTableMetaId = builder.leftTableMetaId;
        this.leftTablePartitionField = builder.leftTablePartitionField;
        this.name = builder.name;
        this.partitionField = builder.partitionField;
        this.requestId = builder.requestId;
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

    public static GetDataDiagnosisResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String leftTableMetaId; 
        private String leftTablePartitionField; 
        private String name; 
        private String partitionField; 
        private String requestId; 
        private String rightTableMetaId; 
        private String rightTablePartitionField; 
        private String tableMetaId; 
        private String tableMetaName; 
        private Long topNQuantity; 
        private String type; 

        private Builder() {
        } 

        private Builder(GetDataDiagnosisResponseBody model) {
            this.config = model.config;
            this.cycleTime = model.cycleTime;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.leftTableMetaId = model.leftTableMetaId;
            this.leftTablePartitionField = model.leftTablePartitionField;
            this.name = model.name;
            this.partitionField = model.partitionField;
            this.requestId = model.requestId;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public GetDataDiagnosisResponseBody build() {
            return new GetDataDiagnosisResponseBody(this);
        } 

    } 

}
