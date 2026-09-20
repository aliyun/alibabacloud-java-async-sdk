// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListInstanceResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceResourcesResponseBody</p>
 */
public class ListInstanceResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.List<Resources> resources;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListInstanceResourcesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resources = builder.resources;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resources
     */
    public java.util.List<Resources> getResources() {
        return this.resources;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Resources> resources; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListInstanceResourcesResponseBody model) {
            this.requestId = model.requestId;
            this.resources = model.resources;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9763624B-5FBB-5E3A-9193-B1ADB554CEAE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>A list of resource objects.</p>
         */
        public Builder resources(java.util.List<Resources> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * <p>The total number of resources.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInstanceResourcesResponseBody build() {
            return new ListInstanceResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceResourcesResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("GmtCreateAt")
        private String gmtCreateAt;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedAt")
        private String gmtModifiedAt;

        @com.aliyun.core.annotation.NameInMap("Group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        private Resources(Builder builder) {
            this.category = builder.category;
            this.config = builder.config;
            this.gmtCreateAt = builder.gmtCreateAt;
            this.gmtModifiedAt = builder.gmtModifiedAt;
            this.group = builder.group;
            this.resourceId = builder.resourceId;
            this.type = builder.type;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return gmtCreateAt
         */
        public String getGmtCreateAt() {
            return this.gmtCreateAt;
        }

        /**
         * @return gmtModifiedAt
         */
        public String getGmtModifiedAt() {
            return this.gmtModifiedAt;
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private String category; 
            private String config; 
            private String gmtCreateAt; 
            private String gmtModifiedAt; 
            private String group; 
            private String resourceId; 
            private String type; 
            private String uri; 

            private Builder() {
            } 

            private Builder(Resources model) {
                this.category = model.category;
                this.config = model.config;
                this.gmtCreateAt = model.gmtCreateAt;
                this.gmtModifiedAt = model.gmtModifiedAt;
                this.group = model.group;
                this.resourceId = model.resourceId;
                this.type = model.type;
                this.uri = model.uri;
            } 

            /**
             * <p>The category of the resource. Valid values:</p>
             * <ul>
             * <li><p>DataManagement</p>
             * </li>
             * <li><p>Engine</p>
             * </li>
             * <li><p>Monitor</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DataManagement</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The configuration of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-13 17:34:52</p>
             */
            public Builder gmtCreateAt(String gmtCreateAt) {
                this.gmtCreateAt = gmtCreateAt;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-13 17:34:52</p>
             */
            public Builder gmtModifiedAt(String gmtModifiedAt) {
                this.gmtModifiedAt = gmtModifiedAt;
                return this;
            }

            /**
             * <p>The group of the resource.</p>
             * <p>If <code>Category</code> is <code>DataManagement</code>, valid values are:</p>
             * <ul>
             * <li><p>storage</p>
             * </li>
             * <li><p>modelpipeline</p>
             * </li>
             * <li><p>datastorage</p>
             * </li>
             * <li><p>modeltrain</p>
             * </li>
             * </ul>
             * <p>If <code>Category</code> is <code>Engine</code>, valid values are:</p>
             * <ul>
             * <li><p>feature</p>
             * </li>
             * <li><p>predict</p>
             * </li>
             * <li><p>recall</p>
             * </li>
             * <li><p>recengine</p>
             * </li>
             * </ul>
             * <p>If <code>Category</code> is <code>Monitor</code>, valid values are:</p>
             * <ul>
             * <li><p>logs</p>
             * </li>
             * <li><p>logsback</p>
             * </li>
             * <li><p>coldstart</p>
             * </li>
             * <li><p>deploy</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>storage</p>
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>reso-2s416t***</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The type of the resource.</p>
             * <ul>
             * <li><p>Hologres</p>
             * </li>
             * <li><p>EAS</p>
             * </li>
             * <li><p>BE</p>
             * </li>
             * <li><p>Rec</p>
             * </li>
             * <li><p>Platform</p>
             * </li>
             * <li><p>SLS</p>
             * </li>
             * <li><p>DataHub</p>
             * </li>
             * <li><p>ApsaraMQ for Kafka</p>
             * </li>
             * <li><p>Realtime Compute for Apache Flink</p>
             * </li>
             * <li><p>ACR</p>
             * </li>
             * <li><p>OSS</p>
             * </li>
             * <li><p>DataWorks</p>
             * </li>
             * <li><p>PAI</p>
             * </li>
             * <li><p>MaxCompute</p>
             * </li>
             * <li><p>Graph Compute Service</p>
             * </li>
             * <li><p>ApsaraDB for Redis</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The resource URI.</p>
             * 
             * <strong>example:</strong>
             * <p>bucket-test-123</p>
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
