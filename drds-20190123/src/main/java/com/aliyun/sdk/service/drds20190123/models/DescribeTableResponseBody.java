// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeTableResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTableResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>Indicates the returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Indicates the unique ID of the request. If the request fails, provide this ID for technical support to troubleshoot the failure.</p>
         * 
         * <strong>example:</strong>
         * <p>B5644ABB-559A-4A1C-83F2-9E7209******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
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
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("ColumnType")
        private String columnType;

        @com.aliyun.core.annotation.NameInMap("Extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("Index")
        private String index;

        @com.aliyun.core.annotation.NameInMap("IsAllowNull")
        private String isAllowNull;

        @com.aliyun.core.annotation.NameInMap("IsPk")
        private String isPk;

        private List(Builder builder) {
            this.columnName = builder.columnName;
            this.columnType = builder.columnType;
            this.extra = builder.extra;
            this.index = builder.index;
            this.isAllowNull = builder.isAllowNull;
            this.isPk = builder.isPk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return columnType
         */
        public String getColumnType() {
            return this.columnType;
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return isAllowNull
         */
        public String getIsAllowNull() {
            return this.isAllowNull;
        }

        /**
         * @return isPk
         */
        public String getIsPk() {
            return this.isPk;
        }

        public static final class Builder {
            private String columnName; 
            private String columnType; 
            private String extra; 
            private String index; 
            private String isAllowNull; 
            private String isPk; 

            /**
             * <p>Indicates the name of a column.</p>
             * 
             * <strong>example:</strong>
             * <p>Id</p>
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * <p>Indicates the type of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>bigint(20)</p>
             */
            public Builder columnType(String columnType) {
                this.columnType = columnType;
                return this;
            }

            /**
             * <p>Extra</p>
             * 
             * <strong>example:</strong>
             * <p>auto_increment</p>
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * <p>Indicates the primary key of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>PRI</p>
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * <p>Indicates whether the column can be empty.</p>
             * 
             * <strong>example:</strong>
             * <p>NO</p>
             */
            public Builder isAllowNull(String isAllowNull) {
                this.isAllowNull = isAllowNull;
                return this;
            }

            /**
             * <p>Indicates whether the column is the primary key column of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>YES</p>
             */
            public Builder isPk(String isPk) {
                this.isPk = isPk;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTableResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTableResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        private Data(Builder builder) {
            this.list = builder.list;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        public static final class Builder {
            private java.util.List<List> list; 

            /**
             * <p>Indicates the details about the table schema.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
