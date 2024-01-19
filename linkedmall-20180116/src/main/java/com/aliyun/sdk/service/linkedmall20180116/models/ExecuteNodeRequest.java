// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteNodeRequest} extends {@link RequestModel}
 *
 * <p>ExecuteNodeRequest</p>
 */
public class ExecuteNodeRequest extends Request {
    @Query
    @NameInMap("BizId")
    private String bizId;

    @Query
    @NameInMap("NodeId")
    @Validation(required = true)
    private String nodeId;

    @Query
    @NameInMap("NodeInstanceId")
    private String nodeInstanceId;

    @Query
    @NameInMap("ProcessId")
    @Validation(required = true)
    private String processId;

    @Query
    @NameInMap("ProcessInstanceId")
    private String processInstanceId;

    @Query
    @NameInMap("RequestData")
    private String requestData;

    private ExecuteNodeRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.nodeId = builder.nodeId;
        this.nodeInstanceId = builder.nodeInstanceId;
        this.processId = builder.processId;
        this.processInstanceId = builder.processInstanceId;
        this.requestData = builder.requestData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteNodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return nodeInstanceId
     */
    public String getNodeInstanceId() {
        return this.nodeInstanceId;
    }

    /**
     * @return processId
     */
    public String getProcessId() {
        return this.processId;
    }

    /**
     * @return processInstanceId
     */
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

    /**
     * @return requestData
     */
    public String getRequestData() {
        return this.requestData;
    }

    public static final class Builder extends Request.Builder<ExecuteNodeRequest, Builder> {
        private String bizId; 
        private String nodeId; 
        private String nodeInstanceId; 
        private String processId; 
        private String processInstanceId; 
        private String requestData; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteNodeRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.nodeId = request.nodeId;
            this.nodeInstanceId = request.nodeInstanceId;
            this.processId = request.processId;
            this.processInstanceId = request.processInstanceId;
            this.requestData = request.requestData;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * NodeInstanceId.
         */
        public Builder nodeInstanceId(String nodeInstanceId) {
            this.putQueryParameter("NodeInstanceId", nodeInstanceId);
            this.nodeInstanceId = nodeInstanceId;
            return this;
        }

        /**
         * ProcessId.
         */
        public Builder processId(String processId) {
            this.putQueryParameter("ProcessId", processId);
            this.processId = processId;
            return this;
        }

        /**
         * ProcessInstanceId.
         */
        public Builder processInstanceId(String processInstanceId) {
            this.putQueryParameter("ProcessInstanceId", processInstanceId);
            this.processInstanceId = processInstanceId;
            return this;
        }

        /**
         * RequestData.
         */
        public Builder requestData(String requestData) {
            this.putQueryParameter("RequestData", requestData);
            this.requestData = requestData;
            return this;
        }

        @Override
        public ExecuteNodeRequest build() {
            return new ExecuteNodeRequest(this);
        } 

    } 

}
