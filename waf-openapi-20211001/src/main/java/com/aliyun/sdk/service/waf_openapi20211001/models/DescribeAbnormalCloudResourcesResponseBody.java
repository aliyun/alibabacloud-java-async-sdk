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
         * AbnormalCloudResources.
         */
        public Builder abnormalCloudResources(java.util.List<AbnormalCloudResources> abnormalCloudResources) {
            this.abnormalCloudResources = abnormalCloudResources;
            return this;
        }

        /**
         * <p>Id of the request</p>
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
             * AppliedType.
             */
            public Builder appliedType(String appliedType) {
                this.appliedType = appliedType;
                return this;
            }

            /**
             * CertName.
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * CommonName.
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * ProductCertId.
             */
            public Builder productCertId(String productCertId) {
                this.productCertId = productCertId;
                return this;
            }

            /**
             * ProductCertName.
             */
            public Builder productCertName(String productCertName) {
                this.productCertName = productCertName;
                return this;
            }

            /**
             * ProductDomainExtension.
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
             * CloudResourceId.
             */
            public Builder cloudResourceId(String cloudResourceId) {
                this.cloudResourceId = cloudResourceId;
                return this;
            }

            /**
             * Details.
             */
            public Builder details(java.util.List<Details> details) {
                this.details = details;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * ResourceInstanceId.
             */
            public Builder resourceInstanceId(String resourceInstanceId) {
                this.resourceInstanceId = resourceInstanceId;
                return this;
            }

            /**
             * ResourceInstanceName.
             */
            public Builder resourceInstanceName(String resourceInstanceName) {
                this.resourceInstanceName = resourceInstanceName;
                return this;
            }

            /**
             * ResourceInstancePort.
             */
            public Builder resourceInstancePort(Integer resourceInstancePort) {
                this.resourceInstancePort = resourceInstancePort;
                return this;
            }

            /**
             * ResourceProduct.
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
