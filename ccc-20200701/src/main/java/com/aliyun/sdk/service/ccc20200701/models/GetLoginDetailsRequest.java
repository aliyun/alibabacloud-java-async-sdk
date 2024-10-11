// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
         * ChatDeviceId.
         */
        public Builder chatDeviceId(String chatDeviceId) {
            this.putQueryParameter("ChatDeviceId", chatDeviceId);
            this.chatDeviceId = chatDeviceId;
            return this;
        }

        /**
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
         * UserId.
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
