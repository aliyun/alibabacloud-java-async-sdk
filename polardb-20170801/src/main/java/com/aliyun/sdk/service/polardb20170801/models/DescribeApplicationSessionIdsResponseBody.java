// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeApplicationSessionIdsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationSessionIdsResponseBody</p>
 */
public class DescribeApplicationSessionIdsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private String totalRecordCount;

    private DescribeApplicationSessionIdsResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationSessionIdsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
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
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String applicationId; 
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private String totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeApplicationSessionIdsResponseBody model) {
            this.applicationId = model.applicationId;
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * TotalRecordCount.
         */
        public Builder totalRecordCount(String totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeApplicationSessionIdsResponseBody build() {
            return new DescribeApplicationSessionIdsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApplicationSessionIdsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationSessionIdsResponseBody</p>
     */
    public static class ItemsItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Agent")
        private String agent;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private ItemsItems(Builder builder) {
            this.agent = builder.agent;
            this.sessionId = builder.sessionId;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemsItems create() {
            return builder().build();
        }

        /**
         * @return agent
         */
        public String getAgent() {
            return this.agent;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String agent; 
            private String sessionId; 
            private String time; 

            private Builder() {
            } 

            private Builder(ItemsItems model) {
                this.agent = model.agent;
                this.sessionId = model.sessionId;
                this.time = model.time;
            } 

            /**
             * Agent.
             */
            public Builder agent(String agent) {
                this.agent = agent;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public ItemsItems build() {
                return new ItemsItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationSessionIdsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationSessionIdsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<ItemsItems> items;

        private Items(Builder builder) {
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<ItemsItems> getItems() {
            return this.items;
        }

        public static final class Builder {
            private java.util.List<ItemsItems> items; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.items = model.items;
            } 

            /**
             * items.
             */
            public Builder items(java.util.List<ItemsItems> items) {
                this.items = items;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
