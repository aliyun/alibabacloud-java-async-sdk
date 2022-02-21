// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTableResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTableResponseBody</p>
 */
public class DescribeTableResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeTableResponseBody build() {
            return new DescribeTableResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("ColumnName")
        private String columnName;

        @NameInMap("ColumnType")
        private String columnType;

        @NameInMap("Extra")
        private String extra;

        @NameInMap("Index")
        private String index;

        @NameInMap("IsAllowNull")
        private String isAllowNull;

        @NameInMap("IsPk")
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
             * ColumnName.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * ColumnType.
             */
            public Builder columnType(String columnType) {
                this.columnType = columnType;
                return this;
            }

            /**
             * Extra.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * IsAllowNull.
             */
            public Builder isAllowNull(String isAllowNull) {
                this.isAllowNull = isAllowNull;
                return this;
            }

            /**
             * IsPk.
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
    public static class Data extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

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
        public java.util.List < List> getList() {
            return this.list;
        }

        public static final class Builder {
            private java.util.List < List> list; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
