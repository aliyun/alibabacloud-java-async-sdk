// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListNamespaceResponseBody} extends {@link TeaModel}
 *
 * <p>ListNamespaceResponseBody</p>
 */
public class ListNamespaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Code")
    private String code;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("TotalCount")
    private String totalCount;

    @NameInMap("Namespaces")
    private java.util.List < Namespaces> namespaces;


    private ListNamespaceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.code = builder.code;
        this.pageNo = builder.pageNo;
        this.isSuccess = builder.isSuccess;
        this.pageSize = builder.pageSize;
        this.totalCount = builder.totalCount;
        this.namespaces = builder.namespaces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNamespaceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return namespaces
     */
    public java.util.List < Namespaces> getNamespaces() {
        return this.namespaces;
    }

    public static final class Builder {
        private String requestId; 
        private String code; 
        private Integer pageNo; 
        private Boolean isSuccess; 
        private Integer pageSize; 
        private String totalCount; 
        private java.util.List < Namespaces> namespaces; 

        /**
         * <p>Request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Page number</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>Successful</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>Page size</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Total quantity</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>Namespace list</p>
         */
        public Builder namespaces(java.util.List < Namespaces> namespaces) {
            this.namespaces = namespaces;
            return this;
        }

        public ListNamespaceResponseBody build() {
            return new ListNamespaceResponseBody(this);
        } 

    } 

    public static class Namespaces extends TeaModel {
        @NameInMap("DefaultRepoType")
        private String defaultRepoType;

        @NameInMap("NamespaceStatus")
        private String namespaceStatus;

        @NameInMap("NamespaceId")
        private String namespaceId;

        @NameInMap("AutoCreateRepo")
        private Boolean autoCreateRepo;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("NamespaceName")
        private String namespaceName;


        private Namespaces(Builder builder) {
            this.defaultRepoType = builder.defaultRepoType;
            this.namespaceStatus = builder.namespaceStatus;
            this.namespaceId = builder.namespaceId;
            this.autoCreateRepo = builder.autoCreateRepo;
            this.instanceId = builder.instanceId;
            this.namespaceName = builder.namespaceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Namespaces create() {
            return builder().build();
        }

        /**
         * @return defaultRepoType
         */
        public String getDefaultRepoType() {
            return this.defaultRepoType;
        }

        /**
         * @return namespaceStatus
         */
        public String getNamespaceStatus() {
            return this.namespaceStatus;
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return autoCreateRepo
         */
        public Boolean getAutoCreateRepo() {
            return this.autoCreateRepo;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return namespaceName
         */
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public static final class Builder {
            private String defaultRepoType; 
            private String namespaceStatus; 
            private String namespaceId; 
            private Boolean autoCreateRepo; 
            private String instanceId; 
            private String namespaceName; 

            /**
             * <p>The default repository type. Valid values:

-"PUBLIC": public repository

-"PRIVATE": private repository</p>
             */
            public Builder defaultRepoType(String defaultRepoType) {
                this.defaultRepoType = defaultRepoType;
                return this;
            }

            /**
             * <p>The status of the namespace. Valid values:

-"NORMAL": Normal

-"DELETING": Deleting</p>
             */
            public Builder namespaceStatus(String namespaceStatus) {
                this.namespaceStatus = namespaceStatus;
                return this;
            }

            /**
             * <p>Namespace ID</p>
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * <p>Enable automatic vault creation</p>
             */
            public Builder autoCreateRepo(Boolean autoCreateRepo) {
                this.autoCreateRepo = autoCreateRepo;
                return this;
            }

            /**
             * <p>Instance ID</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Namespace name</p>
             */
            public Builder namespaceName(String namespaceName) {
                this.namespaceName = namespaceName;
                return this;
            }

            public Namespaces build() {
                return new Namespaces(this);
            } 

        } 

    }
}
