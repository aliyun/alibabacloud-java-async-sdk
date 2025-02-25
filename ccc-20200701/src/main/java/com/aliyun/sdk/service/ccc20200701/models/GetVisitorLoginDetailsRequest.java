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
 * {@link GetVisitorLoginDetailsRequest} extends {@link RequestModel}
 *
 * <p>GetVisitorLoginDetailsRequest</p>
 */
public class GetVisitorLoginDetailsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChatDeviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chatDeviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VisitorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String visitorId;

    private GetVisitorLoginDetailsRequest(Builder builder) {
        super(builder);
        this.chatDeviceId = builder.chatDeviceId;
        this.instanceId = builder.instanceId;
        this.token = builder.token;
        this.visitorId = builder.visitorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVisitorLoginDetailsRequest create() {
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
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return visitorId
     */
    public String getVisitorId() {
        return this.visitorId;
    }

    public static final class Builder extends Request.Builder<GetVisitorLoginDetailsRequest, Builder> {
        private String chatDeviceId; 
        private String instanceId; 
        private String token; 
        private String visitorId; 

        private Builder() {
            super();
        } 

        private Builder(GetVisitorLoginDetailsRequest request) {
            super(request);
            this.chatDeviceId = request.chatDeviceId;
            this.instanceId = request.instanceId;
            this.token = request.token;
            this.visitorId = request.visitorId;
        } 

        /**
         * <p>This parameter is required.</p>
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fcd020fe-d8e4-40e5-8c77-1a272a174a7d</p>
         */
        public Builder visitorId(String visitorId) {
            this.putQueryParameter("VisitorId", visitorId);
            this.visitorId = visitorId;
            return this;
        }

        @Override
        public GetVisitorLoginDetailsRequest build() {
            return new GetVisitorLoginDetailsRequest(this);
        } 

    } 

}
