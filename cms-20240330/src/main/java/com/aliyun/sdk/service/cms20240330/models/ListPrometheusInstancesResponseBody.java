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
 * {@link ListPrometheusInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrometheusInstancesResponseBody</p>
 */
public class ListPrometheusInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("prometheusInstances")
    private java.util.List<PrometheusInstances> prometheusInstances;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListPrometheusInstancesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.prometheusInstances = builder.prometheusInstances;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrometheusInstancesResponseBody create() {
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
     * @return prometheusInstances
     */
    public java.util.List<PrometheusInstances> getPrometheusInstances() {
        return this.prometheusInstances;
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
        private java.util.List<PrometheusInstances> prometheusInstances; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListPrometheusInstancesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.prometheusInstances = model.prometheusInstances;
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
         * <p>xxxxxxxxxx</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>List of Prometheus instances.</p>
         */
        public Builder prometheusInstances(java.util.List<PrometheusInstances> prometheusInstances) {
            this.prometheusInstances = prometheusInstances;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>264C3E89-XXXX-XXXX-XXXX-CE9C2196C7DC</p>
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

        public ListPrometheusInstancesResponseBody build() {
            return new ListPrometheusInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPrometheusInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrometheusInstancesResponseBody</p>
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
             * <p>Tag key</p>
             * 
             * <strong>example:</strong>
             * <p>testKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>testValue</p>
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
     * {@link ListPrometheusInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrometheusInstancesResponseBody</p>
     */
    public static class PrometheusInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessType")
        private String accessType;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("instanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("paymentType")
        private String paymentType;

        @com.aliyun.core.annotation.NameInMap("product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("prometheusInstanceId")
        private String prometheusInstanceId;

        @com.aliyun.core.annotation.NameInMap("prometheusInstanceName")
        private String prometheusInstanceName;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("resourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("supportAuthTypes")
        private java.util.List<String> supportAuthTypes;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private PrometheusInstances(Builder builder) {
            this.accessType = builder.accessType;
            this.createTime = builder.createTime;
            this.instanceType = builder.instanceType;
            this.paymentType = builder.paymentType;
            this.product = builder.product;
            this.prometheusInstanceId = builder.prometheusInstanceId;
            this.prometheusInstanceName = builder.prometheusInstanceName;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceType = builder.resourceType;
            this.status = builder.status;
            this.supportAuthTypes = builder.supportAuthTypes;
            this.tags = builder.tags;
            this.userId = builder.userId;
            this.version = builder.version;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrometheusInstances create() {
            return builder().build();
        }

        /**
         * @return accessType
         */
        public String getAccessType() {
            return this.accessType;
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
         * @return prometheusInstanceId
         */
        public String getPrometheusInstanceId() {
            return this.prometheusInstanceId;
        }

        /**
         * @return prometheusInstanceName
         */
        public String getPrometheusInstanceName() {
            return this.prometheusInstanceName;
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
         * @return supportAuthTypes
         */
        public java.util.List<String> getSupportAuthTypes() {
            return this.supportAuthTypes;
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
            private String accessType; 
            private String createTime; 
            private String instanceType; 
            private String paymentType; 
            private String product; 
            private String prometheusInstanceId; 
            private String prometheusInstanceName; 
            private String regionId; 
            private String resourceGroupId; 
            private String resourceType; 
            private String status; 
            private java.util.List<String> supportAuthTypes; 
            private java.util.List<Tags> tags; 
            private String userId; 
            private String version; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(PrometheusInstances model) {
                this.accessType = model.accessType;
                this.createTime = model.createTime;
                this.instanceType = model.instanceType;
                this.paymentType = model.paymentType;
                this.product = model.product;
                this.prometheusInstanceId = model.prometheusInstanceId;
                this.prometheusInstanceName = model.prometheusInstanceName;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceType = model.resourceType;
                this.status = model.status;
                this.supportAuthTypes = model.supportAuthTypes;
                this.tags = model.tags;
                this.userId = model.userId;
                this.version = model.version;
                this.workspace = model.workspace;
            } 

            /**
             * <p>Access type:
             * readWrite, readOnly, httpReadOnly</p>
             * 
             * <strong>example:</strong>
             * <p>readWrite</p>
             */
            public Builder accessType(String accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * <p>Instance creation time, using UTC+0 time, formatted as yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>2025-08-10T02:07:53Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>remote-write</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>POSTPAY: Postpaid by metric.
             * POSTPAY_GB: Postpaid by write volume.
             * PREPAY: Prepaid.
             * FREE: Free.</p>
             * 
             * <strong>example:</strong>
             * <p>POSTPAY_GB</p>
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * <p>Product to which the prom instance belongs</p>
             * 
             * <strong>example:</strong>
             * <p>arms</p>
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * <p>Instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rw-63549e054ff596a4149927961dff</p>
             */
            public Builder prometheusInstanceId(String prometheusInstanceId) {
                this.prometheusInstanceId = prometheusInstanceId;
                return this;
            }

            /**
             * <p>Instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-prom-name</p>
             */
            public Builder prometheusInstanceName(String prometheusInstanceName) {
                this.prometheusInstanceName = prometheusInstanceName;
                return this;
            }

            /**
             * <p>Region ID</p>
             * 
             * <strong>example:</strong>
             * <p>cn-nanjing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek2bhocin5e2na</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>Prometheus</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>Backend data storage status</p>
             * 
             * <strong>example:</strong>
             * <p>Pending2Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Supported authentication types.</p>
             */
            public Builder supportAuthTypes(java.util.List<String> supportAuthTypes) {
                this.supportAuthTypes = supportAuthTypes;
                return this;
            }

            /**
             * <p>Tags key.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>User ID.</p>
             * 
             * <strong>example:</strong>
             * <p>17073812345</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>Version</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>Workspace to which the Prometheus instance belongs</p>
             * 
             * <strong>example:</strong>
             * <p>default-cms-115214006-cn-hangzhou</p>
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public PrometheusInstances build() {
                return new PrometheusInstances(this);
            } 

        } 

    }
}
