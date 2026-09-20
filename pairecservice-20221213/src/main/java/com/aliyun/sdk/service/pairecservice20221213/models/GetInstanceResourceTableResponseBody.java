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
 * {@link GetInstanceResourceTableResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceResourceTableResponseBody</p>
 */
public class GetInstanceResourceTableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Fields")
    private java.util.List<Fields> fields;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    private GetInstanceResourceTableResponseBody(Builder builder) {
        this.fields = builder.fields;
        this.requestId = builder.requestId;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceResourceTableResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fields
     */
    public java.util.List<Fields> getFields() {
        return this.fields;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder {
        private java.util.List<Fields> fields; 
        private String requestId; 
        private String tableName; 

        private Builder() {
        } 

        private Builder(GetInstanceResourceTableResponseBody model) {
            this.fields = model.fields;
            this.requestId = model.requestId;
            this.tableName = model.tableName;
        } 

        /**
         * <p>The list of fields in the table.</p>
         */
        public Builder fields(java.util.List<Fields> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>74D958EF-3598-56FA-8296-FF1575CE43DF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_table</p>
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        public GetInstanceResourceTableResponseBody build() {
            return new GetInstanceResourceTableResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceResourceTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResourceTableResponseBody</p>
     */
    public static class Fields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsDimensionField")
        private Boolean isDimensionField;

        @com.aliyun.core.annotation.NameInMap("IsPartitionField")
        private Boolean isPartitionField;

        @com.aliyun.core.annotation.NameInMap("Meaning")
        private String meaning;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Fields(Builder builder) {
            this.isDimensionField = builder.isDimensionField;
            this.isPartitionField = builder.isPartitionField;
            this.meaning = builder.meaning;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fields create() {
            return builder().build();
        }

        /**
         * @return isDimensionField
         */
        public Boolean getIsDimensionField() {
            return this.isDimensionField;
        }

        /**
         * @return isPartitionField
         */
        public Boolean getIsPartitionField() {
            return this.isPartitionField;
        }

        /**
         * @return meaning
         */
        public String getMeaning() {
            return this.meaning;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean isDimensionField; 
            private Boolean isPartitionField; 
            private String meaning; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Fields model) {
                this.isDimensionField = model.isDimensionField;
                this.isPartitionField = model.isPartitionField;
                this.meaning = model.meaning;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>Indicates whether the field is a dimension field.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDimensionField(Boolean isDimensionField) {
                this.isDimensionField = isDimensionField;
                return this;
            }

            /**
             * <p>Indicates whether the field is a partition field.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isPartitionField(Boolean isPartitionField) {
                this.isPartitionField = isPartitionField;
                return this;
            }

            /**
             * <p>The field meaning.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder meaning(String meaning) {
                this.meaning = meaning;
                return this;
            }

            /**
             * <p>The field name.</p>
             * 
             * <strong>example:</strong>
             * <p>age</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The field type.</p>
             * 
             * <strong>example:</strong>
             * <p>BIGINT</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Fields build() {
                return new Fields(this);
            } 

        } 

    }
}
