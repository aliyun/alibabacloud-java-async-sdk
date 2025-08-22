// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link PublishRegistryModuleVersionRequest} extends {@link RequestModel}
 *
 * <p>PublishRegistryModuleVersionRequest</p>
 */
public class PublishRegistryModuleVersionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("moduleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String moduleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("namespaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("version")
    @com.aliyun.core.annotation.Validation(required = true)
    private String version;

    private PublishRegistryModuleVersionRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.moduleName = builder.moduleName;
        this.namespaceName = builder.namespaceName;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishRegistryModuleVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return moduleName
     */
    public String getModuleName() {
        return this.moduleName;
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<PublishRegistryModuleVersionRequest, Builder> {
        private String clientToken; 
        private String moduleName; 
        private String namespaceName; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(PublishRegistryModuleVersionRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.moduleName = request.moduleName;
            this.namespaceName = request.namespaceName;
            this.version = request.version;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a65451293e64979ba7a4b573950217fe</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-bucket</p>
         */
        public Builder moduleName(String moduleName) {
            this.putBodyParameter("moduleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>terraform-alicloud-modules</p>
         */
        public Builder namespaceName(String namespaceName) {
            this.putBodyParameter("namespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.0</p>
         */
        public Builder version(String version) {
            this.putBodyParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public PublishRegistryModuleVersionRequest build() {
            return new PublishRegistryModuleVersionRequest(this);
        } 

    } 

}
