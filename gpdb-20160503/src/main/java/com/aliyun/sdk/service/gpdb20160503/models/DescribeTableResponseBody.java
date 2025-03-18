// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeTableResponseBody model) {
            this.columnList = model.columnList;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The columns of the table.</p>
         */
        public Builder columnList(ColumnList columnList) {
            this.columnList = columnList;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the operation. Valid values:</p>
         * <ul>
         * <li><strong>success</strong></li>
         * <li><strong>fail</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeTableResponseBody build() {
            return new DescribeTableResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTableResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTableResponseBody</p>
     */
    public static class ColumnList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnList")
        private java.util.List<ColumnMetadata> columnList;

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
        public java.util.List<ColumnMetadata> getColumnList() {
            return this.columnList;
        }

        public static final class Builder {
            private java.util.List<ColumnMetadata> columnList; 

            private Builder() {
            } 

            private Builder(ColumnList model) {
                this.columnList = model.columnList;
            } 

            /**
             * <p>The columns of the table.</p>
             */
            public Builder columnList(java.util.List<ColumnMetadata> columnList) {
                this.columnList = columnList;
                return this;
            }

            public ColumnList build() {
                return new ColumnList(this);
            } 

        } 

    }
}
