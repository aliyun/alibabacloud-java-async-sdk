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
 * {@link ListPrometheusViewsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrometheusViewsResponseBody</p>
 */
public class ListPrometheusViewsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("prometheusViews")
    private java.util.List<PrometheusViews> prometheusViews;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListPrometheusViewsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.prometheusViews = builder.prometheusViews;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrometheusViewsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return prometheusViews
     */
    public java.util.List<PrometheusViews> getPrometheusViews() {
        return this.prometheusViews;
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
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<PrometheusViews> prometheusViews; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListPrometheusViewsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.prometheusViews = model.prometheusViews;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * prometheusViews.
         */
        public Builder prometheusViews(java.util.List<PrometheusViews> prometheusViews) {
            this.prometheusViews = prometheusViews;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0CEC5375-C554-562B-A65F-9A629907C1F0</p>
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

        public ListPrometheusViewsResponseBody build() {
            return new ListPrometheusViewsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPrometheusViewsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrometheusViewsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
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
    /**
     * 
     * {@link ListPrometheusViewsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrometheusViewsResponseBody</p>
     */
    public static class PrometheusViews extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("instanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("paymentType")
        private String paymentType;

        @com.aliyun.core.annotation.NameInMap("product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("prometheusInstanceCount")
        private Integer prometheusInstanceCount;

        @com.aliyun.core.annotation.NameInMap("prometheusViewId")
        private String prometheusViewId;

        @com.aliyun.core.annotation.NameInMap("prometheusViewName")
        private String prometheusViewName;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("resourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private PrometheusViews(Builder builder) {
            this.createTime = builder.createTime;
            this.instanceType = builder.instanceType;
            this.paymentType = builder.paymentType;
            this.product = builder.product;
            this.prometheusInstanceCount = builder.prometheusInstanceCount;
            this.prometheusViewId = builder.prometheusViewId;
            this.prometheusViewName = builder.prometheusViewName;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceType = builder.resourceType;
            this.status = builder.status;
            this.tags = builder.tags;
            this.userId = builder.userId;
            this.version = builder.version;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrometheusViews create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return paymentType
         */
        public String getPaymentType() {
            return this.paymentType;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return prometheusInstanceCount
         */
        public Integer getPrometheusInstanceCount() {
            return this.prometheusInstanceCount;
        }

        /**
         * @return prometheusViewId
         */
        public String getPrometheusViewId() {
            return this.prometheusViewId;
        }

        /**
         * @return prometheusViewName
         */
        public String getPrometheusViewName() {
            return this.prometheusViewName;
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
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String createTime; 
            private String instanceType; 
            private String paymentType; 
            private String product; 
            private Integer prometheusInstanceCount; 
            private String prometheusViewId; 
            private String prometheusViewName; 
            private String regionId; 
            private String resourceGroupId; 
            private String resourceType; 
            private String status; 
            private java.util.List<Tags> tags; 
            private String userId; 
            private String version; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(PrometheusViews model) {
                this.createTime = model.createTime;
                this.instanceType = model.instanceType;
                this.paymentType = model.paymentType;
                this.product = model.product;
                this.prometheusInstanceCount = model.prometheusInstanceCount;
                this.prometheusViewId = model.prometheusViewId;
                this.prometheusViewName = model.prometheusViewName;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceType = model.resourceType;
                this.status = model.status;
                this.tags = model.tags;
                this.userId = model.userId;
                this.version = model.version;
                this.workspace = model.workspace;
            } 

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * instanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * paymentType.
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * product.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * prometheusInstanceCount.
             */
            public Builder prometheusInstanceCount(Integer prometheusInstanceCount) {
                this.prometheusInstanceCount = prometheusInstanceCount;
                return this;
            }

            /**
             * prometheusViewId.
             */
            public Builder prometheusViewId(String prometheusViewId) {
                this.prometheusViewId = prometheusViewId;
                return this;
            }

            /**
             * prometheusViewName.
             */
            public Builder prometheusViewName(String prometheusViewName) {
                this.prometheusViewName = prometheusViewName;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * resourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * resourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public PrometheusViews build() {
                return new PrometheusViews(this);
            } 

        } 

    }
}
