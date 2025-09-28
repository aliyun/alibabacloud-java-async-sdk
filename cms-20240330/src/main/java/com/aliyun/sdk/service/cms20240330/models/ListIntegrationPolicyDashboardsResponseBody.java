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
 * {@link ListIntegrationPolicyDashboardsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIntegrationPolicyDashboardsResponseBody</p>
 */
public class ListIntegrationPolicyDashboardsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("dashboards")
    private java.util.List<Dashboards> dashboards;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListIntegrationPolicyDashboardsResponseBody(Builder builder) {
        this.dashboards = builder.dashboards;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntegrationPolicyDashboardsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dashboards
     */
    public java.util.List<Dashboards> getDashboards() {
        return this.dashboards;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<Dashboards> dashboards; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListIntegrationPolicyDashboardsResponseBody model) {
            this.dashboards = model.dashboards;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * dashboards.
         */
        public Builder dashboards(java.util.List<Dashboards> dashboards) {
            this.dashboards = dashboards;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CD8BA7D6-995D-578D-9941-78B0FECD14B5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListIntegrationPolicyDashboardsResponseBody build() {
            return new ListIntegrationPolicyDashboardsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIntegrationPolicyDashboardsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntegrationPolicyDashboardsResponseBody</p>
     */
    public static class Dashboards extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("folderUid")
        private String folderUid;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<String> tags;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("uid")
        private String uid;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Dashboards(Builder builder) {
            this.folderUid = builder.folderUid;
            this.region = builder.region;
            this.tags = builder.tags;
            this.title = builder.title;
            this.uid = builder.uid;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dashboards create() {
            return builder().build();
        }

        /**
         * @return folderUid
         */
        public String getFolderUid() {
            return this.folderUid;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
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
            private String folderUid; 
            private String region; 
            private java.util.List<String> tags; 
            private String title; 
            private String uid; 
            private String url; 

            private Builder() {
            } 

            private Builder(Dashboards model) {
                this.folderUid = model.folderUid;
                this.region = model.region;
                this.tags = model.tags;
                this.title = model.title;
                this.uid = model.uid;
                this.url = model.url;
            } 

            /**
             * folderUid.
             */
            public Builder folderUid(String folderUid) {
                this.folderUid = folderUid;
                return this;
            }

            /**
             * region.
             */
            public Builder region(String region) {
                this.region = region;
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

            public Dashboards build() {
                return new Dashboards(this);
            } 

        } 

    }
}
