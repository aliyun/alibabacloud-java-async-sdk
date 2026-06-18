// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ListBranchesResponseBody} extends {@link TeaModel}
 *
 * <p>ListBranchesResponseBody</p>
 */
public class ListBranchesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Branches")
    private Branches branches;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListBranchesResponseBody(Builder builder) {
        this.branches = builder.branches;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBranchesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return branches
     */
    public Branches getBranches() {
        return this.branches;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private Branches branches; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListBranchesResponseBody model) {
            this.branches = model.branches;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Branches.
         */
        public Builder branches(Branches branches) {
            this.branches = branches;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListBranchesResponseBody build() {
            return new ListBranchesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBranchesResponseBody} extends {@link TeaModel}
     *
     * <p>ListBranchesResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListBranchesResponseBody} extends {@link TeaModel}
     *
     * <p>ListBranchesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListBranchesResponseBody} extends {@link TeaModel}
     *
     * <p>ListBranchesResponseBody</p>
     */
    public static class Branch extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BranchId")
        private String branchId;

        @com.aliyun.core.annotation.NameInMap("BranchName")
        private String branchName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExpiresAt")
        private String expiresAt;

        @com.aliyun.core.annotation.NameInMap("InitSource")
        private String initSource;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("ParentBranchId")
        private String parentBranchId;

        @com.aliyun.core.annotation.NameInMap("ParentBranchName")
        private String parentBranchName;

        @com.aliyun.core.annotation.NameInMap("ParentLSN")
        private String parentLSN;

        @com.aliyun.core.annotation.NameInMap("ParentTimestamp")
        private String parentTimestamp;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("Protected")
        private Boolean _protected;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private String serviceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        private Branch(Builder builder) {
            this.branchId = builder.branchId;
            this.branchName = builder.branchName;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.expiresAt = builder.expiresAt;
            this.initSource = builder.initSource;
            this.isDefault = builder.isDefault;
            this.parentBranchId = builder.parentBranchId;
            this.parentBranchName = builder.parentBranchName;
            this.parentLSN = builder.parentLSN;
            this.parentTimestamp = builder.parentTimestamp;
            this.projectId = builder.projectId;
            this._protected = builder._protected;
            this.serviceType = builder.serviceType;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Branch create() {
            return builder().build();
        }

        /**
         * @return branchId
         */
        public String getBranchId() {
            return this.branchId;
        }

        /**
         * @return branchName
         */
        public String getBranchName() {
            return this.branchName;
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
         * @return expiresAt
         */
        public String getExpiresAt() {
            return this.expiresAt;
        }

        /**
         * @return initSource
         */
        public String getInitSource() {
            return this.initSource;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return parentBranchId
         */
        public String getParentBranchId() {
            return this.parentBranchId;
        }

        /**
         * @return parentBranchName
         */
        public String getParentBranchName() {
            return this.parentBranchName;
        }

        /**
         * @return parentLSN
         */
        public String getParentLSN() {
            return this.parentLSN;
        }

        /**
         * @return parentTimestamp
         */
        public String getParentTimestamp() {
            return this.parentTimestamp;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return _protected
         */
        public Boolean get_protected() {
            return this._protected;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String branchId; 
            private String branchName; 
            private String createTime; 
            private String description; 
            private String expiresAt; 
            private String initSource; 
            private Boolean isDefault; 
            private String parentBranchId; 
            private String parentBranchName; 
            private String parentLSN; 
            private String parentTimestamp; 
            private String projectId; 
            private Boolean _protected; 
            private String serviceType; 
            private String status; 
            private Tags tags; 

            private Builder() {
            } 

            private Builder(Branch model) {
                this.branchId = model.branchId;
                this.branchName = model.branchName;
                this.createTime = model.createTime;
                this.description = model.description;
                this.expiresAt = model.expiresAt;
                this.initSource = model.initSource;
                this.isDefault = model.isDefault;
                this.parentBranchId = model.parentBranchId;
                this.parentBranchName = model.parentBranchName;
                this.parentLSN = model.parentLSN;
                this.parentTimestamp = model.parentTimestamp;
                this.projectId = model.projectId;
                this._protected = model._protected;
                this.serviceType = model.serviceType;
                this.status = model.status;
                this.tags = model.tags;
            } 

            /**
             * BranchId.
             */
            public Builder branchId(String branchId) {
                this.branchId = branchId;
                return this;
            }

            /**
             * BranchName.
             */
            public Builder branchName(String branchName) {
                this.branchName = branchName;
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
             * ExpiresAt.
             */
            public Builder expiresAt(String expiresAt) {
                this.expiresAt = expiresAt;
                return this;
            }

            /**
             * InitSource.
             */
            public Builder initSource(String initSource) {
                this.initSource = initSource;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * ParentBranchId.
             */
            public Builder parentBranchId(String parentBranchId) {
                this.parentBranchId = parentBranchId;
                return this;
            }

            /**
             * ParentBranchName.
             */
            public Builder parentBranchName(String parentBranchName) {
                this.parentBranchName = parentBranchName;
                return this;
            }

            /**
             * ParentLSN.
             */
            public Builder parentLSN(String parentLSN) {
                this.parentLSN = parentLSN;
                return this;
            }

            /**
             * ParentTimestamp.
             */
            public Builder parentTimestamp(String parentTimestamp) {
                this.parentTimestamp = parentTimestamp;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * Protected.
             */
            public Builder _protected(Boolean _protected) {
                this._protected = _protected;
                return this;
            }

            /**
             * ServiceType.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
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
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public Branch build() {
                return new Branch(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListBranchesResponseBody} extends {@link TeaModel}
     *
     * <p>ListBranchesResponseBody</p>
     */
    public static class Branches extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Branch")
        private java.util.List<Branch> branch;

        private Branches(Builder builder) {
            this.branch = builder.branch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Branches create() {
            return builder().build();
        }

        /**
         * @return branch
         */
        public java.util.List<Branch> getBranch() {
            return this.branch;
        }

        public static final class Builder {
            private java.util.List<Branch> branch; 

            private Builder() {
            } 

            private Builder(Branches model) {
                this.branch = model.branch;
            } 

            /**
             * Branch.
             */
            public Builder branch(java.util.List<Branch> branch) {
                this.branch = branch;
                return this;
            }

            public Branches build() {
                return new Branches(this);
            } 

        } 

    }
}
