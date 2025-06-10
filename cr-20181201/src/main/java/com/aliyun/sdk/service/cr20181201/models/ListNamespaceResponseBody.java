// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link ListNamespaceResponseBody} extends {@link TeaModel}
 *
 * <p>ListNamespaceResponseBody</p>
 */
public class ListNamespaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("Namespaces")
    private java.util.List<Namespaces> namespaces;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListNamespaceResponseBody(Builder builder) {
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.namespaces = builder.namespaces;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNamespaceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return namespaces
     */
    public java.util.List<Namespaces> getNamespaces() {
        return this.namespaces;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Boolean isSuccess; 
        private java.util.List<Namespaces> namespaces; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListNamespaceResponseBody model) {
            this.code = model.code;
            this.isSuccess = model.isSuccess;
            this.namespaces = model.namespaces;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request is successful.</li>
         * <li><code>false</code>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The queried namespaces.</p>
         */
        public Builder namespaces(java.util.List<Namespaces> namespaces) {
            this.namespaces = namespaces;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
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
         * <p>B7E5FCA5-55ED-451C-9649-0BB2B93387D0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of the queried namespaces.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListNamespaceResponseBody build() {
            return new ListNamespaceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNamespaceResponseBody} extends {@link TeaModel}
     *
     * <p>ListNamespaceResponseBody</p>
     */
    public static class Namespaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoCreateRepo")
        private Boolean autoCreateRepo;

        @com.aliyun.core.annotation.NameInMap("DefaultRepoConfiguration")
        private RepoConfiguration defaultRepoConfiguration;

        @com.aliyun.core.annotation.NameInMap("DefaultRepoType")
        @Deprecated
        private String defaultRepoType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("NamespaceName")
        private String namespaceName;

        @com.aliyun.core.annotation.NameInMap("NamespaceStatus")
        private String namespaceStatus;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        private Namespaces(Builder builder) {
            this.autoCreateRepo = builder.autoCreateRepo;
            this.defaultRepoConfiguration = builder.defaultRepoConfiguration;
            this.defaultRepoType = builder.defaultRepoType;
            this.instanceId = builder.instanceId;
            this.namespaceId = builder.namespaceId;
            this.namespaceName = builder.namespaceName;
            this.namespaceStatus = builder.namespaceStatus;
            this.resourceGroupId = builder.resourceGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Namespaces create() {
            return builder().build();
        }

        /**
         * @return autoCreateRepo
         */
        public Boolean getAutoCreateRepo() {
            return this.autoCreateRepo;
        }

        /**
         * @return defaultRepoConfiguration
         */
        public RepoConfiguration getDefaultRepoConfiguration() {
            return this.defaultRepoConfiguration;
        }

        /**
         * @return defaultRepoType
         */
        public String getDefaultRepoType() {
            return this.defaultRepoType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return namespaceName
         */
        public String getNamespaceName() {
            return this.namespaceName;
        }

        /**
         * @return namespaceStatus
         */
        public String getNamespaceStatus() {
            return this.namespaceStatus;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public static final class Builder {
            private Boolean autoCreateRepo; 
            private RepoConfiguration defaultRepoConfiguration; 
            private String defaultRepoType; 
            private String instanceId; 
            private String namespaceId; 
            private String namespaceName; 
            private String namespaceStatus; 
            private String resourceGroupId; 

            private Builder() {
            } 

            private Builder(Namespaces model) {
                this.autoCreateRepo = model.autoCreateRepo;
                this.defaultRepoConfiguration = model.defaultRepoConfiguration;
                this.defaultRepoType = model.defaultRepoType;
                this.instanceId = model.instanceId;
                this.namespaceId = model.namespaceId;
                this.namespaceName = model.namespaceName;
                this.namespaceStatus = model.namespaceStatus;
                this.resourceGroupId = model.resourceGroupId;
            } 

            /**
             * <p>Indicates whether the automatically creating repositories feature is enabled for the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoCreateRepo(Boolean autoCreateRepo) {
                this.autoCreateRepo = autoCreateRepo;
                return this;
            }

            /**
             * DefaultRepoConfiguration.
             */
            public Builder defaultRepoConfiguration(RepoConfiguration defaultRepoConfiguration) {
                this.defaultRepoConfiguration = defaultRepoConfiguration;
                return this;
            }

            /**
             * <p>The default type of repositories in the namespace. Valid values:</p>
             * <ul>
             * <li><code>PUBLIC</code>: public repositories.</li>
             * <li><code>PRIVATE</code>: private repositories.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PUBLIC</p>
             */
            public Builder defaultRepoType(String defaultRepoType) {
                this.defaultRepoType = defaultRepoType;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-94klsruryslx****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The namespace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>crn-tiw8t3f8i5lt****</p>
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * <p>The namespace name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder namespaceName(String namespaceName) {
                this.namespaceName = namespaceName;
                return this;
            }

            /**
             * <p>The status of the namespace. Valid values:</p>
             * <ul>
             * <li><code>NORMAL</code>: The namespace is normal.</li>
             * <li><code>DELETING</code>: The namespace is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder namespaceStatus(String namespaceStatus) {
                this.namespaceStatus = namespaceStatus;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfm4n5kzyf2fbi</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            public Namespaces build() {
                return new Namespaces(this);
            } 

        } 

    }
}
