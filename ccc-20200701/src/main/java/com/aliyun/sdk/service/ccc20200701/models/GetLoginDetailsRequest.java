// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link GetLoginDetailsRequest} extends {@link RequestModel}
 *
 * <p>GetLoginDetailsRequest</p>
 */
public class GetLoginDetailsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChatDeviceId")
    private String chatDeviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private GetLoginDetailsRequest(Builder builder) {
        super(builder);
        this.chatDeviceId = builder.chatDeviceId;
        this.instanceId = builder.instanceId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLoginDetailsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chatDeviceId
     */
    public String getChatDeviceId() {
        return this.chatDeviceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<GetLoginDetailsRequest, Builder> {
        private String chatDeviceId; 
        private String instanceId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(GetLoginDetailsRequest request) {
            super(request);
            this.chatDeviceId = request.chatDeviceId;
            this.instanceId = request.instanceId;
            this.userId = request.userId;
        } 

        /**
         * <p>Chat Device ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4c51c9116c36537cb850dc1081d745df</p>
         */
        public Builder chatDeviceId(String chatDeviceId) {
            this.putQueryParameter("ChatDeviceId", chatDeviceId);
            this.chatDeviceId = chatDeviceId;
            return this;
        }

        /**
         * <p>Instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Agent ID. This parameter is optional. If not specified, the agent mapped to the current RAM account is used by default.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public GetLoginDetailsRequest build() {
            return new GetLoginDetailsRequest(this);
        } 

    } 

}
