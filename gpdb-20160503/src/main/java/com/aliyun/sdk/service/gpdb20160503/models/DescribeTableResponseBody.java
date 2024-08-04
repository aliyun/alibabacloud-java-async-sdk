// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTableResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTableResponseBody</p>
 */
public class DescribeTableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ColumnList")
    private ColumnList columnList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeTableResponseBody(Builder builder) {
        this.columnList = builder.columnList;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTableResponseBody create() {
        return builder().build();
    }

    /**
     * @return columnList
     */
    public ColumnList getColumnList() {
        return this.columnList;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private ColumnList columnList; 
        private String message; 
        private String requestId; 
        private String status; 

        /**
         * The columns of the table.
         */
        public Builder columnList(ColumnList columnList) {
            this.columnList = columnList;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the operation. Valid values:
         * <p>
         * 
         * *   **success**
         * *   **fail**
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeTableResponseBody build() {
            return new DescribeTableResponseBody(this);
        } 

    } 

    public static class ColumnList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnList")
        private java.util.List < ColumnMetadata > columnList;

        private ColumnList(Builder builder) {
            this.columnList = builder.columnList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColumnList create() {
            return builder().build();
        }

        /**
         * @return columnList
         */
        public java.util.List < ColumnMetadata > getColumnList() {
            return this.columnList;
        }

        public static final class Builder {
            private java.util.List < ColumnMetadata > columnList; 

            /**
             * The columns of the table.
             */
            public Builder columnList(java.util.List < ColumnMetadata > columnList) {
                this.columnList = columnList;
                return this;
            }

            public ColumnList build() {
                return new ColumnList(this);
            } 

        } 

    }
}
