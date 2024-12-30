// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeProductInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProductInstancesResponseBody</p>
 */
public class DescribeProductInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProductInstances")
    private java.util.List<ProductInstances> productInstances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<ProductInstances> getProductInstances() {
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
        private java.util.List<ProductInstances> productInstances; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The information about the instances.</p>
         */
        public Builder productInstances(java.util.List<ProductInstances> productInstances) {
            this.productInstances = productInstances;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>FDCBAE1E-2B3F-5C13-AD20-844B9473****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeProductInstancesResponseBody build() {
            return new DescribeProductInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeProductInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProductInstancesResponseBody</p>
     */
    public static class Certificates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertificateId")
        private String certificateId;

        @com.aliyun.core.annotation.NameInMap("CertificateName")
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
             * <p>The ID of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>10106183</p>
             */
            public Builder certificateId(String certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            /**
             * <p>The name of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>trafficxxxx.cn</p>
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
    /**
     * 
     * {@link DescribeProductInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProductInstancesResponseBody</p>
     */
    public static class ResourcePorts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Certificates")
        private java.util.List<Certificates> certificates;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
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
        public java.util.List<Certificates> getCertificates() {
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
            private java.util.List<Certificates> certificates; 
            private Integer port; 
            private String protocol; 

            /**
             * <p>The information about the certificates.</p>
             */
            public Builder certificates(java.util.List<Certificates> certificates) {
                this.certificates = certificates;
                return this;
            }

            /**
             * <p>The port number.</p>
             * 
             * <strong>example:</strong>
             * <p>443</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol type. Valid values:</p>
             * <ul>
             * <li><strong>http</strong></li>
             * <li><strong>https</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>https</p>
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
    /**
     * 
     * {@link DescribeProductInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProductInstancesResponseBody</p>
     */
    public static class ProductInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OwnerUserId")
        private String ownerUserId;

        @com.aliyun.core.annotation.NameInMap("ResourceInstanceId")
        private String resourceInstanceId;

        @com.aliyun.core.annotation.NameInMap("ResourceInstanceIp")
        private String resourceInstanceIp;

        @com.aliyun.core.annotation.NameInMap("ResourceInstanceName")
        private String resourceInstanceName;

        @com.aliyun.core.annotation.NameInMap("ResourceIp")
        @Deprecated
        private String resourceIp;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        @Deprecated
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("ResourcePorts")
        private java.util.List<ResourcePorts> resourcePorts;

        @com.aliyun.core.annotation.NameInMap("ResourceProduct")
        private String resourceProduct;

        @com.aliyun.core.annotation.NameInMap("ResourceRegionId")
        private String resourceRegionId;

        private ProductInstances(Builder builder) {
            this.ownerUserId = builder.ownerUserId;
            this.resourceInstanceId = builder.resourceInstanceId;
            this.resourceInstanceIp = builder.resourceInstanceIp;
            this.resourceInstanceName = builder.resourceInstanceName;
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
         * @return resourceInstanceIp
         */
        public String getResourceInstanceIp() {
            return this.resourceInstanceIp;
        }

        /**
         * @return resourceInstanceName
         */
        public String getResourceInstanceName() {
            return this.resourceInstanceName;
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
        public java.util.List<ResourcePorts> getResourcePorts() {
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
            private String resourceInstanceIp; 
            private String resourceInstanceName; 
            private String resourceIp; 
            private String resourceName; 
            private java.util.List<ResourcePorts> resourcePorts; 
            private String resourceProduct; 
            private String resourceRegionId; 

            /**
             * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1704********9107</p>
             */
            public Builder ownerUserId(String ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2ze1tm4pvghp****cluv</p>
             */
            public Builder resourceInstanceId(String resourceInstanceId) {
                this.resourceInstanceId = resourceInstanceId;
                return this;
            }

            /**
             * <p>The IP address of the instance that is added to WAF.</p>
             * 
             * <strong>example:</strong>
             * <p>1.X.X.1</p>
             */
            public Builder resourceInstanceIp(String resourceInstanceIp) {
                this.resourceInstanceIp = resourceInstanceIp;
                return this;
            }

            /**
             * <p>The name of the instance that is added to WAF.</p>
             * 
             * <strong>example:</strong>
             * <p>demoInstanceName</p>
             */
            public Builder resourceInstanceName(String resourceInstanceName) {
                this.resourceInstanceName = resourceInstanceName;
                return this;
            }

            /**
             * <p>The public IP address of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1.X.X.1</p>
             */
            public Builder resourceIp(String resourceIp) {
                this.resourceIp = resourceIp;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs-test</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The information about the ports.</p>
             */
            public Builder resourcePorts(java.util.List<ResourcePorts> resourcePorts) {
                this.resourcePorts = resourcePorts;
                return this;
            }

            /**
             * <p>The cloud service to which the instance belongs. Valid values:</p>
             * <ul>
             * <li><strong>clb4</strong>: Layer 4 CLB.</li>
             * <li><strong>clb7</strong>: Layer 7 CLB.</li>
             * <li><strong>ecs</strong>: ECS.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>clb4</p>
             */
            public Builder resourceProduct(String resourceProduct) {
                this.resourceProduct = resourceProduct;
                return this;
            }

            /**
             * <p>The region ID of the instance. Valid values:</p>
             * <ul>
             * <li><strong>cn-chengdu</strong>: China (Chengdu).</li>
             * <li><strong>cn-beijing</strong>: China (Beijing).</li>
             * <li><strong>cn-zhangjiakou</strong>: China (Zhangjiakou).</li>
             * <li><strong>cn-hangzhou</strong>: China (Hangzhou).</li>
             * <li><strong>cn-shanghai</strong>: China (Shanghai).</li>
             * <li><strong>cn-shenzhen</strong>: China (Shenzhen).</li>
             * <li><strong>cn-qingdao</strong>: China (Qingdao).</li>
             * <li><strong>cn-hongkong</strong>: China (Hong Kong).</li>
             * <li><strong>ap-southeast-3</strong>: Malaysia (Kuala Lumpur).</li>
             * <li><strong>ap-southeast-5</strong>: Indonesia (Jakarta).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
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
