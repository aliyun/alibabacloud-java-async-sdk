// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeIpAddressesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIpAddressesResponseBody</p>
 */
public class DescribeIpAddressesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IpAddresses")
    private java.util.List<IpAddresses> ipAddresses;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeIpAddressesResponseBody(Builder builder) {
        this.ipAddresses = builder.ipAddresses;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpAddressesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipAddresses
     */
    public java.util.List<IpAddresses> getIpAddresses() {
        return this.ipAddresses;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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

    public static final class Builder {
        private java.util.List<IpAddresses> ipAddresses; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeIpAddressesResponseBody model) {
            this.ipAddresses = model.ipAddresses;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * IpAddresses.
         */
        public Builder ipAddresses(java.util.List<IpAddresses> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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

        public DescribeIpAddressesResponseBody build() {
            return new DescribeIpAddressesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIpAddressesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIpAddressesResponseBody</p>
     */
    public static class IpAddresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateByWuying")
        private Boolean createByWuying;

        @com.aliyun.core.annotation.NameInMap("EipAddress")
        private String eipAddress;

        @com.aliyun.core.annotation.NameInMap("EipId")
        private String eipId;

        @com.aliyun.core.annotation.NameInMap("EipStatus")
        private String eipStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        private IpAddresses(Builder builder) {
            this.createByWuying = builder.createByWuying;
            this.eipAddress = builder.eipAddress;
            this.eipId = builder.eipId;
            this.eipStatus = builder.eipStatus;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpAddresses create() {
            return builder().build();
        }

        /**
         * @return createByWuying
         */
        public Boolean getCreateByWuying() {
            return this.createByWuying;
        }

        /**
         * @return eipAddress
         */
        public String getEipAddress() {
            return this.eipAddress;
        }

        /**
         * @return eipId
         */
        public String getEipId() {
            return this.eipId;
        }

        /**
         * @return eipStatus
         */
        public String getEipStatus() {
            return this.eipStatus;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private Boolean createByWuying; 
            private String eipAddress; 
            private String eipId; 
            private String eipStatus; 
            private String instanceId; 
            private String instanceType; 

            private Builder() {
            } 

            private Builder(IpAddresses model) {
                this.createByWuying = model.createByWuying;
                this.eipAddress = model.eipAddress;
                this.eipId = model.eipId;
                this.eipStatus = model.eipStatus;
                this.instanceId = model.instanceId;
                this.instanceType = model.instanceType;
            } 

            /**
             * CreateByWuying.
             */
            public Builder createByWuying(Boolean createByWuying) {
                this.createByWuying = createByWuying;
                return this;
            }

            /**
             * EipAddress.
             */
            public Builder eipAddress(String eipAddress) {
                this.eipAddress = eipAddress;
                return this;
            }

            /**
             * EipId.
             */
            public Builder eipId(String eipId) {
                this.eipId = eipId;
                return this;
            }

            /**
             * EipStatus.
             */
            public Builder eipStatus(String eipStatus) {
                this.eipStatus = eipStatus;
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
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public IpAddresses build() {
                return new IpAddresses(this);
            } 

        } 

    }
}
