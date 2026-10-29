// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link ListRenderingInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRenderingInstancesResponseBody</p>
 */
public class ListRenderingInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RenderingInstances")
    private java.util.List<RenderingInstances> renderingInstances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListRenderingInstancesResponseBody(Builder builder) {
        this.renderingInstances = builder.renderingInstances;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRenderingInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return renderingInstances
     */
    public java.util.List<RenderingInstances> getRenderingInstances() {
        return this.renderingInstances;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<RenderingInstances> renderingInstances; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListRenderingInstancesResponseBody model) {
            this.renderingInstances = model.renderingInstances;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of cloud application service instances.</p>
         */
        public Builder renderingInstances(java.util.List<RenderingInstances> renderingInstances) {
            this.renderingInstances = renderingInstances;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of cloud application service instances.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRenderingInstancesResponseBody build() {
            return new ListRenderingInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRenderingInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRenderingInstancesResponseBody</p>
     */
    public static class RenderingInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("MaxEgressBandwidth")
        private String maxEgressBandwidth;

        @com.aliyun.core.annotation.NameInMap("MaxIngressBandwidth")
        private String maxIngressBandwidth;

        @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
        private String renderingInstanceId;

        @com.aliyun.core.annotation.NameInMap("RenderingSpec")
        private String renderingSpec;

        @com.aliyun.core.annotation.NameInMap("ServerStatus")
        private String serverStatus;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageSize")
        private Integer storageSize;

        private RenderingInstances(Builder builder) {
            this.chargeType = builder.chargeType;
            this.creationTime = builder.creationTime;
            this.expireTime = builder.expireTime;
            this.instanceName = builder.instanceName;
            this.maxEgressBandwidth = builder.maxEgressBandwidth;
            this.maxIngressBandwidth = builder.maxIngressBandwidth;
            this.renderingInstanceId = builder.renderingInstanceId;
            this.renderingSpec = builder.renderingSpec;
            this.serverStatus = builder.serverStatus;
            this.status = builder.status;
            this.storageSize = builder.storageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RenderingInstances create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return maxEgressBandwidth
         */
        public String getMaxEgressBandwidth() {
            return this.maxEgressBandwidth;
        }

        /**
         * @return maxIngressBandwidth
         */
        public String getMaxIngressBandwidth() {
            return this.maxIngressBandwidth;
        }

        /**
         * @return renderingInstanceId
         */
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

        /**
         * @return renderingSpec
         */
        public String getRenderingSpec() {
            return this.renderingSpec;
        }

        /**
         * @return serverStatus
         */
        public String getServerStatus() {
            return this.serverStatus;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageSize
         */
        public Integer getStorageSize() {
            return this.storageSize;
        }

        public static final class Builder {
            private String chargeType; 
            private String creationTime; 
            private String expireTime; 
            private String instanceName; 
            private String maxEgressBandwidth; 
            private String maxIngressBandwidth; 
            private String renderingInstanceId; 
            private String renderingSpec; 
            private String serverStatus; 
            private String status; 
            private Integer storageSize; 

            private Builder() {
            } 

            private Builder(RenderingInstances model) {
                this.chargeType = model.chargeType;
                this.creationTime = model.creationTime;
                this.expireTime = model.expireTime;
                this.instanceName = model.instanceName;
                this.maxEgressBandwidth = model.maxEgressBandwidth;
                this.maxIngressBandwidth = model.maxIngressBandwidth;
                this.renderingInstanceId = model.renderingInstanceId;
                this.renderingSpec = model.renderingSpec;
                this.serverStatus = model.serverStatus;
                this.status = model.status;
                this.storageSize = model.storageSize;
            } 

            /**
             * <p>The billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>Postpaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The time when the cloud application service instance was created. The time is in UTC and follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-11-17T02:18:04Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The expiration time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-11-17T02:18:04Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>TestInstance</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The maximum outbound bandwidth limit. Unit: Mbit/s. A value of 0 indicates that no bandwidth limit is configured.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder maxEgressBandwidth(String maxEgressBandwidth) {
                this.maxEgressBandwidth = maxEgressBandwidth;
                return this;
            }

            /**
             * <p>The maximum inbound bandwidth limit. Unit: Mbit/s. A value of 0 indicates that no bandwidth limit is configured.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxIngressBandwidth(String maxIngressBandwidth) {
                this.maxIngressBandwidth = maxIngressBandwidth;
                return this;
            }

            /**
             * <p>The instance ID of the cloud application service.</p>
             * 
             * <strong>example:</strong>
             * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
             */
            public Builder renderingInstanceId(String renderingInstanceId) {
                this.renderingInstanceId = renderingInstanceId;
                return this;
            }

            /**
             * <p>The instance type of the cloud application service instance.</p>
             * 
             * <strong>example:</strong>
             * <p>crs.cp.l1</p>
             */
            public Builder renderingSpec(String renderingSpec) {
                this.renderingSpec = renderingSpec;
                return this;
            }

            /**
             * <p>The status of the service host.</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder serverStatus(String serverStatus) {
                this.serverStatus = serverStatus;
                return this;
            }

            /**
             * <p>The instance status.</p>
             * 
             * <strong>example:</strong>
             * <p>Working</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The cloud storage capacity. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder storageSize(Integer storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            public RenderingInstances build() {
                return new RenderingInstances(this);
            } 

        } 

    }
}
