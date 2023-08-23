// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainsBySourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainsBySourceResponseBody</p>
 */
public class DescribeDomainsBySourceResponseBody extends TeaModel {
    @NameInMap("DomainsList")
    private DomainsList domainsList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Sources")
    private String sources;

    private DescribeDomainsBySourceResponseBody(Builder builder) {
        this.domainsList = builder.domainsList;
        this.requestId = builder.requestId;
        this.sources = builder.sources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainsBySourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainsList
     */
    public DomainsList getDomainsList() {
        return this.domainsList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sources
     */
    public String getSources() {
        return this.sources;
    }

    public static final class Builder {
        private DomainsList domainsList; 
        private String requestId; 
        private String sources; 

        /**
         * The domain names corresponding to each origin server.
         */
        public Builder domainsList(DomainsList domainsList) {
            this.domainsList = domainsList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The origin servers.
         */
        public Builder sources(String sources) {
            this.sources = sources;
            return this;
        }

        public DescribeDomainsBySourceResponseBody build() {
            return new DescribeDomainsBySourceResponseBody(this);
        } 

    } 

    public static class DomainInfo extends TeaModel {
        @NameInMap("CdnType")
        private String cdnType;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DomainCname")
        private String domainCname;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("Status")
        private String status;

        @NameInMap("UpdateTime")
        private String updateTime;

        private DomainInfo(Builder builder) {
            this.cdnType = builder.cdnType;
            this.createTime = builder.createTime;
            this.domainCname = builder.domainCname;
            this.domainName = builder.domainName;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainInfo create() {
            return builder().build();
        }

        /**
         * @return cdnType
         */
        public String getCdnType() {
            return this.cdnType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return domainCname
         */
        public String getDomainCname() {
            return this.domainCname;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String cdnType; 
            private String createTime; 
            private String domainCname; 
            private String domainName; 
            private String status; 
            private String updateTime; 

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
             * The creation time.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The CNAME record assigned to the domain name.
             */
            public Builder domainCname(String domainCname) {
                this.domainCname = domainCname;
                return this;
            }

            /**
             * The domain name.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The status of the domain name. Valid values:
             * <p>
             * 
             * *   **applying**: The domain name is under review.
             * *   **configuring**: The domain name is being configured.
             * *   **online**: The domain name is working as expected.
             * *   **stopping**: The domain name is being stopped.
             * *   **offline**: The domain name is disabled.
             * *   **disabling**: The domain name is being removed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The update time.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public DomainInfo build() {
                return new DomainInfo(this);
            } 

        } 

    }
    public static class DomainInfos extends TeaModel {
        @NameInMap("domainInfo")
        private java.util.List < DomainInfo> domainInfo;

        private DomainInfos(Builder builder) {
            this.domainInfo = builder.domainInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainInfos create() {
            return builder().build();
        }

        /**
         * @return domainInfo
         */
        public java.util.List < DomainInfo> getDomainInfo() {
            return this.domainInfo;
        }

        public static final class Builder {
            private java.util.List < DomainInfo> domainInfo; 

            /**
             * domainInfo.
             */
            public Builder domainInfo(java.util.List < DomainInfo> domainInfo) {
                this.domainInfo = domainInfo;
                return this;
            }

            public DomainInfos build() {
                return new DomainInfos(this);
            } 

        } 

    }
    public static class Domains extends TeaModel {
        @NameInMap("domainNames")
        private java.util.List < String > domainNames;

        private Domains(Builder builder) {
            this.domainNames = builder.domainNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domains create() {
            return builder().build();
        }

        /**
         * @return domainNames
         */
        public java.util.List < String > getDomainNames() {
            return this.domainNames;
        }

        public static final class Builder {
            private java.util.List < String > domainNames; 

            /**
             * domainNames.
             */
            public Builder domainNames(java.util.List < String > domainNames) {
                this.domainNames = domainNames;
                return this;
            }

            public Domains build() {
                return new Domains(this);
            } 

        } 

    }
    public static class DomainsData extends TeaModel {
        @NameInMap("DomainInfos")
        private DomainInfos domainInfos;

        @NameInMap("Domains")
        private Domains domains;

        @NameInMap("Source")
        private String source;

        private DomainsData(Builder builder) {
            this.domainInfos = builder.domainInfos;
            this.domains = builder.domains;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainsData create() {
            return builder().build();
        }

        /**
         * @return domainInfos
         */
        public DomainInfos getDomainInfos() {
            return this.domainInfos;
        }

        /**
         * @return domains
         */
        public Domains getDomains() {
            return this.domains;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private DomainInfos domainInfos; 
            private Domains domains; 
            private String source; 

            /**
             * Information about the domain name.
             */
            public Builder domainInfos(DomainInfos domainInfos) {
                this.domainInfos = domainInfos;
                return this;
            }

            /**
             * The domain names that correspond to each origin server.
             */
            public Builder domains(Domains domains) {
                this.domains = domains;
                return this;
            }

            /**
             * The origin server.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public DomainsData build() {
                return new DomainsData(this);
            } 

        } 

    }
    public static class DomainsList extends TeaModel {
        @NameInMap("DomainsData")
        private java.util.List < DomainsData> domainsData;

        private DomainsList(Builder builder) {
            this.domainsData = builder.domainsData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainsList create() {
            return builder().build();
        }

        /**
         * @return domainsData
         */
        public java.util.List < DomainsData> getDomainsData() {
            return this.domainsData;
        }

        public static final class Builder {
            private java.util.List < DomainsData> domainsData; 

            /**
             * DomainsData.
             */
            public Builder domainsData(java.util.List < DomainsData> domainsData) {
                this.domainsData = domainsData;
                return this;
            }

            public DomainsList build() {
                return new DomainsList(this);
            } 

        } 

    }
}
