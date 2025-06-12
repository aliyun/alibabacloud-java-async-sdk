// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link DeleteBeebotIntentUserSayRequest} extends {@link RequestModel}
 *
 * <p>DeleteBeebotIntentUserSayRequest</p>
 */
public class DeleteBeebotIntentUserSayRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String intentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scriptId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserSayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userSayId;

    private DeleteBeebotIntentUserSayRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.intentId = builder.intentId;
        this.scriptId = builder.scriptId;
        this.userSayId = builder.userSayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBeebotIntentUserSayRequest create() {
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
     * @return intentId
     */
    public String getIntentId() {
        return this.intentId;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * @return userSayId
     */
    public String getUserSayId() {
        return this.userSayId;
    }

    public static final class Builder extends Request.Builder<DeleteBeebotIntentUserSayRequest, Builder> {
        private String instanceId; 
        private String intentId; 
        private String scriptId; 
        private String userSayId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBeebotIntentUserSayRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.intentId = request.intentId;
            this.scriptId = request.scriptId;
            this.userSayId = request.userSayId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e5035654-1745-484a-8c5b-165f7c7bcd79</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10717802</p>
         */
        public Builder intentId(String intentId) {
            this.putQueryParameter("IntentId", intentId);
            this.intentId = intentId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c5c5d8c0-c0f1-48a7-be2b-dc46006d888a</p>
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>17448458</p>
         */
        public Builder userSayId(String userSayId) {
            this.putQueryParameter("UserSayId", userSayId);
            this.userSayId = userSayId;
            return this;
        }

        @Override
        public DeleteBeebotIntentUserSayRequest build() {
            return new DeleteBeebotIntentUserSayRequest(this);
        } 

    } 

}
