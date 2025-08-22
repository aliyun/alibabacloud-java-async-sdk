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
 * {@link GetRegistryModuleVersionRequest} extends {@link RequestModel}
 *
 * <p>GetRegistryModuleVersionRequest</p>
 */
public class GetRegistryModuleVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("moduleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String moduleName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("version")
    @com.aliyun.core.annotation.Validation(required = true)
    private String version;

    private GetRegistryModuleVersionRequest(Builder builder) {
        super(builder);
        this.namespaceName = builder.namespaceName;
        this.moduleName = builder.moduleName;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRegistryModuleVersionRequest create() {
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
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<GetRegistryModuleVersionRequest, Builder> {
        private String namespaceName; 
        private String moduleName; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(GetRegistryModuleVersionRequest request) {
            super(request);
            this.namespaceName = request.namespaceName;
            this.moduleName = request.moduleName;
            this.version = request.version;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alibabacloud</p>
         */
        public Builder namespaceName(String namespaceName) {
            this.putPathParameter("namespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ram-user</p>
         */
        public Builder moduleName(String moduleName) {
            this.putPathParameter("moduleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.0</p>
         */
        public Builder version(String version) {
            this.putPathParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public GetRegistryModuleVersionRequest build() {
            return new GetRegistryModuleVersionRequest(this);
        } 

    } 

}
