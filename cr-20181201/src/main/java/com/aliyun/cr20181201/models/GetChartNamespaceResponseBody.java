// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetChartNamespaceResponseBody} extends {@link TeaModel}
 *
 * <p>GetChartNamespaceResponseBody</p>
 */
public class GetChartNamespaceResponseBody extends TeaModel {
    @NameInMap("DefaultRepoType")
    private String defaultRepoType;

    @NameInMap("NamespaceId")
    private String namespaceId;

    @NameInMap("NamespaceStatus")
    private String namespaceStatus;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Code")
    private String code;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("AutoCreateRepo")
    private Boolean autoCreateRepo;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("NamespaceName")
    private String namespaceName;


    private GetChartNamespaceResponseBody(Builder builder) {
        this.defaultRepoType = builder.defaultRepoType;
        this.namespaceId = builder.namespaceId;
        this.namespaceStatus = builder.namespaceStatus;
        this.requestId = builder.requestId;
        this.code = builder.code;
        this.instanceId = builder.instanceId;
        this.autoCreateRepo = builder.autoCreateRepo;
        this.isSuccess = builder.isSuccess;
        this.namespaceName = builder.namespaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChartNamespaceResponseBody create() {
        return builder().build();
    }

    /**
     * @return defaultRepoType
     */
    public String getDefaultRepoType() {
        return this.defaultRepoType;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
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
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return autoCreateRepo
     */
    public Boolean getAutoCreateRepo() {
        return this.autoCreateRepo;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public static final class Builder {
        private String defaultRepoType; 
        private String namespaceId; 
        private String namespaceStatus; 
        private String requestId; 
        private String code; 
        private String instanceId; 
        private Boolean autoCreateRepo; 
        private Boolean isSuccess; 
        private String namespaceName; 

        /**
         * <p>The default type of the repository. Valid values:

-"PUBLIC": public repository

-"PRIVATE": private repository</p>
         */
        public Builder defaultRepoType(String defaultRepoType) {
            this.defaultRepoType = defaultRepoType;
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
         * <p>The status of the namespace. Value

-"NORMAL": Normal

-"DELETING": Deleting</p>
         */
        public Builder namespaceStatus(String namespaceStatus) {
            this.namespaceStatus = namespaceStatus;
            return this;
        }

        /**
         * <p>Request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Response status</p>
         */
        public Builder code(String code) {
            this.code = code;
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
         * <p>Specifies whether to automatically create an image repository. Valid values:

-"true": automatically creates an image repository.

-"false": The image repository is not automatically created.</p>
         */
        public Builder autoCreateRepo(Boolean autoCreateRepo) {
            this.autoCreateRepo = autoCreateRepo;
            return this;
        }

        /**
         * <p>Indicates whether the API is called. Valid values:

-"true": The API is called.

-"false": failed to call the API.</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>Namespace name</p>
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        public GetChartNamespaceResponseBody build() {
            return new GetChartNamespaceResponseBody(this);
        } 

    } 

}
