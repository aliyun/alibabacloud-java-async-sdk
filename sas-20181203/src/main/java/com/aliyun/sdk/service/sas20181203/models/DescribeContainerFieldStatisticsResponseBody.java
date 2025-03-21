// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeContainerFieldStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContainerFieldStatisticsResponseBody</p>
 */
public class DescribeContainerFieldStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContainerGroupedFields")
    private ContainerGroupedFields containerGroupedFields;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeContainerFieldStatisticsResponseBody(Builder builder) {
        this.containerGroupedFields = builder.containerGroupedFields;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerFieldStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return containerGroupedFields
     */
    public ContainerGroupedFields getContainerGroupedFields() {
        return this.containerGroupedFields;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ContainerGroupedFields containerGroupedFields; 
        private String requestId; 

        /**
         * <p>The statistical information about containers.</p>
         */
        public Builder containerGroupedFields(ContainerGroupedFields containerGroupedFields) {
            this.containerGroupedFields = containerGroupedFields;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F8B6F758-BCD4-597A-8A2C-DA5A552C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeContainerFieldStatisticsResponseBody build() {
            return new DescribeContainerFieldStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeContainerFieldStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerFieldStatisticsResponseBody</p>
     */
    public static class ContainerGroupedFields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppCount")
        private Integer appCount;

        @com.aliyun.core.annotation.NameInMap("ClusterCount")
        private Integer clusterCount;

        @com.aliyun.core.annotation.NameInMap("ContainerCount")
        private Integer containerCount;

        @com.aliyun.core.annotation.NameInMap("ImageCount")
        private Integer imageCount;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private Integer instanceCount;

        @com.aliyun.core.annotation.NameInMap("NamespaceCount")
        private Integer namespaceCount;

        @com.aliyun.core.annotation.NameInMap("PodCount")
        private Integer podCount;

        @com.aliyun.core.annotation.NameInMap("RiskAppCount")
        private Integer riskAppCount;

        @com.aliyun.core.annotation.NameInMap("RiskClusterCount")
        private Integer riskClusterCount;

        @com.aliyun.core.annotation.NameInMap("RiskContainerCount")
        private Integer riskContainerCount;

        @com.aliyun.core.annotation.NameInMap("RiskImageCount")
        private Integer riskImageCount;

        @com.aliyun.core.annotation.NameInMap("RiskInstanceCount")
        private Integer riskInstanceCount;

        @com.aliyun.core.annotation.NameInMap("RiskPodCount")
        private Integer riskPodCount;

        private ContainerGroupedFields(Builder builder) {
            this.appCount = builder.appCount;
            this.clusterCount = builder.clusterCount;
            this.containerCount = builder.containerCount;
            this.imageCount = builder.imageCount;
            this.instanceCount = builder.instanceCount;
            this.namespaceCount = builder.namespaceCount;
            this.podCount = builder.podCount;
            this.riskAppCount = builder.riskAppCount;
            this.riskClusterCount = builder.riskClusterCount;
            this.riskContainerCount = builder.riskContainerCount;
            this.riskImageCount = builder.riskImageCount;
            this.riskInstanceCount = builder.riskInstanceCount;
            this.riskPodCount = builder.riskPodCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainerGroupedFields create() {
            return builder().build();
        }

        /**
         * @return appCount
         */
        public Integer getAppCount() {
            return this.appCount;
        }

        /**
         * @return clusterCount
         */
        public Integer getClusterCount() {
            return this.clusterCount;
        }

        /**
         * @return containerCount
         */
        public Integer getContainerCount() {
            return this.containerCount;
        }

        /**
         * @return imageCount
         */
        public Integer getImageCount() {
            return this.imageCount;
        }

        /**
         * @return instanceCount
         */
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return namespaceCount
         */
        public Integer getNamespaceCount() {
            return this.namespaceCount;
        }

        /**
         * @return podCount
         */
        public Integer getPodCount() {
            return this.podCount;
        }

        /**
         * @return riskAppCount
         */
        public Integer getRiskAppCount() {
            return this.riskAppCount;
        }

        /**
         * @return riskClusterCount
         */
        public Integer getRiskClusterCount() {
            return this.riskClusterCount;
        }

        /**
         * @return riskContainerCount
         */
        public Integer getRiskContainerCount() {
            return this.riskContainerCount;
        }

        /**
         * @return riskImageCount
         */
        public Integer getRiskImageCount() {
            return this.riskImageCount;
        }

        /**
         * @return riskInstanceCount
         */
        public Integer getRiskInstanceCount() {
            return this.riskInstanceCount;
        }

        /**
         * @return riskPodCount
         */
        public Integer getRiskPodCount() {
            return this.riskPodCount;
        }

        public static final class Builder {
            private Integer appCount; 
            private Integer clusterCount; 
            private Integer containerCount; 
            private Integer imageCount; 
            private Integer instanceCount; 
            private Integer namespaceCount; 
            private Integer podCount; 
            private Integer riskAppCount; 
            private Integer riskClusterCount; 
            private Integer riskContainerCount; 
            private Integer riskImageCount; 
            private Integer riskInstanceCount; 
            private Integer riskPodCount; 

            /**
             * <p>The number of applications.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder appCount(Integer appCount) {
                this.appCount = appCount;
                return this;
            }

            /**
             * <p>The number of clusters.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder clusterCount(Integer clusterCount) {
                this.clusterCount = clusterCount;
                return this;
            }

            /**
             * <p>The number of containers.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder containerCount(Integer containerCount) {
                this.containerCount = containerCount;
                return this;
            }

            /**
             * <p>The number of images.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder imageCount(Integer imageCount) {
                this.imageCount = imageCount;
                return this;
            }

            /**
             * <p>The number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * <p>The number of namespaces.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder namespaceCount(Integer namespaceCount) {
                this.namespaceCount = namespaceCount;
                return this;
            }

            /**
             * <p>The number of pods.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder podCount(Integer podCount) {
                this.podCount = podCount;
                return this;
            }

            /**
             * <p>The number of the applications on which risks are detected.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder riskAppCount(Integer riskAppCount) {
                this.riskAppCount = riskAppCount;
                return this;
            }

            /**
             * <p>The number of the clusters on which risks are detected.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder riskClusterCount(Integer riskClusterCount) {
                this.riskClusterCount = riskClusterCount;
                return this;
            }

            /**
             * <p>The number of the containers on which risks are detected.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder riskContainerCount(Integer riskContainerCount) {
                this.riskContainerCount = riskContainerCount;
                return this;
            }

            /**
             * <p>The number of the images on which risks are detected.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder riskImageCount(Integer riskImageCount) {
                this.riskImageCount = riskImageCount;
                return this;
            }

            /**
             * <p>The number of the instances on which risks are detected.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder riskInstanceCount(Integer riskInstanceCount) {
                this.riskInstanceCount = riskInstanceCount;
                return this;
            }

            /**
             * <p>The number of the pods on which risks are detected.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder riskPodCount(Integer riskPodCount) {
                this.riskPodCount = riskPodCount;
                return this;
            }

            public ContainerGroupedFields build() {
                return new ContainerGroupedFields(this);
            } 

        } 

    }
}
