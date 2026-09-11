// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link DescribeAccessGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccessGroupsResponseBody</p>
 */
public class DescribeAccessGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessGroups")
    private AccessGroups accessGroups;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeAccessGroupsResponseBody model) {
            this.accessGroups = model.accessGroups;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * AccessGroups.
         */
        public Builder accessGroups(AccessGroups accessGroups) {
            this.accessGroups = accessGroups;
            return this;
        }

        /**
         * <p>The page number of the list.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of permission groups on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2514F97E-FFF0-4A1F-BF04-729CEAC6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of permission groups.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAccessGroupsResponseBody build() {
            return new DescribeAccessGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAccessGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccessGroupsResponseBody</p>
     */
    public static class AccessGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessGroupName")
        private String accessGroupName;

        @com.aliyun.core.annotation.NameInMap("AccessGroupType")
        private String accessGroupType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FileSystemType")
        private String fileSystemType;

        @com.aliyun.core.annotation.NameInMap("MountTargetCount")
        private Integer mountTargetCount;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RuleCount")
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

            private Builder() {
            } 

            private Builder(AccessGroup model) {
                this.accessGroupName = model.accessGroupName;
                this.accessGroupType = model.accessGroupType;
                this.createTime = model.createTime;
                this.description = model.description;
                this.fileSystemType = model.fileSystemType;
                this.mountTargetCount = model.mountTargetCount;
                this.regionId = model.regionId;
                this.ruleCount = model.ruleCount;
            } 

            /**
             * AccessGroupName.
             */
            public Builder accessGroupName(String accessGroupName) {
                this.accessGroupName = accessGroupName;
                return this;
            }

            /**
             * AccessGroupType.
             */
            public Builder accessGroupType(String accessGroupType) {
                this.accessGroupType = accessGroupType;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
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
             * MountTargetCount.
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
             * RuleCount.
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
    /**
     * 
     * {@link DescribeAccessGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccessGroupsResponseBody</p>
     */
    public static class AccessGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessGroup")
        private java.util.List<AccessGroup> accessGroup;

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
        public java.util.List<AccessGroup> getAccessGroup() {
            return this.accessGroup;
        }

        public static final class Builder {
            private java.util.List<AccessGroup> accessGroup; 

            private Builder() {
            } 

            private Builder(AccessGroups model) {
                this.accessGroup = model.accessGroup;
            } 

            /**
             * AccessGroup.
             */
            public Builder accessGroup(java.util.List<AccessGroup> accessGroup) {
                this.accessGroup = accessGroup;
                return this;
            }

            public AccessGroups build() {
                return new AccessGroups(this);
            } 

        } 

    }
}
