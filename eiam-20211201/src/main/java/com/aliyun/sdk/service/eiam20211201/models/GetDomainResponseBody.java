// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDomainResponseBody} extends {@link TeaModel}
 *
 * <p>GetDomainResponseBody</p>
 */
public class GetDomainResponseBody extends TeaModel {
    @NameInMap("Domain")
    private Domain domain;

    @NameInMap("RequestId")
    private String requestId;

    private GetDomainResponseBody(Builder builder) {
        this.domain = builder.domain;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDomainResponseBody create() {
        return builder().build();
    }

    /**
     * @return domain
     */
    public Domain getDomain() {
        return this.domain;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Domain domain; 
        private String requestId; 

        /**
         * Domain.
         */
        public Builder domain(Domain domain) {
            this.domain = domain;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDomainResponseBody build() {
            return new GetDomainResponseBody(this);
        } 

    } 

    public static class Filing extends TeaModel {
        @NameInMap("IcpNumber")
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

            /**
             * 域名关联的备案号, 长度最大限制64。
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
    public static class Domain extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("DefaultDomain")
        private Boolean defaultDomain;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("DomainId")
        private String domainId;

        @NameInMap("DomainType")
        private String domainType;

        @NameInMap("Filing")
        private Filing filing;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("LockMode")
        private String lockMode;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private Domain(Builder builder) {
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

        public static Domain create() {
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

            /**
             * 域名创建时间，Unix时间戳格式，单位为毫秒。
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 是否默认域名。true表示实例默认域名，false表示非默认域名
             */
            public Builder defaultDomain(Boolean defaultDomain) {
                this.defaultDomain = defaultDomain;
                return this;
            }

            /**
             * 域名。
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * 域名ID。
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * 域名类型。枚举取值:system_init(系统初始化)、user_custom(用户自定义)。
             */
            public Builder domainType(String domainType) {
                this.domainType = domainType;
                return this;
            }

            /**
             * 域名备案信息。
             */
            public Builder filing(Filing filing) {
                this.filing = filing;
                return this;
            }

            /**
             * 实例ID。
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * 域名锁定状态。枚举取值:unlock(正常)、lockByLicense(因License限制不可用)。
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * 域名最近更新时间，Unix时间戳格式，单位为毫秒。
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Domain build() {
                return new Domain(this);
            } 

        } 

    }
}
