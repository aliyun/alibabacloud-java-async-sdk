// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListProjectsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectsResponseBody</p>
 */
public class ListProjectsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListProjectsResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListProjectsResponseBody model) {
            this.pagingInfo = model.pagingInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6D24AD9A-652F-59E2-AC1F-05029300F8A4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListProjectsResponseBody build() {
            return new ListProjectsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class AliyunResourceTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private AliyunResourceTags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AliyunResourceTags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(AliyunResourceTags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>batch</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>blue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public AliyunResourceTags build() {
                return new AliyunResourceTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class Projects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunResourceGroupId")
        private String aliyunResourceGroupId;

        @com.aliyun.core.annotation.NameInMap("AliyunResourceTags")
        private java.util.List<AliyunResourceTags> aliyunResourceTags;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DevEnvironmentEnabled")
        private Boolean devEnvironmentEnabled;

        @com.aliyun.core.annotation.NameInMap("DevRoleDisabled")
        private Boolean devRoleDisabled;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("PaiTaskEnabled")
        private Boolean paiTaskEnabled;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Projects(Builder builder) {
            this.aliyunResourceGroupId = builder.aliyunResourceGroupId;
            this.aliyunResourceTags = builder.aliyunResourceTags;
            this.description = builder.description;
            this.devEnvironmentEnabled = builder.devEnvironmentEnabled;
            this.devRoleDisabled = builder.devRoleDisabled;
            this.displayName = builder.displayName;
            this.id = builder.id;
            this.name = builder.name;
            this.owner = builder.owner;
            this.paiTaskEnabled = builder.paiTaskEnabled;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Projects create() {
            return builder().build();
        }

        /**
         * @return aliyunResourceGroupId
         */
        public String getAliyunResourceGroupId() {
            return this.aliyunResourceGroupId;
        }

        /**
         * @return aliyunResourceTags
         */
        public java.util.List<AliyunResourceTags> getAliyunResourceTags() {
            return this.aliyunResourceTags;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return devEnvironmentEnabled
         */
        public Boolean getDevEnvironmentEnabled() {
            return this.devEnvironmentEnabled;
        }

        /**
         * @return devRoleDisabled
         */
        public Boolean getDevRoleDisabled() {
            return this.devRoleDisabled;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return paiTaskEnabled
         */
        public Boolean getPaiTaskEnabled() {
            return this.paiTaskEnabled;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String aliyunResourceGroupId; 
            private java.util.List<AliyunResourceTags> aliyunResourceTags; 
            private String description; 
            private Boolean devEnvironmentEnabled; 
            private Boolean devRoleDisabled; 
            private String displayName; 
            private Long id; 
            private String name; 
            private String owner; 
            private Boolean paiTaskEnabled; 
            private String status; 

            private Builder() {
            } 

            private Builder(Projects model) {
                this.aliyunResourceGroupId = model.aliyunResourceGroupId;
                this.aliyunResourceTags = model.aliyunResourceTags;
                this.description = model.description;
                this.devEnvironmentEnabled = model.devEnvironmentEnabled;
                this.devRoleDisabled = model.devRoleDisabled;
                this.displayName = model.displayName;
                this.id = model.id;
                this.name = model.name;
                this.owner = model.owner;
                this.paiTaskEnabled = model.paiTaskEnabled;
                this.status = model.status;
            } 

            /**
             * <p>The ID of the Alibaba Cloud resource group to which the workspace belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmzbn7pti3zfa</p>
             */
            public Builder aliyunResourceGroupId(String aliyunResourceGroupId) {
                this.aliyunResourceGroupId = aliyunResourceGroupId;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder aliyunResourceTags(java.util.List<AliyunResourceTags> aliyunResourceTags) {
                this.aliyunResourceTags = aliyunResourceTags;
                return this;
            }

            /**
             * <p>The description of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>Financial analysis group project data development</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the development environment is enabled. Valid values:</p>
             * <ul>
             * <li>true: The development environment is enabled. In this case, the development environment is isolated from the production environment in the workspace.</li>
             * <li>false: The development environment is disabled. In this case, only the production environment is used in the workspace.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder devEnvironmentEnabled(Boolean devEnvironmentEnabled) {
                this.devEnvironmentEnabled = devEnvironmentEnabled;
                return this;
            }

            /**
             * <p>Indicates whether the Develop role is disabled. Valid values:</p>
             * <ul>
             * <li>false (default)</li>
             * <li>true</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder devRoleDisabled(Boolean devRoleDisabled) {
                this.devRoleDisabled = devRoleDisabled;
                return this;
            }

            /**
             * <p>The display name of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>Sora financial analysis</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>sora_finance</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the workspace belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>123532153125</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>Indicates whether scheduling of PAI tasks is enabled. Valid values:</p>
             * <ul>
             * <li>true: Scheduling of PAI tasks is enabled. In this case, you can create a PAI node in a DataWorks workspace and configure scheduling properties for the node to implement periodic scheduling of PAI tasks.</li>
             * <li>false: Scheduling of PAI tasks is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder paiTaskEnabled(Boolean paiTaskEnabled) {
                this.paiTaskEnabled = paiTaskEnabled;
                return this;
            }

            /**
             * <p>The status of the workspace. Valid values:</p>
             * <ul>
             * <li>Available</li>
             * <li>Initializing</li>
             * <li>InitFailed</li>
             * <li>Forbidden</li>
             * <li>Deleting</li>
             * <li>DeleteFailed</li>
             * <li>Frozen</li>
             * <li>Updating</li>
             * <li>UpdateFailed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Projects build() {
                return new Projects(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectsResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Projects")
        private java.util.List<Projects> projects;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PagingInfo(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.projects = builder.projects;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
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
         * @return projects
         */
        public java.util.List<Projects> getProjects() {
            return this.projects;
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
            private java.util.List<Projects> projects; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PagingInfo model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.projects = model.projects;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The workspaces.</p>
             */
            public Builder projects(java.util.List<Projects> projects) {
                this.projects = projects;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
