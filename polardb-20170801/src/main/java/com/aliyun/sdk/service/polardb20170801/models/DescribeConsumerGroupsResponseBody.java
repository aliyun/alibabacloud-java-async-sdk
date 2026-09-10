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
 * {@link DescribeConsumerGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConsumerGroupsResponseBody</p>
 */
public class DescribeConsumerGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeConsumerGroupsResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConsumerGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
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
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeConsumerGroupsResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>A list of consumer groups.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The number of records returned per page. Valid values: 30, 50, and 100. Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>24A1990B-4F6E-482B-B8CB-75C612******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeConsumerGroupsResponseBody build() {
            return new DescribeConsumerGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeConsumerGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConsumerGroupsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowedModels")
        private String allowedModels;

        @com.aliyun.core.annotation.NameInMap("ConsumerGroupId")
        private String consumerGroupId;

        @com.aliyun.core.annotation.NameInMap("ConsumerGroupName")
        private String consumerGroupName;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private String isDefault;

        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        private Items(Builder builder) {
            this.allowedModels = builder.allowedModels;
            this.consumerGroupId = builder.consumerGroupId;
            this.consumerGroupName = builder.consumerGroupName;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.isDefault = builder.isDefault;
            this.nickName = builder.nickName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return allowedModels
         */
        public String getAllowedModels() {
            return this.allowedModels;
        }

        /**
         * @return consumerGroupId
         */
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        /**
         * @return consumerGroupName
         */
        public String getConsumerGroupName() {
            return this.consumerGroupName;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return isDefault
         */
        public String getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        public static final class Builder {
            private String allowedModels; 
            private String consumerGroupId; 
            private String consumerGroupName; 
            private String gmtCreated; 
            private String gmtModified; 
            private String isDefault; 
            private String nickName; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.allowedModels = model.allowedModels;
                this.consumerGroupId = model.consumerGroupId;
                this.consumerGroupName = model.consumerGroupName;
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.isDefault = model.isDefault;
                this.nickName = model.nickName;
            } 

            /**
             * <p>The list of supported models.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;[]&quot;</p>
             */
            public Builder allowedModels(String allowedModels) {
                this.allowedModels = allowedModels;
                return this;
            }

            /**
             * <p>The ID of the consumer group.</p>
             * 
             * <strong>example:</strong>
             * <p>cg-xxxxxxxx</p>
             */
            public Builder consumerGroupId(String consumerGroupId) {
                this.consumerGroupId = consumerGroupId;
                return this;
            }

            /**
             * <p>The name of the consumer group.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder consumerGroupName(String consumerGroupName) {
                this.consumerGroupName = consumerGroupName;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-28T09:56:03+08:00</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-04T16:09:29+08:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Indicates whether the consumer group is the default group. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: No</p>
             * </li>
             * <li><p><strong>1</strong>: Yes</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isDefault(String isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The nickname of the consumer group.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
