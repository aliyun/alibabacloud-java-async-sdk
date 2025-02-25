// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsSlowSqlsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsSlowSqlsResponseBody</p>
 */
public class DescribeDrdsSlowSqlsResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
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
         * Indicates the details of the slow SQL query.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * Indicates the page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * Indicates the number of entries returned on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Indicates the ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Indicates the total number of entries.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeDrdsSlowSqlsResponseBody build() {
            return new DescribeDrdsSlowSqlsResponseBody(this);
        } 

    } 

    public static class Item extends TeaModel {
        @NameInMap("Host")
        private String host;

        @NameInMap("ResponseTime")
        private Long responseTime;

        @NameInMap("Schema")
        private String schema;

        @NameInMap("SendTime")
        private Long sendTime;

        @NameInMap("Sql")
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
             * Indicates the IP address of the execution machine.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * Indicates the response time. Unit: ms.
             */
            public Builder responseTime(Long responseTime) {
                this.responseTime = responseTime;
                return this;
            }

            /**
             * Indicates the name of the database.
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            /**
             * Indicates the time when the slow SQL query was sent. Unit: ms.
             */
            public Builder sendTime(Long sendTime) {
                this.sendTime = sendTime;
                return this;
            }

            /**
             * Indicates the content of the slow SQL query.
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
    public static class Items extends TeaModel {
        @NameInMap("Item")
        private java.util.List < Item> item;

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
        public java.util.List < Item> getItem() {
            return this.item;
        }

        public static final class Builder {
            private java.util.List < Item> item; 

            /**
             * Item.
             */
            public Builder item(java.util.List < Item> item) {
                this.item = item;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
