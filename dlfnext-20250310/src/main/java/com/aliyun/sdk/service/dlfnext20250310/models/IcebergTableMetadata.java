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
 * {@link IcebergTableMetadata} extends {@link TeaModel}
 *
 * <p>IcebergTableMetadata</p>
 */
public class IcebergTableMetadata extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("currentSnapshot")
    private IcebergSnapshot currentSnapshot;

    @com.aliyun.core.annotation.NameInMap("fields")
    private java.util.List<IcebergNestedField> fields;

    @com.aliyun.core.annotation.NameInMap("identifierFieldIds")
    private java.util.List<Integer> identifierFieldIds;

    @com.aliyun.core.annotation.NameInMap("partitionFields")
    private java.util.List<IcebergPartitionField> partitionFields;

    @com.aliyun.core.annotation.NameInMap("properties")
    private java.util.Map<String, String> properties;

    private IcebergTableMetadata(Builder builder) {
        this.currentSnapshot = builder.currentSnapshot;
        this.fields = builder.fields;
        this.identifierFieldIds = builder.identifierFieldIds;
        this.partitionFields = builder.partitionFields;
        this.properties = builder.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IcebergTableMetadata create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentSnapshot
     */
    public IcebergSnapshot getCurrentSnapshot() {
        return this.currentSnapshot;
    }

    /**
     * @return fields
     */
    public java.util.List<IcebergNestedField> getFields() {
        return this.fields;
    }

    /**
     * @return identifierFieldIds
     */
    public java.util.List<Integer> getIdentifierFieldIds() {
        return this.identifierFieldIds;
    }

    /**
     * @return partitionFields
     */
    public java.util.List<IcebergPartitionField> getPartitionFields() {
        return this.partitionFields;
    }

    /**
     * @return properties
     */
    public java.util.Map<String, String> getProperties() {
        return this.properties;
    }

    public static final class Builder {
        private IcebergSnapshot currentSnapshot; 
        private java.util.List<IcebergNestedField> fields; 
        private java.util.List<Integer> identifierFieldIds; 
        private java.util.List<IcebergPartitionField> partitionFields; 
        private java.util.Map<String, String> properties; 

        private Builder() {
        } 

        private Builder(IcebergTableMetadata model) {
            this.currentSnapshot = model.currentSnapshot;
            this.fields = model.fields;
            this.identifierFieldIds = model.identifierFieldIds;
            this.partitionFields = model.partitionFields;
            this.properties = model.properties;
        } 

        /**
         * currentSnapshot.
         */
        public Builder currentSnapshot(IcebergSnapshot currentSnapshot) {
            this.currentSnapshot = currentSnapshot;
            return this;
        }

        /**
         * fields.
         */
        public Builder fields(java.util.List<IcebergNestedField> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * identifierFieldIds.
         */
        public Builder identifierFieldIds(java.util.List<Integer> identifierFieldIds) {
            this.identifierFieldIds = identifierFieldIds;
            return this;
        }

        /**
         * partitionFields.
         */
        public Builder partitionFields(java.util.List<IcebergPartitionField> partitionFields) {
            this.partitionFields = partitionFields;
            return this;
        }

        /**
         * properties.
         */
        public Builder properties(java.util.Map<String, String> properties) {
            this.properties = properties;
            return this;
        }

        public IcebergTableMetadata build() {
            return new IcebergTableMetadata(this);
        } 

    } 

}
