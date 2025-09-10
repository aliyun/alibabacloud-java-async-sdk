// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListPrometheusDashboardsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrometheusDashboardsResponseBody</p>
 */
public class ListPrometheusDashboardsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("prometheusDashboards")
    private java.util.List<PrometheusDashboards> prometheusDashboards;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListPrometheusDashboardsResponseBody(Builder builder) {
        this.prometheusDashboards = builder.prometheusDashboards;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrometheusDashboardsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return prometheusDashboards
     */
    public java.util.List<PrometheusDashboards> getPrometheusDashboards() {
        return this.prometheusDashboards;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<PrometheusDashboards> prometheusDashboards; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListPrometheusDashboardsResponseBody model) {
            this.prometheusDashboards = model.prometheusDashboards;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * prometheusDashboards.
         */
        public Builder prometheusDashboards(java.util.List<PrometheusDashboards> prometheusDashboards) {
            this.prometheusDashboards = prometheusDashboards;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>8FDE2569-626B-5176-9844-28877A*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPrometheusDashboardsResponseBody build() {
            return new ListPrometheusDashboardsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPrometheusDashboardsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrometheusDashboardsResponseBody</p>
     */
    public static class PrometheusDashboards extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<String> tags;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("uid")
        private String uid;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private PrometheusDashboards(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.tags = builder.tags;
            this.title = builder.title;
            this.uid = builder.uid;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrometheusDashboards create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return tags
         */
        public java.util.List<String> getTags() {
            return this.tags;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String id; 
            private String name; 
            private java.util.List<String> tags; 
            private String title; 
            private String uid; 
            private String url; 

            private Builder() {
            } 

            private Builder(PrometheusDashboards model) {
                this.id = model.id;
                this.name = model.name;
                this.tags = model.tags;
                this.title = model.title;
                this.uid = model.uid;
                this.url = model.url;
            } 

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * tags.
             */
            public Builder tags(java.util.List<String> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public PrometheusDashboards build() {
                return new PrometheusDashboards(this);
            } 

        } 

    }
}
