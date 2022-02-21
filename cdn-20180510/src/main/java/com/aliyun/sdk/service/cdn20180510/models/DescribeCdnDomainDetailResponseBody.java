// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnDomainDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnDomainDetailResponseBody</p>
 */
public class DescribeCdnDomainDetailResponseBody extends TeaModel {
    @NameInMap("GetDomainDetailModel")
    private GetDomainDetailModel getDomainDetailModel;

    @NameInMap("RequestId")
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
         * GetDomainDetailModel.
         */
        public Builder getDomainDetailModel(GetDomainDetailModel getDomainDetailModel) {
            this.getDomainDetailModel = getDomainDetailModel;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("Content")
        private String content;

        @NameInMap("Enabled")
        private String enabled;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("Priority")
        private String priority;

        @NameInMap("Type")
        private String type;

        @NameInMap("Weight")
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
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(String enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Weight.
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
        @NameInMap("SourceModel")
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
        @NameInMap("CdnType")
        private String cdnType;

        @NameInMap("Cname")
        private String cname;

        @NameInMap("Description")
        private String description;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("DomainStatus")
        private String domainStatus;

        @NameInMap("GmtCreated")
        private String gmtCreated;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("HttpsCname")
        private String httpsCname;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Scope")
        private String scope;

        @NameInMap("ServerCertificateStatus")
        private String serverCertificateStatus;

        @NameInMap("SourceModels")
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
             * CdnType.
             */
            public Builder cdnType(String cdnType) {
                this.cdnType = cdnType;
                return this;
            }

            /**
             * Cname.
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * DomainStatus.
             */
            public Builder domainStatus(String domainStatus) {
                this.domainStatus = domainStatus;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
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
             * HttpsCname.
             */
            public Builder httpsCname(String httpsCname) {
                this.httpsCname = httpsCname;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * ServerCertificateStatus.
             */
            public Builder serverCertificateStatus(String serverCertificateStatus) {
                this.serverCertificateStatus = serverCertificateStatus;
                return this;
            }

            /**
             * SourceModels.
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
