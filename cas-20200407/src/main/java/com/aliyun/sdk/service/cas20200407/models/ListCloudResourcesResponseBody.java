// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListCloudResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCloudResourcesResponseBody</p>
 */
public class ListCloudResourcesResponseBody extends TeaModel {
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

    private ListCloudResourcesResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.showSize = builder.showSize;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudResourcesResponseBody create() {
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
         * <p>The data returned for the request.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-1234-1234-123456789ABC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: <strong>20</strong>.</p>
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
         * <p>440</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListCloudResourcesResponseBody build() {
            return new ListCloudResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCloudResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudResourcesResponseBody</p>
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
            private String status; 
            private Integer useSsl; 
            private Long userId; 

            /**
             * <p>The end date of the certificate bound to the cloud resource. The value is a timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1737795520000</p>
             */
            public Builder certEndTime(String certEndTime) {
                this.certEndTime = certEndTime;
                return this;
            }

            /**
             * <p>The ID of the certificate bound to the cloud resource.</p>
             * 
             * <strong>example:</strong>
             * <p>12433121</p>
             */
            public Builder certId(Long certId) {
                this.certId = certId;
                return this;
            }

            /**
             * <p>The name of the certificate bound to the cloud resource.</p>
             * 
             * <strong>example:</strong>
             * <p>shop.amsaudio.cn</p>
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * <p>The start date of the certificate bound to the cloud resource. The value is a timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1706259520000</p>
             */
            public Builder certStartTime(String certStartTime) {
                this.certStartTime = certStartTime;
                return this;
            }

            /**
             * <p>The AccessKey ID that is used to access cloud resources.</p>
             * <blockquote>
             * <p> This parameter is returned only when you deploy certificates to cloud services of third-party clouds.</p>
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
             * <p>The cloud service provider.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Tencent</li>
             * <li>Huawei</li>
             * <li>Aws</li>
             * <li>aliyun</li>
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
             * 
             * <strong>example:</strong>
             * <p>ALB</p>
             */
            public Builder cloudProduct(String cloudProduct) {
                this.cloudProduct = cloudProduct;
                return this;
            }

            /**
             * <p>The region ID of the cloud service provider to which the cloud resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder cloudRegion(String cloudRegion) {
                this.cloudRegion = cloudRegion;
                return this;
            }

            /**
             * <p>Indicates whether the cloud resource is the default resource. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes</li>
             * <li><strong>0</strong>: no</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned only when the value of CloudProduct is SLB, NLB, ALB, or GA.</p>
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
             * <p>The domain name bound to the cloud resource.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.tkgeo.ru">www.tkgeo.ru</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>Indicates whether HTTPS is enabled for the cloud resource. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes.</li>
             * <li><strong>0</strong>: no.</li>
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
             * <p>The time when the cloud resource was created. The time is a timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1673423339000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the cloud resource was last modified. The time is a timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1696911946000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the cloud resource.</p>
             * 
             * <strong>example:</strong>
             * <p>2356</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The instance ID of the cloud resource.</p>
             * <blockquote>
             * <p> This parameter is returned only when the value of CloudProduct is SLB, NLB, ALB, or GA.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>nlb-rv05agjc97ovm14il5</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The listener ID of the cloud resource.</p>
             * <blockquote>
             * <p> This parameter is returned only when the value of CloudProduct is SLB, NLB, ALB, or GA.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>lsn-jiugof6t23et66lsnc@443</p>
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * <p>The listening port of the cloud resource.</p>
             * <blockquote>
             * <p> This parameter is returned only when the value of CloudProduct is SLB, NLB, ALB, or GA.</p>
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
             * <p>The region ID of the cloud resource.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The status of the cloud resource.</p>
             * 
             * <strong>example:</strong>
             * <p>BUY</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Indicates whether an Alibaba Cloud SSL certificate is used. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes</li>
             * <li><strong>0</strong>: no</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is required only when you deploy certificates to services of multiple clouds.</p>
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
