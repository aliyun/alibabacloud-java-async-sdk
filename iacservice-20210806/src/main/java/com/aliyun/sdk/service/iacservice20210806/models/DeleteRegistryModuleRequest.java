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
 * {@link DeleteRegistryModuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteRegistryModuleRequest</p>
 */
public class DeleteRegistryModuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("moduleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String moduleName;

    private DeleteRegistryModuleRequest(Builder builder) {
        super(builder);
        this.namespaceName = builder.namespaceName;
        this.moduleName = builder.moduleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRegistryModuleRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteRegistryModuleRequest, Builder> {
        private String namespaceName; 
        private String moduleName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRegistryModuleRequest request) {
            super(request);
            this.namespaceName = request.namespaceName;
            this.moduleName = request.moduleName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_namespace</p>
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
         * <p>ess-scaling-rule</p>
         */
        public Builder moduleName(String moduleName) {
            this.putPathParameter("moduleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        @Override
        public DeleteRegistryModuleRequest build() {
            return new DeleteRegistryModuleRequest(this);
        } 

    } 

}
