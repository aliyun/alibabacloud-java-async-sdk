// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainBasicConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainBasicConfigsResponseBody</p>
 */
public class DescribeDomainBasicConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainConfigs")
    private java.util.List < DomainConfigs> domainConfigs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDomainBasicConfigsResponseBody(Builder builder) {
        this.domainConfigs = builder.domainConfigs;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainBasicConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainConfigs
     */
    public java.util.List < DomainConfigs> getDomainConfigs() {
        return this.domainConfigs;
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
        private java.util.List < DomainConfigs> domainConfigs; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * DomainConfigs.
         */
        public Builder domainConfigs(java.util.List < DomainConfigs> domainConfigs) {
            this.domainConfigs = domainConfigs;
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

        public DescribeDomainBasicConfigsResponseBody build() {
            return new DescribeDomainBasicConfigsResponseBody(this);
        } 

    } 

    public static class DomainConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessType")
        private String accessType;

        @com.aliyun.core.annotation.NameInMap("AclStatus")
        private Integer aclStatus;

        @com.aliyun.core.annotation.NameInMap("CcMode")
        private Integer ccMode;

        @com.aliyun.core.annotation.NameInMap("CcStatus")
        private Integer ccStatus;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Long version;

        @com.aliyun.core.annotation.NameInMap("WafMode")
        private Integer wafMode;

        @com.aliyun.core.annotation.NameInMap("WafStatus")
        private Integer wafStatus;

        private DomainConfigs(Builder builder) {
            this.accessType = builder.accessType;
            this.aclStatus = builder.aclStatus;
            this.ccMode = builder.ccMode;
            this.ccStatus = builder.ccStatus;
            this.domain = builder.domain;
            this.owner = builder.owner;
            this.status = builder.status;
            this.version = builder.version;
            this.wafMode = builder.wafMode;
            this.wafStatus = builder.wafStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainConfigs create() {
            return builder().build();
        }

        /**
         * @return accessType
         */
        public String getAccessType() {
            return this.accessType;
        }

        /**
         * @return aclStatus
         */
        public Integer getAclStatus() {
            return this.aclStatus;
        }

        /**
         * @return ccMode
         */
        public Integer getCcMode() {
            return this.ccMode;
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
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        /**
         * @return wafMode
         */
        public Integer getWafMode() {
            return this.wafMode;
        }

        /**
         * @return wafStatus
         */
        public Integer getWafStatus() {
            return this.wafStatus;
        }

        public static final class Builder {
            private String accessType; 
            private Integer aclStatus; 
            private Integer ccMode; 
            private Integer ccStatus; 
            private String domain; 
            private String owner; 
            private Integer status; 
            private Long version; 
            private Integer wafMode; 
            private Integer wafStatus; 

            /**
             * AccessType.
             */
            public Builder accessType(String accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * AclStatus.
             */
            public Builder aclStatus(Integer aclStatus) {
                this.aclStatus = aclStatus;
                return this;
            }

            /**
             * CcMode.
             */
            public Builder ccMode(Integer ccMode) {
                this.ccMode = ccMode;
                return this;
            }

            /**
             * CcStatus.
             */
            public Builder ccStatus(Integer ccStatus) {
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
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            /**
             * WafMode.
             */
            public Builder wafMode(Integer wafMode) {
                this.wafMode = wafMode;
                return this;
            }

            /**
             * WafStatus.
             */
            public Builder wafStatus(Integer wafStatus) {
                this.wafStatus = wafStatus;
                return this;
            }

            public DomainConfigs build() {
                return new DomainConfigs(this);
            } 

        } 

    }
}
