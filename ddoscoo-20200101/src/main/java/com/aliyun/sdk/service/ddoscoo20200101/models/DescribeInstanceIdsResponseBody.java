// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeInstanceIdsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceIdsResponseBody</p>
 */
public class DescribeInstanceIdsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<InstanceIds> instanceIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceIdsResponseBody(Builder builder) {
        this.instanceIds = builder.instanceIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceIdsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public java.util.List<InstanceIds> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<InstanceIds> instanceIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeInstanceIdsResponseBody model) {
            this.instanceIds = model.instanceIds;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID, type, description, and IP version of the instance.</p>
         */
        public Builder instanceIds(java.util.List<InstanceIds> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceIdsResponseBody build() {
            return new DescribeInstanceIdsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceIdsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceIdsResponseBody</p>
     */
    public static class InstanceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Edition")
        private Integer edition;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IpMode")
        private String ipMode;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private String ipVersion;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        private InstanceIds(Builder builder) {
            this.edition = builder.edition;
            this.instanceId = builder.instanceId;
            this.ipMode = builder.ipMode;
            this.ipVersion = builder.ipVersion;
            this.remark = builder.remark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceIds create() {
            return builder().build();
        }

        /**
         * @return edition
         */
        public Integer getEdition() {
            return this.edition;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ipMode
         */
        public String getIpMode() {
            return this.ipMode;
        }

        /**
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private Integer edition; 
            private String instanceId; 
            private String ipMode; 
            private String ipVersion; 
            private String remark; 

            private Builder() {
            } 

            private Builder(InstanceIds model) {
                this.edition = model.edition;
                this.instanceId = model.instanceId;
                this.ipMode = model.ipMode;
                this.ipVersion = model.ipVersion;
                this.remark = model.remark;
            } 

            /**
             * <p>The type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Anti-DDoS Proxy (Outside Chinese Mainland) instance of the Insurance mitigation plan</li>
             * <li><strong>1</strong>: Anti-DDoS Proxy (Outside Chinese Mainland) instance of the Unlimited mitigation plan</li>
             * <li><strong>2</strong>: Anti-DDoS Proxy (Outside Chinese Mainland) instance of the CMA mitigation plan</li>
             * <li><strong>3</strong>: Anti-DDoS Proxy (Outside Chinese Mainland) instance of the Sec-CMA mitigation plan</li>
             * <li><strong>9</strong>: Anti-DDoS Proxy (Chinese Mainland) instance of the Profession mitigation plan</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder edition(Integer edition) {
                this.edition = edition;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ddoscoo-cn-zvp2eibz****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The IP address-based forwarding mode of the instance. Valid values:</p>
             * <ul>
             * <li><strong>fnat</strong>: Requests from IPv4 addresses are forwarded to origin servers that use IPv4 addresses and requests from IPv6 addresses are forwarded to origin servers that use IPv6 addresses.</li>
             * <li><strong>v6tov4</strong>: All requests are forwarded to origin servers that use IPv4 addresses.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>fnat</p>
             */
            public Builder ipMode(String ipMode) {
                this.ipMode = ipMode;
                return this;
            }

            /**
             * <p>The IP version of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Ipv4</strong></li>
             * <li><strong>Ipv6</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Ipv4</p>
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * <p>The description of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public InstanceIds build() {
                return new InstanceIds(this);
            } 

        } 

    }
}
