// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSourcesResponseBody</p>
 */
public class ListSourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListSourcesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListSourcesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8FA9BB94-915B-5299-A694-49FCC7F5DD00</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSourcesResponseBody build() {
            return new ListSourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSourcesResponseBody</p>
     */
    public static class K8sSourceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clusterId")
        private String clusterId;

        private K8sSourceInfo(Builder builder) {
            this.clusterId = builder.clusterId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static K8sSourceInfo create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        public static final class Builder {
            private String clusterId; 

            private Builder() {
            } 

            private Builder(K8sSourceInfo model) {
                this.clusterId = model.clusterId;
            } 

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c09212180612a42adbed6a940d01d***</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            public K8sSourceInfo build() {
                return new K8sSourceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSourcesResponseBody</p>
     */
    public static class NacosSourceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("clusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        private NacosSourceInfo(Builder builder) {
            this.address = builder.address;
            this.clusterId = builder.clusterId;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NacosSourceInfo create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String address; 
            private String clusterId; 
            private String instanceId; 

            private Builder() {
            } 

            private Builder(NacosSourceInfo model) {
                this.address = model.address;
                this.clusterId = model.clusterId;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>The endpoint of the Nacos instance.</p>
             * 
             * <strong>example:</strong>
             * <p>mse-3353***-nacos-ans.mse.aliyuncs.com:8848</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The registry ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mse-3353***</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The Nacos instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mse_prepaid_public_cn-wuf***</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public NacosSourceInfo build() {
                return new NacosSourceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSourcesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("associationReason")
        private String associationReason;

        @com.aliyun.core.annotation.NameInMap("associationStatus")
        private String associationStatus;

        @com.aliyun.core.annotation.NameInMap("createTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("k8sSourceInfo")
        private K8sSourceInfo k8sSourceInfo;

        @com.aliyun.core.annotation.NameInMap("nacosSourceInfo")
        private NacosSourceInfo nacosSourceInfo;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("resourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("sourceId")
        private String sourceId;

        @com.aliyun.core.annotation.NameInMap("updateTimestamp")
        private Long updateTimestamp;

        private Items(Builder builder) {
            this.associationReason = builder.associationReason;
            this.associationStatus = builder.associationStatus;
            this.createTimestamp = builder.createTimestamp;
            this.k8sSourceInfo = builder.k8sSourceInfo;
            this.nacosSourceInfo = builder.nacosSourceInfo;
            this.name = builder.name;
            this.resourceGroupId = builder.resourceGroupId;
            this.sourceId = builder.sourceId;
            this.updateTimestamp = builder.updateTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return associationReason
         */
        public String getAssociationReason() {
            return this.associationReason;
        }

        /**
         * @return associationStatus
         */
        public String getAssociationStatus() {
            return this.associationStatus;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return k8sSourceInfo
         */
        public K8sSourceInfo getK8sSourceInfo() {
            return this.k8sSourceInfo;
        }

        /**
         * @return nacosSourceInfo
         */
        public NacosSourceInfo getNacosSourceInfo() {
            return this.nacosSourceInfo;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        /**
         * @return updateTimestamp
         */
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public static final class Builder {
            private String associationReason; 
            private String associationStatus; 
            private Long createTimestamp; 
            private K8sSourceInfo k8sSourceInfo; 
            private NacosSourceInfo nacosSourceInfo; 
            private String name; 
            private String resourceGroupId; 
            private String sourceId; 
            private Long updateTimestamp; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.associationReason = model.associationReason;
                this.associationStatus = model.associationStatus;
                this.createTimestamp = model.createTimestamp;
                this.k8sSourceInfo = model.k8sSourceInfo;
                this.nacosSourceInfo = model.nacosSourceInfo;
                this.name = model.name;
                this.resourceGroupId = model.resourceGroupId;
                this.sourceId = model.sourceId;
                this.updateTimestamp = model.updateTimestamp;
            } 

            /**
             * associationReason.
             */
            public Builder associationReason(String associationReason) {
                this.associationReason = associationReason;
                return this;
            }

            /**
             * associationStatus.
             */
            public Builder associationStatus(String associationStatus) {
                this.associationStatus = associationStatus;
                return this;
            }

            /**
             * <p>The creation timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1719386834548</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The source information when the source type is K8S.</p>
             */
            public Builder k8sSourceInfo(K8sSourceInfo k8sSourceInfo) {
                this.k8sSourceInfo = k8sSourceInfo;
                return this;
            }

            /**
             * <p>The source information when the source type is MSE_NACOS.</p>
             */
            public Builder nacosSourceInfo(NacosSourceInfo nacosSourceInfo) {
                this.nacosSourceInfo = nacosSourceInfo;
                return this;
            }

            /**
             * <p>The source name. If the source type is K8S, the name is the container cluster name. If the source type is MSE_NACOS, the name is the Nacos instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>itemcenter-dev-cluster</p>
             */
            public Builder name(String name) {
                this.name = name;
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
             * <p>The source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>src-crdddallhtgtria***</p>
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * <p>The update timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1719386834548</p>
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSourcesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("totalSize")
        private Integer totalSize;

        private Data(Builder builder) {
            this.items = builder.items;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private java.util.List<Items> items; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalSize; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.items = model.items;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalSize = model.totalSize;
            } 

            /**
             * <p>The list of sources.</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
