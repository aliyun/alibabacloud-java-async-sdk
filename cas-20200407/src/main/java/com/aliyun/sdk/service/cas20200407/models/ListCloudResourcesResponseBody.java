// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ShowSize.
         */
        public Builder showSize(Integer showSize) {
            this.showSize = showSize;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListCloudResourcesResponseBody build() {
            return new ListCloudResourcesResponseBody(this);
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
             * CertEndTime.
             */
            public Builder certEndTime(String certEndTime) {
                this.certEndTime = certEndTime;
                return this;
            }

            /**
             * CertId.
             */
            public Builder certId(Long certId) {
                this.certId = certId;
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
             * CertStartTime.
             */
            public Builder certStartTime(String certStartTime) {
                this.certStartTime = certStartTime;
                return this;
            }

            /**
             * CloudAccessId.
             */
            public Builder cloudAccessId(String cloudAccessId) {
                this.cloudAccessId = cloudAccessId;
                return this;
            }

            /**
             * CloudName.
             */
            public Builder cloudName(String cloudName) {
                this.cloudName = cloudName;
                return this;
            }

            /**
             * CloudProduct.
             */
            public Builder cloudProduct(String cloudProduct) {
                this.cloudProduct = cloudProduct;
                return this;
            }

            /**
             * CloudRegion.
             */
            public Builder cloudRegion(String cloudRegion) {
                this.cloudRegion = cloudRegion;
                return this;
            }

            /**
             * DefaultResource.
             */
            public Builder defaultResource(Integer defaultResource) {
                this.defaultResource = defaultResource;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * EnableHttps.
             */
            public Builder enableHttps(Integer enableHttps) {
                this.enableHttps = enableHttps;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * ListenerId.
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * ListenerPort.
             */
            public Builder listenerPort(String listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UseSsl.
             */
            public Builder useSsl(Integer useSsl) {
                this.useSsl = useSsl;
                return this;
            }

            /**
             * UserId.
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
