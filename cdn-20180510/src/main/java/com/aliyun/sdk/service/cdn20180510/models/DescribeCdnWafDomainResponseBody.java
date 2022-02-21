// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnWafDomainResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnWafDomainResponseBody</p>
 */
public class DescribeCdnWafDomainResponseBody extends TeaModel {
    @NameInMap("OutPutDomains")
    private java.util.List < OutPutDomains> outPutDomains;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCdnWafDomainResponseBody(Builder builder) {
        this.outPutDomains = builder.outPutDomains;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnWafDomainResponseBody create() {
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
         * OutPutDomains.
         */
        public Builder outPutDomains(java.util.List < OutPutDomains> outPutDomains) {
            this.outPutDomains = outPutDomains;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCdnWafDomainResponseBody build() {
            return new DescribeCdnWafDomainResponseBody(this);
        } 

    } 

    public static class OutPutDomains extends TeaModel {
        @NameInMap("AclStatus")
        private String aclStatus;

        @NameInMap("CcStatus")
        private String ccStatus;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("Status")
        private String status;

        @NameInMap("WafStatus")
        private String wafStatus;

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
        public String getAclStatus() {
            return this.aclStatus;
        }

        /**
         * @return ccStatus
         */
        public String getCcStatus() {
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
        public String getStatus() {
            return this.status;
        }

        /**
         * @return wafStatus
         */
        public String getWafStatus() {
            return this.wafStatus;
        }

        public static final class Builder {
            private String aclStatus; 
            private String ccStatus; 
            private String domain; 
            private String status; 
            private String wafStatus; 

            /**
             * AclStatus.
             */
            public Builder aclStatus(String aclStatus) {
                this.aclStatus = aclStatus;
                return this;
            }

            /**
             * CcStatus.
             */
            public Builder ccStatus(String ccStatus) {
                this.ccStatus = ccStatus;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * WafStatus.
             */
            public Builder wafStatus(String wafStatus) {
                this.wafStatus = wafStatus;
                return this;
            }

            public OutPutDomains build() {
                return new OutPutDomains(this);
            } 

        } 

    }
}
