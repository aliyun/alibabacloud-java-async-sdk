// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link DescribeInstanceIpWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceIpWhitelistResponseBody</p>
 */
public class DescribeInstanceIpWhitelistResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("IpWhiteListGroups")
    private java.util.List<IpWhiteListGroups> ipWhiteListGroups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceIpWhitelistResponseBody(Builder builder) {
        this.instanceName = builder.instanceName;
        this.ipWhiteListGroups = builder.ipWhiteListGroups;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceIpWhitelistResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return ipWhiteListGroups
     */
    public java.util.List<IpWhiteListGroups> getIpWhiteListGroups() {
        return this.ipWhiteListGroups;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String instanceName; 
        private java.util.List<IpWhiteListGroups> ipWhiteListGroups; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeInstanceIpWhitelistResponseBody model) {
            this.instanceName = model.instanceName;
            this.ipWhiteListGroups = model.ipWhiteListGroups;
            this.requestId = model.requestId;
        } 

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * IpWhiteListGroups.
         */
        public Builder ipWhiteListGroups(java.util.List<IpWhiteListGroups> ipWhiteListGroups) {
            this.ipWhiteListGroups = ipWhiteListGroups;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceIpWhitelistResponseBody build() {
            return new DescribeInstanceIpWhitelistResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceIpWhitelistResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceIpWhitelistResponseBody</p>
     */
    public static class IpWhiteListGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("IpWhitelist")
        private String ipWhitelist;

        private IpWhiteListGroups(Builder builder) {
            this.groupName = builder.groupName;
            this.ipWhitelist = builder.ipWhitelist;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpWhiteListGroups create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return ipWhitelist
         */
        public String getIpWhitelist() {
            return this.ipWhitelist;
        }

        public static final class Builder {
            private String groupName; 
            private String ipWhitelist; 

            private Builder() {
            } 

            private Builder(IpWhiteListGroups model) {
                this.groupName = model.groupName;
                this.ipWhitelist = model.ipWhitelist;
            } 

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * IpWhitelist.
             */
            public Builder ipWhitelist(String ipWhitelist) {
                this.ipWhitelist = ipWhitelist;
                return this;
            }

            public IpWhiteListGroups build() {
                return new IpWhiteListGroups(this);
            } 

        } 

    }
}
