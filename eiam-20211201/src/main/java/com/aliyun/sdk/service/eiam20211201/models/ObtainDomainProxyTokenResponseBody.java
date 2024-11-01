// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ObtainDomainProxyTokenResponseBody} extends {@link TeaModel}
 *
 * <p>ObtainDomainProxyTokenResponseBody</p>
 */
public class ObtainDomainProxyTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainProxyToken")
    private DomainProxyToken domainProxyToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ObtainDomainProxyTokenResponseBody(Builder builder) {
        this.domainProxyToken = builder.domainProxyToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObtainDomainProxyTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainProxyToken
     */
    public DomainProxyToken getDomainProxyToken() {
        return this.domainProxyToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DomainProxyToken domainProxyToken; 
        private String requestId; 

        /**
         * DomainProxyToken.
         */
        public Builder domainProxyToken(DomainProxyToken domainProxyToken) {
            this.domainProxyToken = domainProxyToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ObtainDomainProxyTokenResponseBody build() {
            return new ObtainDomainProxyTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ObtainDomainProxyTokenResponseBody} extends {@link TeaModel}
     *
     * <p>ObtainDomainProxyTokenResponseBody</p>
     */
    public static class DomainProxyToken extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DomainId")
        private String domainId;

        @com.aliyun.core.annotation.NameInMap("DomainProxyToken")
        private String domainProxyToken;

        @com.aliyun.core.annotation.NameInMap("DomainProxyTokenId")
        private String domainProxyTokenId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LastUsedTime")
        private Long lastUsedTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private DomainProxyToken(Builder builder) {
            this.createTime = builder.createTime;
            this.domainId = builder.domainId;
            this.domainProxyToken = builder.domainProxyToken;
            this.domainProxyTokenId = builder.domainProxyTokenId;
            this.instanceId = builder.instanceId;
            this.lastUsedTime = builder.lastUsedTime;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainProxyToken create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return domainId
         */
        public String getDomainId() {
            return this.domainId;
        }

        /**
         * @return domainProxyToken
         */
        public String getDomainProxyToken() {
            return this.domainProxyToken;
        }

        /**
         * @return domainProxyTokenId
         */
        public String getDomainProxyTokenId() {
            return this.domainProxyTokenId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return lastUsedTime
         */
        public Long getLastUsedTime() {
            return this.lastUsedTime;
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
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long createTime; 
            private String domainId; 
            private String domainProxyToken; 
            private String domainProxyTokenId; 
            private String instanceId; 
            private Long lastUsedTime; 
            private String status; 
            private Long updateTime; 

            /**
             * <p>域名代理Token创建时间，Unix时间戳格式，单位为毫秒。</p>
             * 
             * <strong>example:</strong>
             * <p>1649830226000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>域名ID。</p>
             * 
             * <strong>example:</strong>
             * <p>dm_examplexxxx</p>
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * <p>域名代理Token。</p>
             * 
             * <strong>example:</strong>
             * <p>PTxxxxxxxx</p>
             */
            public Builder domainProxyToken(String domainProxyToken) {
                this.domainProxyToken = domainProxyToken;
                return this;
            }

            /**
             * <p>域名代理Token ID。</p>
             * 
             * <strong>example:</strong>
             * <p>pt_examplexxxx</p>
             */
            public Builder domainProxyTokenId(String domainProxyTokenId) {
                this.domainProxyTokenId = domainProxyTokenId;
                return this;
            }

            /**
             * <p>实例ID。</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>域名代理Token最近使用时间，Unix时间戳格式，单位为毫秒。</p>
             * 
             * <strong>example:</strong>
             * <p>1649830226000</p>
             */
            public Builder lastUsedTime(Long lastUsedTime) {
                this.lastUsedTime = lastUsedTime;
                return this;
            }

            /**
             * <p>token状态，枚举类型：(enabled）启用,（disabled）禁用。</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>域名代理Token最近更新时间，Unix时间戳格式，单位为毫秒。</p>
             * 
             * <strong>example:</strong>
             * <p>1649830226000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public DomainProxyToken build() {
                return new DomainProxyToken(this);
            } 

        } 

    }
}
