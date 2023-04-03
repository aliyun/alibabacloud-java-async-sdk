// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDNSSLBSubDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDNSSLBSubDomainsResponseBody</p>
 */
public class DescribeDNSSLBSubDomainsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SlbSubDomains")
    private SlbSubDomains slbSubDomains;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDNSSLBSubDomainsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.slbSubDomains = builder.slbSubDomains;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDNSSLBSubDomainsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slbSubDomains
     */
    public SlbSubDomains getSlbSubDomains() {
        return this.slbSubDomains;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private SlbSubDomains slbSubDomains; 
        private Long totalCount; 

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The total number of subdomains returned.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
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
         * The details of the subdomains.
         */
        public Builder slbSubDomains(SlbSubDomains slbSubDomains) {
            this.slbSubDomains = slbSubDomains;
            return this;
        }

        /**
         * The number of domain name groups.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDNSSLBSubDomainsResponseBody build() {
            return new DescribeDNSSLBSubDomainsResponseBody(this);
        } 

    } 

    public static class LineAlgorithm extends TeaModel {
        @NameInMap("Line")
        private String line;

        @NameInMap("Open")
        private Boolean open;

        private LineAlgorithm(Builder builder) {
            this.line = builder.line;
            this.open = builder.open;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LineAlgorithm create() {
            return builder().build();
        }

        /**
         * @return line
         */
        public String getLine() {
            return this.line;
        }

        /**
         * @return open
         */
        public Boolean getOpen() {
            return this.open;
        }

        public static final class Builder {
            private String line; 
            private Boolean open; 

            /**
             * Line.
             */
            public Builder line(String line) {
                this.line = line;
                return this;
            }

            /**
             * Open.
             */
            public Builder open(Boolean open) {
                this.open = open;
                return this;
            }

            public LineAlgorithm build() {
                return new LineAlgorithm(this);
            } 

        } 

    }
    public static class LineAlgorithms extends TeaModel {
        @NameInMap("LineAlgorithm")
        private java.util.List < LineAlgorithm> lineAlgorithm;

        private LineAlgorithms(Builder builder) {
            this.lineAlgorithm = builder.lineAlgorithm;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LineAlgorithms create() {
            return builder().build();
        }

        /**
         * @return lineAlgorithm
         */
        public java.util.List < LineAlgorithm> getLineAlgorithm() {
            return this.lineAlgorithm;
        }

        public static final class Builder {
            private java.util.List < LineAlgorithm> lineAlgorithm; 

            /**
             * LineAlgorithm.
             */
            public Builder lineAlgorithm(java.util.List < LineAlgorithm> lineAlgorithm) {
                this.lineAlgorithm = lineAlgorithm;
                return this;
            }

            public LineAlgorithms build() {
                return new LineAlgorithms(this);
            } 

        } 

    }
    public static class SlbSubDomain extends TeaModel {
        @NameInMap("LineAlgorithms")
        private LineAlgorithms lineAlgorithms;

        @NameInMap("Open")
        private Boolean open;

        @NameInMap("RecordCount")
        private Long recordCount;

        @NameInMap("SubDomain")
        private String subDomain;

        @NameInMap("Type")
        private String type;

        private SlbSubDomain(Builder builder) {
            this.lineAlgorithms = builder.lineAlgorithms;
            this.open = builder.open;
            this.recordCount = builder.recordCount;
            this.subDomain = builder.subDomain;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlbSubDomain create() {
            return builder().build();
        }

        /**
         * @return lineAlgorithms
         */
        public LineAlgorithms getLineAlgorithms() {
            return this.lineAlgorithms;
        }

        /**
         * @return open
         */
        public Boolean getOpen() {
            return this.open;
        }

        /**
         * @return recordCount
         */
        public Long getRecordCount() {
            return this.recordCount;
        }

        /**
         * @return subDomain
         */
        public String getSubDomain() {
            return this.subDomain;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private LineAlgorithms lineAlgorithms; 
            private Boolean open; 
            private Long recordCount; 
            private String subDomain; 
            private String type; 

            /**
             * LineAlgorithms.
             */
            public Builder lineAlgorithms(LineAlgorithms lineAlgorithms) {
                this.lineAlgorithms = lineAlgorithms;
                return this;
            }

            /**
             * Indicates whether weighted round-robin is enabled for the subdomain.
             */
            public Builder open(Boolean open) {
                this.open = open;
                return this;
            }

            /**
             * The number of DNS records added for the subdomain.
             */
            public Builder recordCount(Long recordCount) {
                this.recordCount = recordCount;
                return this;
            }

            /**
             * The subdomain.
             */
            public Builder subDomain(String subDomain) {
                this.subDomain = subDomain;
                return this;
            }

            /**
             * The type of the DNS record that supports weighted round-robin. Valid values: A, AAAA, and CNAME.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SlbSubDomain build() {
                return new SlbSubDomain(this);
            } 

        } 

    }
    public static class SlbSubDomains extends TeaModel {
        @NameInMap("SlbSubDomain")
        private java.util.List < SlbSubDomain> slbSubDomain;

        private SlbSubDomains(Builder builder) {
            this.slbSubDomain = builder.slbSubDomain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlbSubDomains create() {
            return builder().build();
        }

        /**
         * @return slbSubDomain
         */
        public java.util.List < SlbSubDomain> getSlbSubDomain() {
            return this.slbSubDomain;
        }

        public static final class Builder {
            private java.util.List < SlbSubDomain> slbSubDomain; 

            /**
             * SlbSubDomain.
             */
            public Builder slbSubDomain(java.util.List < SlbSubDomain> slbSubDomain) {
                this.slbSubDomain = slbSubDomain;
                return this;
            }

            public SlbSubDomains build() {
                return new SlbSubDomains(this);
            } 

        } 

    }
}
