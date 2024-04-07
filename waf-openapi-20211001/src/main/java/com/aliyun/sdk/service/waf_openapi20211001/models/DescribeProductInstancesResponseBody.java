// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProductInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProductInstancesResponseBody</p>
 */
public class DescribeProductInstancesResponseBody extends TeaModel {
    @NameInMap("ProductInstances")
    private java.util.List < ProductInstances> productInstances;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeProductInstancesResponseBody(Builder builder) {
        this.productInstances = builder.productInstances;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProductInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return productInstances
     */
    public java.util.List < ProductInstances> getProductInstances() {
        return this.productInstances;
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
        private java.util.List < ProductInstances> productInstances; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The information about the instances.
         */
        public Builder productInstances(java.util.List < ProductInstances> productInstances) {
            this.productInstances = productInstances;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeProductInstancesResponseBody build() {
            return new DescribeProductInstancesResponseBody(this);
        } 

    } 

    public static class Certificates extends TeaModel {
        @NameInMap("CertificateId")
        private String certificateId;

        @NameInMap("CertificateName")
        private String certificateName;

        private Certificates(Builder builder) {
            this.certificateId = builder.certificateId;
            this.certificateName = builder.certificateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Certificates create() {
            return builder().build();
        }

        /**
         * @return certificateId
         */
        public String getCertificateId() {
            return this.certificateId;
        }

        /**
         * @return certificateName
         */
        public String getCertificateName() {
            return this.certificateName;
        }

        public static final class Builder {
            private String certificateId; 
            private String certificateName; 

            /**
             * The ID of the certificate.
             */
            public Builder certificateId(String certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            /**
             * The name of the certificate.
             */
            public Builder certificateName(String certificateName) {
                this.certificateName = certificateName;
                return this;
            }

            public Certificates build() {
                return new Certificates(this);
            } 

        } 

    }
    public static class ResourcePorts extends TeaModel {
        @NameInMap("Certificates")
        private java.util.List < Certificates> certificates;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("Protocol")
        private String protocol;

        private ResourcePorts(Builder builder) {
            this.certificates = builder.certificates;
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcePorts create() {
            return builder().build();
        }

        /**
         * @return certificates
         */
        public java.util.List < Certificates> getCertificates() {
            return this.certificates;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private java.util.List < Certificates> certificates; 
            private Integer port; 
            private String protocol; 

            /**
             * The information about the certificates.
             */
            public Builder certificates(java.util.List < Certificates> certificates) {
                this.certificates = certificates;
                return this;
            }

            /**
             * The port number.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The protocol type. Valid values:
             * <p>
             * 
             * *   **http**
             * *   **https**
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public ResourcePorts build() {
                return new ResourcePorts(this);
            } 

        } 

    }
    public static class ProductInstances extends TeaModel {
        @NameInMap("OwnerUserId")
        private String ownerUserId;

        @NameInMap("ResourceInstanceId")
        private String resourceInstanceId;

        @NameInMap("ResourceIp")
        private String resourceIp;

        @NameInMap("ResourceName")
        private String resourceName;

        @NameInMap("ResourcePorts")
        private java.util.List < ResourcePorts> resourcePorts;

        @NameInMap("ResourceProduct")
        private String resourceProduct;

        @NameInMap("ResourceRegionId")
        private String resourceRegionId;

        private ProductInstances(Builder builder) {
            this.ownerUserId = builder.ownerUserId;
            this.resourceInstanceId = builder.resourceInstanceId;
            this.resourceIp = builder.resourceIp;
            this.resourceName = builder.resourceName;
            this.resourcePorts = builder.resourcePorts;
            this.resourceProduct = builder.resourceProduct;
            this.resourceRegionId = builder.resourceRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductInstances create() {
            return builder().build();
        }

        /**
         * @return ownerUserId
         */
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        /**
         * @return resourceInstanceId
         */
        public String getResourceInstanceId() {
            return this.resourceInstanceId;
        }

        /**
         * @return resourceIp
         */
        public String getResourceIp() {
            return this.resourceIp;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return resourcePorts
         */
        public java.util.List < ResourcePorts> getResourcePorts() {
            return this.resourcePorts;
        }

        /**
         * @return resourceProduct
         */
        public String getResourceProduct() {
            return this.resourceProduct;
        }

        /**
         * @return resourceRegionId
         */
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

        public static final class Builder {
            private String ownerUserId; 
            private String resourceInstanceId; 
            private String resourceIp; 
            private String resourceName; 
            private java.util.List < ResourcePorts> resourcePorts; 
            private String resourceProduct; 
            private String resourceRegionId; 

            /**
             * The ID of the Alibaba Cloud account to which the resource belongs.
             */
            public Builder ownerUserId(String ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder resourceInstanceId(String resourceInstanceId) {
                this.resourceInstanceId = resourceInstanceId;
                return this;
            }

            /**
             * The public IP address of the instance.
             */
            public Builder resourceIp(String resourceIp) {
                this.resourceIp = resourceIp;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * The information about the ports.
             */
            public Builder resourcePorts(java.util.List < ResourcePorts> resourcePorts) {
                this.resourcePorts = resourcePorts;
                return this;
            }

            /**
             * The cloud service to which the instance belongs. Valid values:
             * <p>
             * 
             * *   **clb4**: Layer 4 CLB.
             * *   **clb7**: Layer 7 CLB.
             * *   **ecs**: ECS.
             */
            public Builder resourceProduct(String resourceProduct) {
                this.resourceProduct = resourceProduct;
                return this;
            }

            /**
             * The region ID of the instance. Valid values:
             * <p>
             * 
             * *   **cn-chengdu**: China (Chengdu).
             * *   **cn-beijing**: China (Beijing).
             * *   **cn-zhangjiakou**: China (Zhangjiakou).
             * *   **cn-hangzhou**: China (Hangzhou).
             * *   **cn-shanghai**: China (Shanghai).
             * *   **cn-shenzhen**: China (Shenzhen).
             * *   **cn-qingdao**: China (Qingdao).
             * *   **cn-hongkong**: China (Hong Kong).
             * *   **ap-southeast-3**: Malaysia (Kuala Lumpur).
             * *   **ap-southeast-5**: Indonesia (Jakarta).
             */
            public Builder resourceRegionId(String resourceRegionId) {
                this.resourceRegionId = resourceRegionId;
                return this;
            }

            public ProductInstances build() {
                return new ProductInstances(this);
            } 

        } 

    }
}
