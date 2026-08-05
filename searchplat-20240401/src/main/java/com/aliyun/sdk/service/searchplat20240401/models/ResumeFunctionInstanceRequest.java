// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240401.models;

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
 * {@link ResumeFunctionInstanceRequest} extends {@link RequestModel}
 *
 * <p>ResumeFunctionInstanceRequest</p>
 */
public class ResumeFunctionInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("functionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functionName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    private ResumeFunctionInstanceRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.functionName = builder.functionName;
        this.instanceName = builder.instanceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResumeFunctionInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    public static final class Builder extends Request.Builder<ResumeFunctionInstanceRequest, Builder> {
        private String workspaceName; 
        private String functionName; 
        private String instanceName; 

        private Builder() {
            super();
        } 

        private Builder(ResumeFunctionInstanceRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.functionName = request.functionName;
            this.instanceName = request.instanceName;
        } 

        /**
         * <p>Workspace name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * <p>Service type</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>notebook</p>
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>Notebook name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_notebook</p>
         */
        public Builder instanceName(String instanceName) {
            this.putPathParameter("instanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        @Override
        public ResumeFunctionInstanceRequest build() {
            return new ResumeFunctionInstanceRequest(this);
        } 

    } 

}
