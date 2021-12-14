// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeDomainBasicConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainBasicConfigsResponseBody</p>
 */
public class DescribeDomainBasicConfigsResponseBody extends TeaModel {
    @NameInMap("DomainConfigs")
    private java.util.List < DomainConfigs> domainConfigs;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * <p>DomainConfigs.</p>
         */
        public Builder domainConfigs(java.util.List < DomainConfigs> domainConfigs) {
            this.domainConfigs = domainConfigs;
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

        public DescribeDomainBasicConfigsResponseBody build() {
            return new DescribeDomainBasicConfigsResponseBody(this);
        } 

    } 

    public static class DomainConfigs extends TeaModel {
        @NameInMap("AccessType")
        private String accessType;

        @NameInMap("AclStatus")
        private Integer aclStatus;

        @NameInMap("CcMode")
        private Integer ccMode;

        @NameInMap("CcStatus")
        private Integer ccStatus;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Version")
        private Long version;

        @NameInMap("WafMode")
        private Integer wafMode;

        @NameInMap("WafStatus")
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
             * <p>AccessType.</p>
             */
            public Builder accessType(String accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * <p>AclStatus.</p>
             */
            public Builder aclStatus(Integer aclStatus) {
                this.aclStatus = aclStatus;
                return this;
            }

            /**
             * <p>CcMode.</p>
             */
            public Builder ccMode(Integer ccMode) {
                this.ccMode = ccMode;
                return this;
            }

            /**
             * <p>CcStatus.</p>
             */
            public Builder ccStatus(Integer ccStatus) {
                this.ccStatus = ccStatus;
                return this;
            }

            /**
             * <p>Domain.</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>Owner.</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>Status.</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Version.</p>
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            /**
             * <p>WafMode.</p>
             */
            public Builder wafMode(Integer wafMode) {
                this.wafMode = wafMode;
                return this;
            }

            /**
             * <p>WafStatus.</p>
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
