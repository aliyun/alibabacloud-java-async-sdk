// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnWafDomainResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnWafDomainResponseBody</p>
 */
public class DescribeDcdnWafDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OutPutDomains")
    private java.util.List < OutPutDomains> outPutDomains;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDcdnWafDomainResponseBody(Builder builder) {
        this.outPutDomains = builder.outPutDomains;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafDomainResponseBody create() {
        return builder().build();
    }

    /**
     * @return outPutDomains
     */
    public java.util.List < OutPutDomains> getOutPutDomains() {
        return this.outPutDomains;
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
        private java.util.List < OutPutDomains> outPutDomains; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The accelerated domain name.
         */
        public Builder outPutDomains(java.util.List < OutPutDomains> outPutDomains) {
            this.outPutDomains = outPutDomains;
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
         * The number of accelerated domain names returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDcdnWafDomainResponseBody build() {
            return new DescribeDcdnWafDomainResponseBody(this);
        } 

    } 

    public static class OutPutDomains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclStatus")
        private Integer aclStatus;

        @com.aliyun.core.annotation.NameInMap("CcStatus")
        private Integer ccStatus;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("WafStatus")
        private Integer wafStatus;

        private OutPutDomains(Builder builder) {
            this.aclStatus = builder.aclStatus;
            this.ccStatus = builder.ccStatus;
            this.domain = builder.domain;
            this.status = builder.status;
            this.wafStatus = builder.wafStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutPutDomains create() {
            return builder().build();
        }

        /**
         * @return aclStatus
         */
        public Integer getAclStatus() {
            return this.aclStatus;
        }

        /**
         * @return ccStatus
         */
        public Integer getCcStatus() {
            return this.ccStatus;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return wafStatus
         */
        public Integer getWafStatus() {
            return this.wafStatus;
        }

        public static final class Builder {
            private Integer aclStatus; 
            private Integer ccStatus; 
            private String domain; 
            private Integer status; 
            private Integer wafStatus; 

            /**
             * The status of the ACL. Valid values:
             * <p>
             * 
             * *   0: disabled
             * *   1: enabled
             */
            public Builder aclStatus(Integer aclStatus) {
                this.aclStatus = aclStatus;
                return this;
            }

            /**
             * The status of protection against HTTP flood attacks. Valid values:
             * <p>
             * 
             * *   0: disabled
             * *   1: enabled
             */
            public Builder ccStatus(Integer ccStatus) {
                this.ccStatus = ccStatus;
                return this;
            }

            /**
             * The domain name that has WAF enabled.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The status of the domain name. Valid values:
             * <p>
             * 
             * *   1: The domain name is added to WAF, or the domain name is valid.
             * *   10: The domain name is being added to WAF.
             * *   11: The domain name failed to be added to WAF.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The status of WAF. Valid values:
             * <p>
             * 
             * *   0: disabled
             * *   1: enabled
             */
            public Builder wafStatus(Integer wafStatus) {
                this.wafStatus = wafStatus;
                return this;
            }

            public OutPutDomains build() {
                return new OutPutDomains(this);
            } 

        } 

    }
}
