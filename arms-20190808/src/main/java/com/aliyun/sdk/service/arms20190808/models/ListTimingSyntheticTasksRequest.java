// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link ListTimingSyntheticTasksRequest} extends {@link RequestModel}
 *
 * <p>ListTimingSyntheticTasksRequest</p>
 */
public class ListTimingSyntheticTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Search")
    private Search search;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private ListTimingSyntheticTasksRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.search = builder.search;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTimingSyntheticTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return search
     */
    public Search getSearch() {
        return this.search;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ListTimingSyntheticTasksRequest, Builder> {
        private String regionId; 
        private String resourceGroupId; 
        private Search search; 
        private java.util.List<Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(ListTimingSyntheticTasksRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.search = request.search;
            this.tags = request.tags;
        } 

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxyexli2****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The search keyword.</p>
         */
        public Builder search(Search search) {
            String searchShrink = shrink(search, "Search", "json");
            this.putQueryParameter("Search", searchShrink);
            this.search = search;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public ListTimingSyntheticTasksRequest build() {
            return new ListTimingSyntheticTasksRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListTimingSyntheticTasksRequest} extends {@link TeaModel}
     *
     * <p>ListTimingSyntheticTasksRequest</p>
     */
    public static class Search extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Order")
        private Integer order;

        @com.aliyun.core.annotation.NameInMap("OrderField")
        private String orderField;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskIds")
        private java.util.List<String> taskIds;

        @com.aliyun.core.annotation.NameInMap("TaskTypes")
        private java.util.List<Integer> taskTypes;

        private Search(Builder builder) {
            this.name = builder.name;
            this.order = builder.order;
            this.orderField = builder.orderField;
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.status = builder.status;
            this.taskIds = builder.taskIds;
            this.taskTypes = builder.taskTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Search create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return order
         */
        public Integer getOrder() {
            return this.order;
        }

        /**
         * @return orderField
         */
        public String getOrderField() {
            return this.orderField;
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskIds
         */
        public java.util.List<String> getTaskIds() {
            return this.taskIds;
        }

        /**
         * @return taskTypes
         */
        public java.util.List<Integer> getTaskTypes() {
            return this.taskTypes;
        }

        public static final class Builder {
            private String name; 
            private Integer order; 
            private String orderField; 
            private Integer page; 
            private Integer pageSize; 
            private String status; 
            private java.util.List<String> taskIds; 
            private java.util.List<Integer> taskTypes; 

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>AlibabaCloud DNS Task</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The order by which tasks are sorted. 1: ascending order. -1: descending order.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * <p>The condition by which tasks are sorted. You can sort tasks by gmtCreate, gmtModified, status, or monitorCount.</p>
             * 
             * <strong>example:</strong>
             * <p>status</p>
             */
            public Builder orderField(String orderField) {
                this.orderField = orderField;
                return this;
            }

            /**
             * <p>The page number. This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * <p>The number of entries per page. This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The task status. CREATING: The task is being created. RUNNING: The task is running. PARTIAL_RUNNING: The task is partially running. STOP: The task is stopped. LIMIT_STOP: The task is stopped due to quota limit. EXCEPTION: The task is abnormal. DELETE: The task is deleted. DELETE_EXCEPTION: An exception occurs while deleting the task.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task IDs.</p>
             */
            public Builder taskIds(java.util.List<String> taskIds) {
                this.taskIds = taskIds;
                return this;
            }

            /**
             * <p>The task types.</p>
             */
            public Builder taskTypes(java.util.List<Integer> taskTypes) {
                this.taskTypes = taskTypes;
                return this;
            }

            public Search build() {
                return new Search(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTimingSyntheticTasksRequest} extends {@link TeaModel}
     *
     * <p>ListTimingSyntheticTasksRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>mark</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value1111</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
