// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link ListHotlineRecordRequest} extends {@link RequestModel}
 *
 * <p>ListHotlineRecordRequest</p>
 */
public class ListHotlineRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private ListHotlineRecordRequest(Builder builder) {
        super(builder);
        this.callId = builder.callId;
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotlineRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callId
     */
    public String getCallId() {
        return this.callId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<ListHotlineRecordRequest, Builder> {
        private String callId; 
        private String clientToken; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ListHotlineRecordRequest request) {
            super(request);
            this.callId = request.callId;
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>Session ID. This corresponds to the acid in WebSocket after an inbound call.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100365558</p>
         */
        public Builder callId(String callId) {
            this.putQueryParameter("CallId", callId);
            this.callId = callId;
            return this;
        }

        /**
         * <p>Unique customer request ID. Used for idempotency validation. You can generate it using UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>46c1341e-2648-447a-9b11-70b6a298d94d</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>AICCS instance ID. You can obtain it from the Artificial Intelligence Cloud Call Service console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc_xp_pre-cn-***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ListHotlineRecordRequest build() {
            return new ListHotlineRecordRequest(this);
        } 

    } 

}
