// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3E50D480-9765-5CFD-9650-9BACCECA5135</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: <strong>50</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder showSize(Integer showSize) {
            this.showSize = showSize;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListWorkerResourceResponseBody build() {
            return new ListWorkerResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkerResourceResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkerResourceResponseBody</p>
     */
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
             * <p>The domain name bound to the certificate in the worker task.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder certDomain(String certDomain) {
                this.certDomain = certDomain;
                return this;
            }

            /**
             * <p>The ID of the certificate in the worker task.</p>
             * 
             * <strong>example:</strong>
             * <p>12073663</p>
             */
            public Builder certId(Long certId) {
                this.certId = certId;
                return this;
            }

            /**
             * <p>The instance ID of the certificate in the worker task.</p>
             * 
             * <strong>example:</strong>
             * <p>lsn-jzk2h0xz5dmynuphb8@1883</p>
             */
            public Builder certInstanceId(String certInstanceId) {
                this.certInstanceId = certInstanceId;
                return this;
            }

            /**
             * <p>The name of the certificate in the worker task.</p>
             * 
             * <strong>example:</strong>
             * <p>testCertName</p>
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * <p>The cloud service provider to which the cloud resource in the worker task belongs.</p>
             * <blockquote>
             * <p> This parameter is not returned if you deploy certificates to Alibaba Cloud services.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>aliyun</p>
             */
            public Builder cloudName(String cloudName) {
                this.cloudName = cloudName;
                return this;
            }

            /**
             * <p>The cloud service to which the cloud resource in the worker task belongs. Valid values:</p>
             * <ul>
             * <li><strong>CDN</strong>: Alibaba Cloud CDN (CDN). This value is supported only at the China site (aliyun.com).</li>
             * <li><strong>SLB</strong>: Classic Load Balancer (CLB). This value is supported only at the China site (aliyun.com).</li>
             * <li><strong>DCDN</strong>: Dynamic Content Delivery Network (DCDN). This value is supported only at the China site (aliyun.com).</li>
             * <li><strong>DDOS</strong>: Anti-DDoS. This value is supported only at the China site (aliyun.com).</li>
             * <li><strong>LIVE</strong>: ApsaraVideo Live. This value is supported only at the China site (aliyun.com).</li>
             * <li><strong>webHosting</strong>: Cloud Web Hosting. This value is supported only at the China site (aliyun.com).</li>
             * <li><strong>VOD</strong>: ApsaraVideo VOD. This value is supported only at the China site (aliyun.com).</li>
             * <li><strong>CR</strong>: Container Registry. This value is supported only at the China site (aliyun.com).</li>
             * <li><strong>ALB</strong>: Application Load Balancer (ALB).</li>
             * <li><strong>APIGateway</strong>: API Gateway.</li>
             * <li><strong>FC</strong>: Function Compute.</li>
             * <li><strong>GA</strong>: Global Accelerator (GA).</li>
             * <li><strong>MSE</strong>: Microservices Engine (MSE).</li>
             * <li><strong>NLB</strong>: Network Load Balancer (NLB).</li>
             * <li><strong>OSS</strong>: Object Storage Service (OSS).</li>
             * <li><strong>SAE</strong>: Serverless App Engine (SAE).</li>
             * <li><strong>TencentCDN</strong>: Tencent Cloud Content Delivery Network (CDN).</li>
             * <li><strong>WAF</strong>: Web Application Firewall (WAF).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SLB</p>
             */
            public Builder cloudProduct(String cloudProduct) {
                this.cloudProduct = cloudProduct;
                return this;
            }

            /**
             * <p>The original region ID of the cloud resource in the worker task. The value is the region ID defined by the cloud service provider. This parameter is required only when you deploy certificates to services of multiple clouds.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder cloudRegion(String cloudRegion) {
                this.cloudRegion = cloudRegion;
                return this;
            }

            /**
             * <p>Indicates whether the cloud resource in the worker task is the default resource. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned only when the value of CloudProduct is SLB, NLB, ALB, or GA.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder defaultResource(Boolean defaultResource) {
                this.defaultResource = defaultResource;
                return this;
            }

            /**
             * <p>The time when the worker task was created. The time is a timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1680228896000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the worker task was last modified. The time is a timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1681956830000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the worker task.</p>
             * 
             * <strong>example:</strong>
             * <p>22487</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the cloud resource in the worker task.</p>
             * <blockquote>
             * <p> This parameter is returned only when the value of CloudProduct is SLB, NLB, ALB, or GA.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cas-cn-0pp118nuu40b</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the deployment task to which the worker task belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>8888</p>
             */
            public Builder jobId(Long jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The listener ID of the cloud resource in the worker task.</p>
             * <blockquote>
             * <p> This parameter is returned only when the value of CloudProduct is SLB, NLB, ALB, or GA.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>lsn-lhl8y7s1e1ngc3m3zz@81</p>
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * <p>The ID of the namespace in SAE. This parameter is returned only if you deploy certificates to SAE.</p>
             * 
             * <strong>example:</strong>
             * <p>32fed52a-4bf7-44f6-955f-e82ada68ef18</p>
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * <p>The order ID of the worker task, which is the same as the order ID of the certificate.</p>
             * <blockquote>
             * <p> If the CertId parameter is returned, this parameter is not returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>9349278</p>
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * <p>The listening port of the cloud resource in the worker task.</p>
             * <blockquote>
             * <p> This parameter is returned only when the value of CloudProduct is SLB, NLB, ALB, or GA.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>4431</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The region ID of the cloud resource in the worker task.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the certificate that was originally bound to the cloud resource in the worker task.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder resourceCertId(Long resourceCertId) {
                this.resourceCertId = resourceCertId;
                return this;
            }

            /**
             * <p>The domain name that was originally bound to the cloud resource in the worker task.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder resourceDomain(String resourceDomain) {
                this.resourceDomain = resourceDomain;
                return this;
            }

            /**
             * <p>The ID of the cloud resource in the worker task.</p>
             * 
             * <strong>example:</strong>
             * <p>1286999</p>
             */
            public Builder resourceId(Long resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The status of the worker task. Valid values:</p>
             * <ul>
             * <li><strong>editing</strong></li>
             * <li><strong>pending</strong></li>
             * <li><strong>scheduling</strong></li>
             * <li><strong>processing</strong></li>
             * <li><strong>error</strong></li>
             * <li><strong>success</strong></li>
             * <li><strong>rollback</strong></li>
             * <li><strong>rollback_success</strong></li>
             * <li><strong>rollback_error</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>editing</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the worker task belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1666884372152785</p>
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
