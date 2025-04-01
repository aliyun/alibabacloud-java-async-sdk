// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
         * <p>The instance ID.</p>
         * <blockquote>
         * <p> Only ApsaraDB RDS for MySQL, PolarDB for MySQL, and PolarDB-X 2.0 instances are supported.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze8g2am97624****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The node ID.</p>
         * <blockquote>
         * <p> You must specify this parameter for PolarDB for MySQL clusters. If you do not specify a node ID, the session data of the primary node is returned by default.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pi-wz954ryd8f893****</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The asynchronous request ID.</p>
         * <blockquote>
         * <p> GetMySQLAllSessionAsync is an asynchronous operation. After a request is sent, the system does not return complete results but returns a <strong>request ID</strong>. You need to use the <strong>request ID</strong> to initiate requests until the value of the <strong>isFinish</strong> field in the returned results is <strong>true</strong>, the complete results are returned. This indicates that to obtain complete data, you must call this operation at least twice.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>async__507044db6c4eadfa2dab9b084e80****</p>
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
