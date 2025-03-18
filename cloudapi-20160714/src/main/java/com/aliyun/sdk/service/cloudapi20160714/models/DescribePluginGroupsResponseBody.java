// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link DescribePluginGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePluginGroupsResponseBody</p>
 */
public class DescribePluginGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupSummarys")
    private GroupSummarys groupSummarys;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribePluginGroupsResponseBody(Builder builder) {
        this.groupSummarys = builder.groupSummarys;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePluginGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupSummarys
     */
    public GroupSummarys getGroupSummarys() {
        return this.groupSummarys;
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
        private GroupSummarys groupSummarys; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribePluginGroupsResponseBody model) {
            this.groupSummarys = model.groupSummarys;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Collection of group information</p>
         */
        public Builder groupSummarys(GroupSummarys groupSummarys) {
            this.groupSummarys = groupSummarys;
            return this;
        }

        /**
         * <p>Pagination parameter: current page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Pagination parameter: number of items per page, default value 10</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>765BC99E-F583-5A80-9A42-42AC125C2CDC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of returned results</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePluginGroupsResponseBody build() {
            return new DescribePluginGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePluginGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePluginGroupsResponseBody</p>
     */
    public static class GroupPluginSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BasePath")
        private String basePath;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("StageAlias")
        private String stageAlias;

        @com.aliyun.core.annotation.NameInMap("StageName")
        private String stageName;

        private GroupPluginSummary(Builder builder) {
            this.basePath = builder.basePath;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.regionId = builder.regionId;
            this.stageAlias = builder.stageAlias;
            this.stageName = builder.stageName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupPluginSummary create() {
            return builder().build();
        }

        /**
         * @return basePath
         */
        public String getBasePath() {
            return this.basePath;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return stageAlias
         */
        public String getStageAlias() {
            return this.stageAlias;
        }

        /**
         * @return stageName
         */
        public String getStageName() {
            return this.stageName;
        }

        public static final class Builder {
            private String basePath; 
            private String description; 
            private String groupId; 
            private String groupName; 
            private String regionId; 
            private String stageAlias; 
            private String stageName; 

            private Builder() {
            } 

            private Builder(GroupPluginSummary model) {
                this.basePath = model.basePath;
                this.description = model.description;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.regionId = model.regionId;
                this.stageAlias = model.stageAlias;
                this.stageName = model.stageName;
            } 

            /**
             * <p>API root path</p>
             * 
             * <strong>example:</strong>
             * <p>/rpew</p>
             */
            public Builder basePath(String basePath) {
                this.basePath = basePath;
                return this;
            }

            /**
             * <p>Description</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>API group ID</p>
             * 
             * <strong>example:</strong>
             * <p>4ed31575e2de43de8c51eb1217a1f56b</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>API group name</p>
             * 
             * <strong>example:</strong>
             * <p>ECP_API</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>Region ID where the API group is located</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Stage name Alias</p>
             * 
             * <strong>example:</strong>
             * <p>DEV</p>
             */
            public Builder stageAlias(String stageAlias) {
                this.stageAlias = stageAlias;
                return this;
            }

            /**
             * <p>Environment name, possible values:</p>
             * <ul>
             * <li><strong>RELEASE</strong>: Production</li>
             * <li><strong>PRE</strong>: Pre-release</li>
             * <li><strong>TEST</strong>: Testing</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RELEASE</p>
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            public GroupPluginSummary build() {
                return new GroupPluginSummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePluginGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePluginGroupsResponseBody</p>
     */
    public static class GroupSummarys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupPluginSummary")
        private java.util.List<GroupPluginSummary> groupPluginSummary;

        private GroupSummarys(Builder builder) {
            this.groupPluginSummary = builder.groupPluginSummary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupSummarys create() {
            return builder().build();
        }

        /**
         * @return groupPluginSummary
         */
        public java.util.List<GroupPluginSummary> getGroupPluginSummary() {
            return this.groupPluginSummary;
        }

        public static final class Builder {
            private java.util.List<GroupPluginSummary> groupPluginSummary; 

            private Builder() {
            } 

            private Builder(GroupSummarys model) {
                this.groupPluginSummary = model.groupPluginSummary;
            } 

            /**
             * GroupPluginSummary.
             */
            public Builder groupPluginSummary(java.util.List<GroupPluginSummary> groupPluginSummary) {
                this.groupPluginSummary = groupPluginSummary;
                return this;
            }

            public GroupSummarys build() {
                return new GroupSummarys(this);
            } 

        } 

    }
}
