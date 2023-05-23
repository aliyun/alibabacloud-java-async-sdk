// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportNacosConfigRequest} extends {@link RequestModel}
 *
 * <p>ImportNacosConfigRequest</p>
 */
public class ImportNacosConfigRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("FileUrl")
    @Validation(required = true)
    private String fileUrl;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NamespaceId")
    private String namespaceId;

    @Query
    @NameInMap("Policy")
    private String policy;

    private ImportNacosConfigRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.fileUrl = builder.fileUrl;
        this.instanceId = builder.instanceId;
        this.namespaceId = builder.namespaceId;
        this.policy = builder.policy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportNacosConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
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
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    public static final class Builder extends Request.Builder<ImportNacosConfigRequest, Builder> {
        private String acceptLanguage; 
        private String fileUrl; 
        private String instanceId; 
        private String namespaceId; 
        private String policy; 

        private Builder() {
            super();
        } 

        private Builder(ImportNacosConfigRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.fileUrl = request.fileUrl;
            this.instanceId = request.instanceId;
            this.namespaceId = request.namespaceId;
            this.policy = request.policy;
        } 

        /**
         * mse-200-105
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
         */
        public Builder fileUrl(String fileUrl) {
            this.putQueryParameter("FileUrl", fileUrl);
            this.fileUrl = fileUrl;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * mse_prepaid_public_cn-****
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * Imports Nacos configurations as a file.
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        @Override
        public ImportNacosConfigRequest build() {
            return new ImportNacosConfigRequest(this);
        } 

    } 

}
