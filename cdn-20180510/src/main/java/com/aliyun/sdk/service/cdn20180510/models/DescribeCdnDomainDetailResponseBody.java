// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnDomainDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnDomainDetailResponseBody</p>
 */
public class DescribeCdnDomainDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GetDomainDetailModel")
    private GetDomainDetailModel getDomainDetailModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCdnDomainDetailResponseBody(Builder builder) {
        this.getDomainDetailModel = builder.getDomainDetailModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnDomainDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return getDomainDetailModel
     */
    public GetDomainDetailModel getGetDomainDetailModel() {
        return this.getDomainDetailModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private GetDomainDetailModel getDomainDetailModel; 
        private String requestId; 

        /**
         * The details about the accelerated domain name.
         */
        public Builder getDomainDetailModel(GetDomainDetailModel getDomainDetailModel) {
            this.getDomainDetailModel = getDomainDetailModel;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCdnDomainDetailResponseBody build() {
            return new DescribeCdnDomainDetailResponseBody(this);
        } 

    } 

    public static class SourceModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private String enabled;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private String weight;

        private SourceModel(Builder builder) {
            this.content = builder.content;
            this.enabled = builder.enabled;
            this.port = builder.port;
            this.priority = builder.priority;
            this.type = builder.type;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceModel create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return enabled
         */
        public String getEnabled() {
            return this.enabled;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return weight
         */
        public String getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String content; 
            private String enabled; 
            private Integer port; 
            private String priority; 
            private String type; 
            private String weight; 

            /**
             * The address of the origin server.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The status.
             */
            public Builder enabled(String enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The port over which requests are redirected to the origin server. Ports 443 and 80 are supported.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The priority.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The type of the origin server. Valid values:
             * <p>
             * 
             * *   **ipaddr**: an origin IP address
             * *   **domain**: an origin domain name
             * *   **oss**: the domain name of an Object Storage Service (OSS) bucket
             * *   **fc_domain:** a Function Compute domain name
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The weight of the origin server if multiple origin servers have been specified.
             */
            public Builder weight(String weight) {
                this.weight = weight;
                return this;
            }

            public SourceModel build() {
                return new SourceModel(this);
            } 

        } 

    }
    public static class SourceModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceModel")
        private java.util.List < SourceModel> sourceModel;

        private SourceModels(Builder builder) {
            this.sourceModel = builder.sourceModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceModels create() {
            return builder().build();
        }

        /**
         * @return sourceModel
         */
        public java.util.List < SourceModel> getSourceModel() {
            return this.sourceModel;
        }

        public static final class Builder {
            private java.util.List < SourceModel> sourceModel; 

            /**
             * SourceModel.
             */
            public Builder sourceModel(java.util.List < SourceModel> sourceModel) {
                this.sourceModel = sourceModel;
                return this;
            }

            public SourceModels build() {
                return new SourceModels(this);
            } 

        } 

    }
    public static class GetDomainDetailModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CdnType")
        private String cdnType;

        @com.aliyun.core.annotation.NameInMap("Cname")
        private String cname;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("DomainStatus")
        private String domainStatus;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("HttpsCname")
        private String httpsCname;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("ServerCertificateStatus")
        private String serverCertificateStatus;

        @com.aliyun.core.annotation.NameInMap("SourceModels")
        private SourceModels sourceModels;

        private GetDomainDetailModel(Builder builder) {
            this.cdnType = builder.cdnType;
            this.cname = builder.cname;
            this.description = builder.description;
            this.domainName = builder.domainName;
            this.domainStatus = builder.domainStatus;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.httpsCname = builder.httpsCname;
            this.resourceGroupId = builder.resourceGroupId;
            this.scope = builder.scope;
            this.serverCertificateStatus = builder.serverCertificateStatus;
            this.sourceModels = builder.sourceModels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetDomainDetailModel create() {
            return builder().build();
        }

        /**
         * @return cdnType
         */
        public String getCdnType() {
            return this.cdnType;
        }

        /**
         * @return cname
         */
        public String getCname() {
            return this.cname;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return domainStatus
         */
        public String getDomainStatus() {
            return this.domainStatus;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return httpsCname
         */
        public String getHttpsCname() {
            return this.httpsCname;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return serverCertificateStatus
         */
        public String getServerCertificateStatus() {
            return this.serverCertificateStatus;
        }

        /**
         * @return sourceModels
         */
        public SourceModels getSourceModels() {
            return this.sourceModels;
        }

        public static final class Builder {
            private String cdnType; 
            private String cname; 
            private String description; 
            private String domainName; 
            private String domainStatus; 
            private String gmtCreated; 
            private String gmtModified; 
            private String httpsCname; 
            private String resourceGroupId; 
            private String scope; 
            private String serverCertificateStatus; 
            private SourceModels sourceModels; 

            /**
             * The workload type of the accelerated domain name. Valid values:
             * <p>
             * 
             * *   **web**: images and small files
             * *   **download**: large files
             * *   **video**: on-demand video and audio streaming
             */
            public Builder cdnType(String cdnType) {
                this.cdnType = cdnType;
                return this;
            }

            /**
             * The CNAME that is assigned to the accelerated domain name. You must add the CNAME record in the system of your DNS service provider to map the accelerated domain name to the CNAME.
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * The description of the domain name.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The accelerated domain name.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The status of the accelerated domain name. Valid values:
             * <p>
             * 
             * *   **online**
             * *   **offline**
             * *   **configuring**
             * *   **configure_failed**
             * *   **checking**
             * *   **check_failed**
             * *   **stopping**
             * *   **deleting**
             */
            public Builder domainStatus(String domainStatus) {
                this.domainStatus = domainStatus;
                return this;
            }

            /**
             * The time when the domain name was created.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * The time when the domain name was last modified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The CNAME for which HTTPS is enabled.
             */
            public Builder httpsCname(String httpsCname) {
                this.httpsCname = httpsCname;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The acceleration region.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * Indicates whether the SSL certificate is enabled. Valid values:
             * <p>
             * 
             * *   **on**
             * *   **off**
             */
            public Builder serverCertificateStatus(String serverCertificateStatus) {
                this.serverCertificateStatus = serverCertificateStatus;
                return this;
            }

            /**
             * The information about the origin server.
             */
            public Builder sourceModels(SourceModels sourceModels) {
                this.sourceModels = sourceModels;
                return this;
            }

            public GetDomainDetailModel build() {
                return new GetDomainDetailModel(this);
            } 

        } 

    }
}
