// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitorGroupCategoriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMonitorGroupCategoriesResponseBody</p>
 */
public class DescribeMonitorGroupCategoriesResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("MonitorGroupCategories")
    private MonitorGroupCategories monitorGroupCategories;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the request was successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The cloud services to which the resources in the application group belong and the number of resources that belong to the cloud service.
         */
        public Builder monitorGroupCategories(MonitorGroupCategories monitorGroupCategories) {
            this.monitorGroupCategories = monitorGroupCategories;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true: The request was successful.
         * *   false: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeMonitorGroupCategoriesResponseBody build() {
            return new DescribeMonitorGroupCategoriesResponseBody(this);
        } 

    } 

    public static class CategoryItem extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("Count")
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
             * The abbreviation of the Alibaba Cloud service name.
             * <p>
             * 
             * To obtain the abbreviation of an Alibaba Cloud service name, call the [DescribeProjectMeta](~~114916~~) operation. The `metricCategory` tag in the `Labels` response parameter indicates the abbreviation of the Alibaba Cloud service name.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The number of resources that belong to the cloud service.
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
    public static class MonitorGroupCategory extends TeaModel {
        @NameInMap("CategoryItem")
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
    public static class MonitorGroupCategories extends TeaModel {
        @NameInMap("GroupId")
        private Long groupId;

        @NameInMap("MonitorGroupCategory")
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
             * The ID of the application group.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The cloud services to which the resources in the application group belong and the number of resources that belong to the cloud service.
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
