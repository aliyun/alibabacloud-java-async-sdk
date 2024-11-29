// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetRequestDiagnosisResultRequest} extends {@link RequestModel}
 *
 * <p>GetRequestDiagnosisResultRequest</p>
 */
public class GetRequestDiagnosisResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String messageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlId")
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
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-0iwhhl8gx0ld6****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The unique ID of the diagnostic task.<a href="~~341609~~"></a></p>
         * <blockquote>
         * <p> If you set MessageId to the task ID of the automatic SQL optimization feature, no result is returned.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>61820b594664275c4429****</p>
         */
        public Builder messageId(String messageId) {
            this.putQueryParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
        }

        /**
         * <p>The node ID.</p>
         * <blockquote>
         * <p> You must specify the node ID if your database instance is a PolarDB for MySQL cluster, a PolarDB for PostgreSQL (compatible with Oracle) instance, or an ApsaraDB for MongoDB database.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>202****</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The source of the task.</p>
         * <blockquote>
         * <p> This parameter is required if you call this operation in the DAS console. You do not need to specify this parameter when you call this operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The SQL template ID.</p>
         * <blockquote>
         * <p> This parameter is required if you call this operation in the DAS console. You do not need to specify this parameter when you call this operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>None</p>
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
