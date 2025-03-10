// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link DeleteUdfFunctionRequest} extends {@link RequestModel}
 *
 * <p>DeleteUdfFunctionRequest</p>
 */
public class DeleteUdfFunctionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("functionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("className")
    @com.aliyun.core.annotation.Validation(required = true)
    private String className;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("udfArtifactName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String udfArtifactName;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private DeleteUdfFunctionRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.functionName = builder.functionName;
        this.className = builder.className;
        this.udfArtifactName = builder.udfArtifactName;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUdfFunctionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return className
     */
    public String getClassName() {
        return this.className;
    }

    /**
     * @return udfArtifactName
     */
    public String getUdfArtifactName() {
        return this.udfArtifactName;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<DeleteUdfFunctionRequest, Builder> {
        private String namespace; 
        private String functionName; 
        private String className; 
        private String udfArtifactName; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUdfFunctionRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.functionName = request.functionName;
            this.className = request.className;
            this.udfArtifactName = request.udfArtifactName;
            this.workspace = request.workspace;
        } 

        /**
         * <p>The name of the namespace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>u-gs3rgla9-default</p>
         */
        public Builder namespace(String namespace) {
            this.putPathParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The name of the UDF that you want to delete.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>category</p>
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>The name of the class that corresponds to the UDF.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Category</p>
         */
        public Builder className(String className) {
            this.putQueryParameter("className", className);
            this.className = className;
            return this;
        }

        /**
         * <p>The name of the resource that corresponds to the UDF that you want to delete.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-udf</p>
         */
        public Builder udfArtifactName(String udfArtifactName) {
            this.putQueryParameter("udfArtifactName", udfArtifactName);
            this.udfArtifactName = udfArtifactName;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a14bd5d90a****</p>
         */
        public Builder workspace(String workspace) {
            this.putHeaderParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public DeleteUdfFunctionRequest build() {
            return new DeleteUdfFunctionRequest(this);
        } 

    } 

}
