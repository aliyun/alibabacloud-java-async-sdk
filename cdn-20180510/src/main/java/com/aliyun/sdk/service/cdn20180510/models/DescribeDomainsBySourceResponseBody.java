// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDomainsBySourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainsBySourceResponseBody</p>
 */
public class DescribeDomainsBySourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainsList")
    private DomainsList domainsList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Sources")
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
         * <p>The domain names corresponding to each origin server.</p>
         */
        public Builder domainsList(DomainsList domainsList) {
            this.domainsList = domainsList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B0F074E5-A1AC-4B32-8EA2-6F450410D1E0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The origin servers.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com,aliyundoc.com</p>
         */
        public Builder sources(String sources) {
            this.sources = sources;
            return this;
        }

        public DescribeDomainsBySourceResponseBody build() {
            return new DescribeDomainsBySourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainsBySourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainsBySourceResponseBody</p>
     */
    public static class DomainInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CdnType")
        private String cdnType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DomainCname")
        private String domainCname;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-07-12T11:53:19+08:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The CNAME record assigned to the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>***.alikunlun.com</p>
             */
            public Builder domainCname(String domainCname) {
                this.domainCname = domainCname;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.org</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The status of the domain name. Valid values:</p>
             * <ul>
             * <li><strong>applying</strong>: The domain name is under review.</li>
             * <li><strong>configuring</strong>: The domain name is being configured.</li>
             * <li><strong>online</strong>: The domain name is working as expected.</li>
             * <li><strong>stopping</strong>: The domain name is being stopped.</li>
             * <li><strong>offline</strong>: The domain name is disabled.</li>
             * <li><strong>disabling</strong>: The domain name is being removed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-03-31T04:49:00+08:00</p>
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
    /**
     * 
     * {@link DescribeDomainsBySourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainsBySourceResponseBody</p>
     */
    public static class DomainInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("domainInfo")
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
    /**
     * 
     * {@link DescribeDomainsBySourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainsBySourceResponseBody</p>
     */
    public static class Domains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("domainNames")
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
    /**
     * 
     * {@link DescribeDomainsBySourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainsBySourceResponseBody</p>
     */
    public static class DomainsData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainInfos")
        private DomainInfos domainInfos;

        @com.aliyun.core.annotation.NameInMap("Domains")
        private Domains domains;

        @com.aliyun.core.annotation.NameInMap("Source")
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
             * <p>Information about the domain name.</p>
             */
            public Builder domainInfos(DomainInfos domainInfos) {
                this.domainInfos = domainInfos;
                return this;
            }

            /**
             * <p>The domain names that correspond to each origin server.</p>
             */
            public Builder domains(Domains domains) {
                this.domains = domains;
                return this;
            }

            /**
             * <p>The origin server.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
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
    /**
     * 
     * {@link DescribeDomainsBySourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainsBySourceResponseBody</p>
     */
    public static class DomainsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainsData")
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
