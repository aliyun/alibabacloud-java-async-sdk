// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link ListDeploymentJobResourceResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeploymentJobResourceResponseBody</p>
 */
public class ListDeploymentJobResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDeploymentJobResourceResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The unique ID of the request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDeploymentJobResourceResponseBody build() {
            return new ListDeploymentJobResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDeploymentJobResourceResponseBody} extends {@link TeaModel}
     *
     * <p>ListDeploymentJobResourceResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.certEndTime = model.certEndTime;
                this.certId = model.certId;
                this.certName = model.certName;
                this.certStartTime = model.certStartTime;
                this.cloudAccessId = model.cloudAccessId;
                this.cloudName = model.cloudName;
                this.cloudProduct = model.cloudProduct;
                this.cloudRegion = model.cloudRegion;
                this.defaultResource = model.defaultResource;
                this.domain = model.domain;
                this.enableHttps = model.enableHttps;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.instanceId = model.instanceId;
                this.listenerId = model.listenerId;
                this.listenerPort = model.listenerPort;
                this.regionId = model.regionId;
                this.remark = model.remark;
                this.status = model.status;
                this.useSsl = model.useSsl;
                this.userId = model.userId;
            } 

            /**
             * <p>The expiration date of the certificate that is attached to the cloud product resource. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1681956830000</p>
             */
            public Builder certEndTime(String certEndTime) {
                this.certEndTime = certEndTime;
                return this;
            }

            /**
             * <p>The ID of the certificate that is attached to the cloud product resource.</p>
             * 
             * <strong>example:</strong>
             * <p>11599949</p>
             */
            public Builder certId(Long certId) {
                this.certId = certId;
                return this;
            }

            /**
             * <p>The name of the certificate that is attached to the cloud product resource.</p>
             * 
             * <strong>example:</strong>
             * <p>sc-SSL</p>
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * <p>The start date of the certificate that is attached to the cloud product resource. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1681956830000</p>
             */
            public Builder certStartTime(String certStartTime) {
                this.certStartTime = certStartTime;
                return this;
            }

            /**
             * <p>The key ID used to access the cloud resource set.</p>
             * <blockquote>
             * <p>This parameter is returned only for multicloud deployments.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder cloudAccessId(String cloudAccessId) {
                this.cloudAccessId = cloudAccessId;
                return this;
            }

            /**
             * <p>The provider of the cloud product resource.</p>
             * <ul>
             * <li><p><strong>aliyun</strong>: Alibaba Cloud</p>
             * </li>
             * <li><p><strong>Tencent</strong>: Tencent Cloud</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>aliyun</p>
             */
            public Builder cloudName(String cloudName) {
                this.cloudName = cloudName;
                return this;
            }

            /**
             * <p>The cloud service.</p>
             * <p>&lt;props=&quot;china&quot;&gt;</p>
             * <ul>
             * <li><p><strong>SLB</strong>: Classic Load Balancer (CLB) (China site only)</p>
             * </li>
             * <li><p><strong>LIVE</strong>: ApsaraVideo Live (China site only)</p>
             * </li>
             * <li><p><strong>webHosting</strong>: Cloud Web Hosting (China site only)</p>
             * </li>
             * <li><p><strong>VOD</strong>: ApsaraVideo VOD (China site only)</p>
             * </li>
             * <li><p><strong>CR</strong>: Container Registry (China site only)</p>
             * </li>
             * <li><p><strong>DCDN</strong>: DCDN</p>
             * </li>
             * <li><p><strong>DDOS</strong>: Anti-DDoS</p>
             * </li>
             * <li><p><strong>CDN</strong>: Alibaba Cloud CDN</p>
             * </li>
             * <li><p><strong>ALB</strong>: Application Load Balancer</p>
             * </li>
             * <li><p><strong>APIGateway</strong>: API Gateway</p>
             * </li>
             * <li><p><strong>FC</strong>: Function Compute</p>
             * </li>
             * <li><p><strong>GA</strong>: Global Accelerator</p>
             * </li>
             * <li><p><strong>MSE</strong>: MSE</p>
             * </li>
             * <li><p><strong>NLB</strong>: Network Load Balancer</p>
             * </li>
             * <li><p><strong>OSS</strong>: OSS</p>
             * </li>
             * <li><p><strong>SAE</strong>: SAE</p>
             * </li>
             * <li><p><strong>TencentCDN</strong>: Tencent CDN</p>
             * </li>
             * <li><p><strong>WAF</strong>: WAF</p>
             * </li>
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
             * <p>The region ID of the cloud product resource from the cloud provider.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder cloudRegion(String cloudRegion) {
                this.cloudRegion = cloudRegion;
                return this;
            }

            /**
             * <p>Indicates whether the cloud product resource is a default resource.</p>
             * <ul>
             * <li><p><strong>1</strong>: Default resource</p>
             * </li>
             * <li><p><strong>0</strong>: Not a default resource</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>This parameter is returned only for deployments of SLB, NLB, ALB, and GA.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder defaultResource(Integer defaultResource) {
                this.defaultResource = defaultResource;
                return this;
            }

            /**
             * <p>The domain name that is attached to the cloud product resource.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyundoc.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>Indicates whether HTTPS is enabled for the cloud product resource.</p>
             * <ul>
             * <li><p><strong>1</strong>: Enabled</p>
             * </li>
             * <li><p><strong>0</strong>: Disabled</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder enableHttps(Integer enableHttps) {
                this.enableHttps = enableHttps;
                return this;
            }

            /**
             * <p>The time when the synchronized resource was created. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1673423339000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the synchronized resource was last modified. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1681956830000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the cloud product resource.</p>
             * 
             * <strong>example:</strong>
             * <p>20979</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The instance ID of the cloud product resource.</p>
             * <blockquote>
             * <p>This parameter is returned only for deployments of SLB, NLB, ALB, and GA.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cas-cn-m7r1qocw91at</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The listener ID of the cloud product resource.</p>
             * <blockquote>
             * <p>This parameter is returned only for deployments of SLB, NLB, ALB, and GA.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>lsn-vwdff0q20poq5xazb9@443</p>
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * <p>The listener port of the cloud product resource.</p>
             * <blockquote>
             * <p>This parameter is returned only for deployments of SLB, NLB, ALB, and GA.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>8047</p>
             */
            public Builder listenerPort(String listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * <p>The region ID of the synchronized cloud product resource.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Other metadata about the cloud product resource.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;camera_model\&quot;:\&quot;GIFSHOW [1267087617][OnePlus</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The status of the synchronized cloud product resource.</p>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Indicates whether an Alibaba Cloud SSL certificate is used.</p>
             * <ul>
             * <li><p><strong>1</strong>: Yes</p>
             * </li>
             * <li><p><strong>0</strong>: No</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>This parameter is returned only for multicloud deployments.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder useSsl(Integer useSsl) {
                this.useSsl = useSsl;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>1666884372******</p>
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
