// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeSecurityGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityGroupsResponseBody</p>
 */
public class DescribeSecurityGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityGroups")
    private SecurityGroups securityGroups;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSecurityGroupsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.securityGroups = builder.securityGroups;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityGroups
     */
    public SecurityGroups getSecurityGroups() {
        return this.securityGroups;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private SecurityGroups securityGroups; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSecurityGroupsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.securityGroups = model.securityGroups;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Details about security groups.</p>
         */
        public Builder securityGroups(SecurityGroups securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        /**
         * <p>The total number of returned pages.</p>
         * 
         * <strong>example:</strong>
         * <p>49</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSecurityGroupsResponseBody build() {
            return new DescribeSecurityGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSecurityGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityGroupsResponseBody</p>
     */
    public static class InstanceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private java.util.List<String> instanceId;

        private InstanceIds(Builder builder) {
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceIds create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private java.util.List<String> instanceId; 

            private Builder() {
            } 

            private Builder(InstanceIds model) {
                this.instanceId = model.instanceId;
            } 

            /**
             * InstanceId.
             */
            public Builder instanceId(java.util.List<String> instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public InstanceIds build() {
                return new InstanceIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSecurityGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityGroupsResponseBody</p>
     */
    public static class NetworkInterfaceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
        private java.util.List<String> networkInterfaceId;

        private NetworkInterfaceIds(Builder builder) {
            this.networkInterfaceId = builder.networkInterfaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInterfaceIds create() {
            return builder().build();
        }

        /**
         * @return networkInterfaceId
         */
        public java.util.List<String> getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public static final class Builder {
            private java.util.List<String> networkInterfaceId; 

            private Builder() {
            } 

            private Builder(NetworkInterfaceIds model) {
                this.networkInterfaceId = model.networkInterfaceId;
            } 

            /**
             * NetworkInterfaceId.
             */
            public Builder networkInterfaceId(java.util.List<String> networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            public NetworkInterfaceIds build() {
                return new NetworkInterfaceIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSecurityGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityGroupsResponseBody</p>
     */
    public static class SecurityGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private Integer instanceCount;

        @com.aliyun.core.annotation.NameInMap("InstanceIds")
        private InstanceIds instanceIds;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceIds")
        private NetworkInterfaceIds networkInterfaceIds;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupName")
        private String securityGroupName;

        private SecurityGroup(Builder builder) {
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.instanceCount = builder.instanceCount;
            this.instanceIds = builder.instanceIds;
            this.networkInterfaceIds = builder.networkInterfaceIds;
            this.securityGroupId = builder.securityGroupId;
            this.securityGroupName = builder.securityGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroup create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceCount
         */
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return instanceIds
         */
        public InstanceIds getInstanceIds() {
            return this.instanceIds;
        }

        /**
         * @return networkInterfaceIds
         */
        public NetworkInterfaceIds getNetworkInterfaceIds() {
            return this.networkInterfaceIds;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return securityGroupName
         */
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        public static final class Builder {
            private String creationTime; 
            private String description; 
            private Integer instanceCount; 
            private InstanceIds instanceIds; 
            private NetworkInterfaceIds networkInterfaceIds; 
            private String securityGroupId; 
            private String securityGroupName; 

            private Builder() {
            } 

            private Builder(SecurityGroup model) {
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.instanceCount = model.instanceCount;
                this.instanceIds = model.instanceIds;
                this.networkInterfaceIds = model.networkInterfaceIds;
                this.securityGroupId = model.securityGroupId;
                this.securityGroupName = model.securityGroupName;
            } 

            /**
             * <p>The creation time. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-11-01T06:08:46Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>TestDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The number of associated instances.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * <p>The IDs of the instances that are associated with the security group.</p>
             */
            public Builder instanceIds(InstanceIds instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * <p>The IDs of the ENIs that are associated with the security group.</p>
             */
            public Builder networkInterfaceIds(NetworkInterfaceIds networkInterfaceIds) {
                this.networkInterfaceIds = networkInterfaceIds;
                return this;
            }

            /**
             * <p>The ID of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp67acfmxazb4ph***</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The name of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>DocTest</p>
             */
            public Builder securityGroupName(String securityGroupName) {
                this.securityGroupName = securityGroupName;
                return this;
            }

            public SecurityGroup build() {
                return new SecurityGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSecurityGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityGroupsResponseBody</p>
     */
    public static class SecurityGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityGroup")
        private java.util.List<SecurityGroup> securityGroup;

        private SecurityGroups(Builder builder) {
            this.securityGroup = builder.securityGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroups create() {
            return builder().build();
        }

        /**
         * @return securityGroup
         */
        public java.util.List<SecurityGroup> getSecurityGroup() {
            return this.securityGroup;
        }

        public static final class Builder {
            private java.util.List<SecurityGroup> securityGroup; 

            private Builder() {
            } 

            private Builder(SecurityGroups model) {
                this.securityGroup = model.securityGroup;
            } 

            /**
             * SecurityGroup.
             */
            public Builder securityGroup(java.util.List<SecurityGroup> securityGroup) {
                this.securityGroup = securityGroup;
                return this;
            }

            public SecurityGroups build() {
                return new SecurityGroups(this);
            } 

        } 

    }
}
