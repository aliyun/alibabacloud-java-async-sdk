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
    private String instanceId;

    @Query
    @NameInMap("MessageId")
    private String messageId;

    @Query
    @NameInMap("NodeId")
    private String nodeId;

    private GetRequestDiagnosisResultRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.messageId = builder.messageId;
        this.nodeId = builder.nodeId;
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

    public static final class Builder extends Request.Builder<GetRequestDiagnosisResultRequest, Builder> {
        private String instanceId; 
        private String messageId; 
        private String nodeId; 

        private Builder() {
            super();
        } 

        private Builder(GetRequestDiagnosisResultRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.messageId = response.messageId;
            this.nodeId = response.nodeId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MessageId.
         */
        public Builder messageId(String messageId) {
            this.putQueryParameter("MessageId", messageId);
            this.messageId = messageId;
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

        @Override
        public GetRequestDiagnosisResultRequest build() {
            return new GetRequestDiagnosisResultRequest(this);
        } 

    } 

}
