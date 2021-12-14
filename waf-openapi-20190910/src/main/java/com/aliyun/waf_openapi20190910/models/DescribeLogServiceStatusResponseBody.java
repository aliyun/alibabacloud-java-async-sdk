// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeLogServiceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogServiceStatusResponseBody</p>
 */
public class DescribeLogServiceStatusResponseBody extends TeaModel {
    @NameInMap("DomainStatus")
    private java.util.List < DomainStatus> domainStatus;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;


    private DescribeLogServiceStatusResponseBody(Builder builder) {
        this.domainStatus = builder.domainStatus;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogServiceStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainStatus
     */
    public java.util.List < DomainStatus> getDomainStatus() {
        return this.domainStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < DomainStatus> domainStatus; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>DomainStatus.</p>
         */
        public Builder domainStatus(java.util.List < DomainStatus> domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>TotalCount.</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLogServiceStatusResponseBody build() {
            return new DescribeLogServiceStatusResponseBody(this);
        } 

    } 

    public static class DomainStatus extends TeaModel {
        @NameInMap("Domain")
        private String domain;

        @NameInMap("SlsLogActive")
        private Integer slsLogActive;


        private DomainStatus(Builder builder) {
            this.domain = builder.domain;
            this.slsLogActive = builder.slsLogActive;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainStatus create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return slsLogActive
         */
        public Integer getSlsLogActive() {
            return this.slsLogActive;
        }

        public static final class Builder {
            private String domain; 
            private Integer slsLogActive; 

            /**
             * <p>Domain.</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>SlsLogActive.</p>
             */
            public Builder slsLogActive(Integer slsLogActive) {
                this.slsLogActive = slsLogActive;
                return this;
            }

            public DomainStatus build() {
                return new DomainStatus(this);
            } 

        } 

    }
}
