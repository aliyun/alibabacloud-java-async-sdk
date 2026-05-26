// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link ListConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListConfigsResponseBody</p>
 */
public class ListConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Configs")
    private java.util.List<Configs> configs;

    @com.aliyun.core.annotation.NameInMap("HasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Page")
    private Long page;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ListConfigsResponseBody(Builder builder) {
        this.configs = builder.configs;
        this.hasMore = builder.hasMore;
        this.name = builder.name;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.total = builder.total;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConfigsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configs
     */
    public java.util.List<Configs> getConfigs() {
        return this.configs;
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.List<Configs> configs; 
        private Boolean hasMore; 
        private String name; 
        private Long page; 
        private Long pageSize; 
        private Long total; 
        private String type; 

        private Builder() {
        } 

        private Builder(ListConfigsResponseBody model) {
            this.configs = model.configs;
            this.hasMore = model.hasMore;
            this.name = model.name;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.total = model.total;
            this.type = model.type;
        } 

        /**
         * <p>配置项列表</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Key&quot;: &quot;rate_limit&quot;, &quot;Value&quot;: &quot;{&quot;limit&quot;: 100}&quot;, &quot;CreatedAt&quot;: &quot;2024-01-15T10:30:00Z&quot;, &quot;UpdatedAt&quot;: &quot;2024-01-15T10:30:00Z&quot;}]</p>
         */
        public Builder configs(java.util.List<Configs> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * <p>是否有更多数据</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * <p>服务名称</p>
         * 
         * <strong>example:</strong>
         * <p>my-service</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>当前页码</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.page = page;
            return this;
        }

        /**
         * <p>每页数量</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>总数量</p>
         * 
         * <strong>example:</strong>
         * <p>150</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        /**
         * <p>配置类型</p>
         * 
         * <strong>example:</strong>
         * <p>Service</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ListConfigsResponseBody build() {
            return new ListConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListConfigsResponseBody</p>
     */
    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("UpdatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Configs(Builder builder) {
            this.createdAt = builder.createdAt;
            this.key = builder.key;
            this.updatedAt = builder.updatedAt;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String createdAt; 
            private String key; 
            private String updatedAt; 
            private String value; 

            private Builder() {
            } 

            private Builder(Configs model) {
                this.createdAt = model.createdAt;
                this.key = model.key;
                this.updatedAt = model.updatedAt;
                this.value = model.value;
            } 

            /**
             * <p>创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-01T10:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>配置项键名</p>
             * 
             * <strong>example:</strong>
             * <p>rate_limit</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>更新时间</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-01T10:00:00Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * <p>配置值</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
}
