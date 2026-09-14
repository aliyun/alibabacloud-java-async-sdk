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
 * {@link ListCrossProjectDeploymentEnvironmentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCrossProjectDeploymentEnvironmentsResponseBody</p>
 */
public class ListCrossProjectDeploymentEnvironmentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListCrossProjectDeploymentEnvironmentsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCrossProjectDeploymentEnvironmentsResponseBody create() {
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

        private Builder(ListCrossProjectDeploymentEnvironmentsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business response.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;RequestId&quot;:&quot;735894D1-D5E5-50B8-8A6D-041C90A98B23&quot;,&quot;PageNumber&quot;:1,&quot;PageSize&quot;:10,&quot;TotalCount&quot;:1,&quot;DeploymentEnvironments&quot;:[{&quot;DeploymentEnvironmentId&quot;:101,&quot;Name&quot;:&quot;environment-101&quot;,&quot;SourceProjectId&quot;:10,&quot;TargetProjectId&quot;:20,&quot;TargetProjectName&quot;:&quot;target&quot;,&quot;Status&quot;:&quot;Enabled&quot;}]}</p>
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

        public ListCrossProjectDeploymentEnvironmentsResponseBody build() {
            return new ListCrossProjectDeploymentEnvironmentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCrossProjectDeploymentEnvironmentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCrossProjectDeploymentEnvironmentsResponseBody</p>
     */
    public static class DeploymentEnvironments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeploymentEnvironmentId")
        private Long deploymentEnvironmentId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SourceProjectId")
        private Long sourceProjectId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TargetProjectId")
        private Long targetProjectId;

        @com.aliyun.core.annotation.NameInMap("TargetProjectName")
        private String targetProjectName;

        private DeploymentEnvironments(Builder builder) {
            this.deploymentEnvironmentId = builder.deploymentEnvironmentId;
            this.name = builder.name;
            this.sourceProjectId = builder.sourceProjectId;
            this.status = builder.status;
            this.targetProjectId = builder.targetProjectId;
            this.targetProjectName = builder.targetProjectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeploymentEnvironments create() {
            return builder().build();
        }

        /**
         * @return deploymentEnvironmentId
         */
        public Long getDeploymentEnvironmentId() {
            return this.deploymentEnvironmentId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sourceProjectId
         */
        public Long getSourceProjectId() {
            return this.sourceProjectId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return targetProjectId
         */
        public Long getTargetProjectId() {
            return this.targetProjectId;
        }

        /**
         * @return targetProjectName
         */
        public String getTargetProjectName() {
            return this.targetProjectName;
        }

        public static final class Builder {
            private Long deploymentEnvironmentId; 
            private String name; 
            private Long sourceProjectId; 
            private String status; 
            private Long targetProjectId; 
            private String targetProjectName; 

            private Builder() {
            } 

            private Builder(DeploymentEnvironments model) {
                this.deploymentEnvironmentId = model.deploymentEnvironmentId;
                this.name = model.name;
                this.sourceProjectId = model.sourceProjectId;
                this.status = model.status;
                this.targetProjectId = model.targetProjectId;
                this.targetProjectName = model.targetProjectName;
            } 

            /**
             * <p>The cross-workspace deployment environment ID.</p>
             * 
             * <strong>example:</strong>
             * <p>101</p>
             */
            public Builder deploymentEnvironmentId(Long deploymentEnvironmentId) {
                this.deploymentEnvironmentId = deploymentEnvironmentId;
                return this;
            }

            /**
             * <p>The environment name.</p>
             * 
             * <strong>example:</strong>
             * <p>environment-101</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The source project workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder sourceProjectId(Long sourceProjectId) {
                this.sourceProjectId = sourceProjectId;
                return this;
            }

            /**
             * <p>The environment status.</p>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The target project workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder targetProjectId(Long targetProjectId) {
                this.targetProjectId = targetProjectId;
                return this;
            }

            /**
             * <p>The target project workspace name.</p>
             * 
             * <strong>example:</strong>
             * <p>target</p>
             */
            public Builder targetProjectName(String targetProjectName) {
                this.targetProjectName = targetProjectName;
                return this;
            }

            public DeploymentEnvironments build() {
                return new DeploymentEnvironments(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCrossProjectDeploymentEnvironmentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCrossProjectDeploymentEnvironmentsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeploymentEnvironments")
        private java.util.List<DeploymentEnvironments> deploymentEnvironments;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.deploymentEnvironments = builder.deploymentEnvironments;
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
         * @return deploymentEnvironments
         */
        public java.util.List<DeploymentEnvironments> getDeploymentEnvironments() {
            return this.deploymentEnvironments;
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
            private java.util.List<DeploymentEnvironments> deploymentEnvironments; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private String requestId; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.deploymentEnvironments = model.deploymentEnvironments;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.requestId = model.requestId;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of enabled cross-workspace deployment environments in the source project.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;DeploymentEnvironmentId&quot;:101,&quot;Name&quot;:&quot;environment-101&quot;,&quot;SourceProjectId&quot;:10,&quot;TargetProjectId&quot;:20,&quot;TargetProjectName&quot;:&quot;target&quot;,&quot;Status&quot;:&quot;Enabled&quot;}]</p>
             */
            public Builder deploymentEnvironments(java.util.List<DeploymentEnvironments> deploymentEnvironments) {
                this.deploymentEnvironments = deploymentEnvironments;
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
