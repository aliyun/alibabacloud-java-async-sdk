// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link GetMCTableSchemaResponseBody} extends {@link TeaModel}
 *
 * <p>GetMCTableSchemaResponseBody</p>
 */
public class GetMCTableSchemaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Columns")
    private java.util.List<Columns> columns;

    @com.aliyun.core.annotation.NameInMap("PartitionColumns")
    private java.util.List<String> partitionColumns;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMCTableSchemaResponseBody(Builder builder) {
        this.columns = builder.columns;
        this.partitionColumns = builder.partitionColumns;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMCTableSchemaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return columns
     */
    public java.util.List<Columns> getColumns() {
        return this.columns;
    }

    /**
     * @return partitionColumns
     */
    public java.util.List<String> getPartitionColumns() {
        return this.partitionColumns;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Columns> columns; 
        private java.util.List<String> partitionColumns; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMCTableSchemaResponseBody model) {
            this.columns = model.columns;
            this.partitionColumns = model.partitionColumns;
            this.requestId = model.requestId;
        } 

        /**
         * Columns.
         */
        public Builder columns(java.util.List<Columns> columns) {
            this.columns = columns;
            return this;
        }

        /**
         * PartitionColumns.
         */
        public Builder partitionColumns(java.util.List<String> partitionColumns) {
            this.partitionColumns = partitionColumns;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMCTableSchemaResponseBody build() {
            return new GetMCTableSchemaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMCTableSchemaResponseBody} extends {@link TeaModel}
     *
     * <p>GetMCTableSchemaResponseBody</p>
     */
    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Preview")
        private java.util.List<String> preview;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Columns(Builder builder) {
            this.name = builder.name;
            this.preview = builder.preview;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Columns create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return preview
         */
        public java.util.List<String> getPreview() {
            return this.preview;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private java.util.List<String> preview; 
            private String type; 

            private Builder() {
            } 

            private Builder(Columns model) {
                this.name = model.name;
                this.preview = model.preview;
                this.type = model.type;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Preview.
             */
            public Builder preview(java.util.List<String> preview) {
                this.preview = preview;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Columns build() {
                return new Columns(this);
            } 

        } 

    }
}
