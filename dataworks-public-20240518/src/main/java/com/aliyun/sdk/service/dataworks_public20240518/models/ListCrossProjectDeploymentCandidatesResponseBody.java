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
 * {@link ListCrossProjectDeploymentCandidatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCrossProjectDeploymentCandidatesResponseBody</p>
 */
public class ListCrossProjectDeploymentCandidatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListCrossProjectDeploymentCandidatesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCrossProjectDeploymentCandidatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListCrossProjectDeploymentCandidatesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business response.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;RequestId&quot;:&quot;735894D1-D5E5-50B8-8A6D-041C90A98B23&quot;,&quot;PageNumber&quot;:1,&quot;PageSize&quot;:10,&quot;TotalCount&quot;:1,&quot;DeploymentCandidates&quot;:[{&quot;ObjectId&quot;:&quot;1&quot;,&quot;ObjectType&quot;:&quot;ODPS_SQL&quot;,&quot;ObjectName&quot;:&quot;object-1&quot;,&quot;ObjectVersion&quot;:&quot;7&quot;,&quot;ChangeType&quot;:&quot;ADD&quot;,&quot;CommitUser&quot;:&quot;operator&quot;,&quot;CommitTime&quot;:1788739200000}]}</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot this API call.</p>
         * 
         * <strong>example:</strong>
         * <p>735894D1-D5E5-50B8-8A6D-041C90A98B23</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCrossProjectDeploymentCandidatesResponseBody build() {
            return new ListCrossProjectDeploymentCandidatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCrossProjectDeploymentCandidatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCrossProjectDeploymentCandidatesResponseBody</p>
     */
    public static class DeploymentCandidates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeType")
        private String changeType;

        @com.aliyun.core.annotation.NameInMap("CommitTime")
        private Long commitTime;

        @com.aliyun.core.annotation.NameInMap("CommitUser")
        private String commitUser;

        @com.aliyun.core.annotation.NameInMap("ObjectId")
        private String objectId;

        @com.aliyun.core.annotation.NameInMap("ObjectName")
        private String objectName;

        @com.aliyun.core.annotation.NameInMap("ObjectType")
        private String objectType;

        @com.aliyun.core.annotation.NameInMap("ObjectVersion")
        private String objectVersion;

        private DeploymentCandidates(Builder builder) {
            this.changeType = builder.changeType;
            this.commitTime = builder.commitTime;
            this.commitUser = builder.commitUser;
            this.objectId = builder.objectId;
            this.objectName = builder.objectName;
            this.objectType = builder.objectType;
            this.objectVersion = builder.objectVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeploymentCandidates create() {
            return builder().build();
        }

        /**
         * @return changeType
         */
        public String getChangeType() {
            return this.changeType;
        }

        /**
         * @return commitTime
         */
        public Long getCommitTime() {
            return this.commitTime;
        }

        /**
         * @return commitUser
         */
        public String getCommitUser() {
            return this.commitUser;
        }

        /**
         * @return objectId
         */
        public String getObjectId() {
            return this.objectId;
        }

        /**
         * @return objectName
         */
        public String getObjectName() {
            return this.objectName;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        /**
         * @return objectVersion
         */
        public String getObjectVersion() {
            return this.objectVersion;
        }

        public static final class Builder {
            private String changeType; 
            private Long commitTime; 
            private String commitUser; 
            private String objectId; 
            private String objectName; 
            private String objectType; 
            private String objectVersion; 

            private Builder() {
            } 

            private Builder(DeploymentCandidates model) {
                this.changeType = model.changeType;
                this.commitTime = model.commitTime;
                this.commitUser = model.commitUser;
                this.objectId = model.objectId;
                this.objectName = model.objectName;
                this.objectType = model.objectType;
                this.objectVersion = model.objectVersion;
            } 

            /**
             * <p>The change type.</p>
             * 
             * <strong>example:</strong>
             * <p>ADD</p>
             */
            public Builder changeType(String changeType) {
                this.changeType = changeType;
                return this;
            }

            /**
             * <p>The commit time. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1788739200000</p>
             */
            public Builder commitTime(Long commitTime) {
                this.commitTime = commitTime;
                return this;
            }

            /**
             * <p>The committer.</p>
             * 
             * <strong>example:</strong>
             * <p>operator</p>
             */
            public Builder commitUser(String commitUser) {
                this.commitUser = commitUser;
                return this;
            }

            /**
             * <p>The candidate object ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * <p>The candidate object name.</p>
             * 
             * <strong>example:</strong>
             * <p>object-1</p>
             */
            public Builder objectName(String objectName) {
                this.objectName = objectName;
                return this;
            }

            /**
             * <p>The candidate object type.</p>
             * 
             * <strong>example:</strong>
             * <p>ODPS_SQL</p>
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * <p>The candidate object version.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder objectVersion(String objectVersion) {
                this.objectVersion = objectVersion;
                return this;
            }

            public DeploymentCandidates build() {
                return new DeploymentCandidates(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCrossProjectDeploymentCandidatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCrossProjectDeploymentCandidatesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeploymentCandidates")
        private java.util.List<DeploymentCandidates> deploymentCandidates;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.deploymentCandidates = builder.deploymentCandidates;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.requestId = builder.requestId;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deploymentCandidates
         */
        public java.util.List<DeploymentCandidates> getDeploymentCandidates() {
            return this.deploymentCandidates;
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
            private java.util.List<DeploymentCandidates> deploymentCandidates; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private String requestId; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.deploymentCandidates = model.deploymentCandidates;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.requestId = model.requestId;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of candidate objects from the source workspace that are available for cross-workspace deployment.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;ObjectId&quot;:&quot;1&quot;,&quot;ObjectType&quot;:&quot;ODPS_SQL&quot;,&quot;ObjectName&quot;:&quot;object-1&quot;,&quot;ObjectVersion&quot;:&quot;7&quot;,&quot;ChangeType&quot;:&quot;ADD&quot;,&quot;CommitUser&quot;:&quot;operator&quot;,&quot;CommitTime&quot;:1788739200000}]</p>
             */
            public Builder deploymentCandidates(java.util.List<DeploymentCandidates> deploymentCandidates) {
                this.deploymentCandidates = deploymentCandidates;
                return this;
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
             * <p>735894D1-D5E5-50B8-8A6D-041C90A98B23</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
