// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDeadLockDetailRequest} extends {@link RequestModel}
 *
 * <p>GetDeadLockDetailRequest</p>
 */
public class GetDeadLockDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TextId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String textId;

    private GetDeadLockDetailRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.nodeId = builder.nodeId;
        this.source = builder.source;
        this.textId = builder.textId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeadLockDetailRequest create() {
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
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return textId
     */
    public String getTextId() {
        return this.textId;
    }

    public static final class Builder extends Request.Builder<GetDeadLockDetailRequest, Builder> {
        private String instanceId; 
        private String nodeId; 
        private String source; 
        private String textId; 

        private Builder() {
            super();
        } 

        private Builder(GetDeadLockDetailRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.nodeId = request.nodeId;
            this.source = request.source;
            this.textId = request.textId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1u5mas9exx7****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a0e390cd5aca9ae964448f040153****</p>
         */
        public Builder textId(String textId) {
            this.putQueryParameter("TextId", textId);
            this.textId = textId;
            return this;
        }

        @Override
        public GetDeadLockDetailRequest build() {
            return new GetDeadLockDetailRequest(this);
        } 

    } 

}
