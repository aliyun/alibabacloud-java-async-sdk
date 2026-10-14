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
         * <p>The IDs, editions, remarks, and IP types of the Anti-DDoS Pro or Anti-DDoS Premium instances.</p>
         */
        public Builder instanceIds(java.util.List<InstanceIds> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>310A41FD-0990-5610-92E0-A6A55D7C6444</p>
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
             * <p>The edition of the instance. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Anti-DDoS Pro or Anti-DDoS Premium (outside the Chinese mainland) Insurance Edition.</li>
             * <li><strong>1</strong>: Anti-DDoS Pro or Anti-DDoS Premium (outside the Chinese mainland) Unlimited Edition.</li>
             * <li><strong>2</strong>: Anti-DDoS Pro or Anti-DDoS Premium (outside the Chinese mainland) Acceleration Line.</li>
             * <li><strong>3</strong>: Anti-DDoS Pro or Anti-DDoS Premium (outside the Chinese mainland) Secure Acceleration Line.</li>
             * <li><strong>9</strong>: Anti-DDoS Pro or Anti-DDoS Premium (the Chinese mainland) Professional Edition.</li>
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
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ddoscoo-cn-zvp2eibz****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The IP forwarding mode of the instance. Valid values:</p>
             * <ul>
             * <li><strong>fnat</strong>: The IP versions of the origin server and the client are the same. IPv4 client requests are forwarded to the IPv4 origin server, and IPv6 client requests are forwarded to the IPv6 origin server.</li>
             * <li><strong>v6tov4</strong>: Both IPv6 and IPv4 client requests are forwarded to the IPv4 origin server.</li>
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
             * <p>The IP protocol version of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Ipv4</strong>: IPv4.</li>
             * <li><strong>Ipv6</strong>: IPv6.</li>
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
             * <p>The remark of the instance.</p>
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
