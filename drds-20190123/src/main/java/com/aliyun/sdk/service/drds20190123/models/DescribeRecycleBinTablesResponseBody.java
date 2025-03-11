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
 * {@link DescribeRecycleBinTablesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecycleBinTablesResponseBody</p>
 */
public class DescribeRecycleBinTablesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeRecycleBinTablesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecycleBinTablesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The data object returned.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5D64DE5944A1E541E0CB908A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeRecycleBinTablesResponseBody build() {
            return new DescribeRecycleBinTablesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRecycleBinTablesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecycleBinTablesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("OriginalTableName")
        private String originalTableName;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.originalTableName = builder.originalTableName;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return originalTableName
         */
        public String getOriginalTableName() {
            return this.originalTableName;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String createTime; 
            private String originalTableName; 
            private String tableName; 

            /**
             * <p>The time when the table was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-09-16 14:42:06</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The original name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>BIN_T4AG3CY5WWXPKHITCHJY</p>
             */
            public Builder originalTableName(String originalTableName) {
                this.originalTableName = originalTableName;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
