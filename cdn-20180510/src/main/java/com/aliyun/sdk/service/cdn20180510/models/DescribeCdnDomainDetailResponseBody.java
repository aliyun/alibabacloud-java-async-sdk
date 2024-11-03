// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The details about the accelerated domain name.</p>
         */
        public Builder getDomainDetailModel(GetDomainDetailModel getDomainDetailModel) {
            this.getDomainDetailModel = getDomainDetailModel;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>18CF38AA-1275-451D-A12B-4EC0BF1C5E30</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCdnDomainDetailResponseBody build() {
            return new DescribeCdnDomainDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCdnDomainDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnDomainDetailResponseBody</p>
     */
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
             * <p>The address of the origin server.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder enabled(String enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The port over which requests are redirected to the origin server. Ports 443 and 80 are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The priority.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The type of the origin server. Valid values:</p>
             * <ul>
             * <li><strong>ipaddr</strong>: an origin IP address</li>
             * <li><strong>domain</strong>: an origin domain name</li>
             * <li><strong>oss</strong>: the domain name of an Object Storage Service (OSS) bucket</li>
             * <li><strong>fc_domain:</strong> a Function Compute domain name</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>domain</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The weight of the origin server if multiple origin servers have been specified.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
    /**
     * 
     * {@link DescribeCdnDomainDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnDomainDetailResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeCdnDomainDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnDomainDetailResponseBody</p>
     */
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
             * <p>The workload type of the accelerated domain name. Valid values:</p>
             * <ul>
             * <li><strong>web</strong>: images and small files</li>
             * <li><strong>download</strong>: large files</li>
             * <li><strong>video</strong>: on-demand video and audio streaming</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>web</p>
             */
            public Builder cdnType(String cdnType) {
                this.cdnType = cdnType;
                return this;
            }

            /**
             * <p>The CNAME that is assigned to the accelerated domain name. You must add the CNAME record in the system of your DNS service provider to map the accelerated domain name to the CNAME.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com.w.kunlunle.com</p>
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * <p>The description of the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>Streaming domain</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The accelerated domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The status of the accelerated domain name. Valid values:</p>
             * <ul>
             * <li><strong>online</strong></li>
             * <li><strong>offline</strong></li>
             * <li><strong>configuring</strong></li>
             * <li><strong>configure_failed</strong></li>
             * <li><strong>checking</strong></li>
             * <li><strong>check_failed</strong></li>
             * <li><strong>stopping</strong></li>
             * <li><strong>deleting</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder domainStatus(String domainStatus) {
                this.domainStatus = domainStatus;
                return this;
            }

            /**
             * <p>The time when the domain name was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-06-25T03:30:50Z</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The time when the domain name was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-06-25T03:30:50Z</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The CNAME for which HTTPS is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com.w.kunlunle.com</p>
             */
            public Builder httpsCname(String httpsCname) {
                this.httpsCname = httpsCname;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>abcd1234abcd1234</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The acceleration region.</p>
             * 
             * <strong>example:</strong>
             * <p>domestic</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>Indicates whether the SSL certificate is enabled. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder serverCertificateStatus(String serverCertificateStatus) {
                this.serverCertificateStatus = serverCertificateStatus;
                return this;
            }

            /**
             * <p>The information about the origin server.</p>
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
