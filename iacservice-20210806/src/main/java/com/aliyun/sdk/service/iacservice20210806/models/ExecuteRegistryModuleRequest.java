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
 * {@link ExecuteRegistryModuleRequest} extends {@link RequestModel}
 *
 * <p>ExecuteRegistryModuleRequest</p>
 */
public class ExecuteRegistryModuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("moduleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String moduleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parameters")
    private java.util.Map<String, ?> parameters;

    private ExecuteRegistryModuleRequest(Builder builder) {
        super(builder);
        this.namespaceName = builder.namespaceName;
        this.moduleName = builder.moduleName;
        this.clientToken = builder.clientToken;
        this.parameters = builder.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteRegistryModuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * @return moduleName
     */
    public String getModuleName() {
        return this.moduleName;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return parameters
     */
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public static final class Builder extends Request.Builder<ExecuteRegistryModuleRequest, Builder> {
        private String namespaceName; 
        private String moduleName; 
        private String clientToken; 
        private java.util.Map<String, ?> parameters; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteRegistryModuleRequest request) {
            super(request);
            this.namespaceName = request.namespaceName;
            this.moduleName = request.moduleName;
            this.clientToken = request.clientToken;
            this.parameters = request.parameters;
        } 

        /**
         * <p>The workspace to which the Module belongs. The workspaces for official registry modules are alibaba, alibabacloud-automation, aliyun, and terraform-alicloud-modules.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba</p>
         */
        public Builder namespaceName(String namespaceName) {
            this.putPathParameter("namespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * <p>The template name. You can call ListExplorerRegistryModules to query available modules.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        public Builder moduleName(String moduleName) {
            this.putPathParameter("moduleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        /**
         * <p>The idempotency token. Format: [0-9a-zA-Z-]{1,64}. We recommend that you use a UUID.</p>
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
         * <p>The set of parameters used by the template.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;region\&quot;: \&quot;cn-hangzhou\&quot;, \&quot;vpcId\&quot;: \&quot;vpc-bp145sc90s26q0qbkfb6i\&quot;, \&quot;functionName\&quot;: \&quot;filemgr-cn-hangzhou-063fd4aead\&quot;, \&quot;mountPointsServerAddr\&quot;: \&quot;063fd4aead-dex50.cn-hangzhou.nas.aliyuncs.com\&quot;}</p>
         */
        public Builder parameters(java.util.Map<String, ?> parameters) {
            this.putBodyParameter("parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        @Override
        public ExecuteRegistryModuleRequest build() {
            return new ExecuteRegistryModuleRequest(this);
        } 

    } 

}
