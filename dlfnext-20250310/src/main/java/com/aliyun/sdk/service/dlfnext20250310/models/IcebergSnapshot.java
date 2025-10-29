// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link IcebergSnapshot} extends {@link TeaModel}
 *
 * <p>IcebergSnapshot</p>
 */
public class IcebergSnapshot extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("addedRows")
    private Long addedRows;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("idString")
    private String idString;

    @com.aliyun.core.annotation.NameInMap("operation")
    private String operation;

    @com.aliyun.core.annotation.NameInMap("parentId")
    private Long parentId;

    @com.aliyun.core.annotation.NameInMap("parentIdString")
    private String parentIdString;

    @com.aliyun.core.annotation.NameInMap("schemaId")
    private Long schemaId;

    @com.aliyun.core.annotation.NameInMap("sequenceNumber")
    private Long sequenceNumber;

    @com.aliyun.core.annotation.NameInMap("summary")
    private java.util.Map<String, String> summary;

    @com.aliyun.core.annotation.NameInMap("timestampMillis")
    private Long timestampMillis;

    private IcebergSnapshot(Builder builder) {
        this.addedRows = builder.addedRows;
        this.id = builder.id;
        this.idString = builder.idString;
        this.operation = builder.operation;
        this.parentId = builder.parentId;
        this.parentIdString = builder.parentIdString;
        this.schemaId = builder.schemaId;
        this.sequenceNumber = builder.sequenceNumber;
        this.summary = builder.summary;
        this.timestampMillis = builder.timestampMillis;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IcebergSnapshot create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addedRows
     */
    public Long getAddedRows() {
        return this.addedRows;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return idString
     */
    public String getIdString() {
        return this.idString;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return parentId
     */
    public Long getParentId() {
        return this.parentId;
    }

    /**
     * @return parentIdString
     */
    public String getParentIdString() {
        return this.parentIdString;
    }

    /**
     * @return schemaId
     */
    public Long getSchemaId() {
        return this.schemaId;
    }

    /**
     * @return sequenceNumber
     */
    public Long getSequenceNumber() {
        return this.sequenceNumber;
    }

    /**
     * @return summary
     */
    public java.util.Map<String, String> getSummary() {
        return this.summary;
    }

    /**
     * @return timestampMillis
     */
    public Long getTimestampMillis() {
        return this.timestampMillis;
    }

    public static final class Builder {
        private Long addedRows; 
        private Long id; 
        private String idString; 
        private String operation; 
        private Long parentId; 
        private String parentIdString; 
        private Long schemaId; 
        private Long sequenceNumber; 
        private java.util.Map<String, String> summary; 
        private Long timestampMillis; 

        private Builder() {
        } 

        private Builder(IcebergSnapshot model) {
            this.addedRows = model.addedRows;
            this.id = model.id;
            this.idString = model.idString;
            this.operation = model.operation;
            this.parentId = model.parentId;
            this.parentIdString = model.parentIdString;
            this.schemaId = model.schemaId;
            this.sequenceNumber = model.sequenceNumber;
            this.summary = model.summary;
            this.timestampMillis = model.timestampMillis;
        } 

        /**
         * addedRows.
         */
        public Builder addedRows(Long addedRows) {
            this.addedRows = addedRows;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * idString.
         */
        public Builder idString(String idString) {
            this.idString = idString;
            return this;
        }

        /**
         * operation.
         */
        public Builder operation(String operation) {
            this.operation = operation;
            return this;
        }

        /**
         * parentId.
         */
        public Builder parentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }

        /**
         * parentIdString.
         */
        public Builder parentIdString(String parentIdString) {
            this.parentIdString = parentIdString;
            return this;
        }

        /**
         * schemaId.
         */
        public Builder schemaId(Long schemaId) {
            this.schemaId = schemaId;
            return this;
        }

        /**
         * sequenceNumber.
         */
        public Builder sequenceNumber(Long sequenceNumber) {
            this.sequenceNumber = sequenceNumber;
            return this;
        }

        /**
         * summary.
         */
        public Builder summary(java.util.Map<String, String> summary) {
            this.summary = summary;
            return this;
        }

        /**
         * timestampMillis.
         */
        public Builder timestampMillis(Long timestampMillis) {
            this.timestampMillis = timestampMillis;
            return this;
        }

        public IcebergSnapshot build() {
            return new IcebergSnapshot(this);
        } 

    } 

}
