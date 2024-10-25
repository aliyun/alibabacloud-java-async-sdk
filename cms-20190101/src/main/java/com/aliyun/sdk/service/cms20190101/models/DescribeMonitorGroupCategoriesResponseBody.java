// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMonitorGroupCategoriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMonitorGroupCategoriesResponseBody</p>
 */
public class DescribeMonitorGroupCategoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("MonitorGroupCategories")
    private MonitorGroupCategories monitorGroupCategories;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeMonitorGroupCategoriesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.monitorGroupCategories = builder.monitorGroupCategories;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitorGroupCategoriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return monitorGroupCategories
     */
    public MonitorGroupCategories getMonitorGroupCategories() {
        return this.monitorGroupCategories;
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
        private Integer code; 
        private String message; 
        private MonitorGroupCategories monitorGroupCategories; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the request was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified resource is not found.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The cloud services to which the resources in the application group belong and the number of resources that belong to the cloud service.</p>
         */
        public Builder monitorGroupCategories(MonitorGroupCategories monitorGroupCategories) {
            this.monitorGroupCategories = monitorGroupCategories;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9E0347B0-EBC3-4769-A78D-D96F21C6BB52</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeMonitorGroupCategoriesResponseBody build() {
            return new DescribeMonitorGroupCategoriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMonitorGroupCategoriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorGroupCategoriesResponseBody</p>
     */
    public static class CategoryItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        private CategoryItem(Builder builder) {
            this.category = builder.category;
            this.count = builder.count;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CategoryItem create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        public static final class Builder {
            private String category; 
            private Integer count; 

            /**
             * <p>The abbreviation of the cloud service name.</p>
             * <blockquote>
             * <p> For more information about how to obtain the abbreviation of a cloud service name, see <code>metricCategory</code> in the response parameter <code>Labels</code> of the <a href="https://help.aliyun.com/document_detail/114916.html">DescribeProjectMeta</a> operation.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The number of resources that belong to the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            public CategoryItem build() {
                return new CategoryItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMonitorGroupCategoriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorGroupCategoriesResponseBody</p>
     */
    public static class MonitorGroupCategory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryItem")
        private java.util.List < CategoryItem> categoryItem;

        private MonitorGroupCategory(Builder builder) {
            this.categoryItem = builder.categoryItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorGroupCategory create() {
            return builder().build();
        }

        /**
         * @return categoryItem
         */
        public java.util.List < CategoryItem> getCategoryItem() {
            return this.categoryItem;
        }

        public static final class Builder {
            private java.util.List < CategoryItem> categoryItem; 

            /**
             * CategoryItem.
             */
            public Builder categoryItem(java.util.List < CategoryItem> categoryItem) {
                this.categoryItem = categoryItem;
                return this;
            }

            public MonitorGroupCategory build() {
                return new MonitorGroupCategory(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMonitorGroupCategoriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorGroupCategoriesResponseBody</p>
     */
    public static class MonitorGroupCategories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("MonitorGroupCategory")
        private MonitorGroupCategory monitorGroupCategory;

        private MonitorGroupCategories(Builder builder) {
            this.groupId = builder.groupId;
            this.monitorGroupCategory = builder.monitorGroupCategory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorGroupCategories create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return monitorGroupCategory
         */
        public MonitorGroupCategory getMonitorGroupCategory() {
            return this.monitorGroupCategory;
        }

        public static final class Builder {
            private Long groupId; 
            private MonitorGroupCategory monitorGroupCategory; 

            /**
             * <p>The ID of the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The cloud services to which the resources in the application group belong and the number of resources that belong to the cloud service.</p>
             */
            public Builder monitorGroupCategory(MonitorGroupCategory monitorGroupCategory) {
                this.monitorGroupCategory = monitorGroupCategory;
                return this;
            }

            public MonitorGroupCategories build() {
                return new MonitorGroupCategories(this);
            } 

        } 

    }
}
