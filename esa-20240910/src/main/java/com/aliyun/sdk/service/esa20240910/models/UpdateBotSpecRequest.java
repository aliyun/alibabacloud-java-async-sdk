// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UpdateBotSpecRequest} extends {@link RequestModel}
 *
 * <p>UpdateBotSpecRequest</p>
 */
public class UpdateBotSpecRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BotInstanceLevel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String botInstanceLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private UpdateBotSpecRequest(Builder builder) {
        super(builder);
        this.botInstanceLevel = builder.botInstanceLevel;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBotSpecRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return botInstanceLevel
     */
    public String getBotInstanceLevel() {
        return this.botInstanceLevel;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<UpdateBotSpecRequest, Builder> {
        private String botInstanceLevel; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBotSpecRequest request) {
            super(request);
            this.botInstanceLevel = request.botInstanceLevel;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>enterprise_bot</p>
         */
        public Builder botInstanceLevel(String botInstanceLevel) {
            this.putQueryParameter("BotInstanceLevel", botInstanceLevel);
            this.botInstanceLevel = botInstanceLevel;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>esa-bot-9tuv*********</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public UpdateBotSpecRequest build() {
            return new UpdateBotSpecRequest(this);
        } 

    } 

}
