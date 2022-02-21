// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTLSCipherPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTLSCipherPoliciesResponseBody</p>
 */
public class ListTLSCipherPoliciesResponseBody extends TeaModel {
    @NameInMap("IsTruncated")
    private Boolean isTruncated;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TLSCipherPolicies")
    private java.util.List < TLSCipherPolicies> TLSCipherPolicies;

    @NameInMap("TotalCount")
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
         * IsTruncated.
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * TLSCipherPolicies.
         */
        public Builder TLSCipherPolicies(java.util.List < TLSCipherPolicies> TLSCipherPolicies) {
            this.TLSCipherPolicies = TLSCipherPolicies;
            return this;
        }

        /**
         * TotalCount.
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
        @NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("Protocol")
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
             * LoadBalancerId.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Protocol.
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
        @NameInMap("Ciphers")
        private java.util.List < String > ciphers;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Name")
        private String name;

        @NameInMap("RelateListeners")
        private java.util.List < RelateListeners> relateListeners;

        @NameInMap("Status")
        private String status;

        @NameInMap("TLSVersions")
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
             * Ciphers.
             */
            public Builder ciphers(java.util.List < String > ciphers) {
                this.ciphers = ciphers;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RelateListeners.
             */
            public Builder relateListeners(java.util.List < RelateListeners> relateListeners) {
                this.relateListeners = relateListeners;
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
             * TLSVersions.
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
