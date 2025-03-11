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
 * {@link DescribeDrdsSlowSqlsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsSlowSqlsResponseBody</p>
 */
public class DescribeDrdsSlowSqlsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private DescribeDrdsSlowSqlsResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsSlowSqlsResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Items items; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        /**
         * <p>Indicates the details of the slow SQL query.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>Indicates the page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Indicates the number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Indicates the ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>509BDE17-505A-4B3B-854D-30D3F0******</p>
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

        /**
         * <p>Indicates the total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeDrdsSlowSqlsResponseBody build() {
            return new DescribeDrdsSlowSqlsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDrdsSlowSqlsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsSlowSqlsResponseBody</p>
     */
    public static class Item extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("ResponseTime")
        private Long responseTime;

        @com.aliyun.core.annotation.NameInMap("Schema")
        private String schema;

        @com.aliyun.core.annotation.NameInMap("SendTime")
        private Long sendTime;

        @com.aliyun.core.annotation.NameInMap("Sql")
        private String sql;

        private Item(Builder builder) {
            this.host = builder.host;
            this.responseTime = builder.responseTime;
            this.schema = builder.schema;
            this.sendTime = builder.sendTime;
            this.sql = builder.sql;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return responseTime
         */
        public Long getResponseTime() {
            return this.responseTime;
        }

        /**
         * @return schema
         */
        public String getSchema() {
            return this.schema;
        }

        /**
         * @return sendTime
         */
        public Long getSendTime() {
            return this.sendTime;
        }

        /**
         * @return sql
         */
        public String getSql() {
            return this.sql;
        }

        public static final class Builder {
            private String host; 
            private Long responseTime; 
            private String schema; 
            private Long sendTime; 
            private String sql; 

            /**
             * <p>Indicates the IP address of the execution machine.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.<em><strong>.</strong></em></p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>Indicates the response time. Unit: ms.</p>
             * 
             * <strong>example:</strong>
             * <p>1568267711</p>
             */
            public Builder responseTime(Long responseTime) {
                this.responseTime = responseTime;
                return this;
            }

            /**
             * <p>Indicates the name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            /**
             * <p>Indicates the time when the slow SQL query was sent. Unit: ms.</p>
             * 
             * <strong>example:</strong>
             * <p>1568267711</p>
             */
            public Builder sendTime(Long sendTime) {
                this.sendTime = sendTime;
                return this;
            }

            /**
             * <p>Indicates the content of the slow SQL query.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT   count(1) from   payment_order where   order_status = &quot;08&quot;;</p>
             */
            public Builder sql(String sql) {
                this.sql = sql;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDrdsSlowSqlsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsSlowSqlsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
        private java.util.List<Item> item;

        private Items(Builder builder) {
            this.item = builder.item;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public java.util.List<Item> getItem() {
            return this.item;
        }

        public static final class Builder {
            private java.util.List<Item> item; 

            /**
             * Item.
             */
            public Builder item(java.util.List<Item> item) {
                this.item = item;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
