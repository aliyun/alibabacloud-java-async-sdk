// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListChartNamespaceResponseBody} extends {@link TeaModel}
 *
 * <p>ListChartNamespaceResponseBody</p>
 */
public class ListChartNamespaceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("Namespaces")
    private java.util.List < Namespaces> namespaces;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private String totalCount;

    private ListChartNamespaceResponseBody(Builder builder) {
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

    public static ListChartNamespaceResponseBody create() {
        return builder().build();
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
    public java.util.List < Namespaces> getNamespaces() {
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
        private java.util.List < Namespaces> namespaces; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private String totalCount; 

        /**
         * The return value.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * The namespaces.
         */
        public Builder namespaces(java.util.List < Namespaces> namespaces) {
            this.namespaces = namespaces;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListChartNamespaceResponseBody build() {
            return new ListChartNamespaceResponseBody(this);
        } 

    } 

    public static class Namespaces extends TeaModel {
        @NameInMap("AutoCreateRepo")
        private Boolean autoCreateRepo;

        @NameInMap("DefaultRepoType")
        private String defaultRepoType;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("NamespaceId")
        private String namespaceId;

        @NameInMap("NamespaceName")
        private String namespaceName;

        @NameInMap("NamespaceStatus")
        private String namespaceStatus;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        private Namespaces(Builder builder) {
            this.autoCreateRepo = builder.autoCreateRepo;
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
            private String defaultRepoType; 
            private String instanceId; 
            private String namespaceId; 
            private String namespaceName; 
            private String namespaceStatus; 
            private String resourceGroupId; 

            /**
             * Indicates whether a repository was automatically created when a chart is pushed to the namespace.
             */
            public Builder autoCreateRepo(Boolean autoCreateRepo) {
                this.autoCreateRepo = autoCreateRepo;
                return this;
            }

            /**
             * The default repository type. Valid values:
             * <p>
             * 
             * *   `PUBLIC`: a public repository
             * *   `PRIVATE`: a private repository
             */
            public Builder defaultRepoType(String defaultRepoType) {
                this.defaultRepoType = defaultRepoType;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the namespace.
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * The name of the namespace.
             */
            public Builder namespaceName(String namespaceName) {
                this.namespaceName = namespaceName;
                return this;
            }

            /**
             * The status of the namespace. Valid values:
             * <p>
             * 
             * *   `NORMAL`: The namespace is normal.
             * *   `DELETING`: The namespace is being deleted.
             */
            public Builder namespaceStatus(String namespaceStatus) {
                this.namespaceStatus = namespaceStatus;
                return this;
            }

            /**
             * ResourceGroupId.
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
