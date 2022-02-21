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

        /**
         * AutoCreateRepo.
         */
        public Builder autoCreateRepo(Boolean autoCreateRepo) {
            this.autoCreateRepo = autoCreateRepo;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DefaultRepoType.
         */
        public Builder defaultRepoType(String defaultRepoType) {
            this.defaultRepoType = defaultRepoType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * NamespaceName.
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * NamespaceStatus.
         */
        public Builder namespaceStatus(String namespaceStatus) {
            this.namespaceStatus = namespaceStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetChartNamespaceResponseBody build() {
            return new GetChartNamespaceResponseBody(this);
        } 

    } 

}
