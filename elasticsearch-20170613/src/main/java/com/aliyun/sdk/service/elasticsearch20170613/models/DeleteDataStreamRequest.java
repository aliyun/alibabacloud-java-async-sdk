// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link DeleteDataStreamRequest} extends {@link RequestModel}
 *
 * <p>DeleteDataStreamRequest</p>
 */
public class DeleteDataStreamRequest extends Request {
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

    private DeleteDataStreamRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.dataStream = builder.dataStream;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDataStreamRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteDataStreamRequest, Builder> {
        private String instanceId; 
        private String dataStream; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDataStreamRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.dataStream = request.dataStream;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-nif24adwc0082****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-001</p>
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
        public DeleteDataStreamRequest build() {
            return new DeleteDataStreamRequest(this);
        } 

    } 

}
