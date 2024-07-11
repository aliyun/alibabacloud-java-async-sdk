// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIpWhitelistResponseBody</p>
 */
public class DescribeIpWhitelistResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Groups")
    private Groups groups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeIpWhitelistResponseBody(Builder builder) {
        this.groups = builder.groups;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpWhitelistResponseBody create() {
        return builder().build();
    }

    /**
     * @return groups
     */
    public Groups getGroups() {
        return this.groups;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Groups groups; 
        private String requestId; 

        /**
         * Groups.
         */
        public Builder groups(Groups groups) {
            this.groups = groups;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeIpWhitelistResponseBody build() {
            return new DescribeIpWhitelistResponseBody(this);
        } 

    } 

    public static class IpList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        private java.util.List < String > ip;

        private IpList(Builder builder) {
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpList create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public java.util.List < String > getIp() {
            return this.ip;
        }

        public static final class Builder {
            private java.util.List < String > ip; 

            /**
             * Ip.
             */
            public Builder ip(java.util.List < String > ip) {
                this.ip = ip;
                return this;
            }

            public IpList build() {
                return new IpList(this);
            } 

        } 

    }
    public static class Group extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("IpList")
        private IpList ipList;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private Integer ipVersion;

        private Group(Builder builder) {
            this.groupName = builder.groupName;
            this.ipList = builder.ipList;
            this.ipVersion = builder.ipVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Group create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return ipList
         */
        public IpList getIpList() {
            return this.ipList;
        }

        /**
         * @return ipVersion
         */
        public Integer getIpVersion() {
            return this.ipVersion;
        }

        public static final class Builder {
            private String groupName; 
            private IpList ipList; 
            private Integer ipVersion; 

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * IpList.
             */
            public Builder ipList(IpList ipList) {
                this.ipList = ipList;
                return this;
            }

            /**
             * IpVersion.
             */
            public Builder ipVersion(Integer ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            public Group build() {
                return new Group(this);
            } 

        } 

    }
    public static class Groups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Group")
        private java.util.List < Group> group;

        private Groups(Builder builder) {
            this.group = builder.group;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return group
         */
        public java.util.List < Group> getGroup() {
            return this.group;
        }

        public static final class Builder {
            private java.util.List < Group> group; 

            /**
             * Group.
             */
            public Builder group(java.util.List < Group> group) {
                this.group = group;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
}
