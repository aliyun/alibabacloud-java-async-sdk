// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeploymentJobResourceResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeploymentJobResourceResponseBody</p>
 */
public class ListDeploymentJobResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDeploymentJobResourceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeploymentJobResourceResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

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

        public ListDeploymentJobResourceResponseBody build() {
            return new ListDeploymentJobResourceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertEndTime")
        private String certEndTime;

        @com.aliyun.core.annotation.NameInMap("CertId")
        private Long certId;

        @com.aliyun.core.annotation.NameInMap("CertName")
        private String certName;

        @com.aliyun.core.annotation.NameInMap("CertStartTime")
        private String certStartTime;

        @com.aliyun.core.annotation.NameInMap("CloudAccessId")
        private String cloudAccessId;

        @com.aliyun.core.annotation.NameInMap("CloudName")
        private String cloudName;

        @com.aliyun.core.annotation.NameInMap("CloudProduct")
        private String cloudProduct;

        @com.aliyun.core.annotation.NameInMap("CloudRegion")
        private String cloudRegion;

        @com.aliyun.core.annotation.NameInMap("DefaultResource")
        private Integer defaultResource;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("EnableHttps")
        private Integer enableHttps;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ListenerId")
        private String listenerId;

        @com.aliyun.core.annotation.NameInMap("ListenerPort")
        private String listenerPort;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UseSsl")
        private Integer useSsl;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        private Data(Builder builder) {
            this.certEndTime = builder.certEndTime;
            this.certId = builder.certId;
            this.certName = builder.certName;
            this.certStartTime = builder.certStartTime;
            this.cloudAccessId = builder.cloudAccessId;
            this.cloudName = builder.cloudName;
            this.cloudProduct = builder.cloudProduct;
            this.cloudRegion = builder.cloudRegion;
            this.defaultResource = builder.defaultResource;
            this.domain = builder.domain;
            this.enableHttps = builder.enableHttps;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.listenerId = builder.listenerId;
            this.listenerPort = builder.listenerPort;
            this.regionId = builder.regionId;
            this.remark = builder.remark;
            this.status = builder.status;
            this.useSsl = builder.useSsl;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return certEndTime
         */
        public String getCertEndTime() {
            return this.certEndTime;
        }

        /**
         * @return certId
         */
        public Long getCertId() {
            return this.certId;
        }

        /**
         * @return certName
         */
        public String getCertName() {
            return this.certName;
        }

        /**
         * @return certStartTime
         */
        public String getCertStartTime() {
            return this.certStartTime;
        }

        /**
         * @return cloudAccessId
         */
        public String getCloudAccessId() {
            return this.cloudAccessId;
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
        public Integer getDefaultResource() {
            return this.defaultResource;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return enableHttps
         */
        public Integer getEnableHttps() {
            return this.enableHttps;
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
         * @return listenerId
         */
        public String getListenerId() {
            return this.listenerId;
        }

        /**
         * @return listenerPort
         */
        public String getListenerPort() {
            return this.listenerPort;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return useSsl
         */
        public Integer getUseSsl() {
            return this.useSsl;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String certEndTime; 
            private Long certId; 
            private String certName; 
            private String certStartTime; 
            private String cloudAccessId; 
            private String cloudName; 
            private String cloudProduct; 
            private String cloudRegion; 
            private Integer defaultResource; 
            private String domain; 
            private Integer enableHttps; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String instanceId; 
            private String listenerId; 
            private String listenerPort; 
            private String regionId; 
            private String remark; 
            private String status; 
            private Integer useSsl; 
            private Long userId; 

            /**
             * The end date of the certificate bound to the cloud resource. The value is a timestamp in seconds.
             */
            public Builder certEndTime(String certEndTime) {
                this.certEndTime = certEndTime;
                return this;
            }

            /**
             * The ID of the certificate bound to the cloud resource.
             */
            public Builder certId(Long certId) {
                this.certId = certId;
                return this;
            }

            /**
             * The name of the certificate bound to the cloud resource.
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * The start date of the certificate bound to the cloud resource. The value is a timestamp in seconds.
             */
            public Builder certStartTime(String certStartTime) {
                this.certStartTime = certStartTime;
                return this;
            }

            /**
             * The AccessKey ID used to access cloud resources.
             * <p>
             * 
             * >  This parameter is required only when you deploy certificates to services of multiple clouds.
             */
            public Builder cloudAccessId(String cloudAccessId) {
                this.cloudAccessId = cloudAccessId;
                return this;
            }

            /**
             * The cloud service provider of the cloud resource. Valid values:
             * <p>
             * 
             * *   **aliyun**: Alibaba Cloud
             * *   **Tencent**: Tencent Cloud
             */
            public Builder cloudName(String cloudName) {
                this.cloudName = cloudName;
                return this;
            }

            /**
             * The cloud service. Valid values:
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
             * The region ID of the cloud service provider to which the cloud resource belongs.
             */
            public Builder cloudRegion(String cloudRegion) {
                this.cloudRegion = cloudRegion;
                return this;
            }

            /**
             * Indicates whether the cloud resource is the default resource. Valid values:
             * <p>
             * 
             * *   **1**: yes
             * *   **0**: no
             * 
             * >  This parameter is returned only when the value of CloudProduct is SLB, NLB, ALB, or GA.
             */
            public Builder defaultResource(Integer defaultResource) {
                this.defaultResource = defaultResource;
                return this;
            }

            /**
             * The domain name bound to the cloud resource.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Indicates whether HTTPS is enabled for the cloud resource. Valid values:
             * <p>
             * 
             * *   **1**: yes
             * *   **0**: no
             */
            public Builder enableHttps(Integer enableHttps) {
                this.enableHttps = enableHttps;
                return this;
            }

            /**
             * The time when the cloud resource was created. The time is a timestamp in seconds.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the cloud resource was last modified. The time is in the timestamp format.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the cloud resource.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The instance ID of the cloud resource.
             * <p>
             * 
             * >  This parameter is returned only when the value of CloudProduct is SLB, NLB, ALB, or GA.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The listener ID of the cloud resource.
             * <p>
             * 
             * >  This parameter is returned only when the value of CloudProduct is SLB, NLB, ALB, or GA.
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * The listening port of the cloud resource.
             * <p>
             * 
             * >  This parameter is returned only when the value of CloudProduct is SLB, NLB, ALB, or GA.
             */
            public Builder listenerPort(String listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * The region ID of the cloud resource.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The other metadata related to the cloud resource.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The status of the cloud resource.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Indicates whether an Alibaba Cloud SSL certificate is used. Valid values:
             * <p>
             * 
             * *   **1**: yes
             * *   **0**: no
             * 
             * >  This parameter is required only when you deploy certificates to services of multiple clouds.
             */
            public Builder useSsl(Integer useSsl) {
                this.useSsl = useSsl;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account.
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
