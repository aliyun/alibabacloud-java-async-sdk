// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link RunNodeOperationRequest} extends {@link RequestModel}
 *
 * <p>RunNodeOperationRequest</p>
 */
public class RunNodeOperationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("clusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("nodepoolId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodepoolId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("nodeName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operationAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operationAction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operationArgs")
    private java.util.List<String> operationArgs;

    private RunNodeOperationRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodepoolId = builder.nodepoolId;
        this.nodeName = builder.nodeName;
        this.operationAction = builder.operationAction;
        this.operationArgs = builder.operationArgs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunNodeOperationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return nodepoolId
     */
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * @return operationAction
     */
    public String getOperationAction() {
        return this.operationAction;
    }

    /**
     * @return operationArgs
     */
    public java.util.List<String> getOperationArgs() {
        return this.operationArgs;
    }

    public static final class Builder extends Request.Builder<RunNodeOperationRequest, Builder> {
        private String clusterId; 
        private String nodepoolId; 
        private String nodeName; 
        private String operationAction; 
        private java.util.List<String> operationArgs; 

        private Builder() {
            super();
        } 

        private Builder(RunNodeOperationRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodepoolId = request.nodepoolId;
            this.nodeName = request.nodeName;
            this.operationAction = request.operationAction;
            this.operationArgs = request.operationArgs;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c2230fxxxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("clusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>npe76bc164769844b****</p>
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putPathParameter("nodepoolId", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou.192.168.0.1</p>
         */
        public Builder nodeName(String nodeName) {
            this.putPathParameter("nodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>restart.kubelet</p>
         */
        public Builder operationAction(String operationAction) {
            this.putBodyParameter("operationAction", operationAction);
            this.operationAction = operationAction;
            return this;
        }

        /**
         * operationArgs.
         */
        public Builder operationArgs(java.util.List<String> operationArgs) {
            this.putBodyParameter("operationArgs", operationArgs);
            this.operationArgs = operationArgs;
            return this;
        }

        @Override
        public RunNodeOperationRequest build() {
            return new RunNodeOperationRequest(this);
        } 

    } 

}
