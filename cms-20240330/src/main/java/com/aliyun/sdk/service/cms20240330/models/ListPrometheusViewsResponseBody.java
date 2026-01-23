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
         * <p>Maximum number of records to return.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Token for the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>2-ba4d-4b9f-aa24-dcb067a30f1c</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>List of Prometheus view instances.</p>
         */
        public Builder prometheusViews(java.util.List<PrometheusViews> prometheusViews) {
            this.prometheusViews = prometheusViews;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0CEC5375-C554-562B-A65F-9A629907C1F0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of instances</p>
         * 
         * <strong>example:</strong>
         * <p>66</p>
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

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

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
            this.resourceType = builder.resourceType;
            this.status = builder.status;
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
            private String resourceType; 
            private String status; 
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
                this.resourceType = model.resourceType;
                this.status = model.status;
                this.userId = model.userId;
                this.version = model.version;
                this.workspace = model.workspace;
            } 

            /**
             * <p>Instance creation time, using UTC+0 time, formatted as yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-12T02:18:36Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Instance type:
             * prom-view: new version aggregated view
             * global-view: old version aggregated view</p>
             * 
             * <strong>example:</strong>
             * <p>prom-view</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>Payment type. Currently, the fixed value is FREE (free).</p>
             * 
             * <strong>example:</strong>
             * <p>FREE</p>
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * <p>Product that the prom instance belongs to (arms or cms).</p>
             * 
             * <strong>example:</strong>
             * <p>cms</p>
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * <p>Number of Prometheus instances in the view.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder prometheusInstanceCount(Integer prometheusInstanceCount) {
                this.prometheusInstanceCount = prometheusInstanceCount;
                return this;
            }

            /**
             * <p>Prometheus view ID.</p>
             * 
             * <strong>example:</strong>
             * <p>view-xxx</p>
             */
            public Builder prometheusViewId(String prometheusViewId) {
                this.prometheusViewId = prometheusViewId;
                return this;
            }

            /**
             * <p>Prometheus view name.</p>
             * 
             * <strong>example:</strong>
             * <p>view1</p>
             */
            public Builder prometheusViewName(String prometheusViewName) {
                this.prometheusViewName = prometheusViewName;
                return this;
            }

            /**
             * <p>Region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-zhangjiakou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Fixed value: PrometheusView.</p>
             * 
             * <strong>example:</strong>
             * <p>PrometheusView</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>Backend data storage status.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>User ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123xxx</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>Version.</p>
             * 
             * <strong>example:</strong>
             * <p>V2</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>Workspace that the prom instance belongs to.</p>
             * 
             * <strong>example:</strong>
             * <p>default-cms-1490404746278495-cn-hangzhou</p>
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
