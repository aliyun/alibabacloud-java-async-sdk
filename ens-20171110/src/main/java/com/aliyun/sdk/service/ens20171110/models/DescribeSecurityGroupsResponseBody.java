// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecurityGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityGroupsResponseBody</p>
 */
public class DescribeSecurityGroupsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityGroups")
    private SecurityGroups securityGroups;

    @NameInMap("TotalCount")
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

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Details about security groups.
         */
        public Builder securityGroups(SecurityGroups securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        /**
         * The total number of returned pages.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSecurityGroupsResponseBody build() {
            return new DescribeSecurityGroupsResponseBody(this);
        } 

    } 

    public static class SecurityGroup extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("InstanceCount")
        private Integer instanceCount;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("SecurityGroupName")
        private String securityGroupName;

        private SecurityGroup(Builder builder) {
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.instanceCount = builder.instanceCount;
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
            private String securityGroupId; 
            private String securityGroupName; 

            /**
             * The time when the security group was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. The time is displayed in UTC. The format is yyyy-MM-ddThh:mmZ.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the security group.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The number of associated instances.
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * The ID of the security group.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The name of the security group.
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
    public static class SecurityGroups extends TeaModel {
        @NameInMap("SecurityGroup")
        private java.util.List < SecurityGroup> securityGroup;

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
        public java.util.List < SecurityGroup> getSecurityGroup() {
            return this.securityGroup;
        }

        public static final class Builder {
            private java.util.List < SecurityGroup> securityGroup; 

            /**
             * SecurityGroup.
             */
            public Builder securityGroup(java.util.List < SecurityGroup> securityGroup) {
                this.securityGroup = securityGroup;
                return this;
            }

            public SecurityGroups build() {
                return new SecurityGroups(this);
            } 

        } 

    }
}
