// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkerResourceResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkerResourceResponseBody</p>
 */
public class ListWorkerResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Integer showSize;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private ListWorkerResourceResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.showSize = builder.showSize;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkerResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return showSize
     */
    public Integer getShowSize() {
        return this.showSize;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List < Data> data; 
        private String requestId; 
        private Integer showSize; 
        private Long total; 

        /**
         * The page number. Default value: 1.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The response parameters.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of entries per page. Default value: **50**.
         */
        public Builder showSize(Integer showSize) {
            this.showSize = showSize;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListWorkerResourceResponseBody build() {
            return new ListWorkerResourceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertDomain")
        private String certDomain;

        @com.aliyun.core.annotation.NameInMap("CertId")
        private Long certId;

        @com.aliyun.core.annotation.NameInMap("CertInstanceId")
        private String certInstanceId;

        @com.aliyun.core.annotation.NameInMap("CertName")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("CloudName")
        private String cloudName;

        @com.aliyun.core.annotation.NameInMap("CloudProduct")
        private String cloudProduct;

        @com.aliyun.core.annotation.NameInMap("CloudRegion")
        private String cloudRegion;

        @com.aliyun.core.annotation.NameInMap("DefaultResource")
        private Boolean defaultResource;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private Long jobId;

        @com.aliyun.core.annotation.NameInMap("ListenerId")
        private String listenerId;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceCertId")
        private Long resourceCertId;

        @com.aliyun.core.annotation.NameInMap("ResourceDomain")
        private String resourceDomain;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private Long resourceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        private Data(Builder builder) {
            this.certDomain = builder.certDomain;
            this.certId = builder.certId;
            this.certInstanceId = builder.certInstanceId;
            this.certName = builder.certName;
            this.cloudName = builder.cloudName;
            this.cloudProduct = builder.cloudProduct;
            this.cloudRegion = builder.cloudRegion;
            this.defaultResource = builder.defaultResource;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.jobId = builder.jobId;
            this.listenerId = builder.listenerId;
            this.namespaceId = builder.namespaceId;
            this.orderId = builder.orderId;
            this.port = builder.port;
            this.regionId = builder.regionId;
            this.resourceCertId = builder.resourceCertId;
            this.resourceDomain = builder.resourceDomain;
            this.resourceId = builder.resourceId;
            this.status = builder.status;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return certDomain
         */
        public String getCertDomain() {
            return this.certDomain;
        }

        /**
         * @return certId
         */
        public Long getCertId() {
            return this.certId;
        }

        /**
         * @return certInstanceId
         */
        public String getCertInstanceId() {
            return this.certInstanceId;
        }

        /**
         * @return certName
         */
        public String getCertName() {
            return this.certName;
        }

        /**
         * @return cloudName
         */
        public String getCloudName() {
            return this.cloudName;
        }

        /**
         * @return cloudProduct
         */
        public String getCloudProduct() {
            return this.cloudProduct;
        }

        /**
         * @return cloudRegion
         */
        public String getCloudRegion() {
            return this.cloudRegion;
        }

        /**
         * @return defaultResource
         */
        public Boolean getDefaultResource() {
            return this.defaultResource;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return jobId
         */
        public Long getJobId() {
            return this.jobId;
        }

        /**
         * @return listenerId
         */
        public String getListenerId() {
            return this.listenerId;
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceCertId
         */
        public Long getResourceCertId() {
            return this.resourceCertId;
        }

        /**
         * @return resourceDomain
         */
        public String getResourceDomain() {
            return this.resourceDomain;
        }

        /**
         * @return resourceId
         */
        public Long getResourceId() {
            return this.resourceId;
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
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String certDomain; 
            private Long certId; 
            private String certInstanceId; 
            private String certName; 
            private String cloudName; 
            private String cloudProduct; 
            private String cloudRegion; 
            private Boolean defaultResource; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String instanceId; 
            private Long jobId; 
            private String listenerId; 
            private String namespaceId; 
            private Long orderId; 
            private Integer port; 
            private String regionId; 
            private Long resourceCertId; 
            private String resourceDomain; 
            private Long resourceId; 
            private String status; 
            private Long userId; 

            /**
             * The domain name bound to the certificate in the worker task.
             */
            public Builder certDomain(String certDomain) {
                this.certDomain = certDomain;
                return this;
            }

            /**
             * The ID of the certificate in the worker task.
             */
            public Builder certId(Long certId) {
                this.certId = certId;
                return this;
            }

            /**
             * The instance ID of the certificate in the worker task.
             */
            public Builder certInstanceId(String certInstanceId) {
                this.certInstanceId = certInstanceId;
                return this;
            }

            /**
             * The name of the certificate in the worker task.
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * The cloud service provider to which the cloud resource in the worker task belongs.
             * <p>
             * 
             * >  This parameter is not returned if you deploy certificates to Alibaba Cloud services.
             */
            public Builder cloudName(String cloudName) {
                this.cloudName = cloudName;
                return this;
            }

            /**
             * The cloud service to which the cloud resource in the worker task belongs. Valid values:
             * <p>
             * 
             * *   **CDN**: Alibaba Cloud CDN (CDN). This value is supported only at the China site (aliyun.com).
             * *   **SLB**: Classic Load Balancer (CLB). This value is supported only at the China site (aliyun.com).
             * *   **DCDN**: Dynamic Content Delivery Network (DCDN). This value is supported only at the China site (aliyun.com).
             * *   **DDOS**: Anti-DDoS. This value is supported only at the China site (aliyun.com).
             * *   **LIVE**: ApsaraVideo Live. This value is supported only at the China site (aliyun.com).
             * *   **webHosting**: Cloud Web Hosting. This value is supported only at the China site (aliyun.com).
             * *   **VOD**: ApsaraVideo VOD. This value is supported only at the China site (aliyun.com).
             * *   **CR**: Container Registry. This value is supported only at the China site (aliyun.com).
             * *   **ALB**: Application Load Balancer (ALB).
             * *   **APIGateway**: API Gateway.
             * *   **FC**: Function Compute.
             * *   **GA**: Global Accelerator (GA).
             * *   **MSE**: Microservices Engine (MSE).
             * *   **NLB**: Network Load Balancer (NLB).
             * *   **OSS**: Object Storage Service (OSS).
             * *   **SAE**: Serverless App Engine (SAE).
             * *   **TencentCDN**: Tencent Cloud Content Delivery Network (CDN).
             * *   **WAF**: Web Application Firewall (WAF).
             */
            public Builder cloudProduct(String cloudProduct) {
                this.cloudProduct = cloudProduct;
                return this;
            }

            /**
             * The original region ID of the cloud resource in the worker task. The value is the region ID defined by the cloud service provider. This parameter is required only when you deploy certificates to services of multiple clouds.
             */
            public Builder cloudRegion(String cloudRegion) {
                this.cloudRegion = cloudRegion;
                return this;
            }

            /**
             * Indicates whether the cloud resource in the worker task is the default resource. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * >  This parameter is returned only when the value of CloudProduct is SLB, NLB, ALB, or GA.
             */
            public Builder defaultResource(Boolean defaultResource) {
                this.defaultResource = defaultResource;
                return this;
            }

            /**
             * The time when the worker task was created. The time is a timestamp in seconds.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the worker task was last modified. The time is a timestamp in seconds.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the worker task.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The ID of the cloud resource in the worker task.
             * <p>
             * 
             * >  This parameter is returned only when the value of CloudProduct is SLB, NLB, ALB, or GA.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the deployment task to which the worker task belongs.
             */
            public Builder jobId(Long jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The listener ID of the cloud resource in the worker task.
             * <p>
             * 
             * >  This parameter is returned only when the value of CloudProduct is SLB, NLB, ALB, or GA.
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * The ID of the namespace in SAE. This parameter is returned only if you deploy certificates to SAE.
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * The order ID of the worker task, which is the same as the order ID of the certificate.
             * <p>
             * 
             * >  If the CertId parameter is returned, this parameter is not returned.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * The listening port of the cloud resource in the worker task.
             * <p>
             * 
             * >  This parameter is returned only when the value of CloudProduct is SLB, NLB, ALB, or GA.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The region ID of the cloud resource in the worker task.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the certificate that was originally bound to the cloud resource in the worker task.
             */
            public Builder resourceCertId(Long resourceCertId) {
                this.resourceCertId = resourceCertId;
                return this;
            }

            /**
             * The domain name that was originally bound to the cloud resource in the worker task.
             */
            public Builder resourceDomain(String resourceDomain) {
                this.resourceDomain = resourceDomain;
                return this;
            }

            /**
             * The ID of the cloud resource in the worker task.
             */
            public Builder resourceId(Long resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The status of the worker task. Valid values:
             * <p>
             * 
             * *   **editing**
             * *   **pending**
             * *   **scheduling**
             * *   **processing**
             * *   **error**
             * *   **success**
             * *   **rollback**
             * *   **rollback_success**
             * *   **rollback_error**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the worker task belongs.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
