// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRequestDiagnosisResultRequest} extends {@link RequestModel}
 *
 * <p>GetRequestDiagnosisResultRequest</p>
 */
public class GetRequestDiagnosisResultRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("MessageId")
    @Validation(required = true)
    private String messageId;

    @Query
    @NameInMap("NodeId")
    private String nodeId;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("SqlId")
    private String sqlId;

    private GetRequestDiagnosisResultRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.messageId = builder.messageId;
        this.nodeId = builder.nodeId;
        this.source = builder.source;
        this.sqlId = builder.sqlId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRequestDiagnosisResultRequest create() {
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
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return sqlId
     */
    public String getSqlId() {
        return this.sqlId;
    }

    public static final class Builder extends Request.Builder<GetRequestDiagnosisResultRequest, Builder> {
        private String instanceId; 
        private String messageId; 
        private String nodeId; 
        private String source; 
        private String sqlId; 

        private Builder() {
            super();
        } 

        private Builder(GetRequestDiagnosisResultRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.messageId = request.messageId;
            this.nodeId = request.nodeId;
            this.source = request.source;
            this.sqlId = request.sqlId;
        } 

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The unique ID of the diagnostics task. You can call the [CreateRequestDiagnosis](~~341609~~) operation to query the diagnostics task ID.
         */
        public Builder messageId(String messageId) {
            this.putQueryParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
        }

        /**
         * The node ID.
         * <p>
         * 
         * >  You must specify the node ID if your database instance is a PolarDB for MySQL cluster, a PolarDB for PostgreSQL (compatible with Oracle) instance, or an ApsaraDB for MongoDB database.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The source of the task.
         * <p>
         * 
         * >  This parameter is required if you call this operation in the DAS console. You do not need to specify this parameter when you call this operation.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * The SQL template ID.
         * <p>
         * 
         * >  This parameter is required if you call this operation in the DAS console. You do not need to specify this parameter when you call this operation.
         */
        public Builder sqlId(String sqlId) {
            this.putQueryParameter("SqlId", sqlId);
            this.sqlId = sqlId;
            return this;
        }

        @Override
        public GetRequestDiagnosisResultRequest build() {
            return new GetRequestDiagnosisResultRequest(this);
        } 

    } 

}
