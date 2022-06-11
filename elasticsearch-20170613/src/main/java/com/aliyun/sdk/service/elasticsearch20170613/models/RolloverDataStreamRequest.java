// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RolloverDataStreamRequest} extends {@link RequestModel}
 *
 * <p>RolloverDataStreamRequest</p>
 */
public class RolloverDataStreamRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("DataStream")
    @Validation(required = true)
    private String dataStream;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("body")
    private String body;

    private RolloverDataStreamRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.dataStream = builder.dataStream;
        this.clientToken = builder.clientToken;
        this.body = builder.body;
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

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<RolloverDataStreamRequest, Builder> {
        private String instanceId; 
        private String dataStream; 
        private String clientToken; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(RolloverDataStreamRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.dataStream = request.dataStream;
            this.clientToken = request.clientToken;
            this.body = request.body;
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

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public RolloverDataStreamRequest build() {
            return new RolloverDataStreamRequest(this);
        } 

    } 

}
