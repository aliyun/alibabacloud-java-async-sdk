// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link CostQueryModelsDTO} extends {@link TeaModel}
 *
 * <p>CostQueryModelsDTO</p>
 */
public class CostQueryModelsDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("columns")
    private java.util.List<MetricDefRespDTO> columns;

    @com.aliyun.core.annotation.NameInMap("idField")
    private String idField;

    @com.aliyun.core.annotation.NameInMap("nameField")
    private String nameField;

    @com.aliyun.core.annotation.NameInMap("rows")
    private java.util.List<ModelRowDTO> rows;

    private CostQueryModelsDTO(Builder builder) {
        this.columns = builder.columns;
        this.idField = builder.idField;
        this.nameField = builder.nameField;
        this.rows = builder.rows;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CostQueryModelsDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return columns
     */
    public java.util.List<MetricDefRespDTO> getColumns() {
        return this.columns;
    }

    /**
     * @return idField
     */
    public String getIdField() {
        return this.idField;
    }

    /**
     * @return nameField
     */
    public String getNameField() {
        return this.nameField;
    }

    /**
     * @return rows
     */
    public java.util.List<ModelRowDTO> getRows() {
        return this.rows;
    }

    public static final class Builder {
        private java.util.List<MetricDefRespDTO> columns; 
        private String idField; 
        private String nameField; 
        private java.util.List<ModelRowDTO> rows; 

        private Builder() {
        } 

        private Builder(CostQueryModelsDTO model) {
            this.columns = model.columns;
            this.idField = model.idField;
            this.nameField = model.nameField;
            this.rows = model.rows;
        } 

        /**
         * columns.
         */
        public Builder columns(java.util.List<MetricDefRespDTO> columns) {
            this.columns = columns;
            return this;
        }

        /**
         * idField.
         */
        public Builder idField(String idField) {
            this.idField = idField;
            return this;
        }

        /**
         * nameField.
         */
        public Builder nameField(String nameField) {
            this.nameField = nameField;
            return this;
        }

        /**
         * rows.
         */
        public Builder rows(java.util.List<ModelRowDTO> rows) {
            this.rows = rows;
            return this;
        }

        public CostQueryModelsDTO build() {
            return new CostQueryModelsDTO(this);
        } 

    } 

}
