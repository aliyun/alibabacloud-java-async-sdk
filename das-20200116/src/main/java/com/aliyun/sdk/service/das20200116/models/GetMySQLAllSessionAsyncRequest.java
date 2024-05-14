// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMySQLAllSessionAsyncRequest} extends {@link RequestModel}
 *
 * <p>GetMySQLAllSessionAsyncRequest</p>
 */
public class GetMySQLAllSessionAsyncRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResultId")
    private String resultId;

    private GetMySQLAllSessionAsyncRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.nodeId = builder.nodeId;
        this.resultId = builder.resultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMySQLAllSessionAsyncRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return resultId
     */
    public String getResultId() {
        return this.resultId;
    }

    public static final class Builder extends Request.Builder<GetMySQLAllSessionAsyncRequest, Builder> {
        private String instanceId; 
        private String nodeId; 
        private String resultId; 

        private Builder() {
            super();
        } 

        private Builder(GetMySQLAllSessionAsyncRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.nodeId = request.nodeId;
            this.resultId = request.resultId;
        } 

        /**
         * The instance ID.
         * <p>
         * 
         * >  Only ApsaraDB RDS for MySQL, PolarDB for MySQL, and PolarDB-X 2.0 instances are supported.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The node ID.
         * <p>
         * 
         * >  You must specify this parameter for PolarDB for MySQL clusters. If you do not specify a node ID, the session data of the primary node is returned by default.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The ID of the asynchronous request.
         * <p>
         * 
         * >  You can leave this parameter empty when you call the operation to initiate the request for the first time, and use the value of this parameter contained in the response to the first request for subsequent requests.
         */
        public Builder resultId(String resultId) {
            this.putQueryParameter("ResultId", resultId);
            this.resultId = resultId;
            return this;
        }

        @Override
        public GetMySQLAllSessionAsyncRequest build() {
            return new GetMySQLAllSessionAsyncRequest(this);
        } 

    } 

}
