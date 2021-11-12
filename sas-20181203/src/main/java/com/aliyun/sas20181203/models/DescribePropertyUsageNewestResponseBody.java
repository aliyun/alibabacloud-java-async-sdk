// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribePropertyUsageNewestResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePropertyUsageNewestResponseBody</p>
 */
public class DescribePropertyUsageNewestResponseBody extends TeaModel {
    @NameInMap("ItemCount")
    private Integer itemCount;

    @NameInMap("NewestStatisticItems")
    private java.util.List < NewestStatisticItems> newestStatisticItems;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Type")
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
         * <p>ItemCount.</p>
         */
        public Builder itemCount(Integer itemCount) {
            this.itemCount = itemCount;
            return this;
        }

        /**
         * <p>NewestStatisticItems.</p>
         */
        public Builder newestStatisticItems(java.util.List < NewestStatisticItems> newestStatisticItems) {
            this.newestStatisticItems = newestStatisticItems;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Type.</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DescribePropertyUsageNewestResponseBody build() {
            return new DescribePropertyUsageNewestResponseBody(this);
        } 

    } 

    public static class NewestStatisticItems extends TeaModel {
        @NameInMap("Create")
        private Long create;

        @NameInMap("Name")
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
             * <p>Create.</p>
             */
            public Builder create(Long create) {
                this.create = create;
                return this;
            }

            /**
             * <p>Name.</p>
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
