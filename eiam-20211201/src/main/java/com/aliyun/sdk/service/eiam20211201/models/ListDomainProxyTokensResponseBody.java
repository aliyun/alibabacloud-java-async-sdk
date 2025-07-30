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
 * {@link ListDomainProxyTokensResponseBody} extends {@link TeaModel}
 *
 * <p>ListDomainProxyTokensResponseBody</p>
 */
public class ListDomainProxyTokensResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainProxyTokens")
    private java.util.List<DomainProxyTokens> domainProxyTokens;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDomainProxyTokensResponseBody(Builder builder) {
        this.domainProxyTokens = builder.domainProxyTokens;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDomainProxyTokensResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainProxyTokens
     */
    public java.util.List<DomainProxyTokens> getDomainProxyTokens() {
        return this.domainProxyTokens;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DomainProxyTokens> domainProxyTokens; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDomainProxyTokensResponseBody model) {
            this.domainProxyTokens = model.domainProxyTokens;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The proxy tokens of the domain name.</p>
         */
        public Builder domainProxyTokens(java.util.List<DomainProxyTokens> domainProxyTokens) {
            this.domainProxyTokens = domainProxyTokens;
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

        public ListDomainProxyTokensResponseBody build() {
            return new ListDomainProxyTokensResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDomainProxyTokensResponseBody} extends {@link TeaModel}
     *
     * <p>ListDomainProxyTokensResponseBody</p>
     */
    public static class DomainProxyTokens extends TeaModel {
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

        private DomainProxyTokens(Builder builder) {
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

        public static DomainProxyTokens create() {
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

            private Builder() {
            } 

            private Builder(DomainProxyTokens model) {
                this.createTime = model.createTime;
                this.domainId = model.domainId;
                this.domainProxyToken = model.domainProxyToken;
                this.domainProxyTokenId = model.domainProxyTokenId;
                this.instanceId = model.instanceId;
                this.lastUsedTime = model.lastUsedTime;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The time when the proxy token of the domain name was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1649830226000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The domain ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dm_examplexxxx</p>
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * <p>The proxy token of the domain.</p>
             * 
             * <strong>example:</strong>
             * <p>PTxxxxxxxx</p>
             */
            public Builder domainProxyToken(String domainProxyToken) {
                this.domainProxyToken = domainProxyToken;
                return this;
            }

            /**
             * <p>The ID of the proxy token of the domain.</p>
             * 
             * <strong>example:</strong>
             * <p>pt_examplexxxx</p>
             */
            public Builder domainProxyTokenId(String domainProxyTokenId) {
                this.domainProxyTokenId = domainProxyTokenId;
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
             * <p>The time when the proxy token of the domain name was last used. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1649830226000</p>
             */
            public Builder lastUsedTime(Long lastUsedTime) {
                this.lastUsedTime = lastUsedTime;
                return this;
            }

            /**
             * <p>The state of the proxy token. Valid values:</p>
             * <ul>
             * <li>enabled</li>
             * <li>disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the proxy token of the domain name was last updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1649830226000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public DomainProxyTokens build() {
                return new DomainProxyTokens(this);
            } 

        } 

    }
}
