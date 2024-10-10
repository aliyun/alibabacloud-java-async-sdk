// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePropertyUsageNewestResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePropertyUsageNewestResponseBody</p>
 */
public class DescribePropertyUsageNewestResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ItemCount")
    private Integer itemCount;

    @com.aliyun.core.annotation.NameInMap("NewestStatisticItems")
    private java.util.List < NewestStatisticItems> newestStatisticItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DescribePropertyUsageNewestResponseBody(Builder builder) {
        this.itemCount = builder.itemCount;
        this.newestStatisticItems = builder.newestStatisticItems;
        this.requestId = builder.requestId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyUsageNewestResponseBody create() {
        return builder().build();
    }

    /**
     * @return itemCount
     */
    public Integer getItemCount() {
        return this.itemCount;
    }

    /**
     * @return newestStatisticItems
     */
    public java.util.List < NewestStatisticItems> getNewestStatisticItems() {
        return this.newestStatisticItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Integer itemCount; 
        private java.util.List < NewestStatisticItems> newestStatisticItems; 
        private String requestId; 
        private String type; 

        /**
         * ItemCount.
         */
        public Builder itemCount(Integer itemCount) {
            this.itemCount = itemCount;
            return this;
        }

        /**
         * NewestStatisticItems.
         */
        public Builder newestStatisticItems(java.util.List < NewestStatisticItems> newestStatisticItems) {
            this.newestStatisticItems = newestStatisticItems;
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
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DescribePropertyUsageNewestResponseBody build() {
            return new DescribePropertyUsageNewestResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePropertyUsageNewestResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePropertyUsageNewestResponseBody</p>
     */
    public static class NewestStatisticItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Create")
        private Long create;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private NewestStatisticItems(Builder builder) {
            this.create = builder.create;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NewestStatisticItems create() {
            return builder().build();
        }

        /**
         * @return create
         */
        public Long getCreate() {
            return this.create;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long create; 
            private String name; 

            /**
             * Create.
             */
            public Builder create(Long create) {
                this.create = create;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public NewestStatisticItems build() {
                return new NewestStatisticItems(this);
            } 

        } 

    }
}
