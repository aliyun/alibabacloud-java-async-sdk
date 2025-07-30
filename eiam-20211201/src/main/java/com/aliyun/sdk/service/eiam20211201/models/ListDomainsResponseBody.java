// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDomainsResponseBody</p>
 */
public class ListDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Domains")
    private java.util.List<Domains> domains;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDomainsResponseBody(Builder builder) {
        this.domains = builder.domains;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDomainsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domains
     */
    public java.util.List<Domains> getDomains() {
        return this.domains;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Domains> domains; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDomainsResponseBody model) {
            this.domains = model.domains;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the domain names.</p>
         */
        public Builder domains(java.util.List<Domains> domains) {
            this.domains = domains;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDomainsResponseBody build() {
            return new ListDomainsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDomainsResponseBody</p>
     */
    public static class Filing extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IcpNumber")
        private String icpNumber;

        private Filing(Builder builder) {
            this.icpNumber = builder.icpNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filing create() {
            return builder().build();
        }

        /**
         * @return icpNumber
         */
        public String getIcpNumber() {
            return this.icpNumber;
        }

        public static final class Builder {
            private String icpNumber; 

            private Builder() {
            } 

            private Builder(Filing model) {
                this.icpNumber = model.icpNumber;
            } 

            /**
             * <p>The ICP number associated with the domain name. Both the entity ICP number and website ICP number are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhexx-xxxxxx</p>
             */
            public Builder icpNumber(String icpNumber) {
                this.icpNumber = icpNumber;
                return this;
            }

            public Filing build() {
                return new Filing(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDomainsResponseBody</p>
     */
    public static class Domains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DefaultDomain")
        private Boolean defaultDomain;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("DomainId")
        private String domainId;

        @com.aliyun.core.annotation.NameInMap("DomainType")
        private String domainType;

        @com.aliyun.core.annotation.NameInMap("Filing")
        private Filing filing;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private String lockMode;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Domains(Builder builder) {
            this.createTime = builder.createTime;
            this.defaultDomain = builder.defaultDomain;
            this.domain = builder.domain;
            this.domainId = builder.domainId;
            this.domainType = builder.domainType;
            this.filing = builder.filing;
            this.instanceId = builder.instanceId;
            this.lockMode = builder.lockMode;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domains create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return defaultDomain
         */
        public Boolean getDefaultDomain() {
            return this.defaultDomain;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return domainId
         */
        public String getDomainId() {
            return this.domainId;
        }

        /**
         * @return domainType
         */
        public String getDomainType() {
            return this.domainType;
        }

        /**
         * @return filing
         */
        public Filing getFiling() {
            return this.filing;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return lockMode
         */
        public String getLockMode() {
            return this.lockMode;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long createTime; 
            private Boolean defaultDomain; 
            private String domain; 
            private String domainId; 
            private String domainType; 
            private Filing filing; 
            private String instanceId; 
            private String lockMode; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Domains model) {
                this.createTime = model.createTime;
                this.defaultDomain = model.defaultDomain;
                this.domain = model.domain;
                this.domainId = model.domainId;
                this.domainType = model.domainType;
                this.filing = model.filing;
                this.instanceId = model.instanceId;
                this.lockMode = model.lockMode;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The time when the domain name was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1649830226000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Indicates whether the domain name is the default domain.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder defaultDomain(Boolean defaultDomain) {
                this.defaultDomain = defaultDomain;
                return this;
            }

            /**
             * <p>The domain.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The domain ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dm_examplexxxxx</p>
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * <p>The type of the domain name. Valid values:</p>
             * <ul>
             * <li>system_init: an initial domain name.</li>
             * <li>user_custom: a custom domain name.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>system_init</p>
             */
            public Builder domainType(String domainType) {
                this.domainType = domainType;
                return this;
            }

            /**
             * <p>The information about the Internet content provider (ICP) filing of the domain name.</p>
             */
            public Builder filing(Filing filing) {
                this.filing = filing;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Indicates whether the domain name is locked. Valid values:</p>
             * <ul>
             * <li>unlock</li>
             * <li>lockByLicense</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>unlock</p>
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * <p>The time when the domain name was last updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1649830226000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Domains build() {
                return new Domains(this);
            } 

        } 

    }
}
