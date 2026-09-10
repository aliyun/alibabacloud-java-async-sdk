// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeAgenticDBProjectsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAgenticDBProjectsResponseBody</p>
 */
public class DescribeAgenticDBProjectsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAgenticDBProjectsResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAgenticDBProjectsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
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
        private java.util.List<Items> items; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeAgenticDBProjectsResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of projects.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The current page number.</p>
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
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F6A7B8C9-D0E1-2345-FABC-456789012345</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAgenticDBProjectsResponseBody build() {
            return new DescribeAgenticDBProjectsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAgenticDBProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAgenticDBProjectsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("DefaultBranchId")
        private String defaultBranchId;

        @com.aliyun.core.annotation.NameInMap("DefaultBranchName")
        private String defaultBranchName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        private Items(Builder builder) {
            this.createTime = builder.createTime;
            this.DBClusterId = builder.DBClusterId;
            this.defaultBranchId = builder.defaultBranchId;
            this.defaultBranchName = builder.defaultBranchName;
            this.description = builder.description;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return defaultBranchId
         */
        public String getDefaultBranchId() {
            return this.defaultBranchId;
        }

        /**
         * @return defaultBranchName
         */
        public String getDefaultBranchName() {
            return this.defaultBranchName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String createTime; 
            private String DBClusterId; 
            private String defaultBranchId; 
            private String defaultBranchName; 
            private String description; 
            private String projectId; 
            private String projectName; 
            private String status; 
            private String tenantId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.createTime = model.createTime;
                this.DBClusterId = model.DBClusterId;
                this.defaultBranchId = model.defaultBranchId;
                this.defaultBranchName = model.defaultBranchName;
                this.description = model.description;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.status = model.status;
                this.tenantId = model.tenantId;
            } 

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-10T11:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The associated AgenticDB cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pagc-bp1abcdef1234567</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>The default branch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>br-1a2b3c4d5e6f</p>
             */
            public Builder defaultBranchId(String defaultBranchId) {
                this.defaultBranchId = defaultBranchId;
                return this;
            }

            /**
             * <p>The default branch name.</p>
             * 
             * <strong>example:</strong>
             * <p>main</p>
             */
            public Builder defaultBranchName(String defaultBranchName) {
                this.defaultBranchName = defaultBranchName;
                return this;
            }

            /**
             * <p>The description of the project.</p>
             * 
             * <strong>example:</strong>
             * <p>Production analytics database</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Project ID</p>
             * 
             * <strong>example:</strong>
             * <p>proj-a1b2c3d4e5f6</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The project name.</p>
             * 
             * <strong>example:</strong>
             * <p>analytics-prod</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tenant ID to which the project belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>t-4b83e0da66674951</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
