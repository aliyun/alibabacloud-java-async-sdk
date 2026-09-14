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
 * {@link DescribeBranchResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBranchResponseBody</p>
 */
public class DescribeBranchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Branch")
    private Branch branch;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeBranchResponseBody(Builder builder) {
        this.branch = builder.branch;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBranchResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return branch
     */
    public Branch getBranch() {
        return this.branch;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Branch branch; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeBranchResponseBody model) {
            this.branch = model.branch;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The branch information. Each element represents a Supabase branch.</p>
         */
        public Builder branch(Branch branch) {
            this.branch = branch;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBranchResponseBody build() {
            return new DescribeBranchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBranchResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBranchResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>dev</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBranchResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBranchResponseBody</p>
     */
    public static class Branch extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BranchId")
        private String branchId;

        @com.aliyun.core.annotation.NameInMap("BranchName")
        private String branchName;

        @com.aliyun.core.annotation.NameInMap("ComputeEndpoint")
        private String computeEndpoint;

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

        @com.aliyun.core.annotation.NameInMap("SpbProjectId")
        private String spbProjectId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private Branch(Builder builder) {
            this.branchId = builder.branchId;
            this.branchName = builder.branchName;
            this.computeEndpoint = builder.computeEndpoint;
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
            this.spbProjectId = builder.spbProjectId;
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
         * @return computeEndpoint
         */
        public String getComputeEndpoint() {
            return this.computeEndpoint;
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
         * @return spbProjectId
         */
        public String getSpbProjectId() {
            return this.spbProjectId;
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
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String branchId; 
            private String branchName; 
            private String computeEndpoint; 
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
            private String spbProjectId; 
            private String status; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(Branch model) {
                this.branchId = model.branchId;
                this.branchName = model.branchName;
                this.computeEndpoint = model.computeEndpoint;
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
                this.spbProjectId = model.spbProjectId;
                this.status = model.status;
                this.tags = model.tags;
            } 

            /**
             * <p>The branch ID, which uniquely identifies a Supabase branch.</p>
             * 
             * <strong>example:</strong>
             * <p>br-xxxx</p>
             */
            public Builder branchId(String branchId) {
                this.branchId = branchId;
                return this;
            }

            /**
             * <p>The branch name.</p>
             * 
             * <strong>example:</strong>
             * <p>dev</p>
             */
            public Builder branchName(String branchName) {
                this.branchName = branchName;
                return this;
            }

            /**
             * <p>The connection information of the compute node associated with the branch.</p>
             * 
             * <strong>example:</strong>
             * <p>postgresql://user:password@host:5432/db</p>
             */
            public Builder computeEndpoint(String computeEndpoint) {
                this.computeEndpoint = computeEndpoint;
                return this;
            }

            /**
             * <p>The time when the branch was created, in ISO 8601 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-08T09:11:12Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The branch description.</p>
             * 
             * <strong>example:</strong>
             * <p>test branch</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the branch expires and is automatically deleted, in ISO 8601 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-08T09:11:12Z</p>
             */
            public Builder expiresAt(String expiresAt) {
                this.expiresAt = expiresAt;
                return this;
            }

            /**
             * <p>The initialization source of the branch.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>ParentData: Copies the schema and data from the parent branch. This is the default value.</li>
             * <li>SchemaOnly: Copies only the schema structure.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ParentData</p>
             */
            public Builder initSource(String initSource) {
                this.initSource = initSource;
                return this;
            }

            /**
             * <p>Indicates whether this is the default branch.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The parent branch ID, which specifies the parent branch of a new branch or a query condition.</p>
             * 
             * <strong>example:</strong>
             * <p>br-main</p>
             */
            public Builder parentBranchId(String parentBranchId) {
                this.parentBranchId = parentBranchId;
                return this;
            }

            /**
             * <p>The parent branch name. This value is empty or displayed as - for the primary branch.</p>
             * 
             * <strong>example:</strong>
             * <p>main</p>
             */
            public Builder parentBranchName(String parentBranchName) {
                this.parentBranchName = parentBranchName;
                return this;
            }

            /**
             * <p>The LSN of the parent branch at the time this branch was created.</p>
             * 
             * <strong>example:</strong>
             * <p>0/3522648</p>
             */
            public Builder parentLSN(String parentLSN) {
                this.parentLSN = parentLSN;
                return this;
            }

            /**
             * <p>The data synchronization point in time selected from the parent branch when this branch was created, in ISO 8601 UTC format.</p>
             * <p>Description:</p>
             * <ul>
             * <li>For child branches, this value indicates the point in time of the parent branch selected during creation.</li>
             * <li>If no parent branch exists, the value 1970-01-01T00:00:00.000Z is returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2026-04-08T09:11:12Z</p>
             */
            public Builder parentTimestamp(String parentTimestamp) {
                this.parentTimestamp = parentTimestamp;
                return this;
            }

            /**
             * <p>The Supabase project ID that corresponds to the primary branch.</p>
             * 
             * <strong>example:</strong>
             * <p>spb-xxxx</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>Indicates whether branch protection is enabled. A value of true indicates that branch protection is enabled. A value of false indicates that branch protection is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder _protected(Boolean _protected) {
                this._protected = _protected;
                return this;
            }

            /**
             * <p>The service type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Supabase: Supabase service.</li>
             * <li>Memory: Memory service.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Supabase</p>
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * <p>The Supabase project ID that corresponds to the current branch.</p>
             * 
             * <strong>example:</strong>
             * <p>spb-xxxx</p>
             */
            public Builder spbProjectId(String spbProjectId) {
                this.spbProjectId = spbProjectId;
                return this;
            }

            /**
             * <p>The branch status.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The list of branch tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Branch build() {
                return new Branch(this);
            } 

        } 

    }
}
