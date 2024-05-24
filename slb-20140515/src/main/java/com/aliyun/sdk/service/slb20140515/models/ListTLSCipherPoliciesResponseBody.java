// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTLSCipherPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTLSCipherPoliciesResponseBody</p>
 */
public class ListTLSCipherPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsTruncated")
    private Boolean isTruncated;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TLSCipherPolicies")
    private java.util.List < TLSCipherPolicies> TLSCipherPolicies;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListTLSCipherPoliciesResponseBody(Builder builder) {
        this.isTruncated = builder.isTruncated;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.TLSCipherPolicies = builder.TLSCipherPolicies;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTLSCipherPoliciesResponseBody create() {
        return builder().build();
    }

    /**
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return TLSCipherPolicies
     */
    public java.util.List < TLSCipherPolicies> getTLSCipherPolicies() {
        return this.TLSCipherPolicies;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Boolean isTruncated; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < TLSCipherPolicies> TLSCipherPolicies; 
        private Integer totalCount; 

        /**
         * Indicates whether the current page is the last page. Valid values:
         * <p>
         * 
         * *   **true**: The current page is the last page.
         * *   **false**: The current page is not the last page.
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * The token that is used for the next query. Valid values:
         * <p>
         * 
         * *   If **NextToken** is empty, it indicates that no next query is to be sent.
         * *   If **NextToken** is not empty, the value indicates the token that is used for the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * The list of TLS policies.
         */
        public Builder TLSCipherPolicies(java.util.List < TLSCipherPolicies> TLSCipherPolicies) {
            this.TLSCipherPolicies = TLSCipherPolicies;
            return this;
        }

        /**
         * The total number of TLS policies returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTLSCipherPoliciesResponseBody build() {
            return new ListTLSCipherPoliciesResponseBody(this);
        } 

    } 

    public static class RelateListeners extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        private RelateListeners(Builder builder) {
            this.loadBalancerId = builder.loadBalancerId;
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelateListeners create() {
            return builder().build();
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String loadBalancerId; 
            private Integer port; 
            private String protocol; 

            /**
             * The ID of the CLB instance.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * The listening port. Valid values: **1** to **65535**.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The listening protocol. Valid values:
             * <p>
             * 
             * *   **TCP**
             * *   **UDP**
             * *   **HTTP**
             * *   **HTTPS**
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public RelateListeners build() {
                return new RelateListeners(this);
            } 

        } 

    }
    public static class TLSCipherPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ciphers")
        private java.util.List < String > ciphers;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RelateListeners")
        private java.util.List < RelateListeners> relateListeners;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TLSVersions")
        private java.util.List < String > TLSVersions;

        private TLSCipherPolicies(Builder builder) {
            this.ciphers = builder.ciphers;
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.relateListeners = builder.relateListeners;
            this.status = builder.status;
            this.TLSVersions = builder.TLSVersions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TLSCipherPolicies create() {
            return builder().build();
        }

        /**
         * @return ciphers
         */
        public java.util.List < String > getCiphers() {
            return this.ciphers;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return relateListeners
         */
        public java.util.List < RelateListeners> getRelateListeners() {
            return this.relateListeners;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return TLSVersions
         */
        public java.util.List < String > getTLSVersions() {
            return this.TLSVersions;
        }

        public static final class Builder {
            private java.util.List < String > ciphers; 
            private Long createTime; 
            private String instanceId; 
            private String name; 
            private java.util.List < RelateListeners> relateListeners; 
            private String status; 
            private java.util.List < String > TLSVersions; 

            /**
             * The cipher suites supported by the TLS version.
             * <p>
             * 
             * TLS 1.0 and TLS 1.1 support the following cipher suites:
             * 
             * *   ECDHE-ECDSA-AES128-SHA
             * *   ECDHE-ECDSA-AES256-SHA
             * *   ECDHE-RSA-AES128-SHA
             * *   ECDHE-RSA-AES256-SHA
             * *   AES128-SHA AES256-SHA
             * *   DES-CBC3-SHA
             * 
             * TLS 1.2 supports the following cipher suites:
             * 
             * *   ECDHE-ECDSA-AES128-SHA
             * *   ECDHE-ECDSA-AES256-SHA
             * *   ECDHE-RSA-AES128-SHA
             * *   ECDHE-RSA-AES256-SHA
             * *   AES128-SHA AES256-SHA
             * *   DES-CBC3-SHA
             * *   ECDHE-ECDSA-AES128-GCM-SHA256
             * *   ECDHE-ECDSA-AES256-GCM-SHA384
             * *   ECDHE-ECDSA-AES128-SHA256
             * *   ECDHE-ECDSA-AES256-SHA384
             * *   ECDHE-RSA-AES128-GCM-SHA256
             * *   ECDHE-RSA-AES256-GCM-SHA384
             * *   ECDHE-RSA-AES128-SHA256
             * *   ECDHE-RSA-AES256-SHA384
             * *   AES128-GCM-SHA256
             * *   AES256-GCM-SHA384
             * *   AES128-SHA256 AES256-SHA256
             * 
             * TLS 1.3 supports the following cipher suites:
             * 
             * *   TLS_AES\_128\_GCM_SHA256
             * *   TLS_AES\_256\_GCM_SHA384
             * *   TLS_CHACHA20\_POLY1305\_SHA256
             * *   TLS_AES\_128\_CCM_SHA256
             * *   TLS_AES\_128\_CCM\_8\_SHA256
             */
            public Builder ciphers(java.util.List < String > ciphers) {
                this.ciphers = ciphers;
                return this;
            }

            /**
             * The timestamp generated when the TLS policy is created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the TLS policy.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the TLS policy.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The list of associated listeners.
             */
            public Builder relateListeners(java.util.List < RelateListeners> relateListeners) {
                this.relateListeners = relateListeners;
                return this;
            }

            /**
             * The status of the TLS policy. Valid values:
             * <p>
             * 
             * *   **configuring**: The TLS policy is being configured.
             * *   **normal**: The TLS policy works as expected.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The version of the TLS protocol.
             */
            public Builder TLSVersions(java.util.List < String > TLSVersions) {
                this.TLSVersions = TLSVersions;
                return this;
            }

            public TLSCipherPolicies build() {
                return new TLSCipherPolicies(this);
            } 

        } 

    }
}
