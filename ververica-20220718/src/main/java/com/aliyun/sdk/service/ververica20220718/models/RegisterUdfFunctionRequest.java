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
 * {@link RegisterUdfFunctionRequest} extends {@link RequestModel}
 *
 * <p>RegisterUdfFunctionRequest</p>
 */
public class RegisterUdfFunctionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("className")
    @com.aliyun.core.annotation.Validation(required = true)
    private String className;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("functionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("udfArtifactName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String udfArtifactName;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private RegisterUdfFunctionRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.className = builder.className;
        this.functionName = builder.functionName;
        this.udfArtifactName = builder.udfArtifactName;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterUdfFunctionRequest create() {
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
     * @return className
     */
    public String getClassName() {
        return this.className;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
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

    public static final class Builder extends Request.Builder<RegisterUdfFunctionRequest, Builder> {
        private String namespace; 
        private String className; 
        private String functionName; 
        private String udfArtifactName; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(RegisterUdfFunctionRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.className = request.className;
            this.functionName = request.functionName;
            this.udfArtifactName = request.udfArtifactName;
            this.workspace = request.workspace;
        } 

        /**
         * <p>The name of the namespace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default-namespace</p>
         */
        public Builder namespace(String namespace) {
            this.putPathParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The name of the class that corresponds to the UDF.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>orderRank</p>
         */
        public Builder className(String className) {
            this.putQueryParameter("className", className);
            this.className = className;
            return this;
        }

        /**
         * <p>The name of the UDF. In most cases, the name of the UDF is the same as the class name. You can specify a name for the UDF.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>orderRank</p>
         */
        public Builder functionName(String functionName) {
            this.putQueryParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>The name of the JAR or Python file that corresponds to the UDF.</p>
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
        public RegisterUdfFunctionRequest build() {
            return new RegisterUdfFunctionRequest(this);
        } 

    } 

}
