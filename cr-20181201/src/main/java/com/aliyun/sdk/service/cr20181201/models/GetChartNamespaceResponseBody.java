// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChartNamespaceResponseBody} extends {@link TeaModel}
 *
 * <p>GetChartNamespaceResponseBody</p>
 */
public class GetChartNamespaceResponseBody extends TeaModel {
    @NameInMap("AutoCreateRepo")
    private Boolean autoCreateRepo;

    @NameInMap("Code")
    private String code;

    @NameInMap("DefaultRepoType")
    private String defaultRepoType;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("NamespaceId")
    private String namespaceId;

    @NameInMap("NamespaceName")
    private String namespaceName;

    @NameInMap("NamespaceStatus")
    private String namespaceStatus;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private GetChartNamespaceResponseBody(Builder builder) {
        this.autoCreateRepo = builder.autoCreateRepo;
        this.code = builder.code;
        this.defaultRepoType = builder.defaultRepoType;
        this.instanceId = builder.instanceId;
        this.isSuccess = builder.isSuccess;
        this.namespaceId = builder.namespaceId;
        this.namespaceName = builder.namespaceName;
        this.namespaceStatus = builder.namespaceStatus;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChartNamespaceResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoCreateRepo
     */
    public Boolean getAutoCreateRepo() {
        return this.autoCreateRepo;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder {
        private Boolean autoCreateRepo; 
        private String code; 
        private String defaultRepoType; 
        private String instanceId; 
        private Boolean isSuccess; 
        private String namespaceId; 
        private String namespaceName; 
        private String namespaceStatus; 
        private String requestId; 
        private String resourceGroupId; 

        /**
         * Indicates whether a repository was automatically created in the namespace. Valid values:
         * <p>
         * 
         * *   `true`: A repository was automatically created in the namespace.
         * *   `false`: No repository was automatically created in the namespace.
         */
        public Builder autoCreateRepo(Boolean autoCreateRepo) {
            this.autoCreateRepo = autoCreateRepo;
            return this;
        }

        /**
         * The return value.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The default repository type. Valid values:
         * <p>
         * 
         * *   `PUBLIC`: a public repository.
         * *   `PRIVATE`: a private repository.
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
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   `true`: The request is successful.
         * *   `false`: The request fails.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        public GetChartNamespaceResponseBody build() {
            return new GetChartNamespaceResponseBody(this);
        } 

    } 

}
