// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccessGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccessGroupsResponseBody</p>
 */
public class DescribeAccessGroupsResponseBody extends TeaModel {
    @NameInMap("AccessGroups")
    private AccessGroups accessGroups;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAccessGroupsResponseBody(Builder builder) {
        this.accessGroups = builder.accessGroups;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessGroups
     */
    public AccessGroups getAccessGroups() {
        return this.accessGroups;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private AccessGroups accessGroups; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The queried permission groups.
         */
        public Builder accessGroups(AccessGroups accessGroups) {
            this.accessGroups = accessGroups;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of permission groups returned per page.
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
         * The total number of permission groups.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAccessGroupsResponseBody build() {
            return new DescribeAccessGroupsResponseBody(this);
        } 

    } 

    public static class AccessGroup extends TeaModel {
        @NameInMap("AccessGroupName")
        private String accessGroupName;

        @NameInMap("AccessGroupType")
        private String accessGroupType;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("FileSystemType")
        private String fileSystemType;

        @NameInMap("MountTargetCount")
        private Integer mountTargetCount;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RuleCount")
        private Integer ruleCount;

        private AccessGroup(Builder builder) {
            this.accessGroupName = builder.accessGroupName;
            this.accessGroupType = builder.accessGroupType;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.fileSystemType = builder.fileSystemType;
            this.mountTargetCount = builder.mountTargetCount;
            this.regionId = builder.regionId;
            this.ruleCount = builder.ruleCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessGroup create() {
            return builder().build();
        }

        /**
         * @return accessGroupName
         */
        public String getAccessGroupName() {
            return this.accessGroupName;
        }

        /**
         * @return accessGroupType
         */
        public String getAccessGroupType() {
            return this.accessGroupType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fileSystemType
         */
        public String getFileSystemType() {
            return this.fileSystemType;
        }

        /**
         * @return mountTargetCount
         */
        public Integer getMountTargetCount() {
            return this.mountTargetCount;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return ruleCount
         */
        public Integer getRuleCount() {
            return this.ruleCount;
        }

        public static final class Builder {
            private String accessGroupName; 
            private String accessGroupType; 
            private String createTime; 
            private String description; 
            private String fileSystemType; 
            private Integer mountTargetCount; 
            private String regionId; 
            private Integer ruleCount; 

            /**
             * The name of the permission group.
             */
            public Builder accessGroupName(String accessGroupName) {
                this.accessGroupName = accessGroupName;
                return this;
            }

            /**
             * The network type of the permission group. Valid value: **Vpc**.
             */
            public Builder accessGroupType(String accessGroupType) {
                this.accessGroupType = accessGroupType;
                return this;
            }

            /**
             * The time when the permission group was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the permission group.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * FileSystemType.
             */
            public Builder fileSystemType(String fileSystemType) {
                this.fileSystemType = fileSystemType;
                return this;
            }

            /**
             * The number of mount targets to which the permission group is attached.
             */
            public Builder mountTargetCount(Integer mountTargetCount) {
                this.mountTargetCount = mountTargetCount;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The total number of rules in the permission group.
             */
            public Builder ruleCount(Integer ruleCount) {
                this.ruleCount = ruleCount;
                return this;
            }

            public AccessGroup build() {
                return new AccessGroup(this);
            } 

        } 

    }
    public static class AccessGroups extends TeaModel {
        @NameInMap("AccessGroup")
        private java.util.List < AccessGroup> accessGroup;

        private AccessGroups(Builder builder) {
            this.accessGroup = builder.accessGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessGroups create() {
            return builder().build();
        }

        /**
         * @return accessGroup
         */
        public java.util.List < AccessGroup> getAccessGroup() {
            return this.accessGroup;
        }

        public static final class Builder {
            private java.util.List < AccessGroup> accessGroup; 

            /**
             * AccessGroup.
             */
            public Builder accessGroup(java.util.List < AccessGroup> accessGroup) {
                this.accessGroup = accessGroup;
                return this;
            }

            public AccessGroups build() {
                return new AccessGroups(this);
            } 

        } 

    }
}
