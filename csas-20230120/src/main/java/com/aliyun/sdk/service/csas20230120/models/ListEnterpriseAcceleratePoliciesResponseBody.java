// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListEnterpriseAcceleratePoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListEnterpriseAcceleratePoliciesResponseBody</p>
 */
public class ListEnterpriseAcceleratePoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Policies")
    private java.util.List<Policies> policies;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListEnterpriseAcceleratePoliciesResponseBody(Builder builder) {
        this.policies = builder.policies;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnterpriseAcceleratePoliciesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policies
     */
    public java.util.List<Policies> getPolicies() {
        return this.policies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<Policies> policies; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListEnterpriseAcceleratePoliciesResponseBody model) {
            this.policies = model.policies;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The list of policies.</p>
         */
        public Builder policies(java.util.List<Policies> policies) {
            this.policies = policies;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DB0471D0-C05C-556D-9F40-0325D890036F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of policies.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListEnterpriseAcceleratePoliciesResponseBody build() {
            return new ListEnterpriseAcceleratePoliciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEnterpriseAcceleratePoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnterpriseAcceleratePoliciesResponseBody</p>
     */
    public static class Policies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccelerationType")
        private String accelerationType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EapId")
        private String eapId;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Integer enabled;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OnTls")
        private Integer onTls;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ShowInClient")
        private Integer showInClient;

        @com.aliyun.core.annotation.NameInMap("UpstreamHost")
        private String upstreamHost;

        @com.aliyun.core.annotation.NameInMap("UpstreamPort")
        private Integer upstreamPort;

        @com.aliyun.core.annotation.NameInMap("UpstreamType")
        private String upstreamType;

        @com.aliyun.core.annotation.NameInMap("UserAttributeGroup")
        private String userAttributeGroup;

        private Policies(Builder builder) {
            this.accelerationType = builder.accelerationType;
            this.description = builder.description;
            this.eapId = builder.eapId;
            this.enabled = builder.enabled;
            this.name = builder.name;
            this.onTls = builder.onTls;
            this.priority = builder.priority;
            this.showInClient = builder.showInClient;
            this.upstreamHost = builder.upstreamHost;
            this.upstreamPort = builder.upstreamPort;
            this.upstreamType = builder.upstreamType;
            this.userAttributeGroup = builder.userAttributeGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
        }

        /**
         * @return accelerationType
         */
        public String getAccelerationType() {
            return this.accelerationType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return eapId
         */
        public String getEapId() {
            return this.eapId;
        }

        /**
         * @return enabled
         */
        public Integer getEnabled() {
            return this.enabled;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return onTls
         */
        public Integer getOnTls() {
            return this.onTls;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return showInClient
         */
        public Integer getShowInClient() {
            return this.showInClient;
        }

        /**
         * @return upstreamHost
         */
        public String getUpstreamHost() {
            return this.upstreamHost;
        }

        /**
         * @return upstreamPort
         */
        public Integer getUpstreamPort() {
            return this.upstreamPort;
        }

        /**
         * @return upstreamType
         */
        public String getUpstreamType() {
            return this.upstreamType;
        }

        /**
         * @return userAttributeGroup
         */
        public String getUserAttributeGroup() {
            return this.userAttributeGroup;
        }

        public static final class Builder {
            private String accelerationType; 
            private String description; 
            private String eapId; 
            private Integer enabled; 
            private String name; 
            private Integer onTls; 
            private Integer priority; 
            private Integer showInClient; 
            private String upstreamHost; 
            private Integer upstreamPort; 
            private String upstreamType; 
            private String userAttributeGroup; 

            private Builder() {
            } 

            private Builder(Policies model) {
                this.accelerationType = model.accelerationType;
                this.description = model.description;
                this.eapId = model.eapId;
                this.enabled = model.enabled;
                this.name = model.name;
                this.onTls = model.onTls;
                this.priority = model.priority;
                this.showInClient = model.showInClient;
                this.upstreamHost = model.upstreamHost;
                this.upstreamPort = model.upstreamPort;
                this.upstreamType = model.upstreamType;
                this.userAttributeGroup = model.userAttributeGroup;
            } 

            /**
             * <p>The acceleration pattern.</p>
             * <ul>
             * <li><p><strong>whitelist</strong>: accelerates access to applications in the whitelist.</p>
             * </li>
             * <li><p><strong>global</strong>: accelerates access to all applications.</p>
             * </li>
             * <li><p><strong>build-in-list:</strong> accelerates access to built-in applications.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>whitelist</p>
             */
            public Builder accelerationType(String accelerationType) {
                this.accelerationType = accelerationType;
                return this;
            }

            /**
             * <p>The description of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>这是一条测试策略。</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>eap-eec34d4b12fcca61</p>
             */
            public Builder eapId(String eapId) {
                this.eapId = eapId;
                return this;
            }

            /**
             * <p>Indicates whether the policy is enabled.</p>
             * <ul>
             * <li><p><strong>1</strong>: enabled</p>
             * </li>
             * <li><p><strong>0</strong>: disabled</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder enabled(Integer enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The policy name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether to enable Transport Layer Security (TLS).</p>
             * <ul>
             * <li><p><strong>0</strong>: disable</p>
             * </li>
             * <li><p><strong>1</strong>: enable</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder onTls(Integer onTls) {
                this.onTls = onTls;
                return this;
            }

            /**
             * <p>The policy priority.</p>
             * 
             * <strong>example:</strong>
             * <p>99</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>Indicates whether the policy is visible on the client.</p>
             * <ul>
             * <li><p><strong>0</strong>: not visible</p>
             * </li>
             * <li><p><strong>1</strong>: visible</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder showInClient(Integer showInClient) {
                this.showInClient = showInClient;
                return this;
            }

            /**
             * <p>The address of the acceleration instance. The address can be an IP address or a domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>12.34.56.XX</p>
             */
            public Builder upstreamHost(String upstreamHost) {
                this.upstreamHost = upstreamHost;
                return this;
            }

            /**
             * <p>The port of the acceleration instance. The port must be between 1000 and 60000.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder upstreamPort(Integer upstreamPort) {
                this.upstreamPort = upstreamPort;
                return this;
            }

            /**
             * <p>The acceleration instance.</p>
             * 
             * <strong>example:</strong>
             * <p>connector</p>
             */
            public Builder upstreamType(String upstreamType) {
                this.upstreamType = upstreamType;
                return this;
            }

            /**
             * <p>The user group for acceleration.</p>
             * 
             * <strong>example:</strong>
             * <p>测试用户组</p>
             */
            public Builder userAttributeGroup(String userAttributeGroup) {
                this.userAttributeGroup = userAttributeGroup;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
}
