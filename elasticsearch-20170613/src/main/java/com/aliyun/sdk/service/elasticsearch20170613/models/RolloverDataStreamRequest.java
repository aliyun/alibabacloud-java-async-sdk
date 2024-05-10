// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RolloverDataStreamRequest} extends {@link RequestModel}
 *
 * <p>RolloverDataStreamRequest</p>
 */
public class RolloverDataStreamRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DataStream")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataStream;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    private RolloverDataStreamRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.dataStream = builder.dataStream;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RolloverDataStreamRequest create() {
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
     * @return dataStream
     */
    public String getDataStream() {
        return this.dataStream;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<RolloverDataStreamRequest, Builder> {
        private String instanceId; 
        private String dataStream; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(RolloverDataStreamRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.dataStream = request.dataStream;
            this.clientToken = request.clientToken;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * DataStream.
         */
        public Builder dataStream(String dataStream) {
            this.putPathParameter("DataStream", dataStream);
            this.dataStream = dataStream;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public RolloverDataStreamRequest build() {
            return new RolloverDataStreamRequest(this);
        } 

    } 

}
