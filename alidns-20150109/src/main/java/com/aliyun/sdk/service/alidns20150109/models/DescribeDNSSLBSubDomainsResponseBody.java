// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDNSSLBSubDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDNSSLBSubDomainsResponseBody</p>
 */
public class DescribeDNSSLBSubDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlbSubDomains")
    private SlbSubDomains slbSubDomains;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The page number. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: <strong>1 to 100</strong>. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The subdomains for which weighted round-robin is enabled.</p>
         */
        public Builder slbSubDomains(SlbSubDomains slbSubDomains) {
            this.slbSubDomains = slbSubDomains;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDNSSLBSubDomainsResponseBody build() {
            return new DescribeDNSSLBSubDomainsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDNSSLBSubDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDNSSLBSubDomainsResponseBody</p>
     */
    public static class LineAlgorithm extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Line")
        private String line;

        @com.aliyun.core.annotation.NameInMap("Open")
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
             * <p>The DNS resolution line. The line can be China Telecom, China Mobile, and China Unicom.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder line(String line) {
                this.line = line;
                return this;
            }

            /**
             * <p>Indicates whether weighted round-robin is enabled for the line. Valid values:</p>
             * <ul>
             * <li><strong>true</strong> (default): Weighted round-robin is enabled.</li>
             * <li><strong>false</strong>: Weighted round-robin is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link DescribeDNSSLBSubDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDNSSLBSubDomainsResponseBody</p>
     */
    public static class LineAlgorithms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LineAlgorithm")
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
    /**
     * 
     * {@link DescribeDNSSLBSubDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDNSSLBSubDomainsResponseBody</p>
     */
    public static class SlbSubDomain extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LineAlgorithms")
        private LineAlgorithms lineAlgorithms;

        @com.aliyun.core.annotation.NameInMap("Open")
        private Boolean open;

        @com.aliyun.core.annotation.NameInMap("RecordCount")
        private Long recordCount;

        @com.aliyun.core.annotation.NameInMap("SubDomain")
        private String subDomain;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>The lines for which weighted round-robin is enabled.</p>
             */
            public Builder lineAlgorithms(LineAlgorithms lineAlgorithms) {
                this.lineAlgorithms = lineAlgorithms;
                return this;
            }

            /**
             * <p>Indicates whether weighted round-robin is enabled for the subdomain.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder open(Boolean open) {
                this.open = open;
                return this;
            }

            /**
             * <p>The number of DNS records added for the subdomain.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder recordCount(Long recordCount) {
                this.recordCount = recordCount;
                return this;
            }

            /**
             * <p>The subdomain name.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder subDomain(String subDomain) {
                this.subDomain = subDomain;
                return this;
            }

            /**
             * <p>The type of the Domain Name System (DNS) record that supports weighted round-robin. Valid values: A, AAAA, and CNAME.</p>
             * 
             * <strong>example:</strong>
             * <p>A</p>
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
    /**
     * 
     * {@link DescribeDNSSLBSubDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDNSSLBSubDomainsResponseBody</p>
     */
    public static class SlbSubDomains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SlbSubDomain")
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
