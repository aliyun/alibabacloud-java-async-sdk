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
 * {@link DescribeAbnormalCloudResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAbnormalCloudResourcesResponseBody</p>
 */
public class DescribeAbnormalCloudResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AbnormalCloudResources")
    private java.util.List<AbnormalCloudResources> abnormalCloudResources;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAbnormalCloudResourcesResponseBody(Builder builder) {
        this.abnormalCloudResources = builder.abnormalCloudResources;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAbnormalCloudResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return abnormalCloudResources
     */
    public java.util.List<AbnormalCloudResources> getAbnormalCloudResources() {
        return this.abnormalCloudResources;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AbnormalCloudResources> abnormalCloudResources; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAbnormalCloudResourcesResponseBody model) {
            this.abnormalCloudResources = model.abnormalCloudResources;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The abnormal cloud resources that are added in cloud native mode.</p>
         */
        public Builder abnormalCloudResources(java.util.List<AbnormalCloudResources> abnormalCloudResources) {
            this.abnormalCloudResources = abnormalCloudResources;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>66A98669-CC6E-4F3E-80A6-***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAbnormalCloudResourcesResponseBody build() {
            return new DescribeAbnormalCloudResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAbnormalCloudResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAbnormalCloudResourcesResponseBody</p>
     */
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppliedType")
        private String appliedType;

        @com.aliyun.core.annotation.NameInMap("CertName")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CommonName")
        private String commonName;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("ProductCertId")
        private String productCertId;

        @com.aliyun.core.annotation.NameInMap("ProductCertName")
        private String productCertName;

        @com.aliyun.core.annotation.NameInMap("ProductDomainExtension")
        private String productDomainExtension;

        private Details(Builder builder) {
            this.appliedType = builder.appliedType;
            this.certName = builder.certName;
            this.code = builder.code;
            this.commonName = builder.commonName;
            this.expireTime = builder.expireTime;
            this.productCertId = builder.productCertId;
            this.productCertName = builder.productCertName;
            this.productDomainExtension = builder.productDomainExtension;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return appliedType
         */
        public String getAppliedType() {
            return this.appliedType;
        }

        /**
         * @return certName
         */
        public String getCertName() {
            return this.certName;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return commonName
         */
        public String getCommonName() {
            return this.commonName;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return productCertId
         */
        public String getProductCertId() {
            return this.productCertId;
        }

        /**
         * @return productCertName
         */
        public String getProductCertName() {
            return this.productCertName;
        }

        /**
         * @return productDomainExtension
         */
        public String getProductDomainExtension() {
            return this.productDomainExtension;
        }

        public static final class Builder {
            private String appliedType; 
            private String certName; 
            private String code; 
            private String commonName; 
            private Long expireTime; 
            private String productCertId; 
            private String productCertName; 
            private String productDomainExtension; 

            private Builder() {
            } 

            private Builder(Details model) {
                this.appliedType = model.appliedType;
                this.certName = model.certName;
                this.code = model.code;
                this.commonName = model.commonName;
                this.expireTime = model.expireTime;
                this.productCertId = model.productCertId;
                this.productCertName = model.productCertName;
                this.productDomainExtension = model.productDomainExtension;
            } 

            /**
             * <p>The type of the certificate for the HTTPS protocol. Valid values:</p>
             * <ul>
             * <li><p><strong>default</strong>: default certificate.</p>
             * </li>
             * <li><p><strong>extension</strong>: additional certificate.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder appliedType(String appliedType) {
                this.appliedType = appliedType;
                return this;
            }

            /**
             * <p>The name of the certificate in SSL Certificate Service.</p>
             * 
             * <strong>example:</strong>
             * <p>test-name</p>
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * <p>The cause of the exception. Valid values:</p>
             * <p>InvalidCert: The certificate is invalid.</p>
             * <p>ClientCertOpend: Mutual authentication is enabled.</p>
             * <p>NetworkConfigLost: A network error occurred.</p>
             * <p>UserUploadCert: A custom certificate is uploaded.</p>
             * <p>CertNotExistInCertCenter: The certificate ID does not exist in SSL Certificate Service.</p>
             * <p>CertExpired: The certificate has expired.</p>
             * <p>EmptyCertCN: The common name (CN) is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>CertExpired</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The common name (CN) of the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.test.com">www.test.com</a></p>
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * <p>The time when the certificate expires. This value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1735009193</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The ID of the certificate that is configured in the cloud service console.</p>
             * 
             * <strong>example:</strong>
             * <p>123-cn-hangzhou</p>
             */
            public Builder productCertId(String productCertId) {
                this.productCertId = productCertId;
                return this;
            }

            /**
             * <p>The name of the certificate that is configured in the cloud service console.</p>
             * 
             * <strong>example:</strong>
             * <p>test-cert-name</p>
             */
            public Builder productCertName(String productCertName) {
                this.productCertName = productCertName;
                return this;
            }

            /**
             * <p>The additional domain name that is configured in the cloud service console.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.test.com">www.test.com</a></p>
             */
            public Builder productDomainExtension(String productDomainExtension) {
                this.productDomainExtension = productDomainExtension;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAbnormalCloudResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAbnormalCloudResourcesResponseBody</p>
     */
    public static class AbnormalCloudResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CloudResourceId")
        private String cloudResourceId;

        @com.aliyun.core.annotation.NameInMap("Details")
        private java.util.List<Details> details;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("ResourceInstanceId")
        private String resourceInstanceId;

        @com.aliyun.core.annotation.NameInMap("ResourceInstanceName")
        private String resourceInstanceName;

        @com.aliyun.core.annotation.NameInMap("ResourceInstancePort")
        private Integer resourceInstancePort;

        @com.aliyun.core.annotation.NameInMap("ResourceProduct")
        private String resourceProduct;

        private AbnormalCloudResources(Builder builder) {
            this.cloudResourceId = builder.cloudResourceId;
            this.details = builder.details;
            this.reason = builder.reason;
            this.resourceInstanceId = builder.resourceInstanceId;
            this.resourceInstanceName = builder.resourceInstanceName;
            this.resourceInstancePort = builder.resourceInstancePort;
            this.resourceProduct = builder.resourceProduct;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AbnormalCloudResources create() {
            return builder().build();
        }

        /**
         * @return cloudResourceId
         */
        public String getCloudResourceId() {
            return this.cloudResourceId;
        }

        /**
         * @return details
         */
        public java.util.List<Details> getDetails() {
            return this.details;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return resourceInstanceId
         */
        public String getResourceInstanceId() {
            return this.resourceInstanceId;
        }

        /**
         * @return resourceInstanceName
         */
        public String getResourceInstanceName() {
            return this.resourceInstanceName;
        }

        /**
         * @return resourceInstancePort
         */
        public Integer getResourceInstancePort() {
            return this.resourceInstancePort;
        }

        /**
         * @return resourceProduct
         */
        public String getResourceProduct() {
            return this.resourceProduct;
        }

        public static final class Builder {
            private String cloudResourceId; 
            private java.util.List<Details> details; 
            private String reason; 
            private String resourceInstanceId; 
            private String resourceInstanceName; 
            private Integer resourceInstancePort; 
            private String resourceProduct; 

            private Builder() {
            } 

            private Builder(AbnormalCloudResources model) {
                this.cloudResourceId = model.cloudResourceId;
                this.details = model.details;
                this.reason = model.reason;
                this.resourceInstanceId = model.resourceInstanceId;
                this.resourceInstanceName = model.resourceInstanceName;
                this.resourceInstancePort = model.resourceInstancePort;
                this.resourceProduct = model.resourceProduct;
            } 

            /**
             * <p>The ID of the cloud resource. This ID is automatically generated by WAF when the resource is added.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-***-80-clb7</p>
             */
            public Builder cloudResourceId(String cloudResourceId) {
                this.cloudResourceId = cloudResourceId;
                return this;
            }

            /**
             * <p>The details of the exception.</p>
             */
            public Builder details(java.util.List<Details> details) {
                this.details = details;
                return this;
            }

            /**
             * <p>The cause of the exception. Valid values:</p>
             * <ul>
             * <li><p><strong>InvalidCert</strong>: The certificate is invalid.</p>
             * </li>
             * <li><p><strong>ClientCertOpend</strong>: Mutual authentication is enabled.</p>
             * </li>
             * <li><p><strong>NetworkConfigLost</strong>: A network error occurred.</p>
             * </li>
             * <li><p><strong>UserUploadCert</strong>: A custom certificate is uploaded.</p>
             * </li>
             * <li><p><strong>CertNotExistInCertCenter</strong>: The certificate ID does not exist in SSL Certificate Service.</p>
             * </li>
             * <li><p><strong>CertExpired</strong>: The certificate has expired.</p>
             * </li>
             * <li><p><strong>EmptyCertCN</strong>: The common name (CN) is empty.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CertExpired</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The ID of the instance that is added to WAF.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-***</p>
             */
            public Builder resourceInstanceId(String resourceInstanceId) {
                this.resourceInstanceId = resourceInstanceId;
                return this;
            }

            /**
             * <p>The name of the instance that is added to WAF.</p>
             * 
             * <strong>example:</strong>
             * <p>test-name</p>
             */
            public Builder resourceInstanceName(String resourceInstanceName) {
                this.resourceInstanceName = resourceInstanceName;
                return this;
            }

            /**
             * <p>The port of the instance that is added to WAF.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder resourceInstancePort(Integer resourceInstancePort) {
                this.resourceInstancePort = resourceInstancePort;
                return this;
            }

            /**
             * <p>The cloud service to which the resource belongs. By default, instances of Application Load Balancer (ALB), MSE, FC, and SAE are returned. Valid values:</p>
             * <ul>
             * <li><p><strong>alb</strong>: ALB.</p>
             * </li>
             * <li><p><strong>mse</strong>: MSE.</p>
             * </li>
             * <li><p><strong>fc</strong>: FC.</p>
             * </li>
             * <li><p><strong>sae</strong>: SAE.</p>
             * </li>
             * <li><p><strong>ecs</strong>: ECS.</p>
             * </li>
             * <li><p><strong>clb4</strong>: Classic Load Balancer (CLB) that uses TCP.</p>
             * </li>
             * <li><p><strong>clb7</strong>: CLB that uses HTTP or HTTPS.</p>
             * </li>
             * <li><p><strong>nlb</strong>: Network Load Balancer (NLB).</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>Each cloud service is supported in different regions. If you specify this parameter, make sure that the specified cloud service is supported in the selected region. Otherwise, the request may fail.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>clb7</p>
             */
            public Builder resourceProduct(String resourceProduct) {
                this.resourceProduct = resourceProduct;
                return this;
            }

            public AbnormalCloudResources build() {
                return new AbnormalCloudResources(this);
            } 

        } 

    }
}
