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
         * Branch.
         */
        public Builder branch(Branch branch) {
            this.branch = branch;
            return this;
        }

        /**
         * RequestId.
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
             * ComputeEndpoint.
             */
            public Builder computeEndpoint(String computeEndpoint) {
                this.computeEndpoint = computeEndpoint;
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
