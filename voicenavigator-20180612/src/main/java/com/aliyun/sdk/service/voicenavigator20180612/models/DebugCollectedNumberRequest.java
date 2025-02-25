// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

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
 * {@link DebugCollectedNumberRequest} extends {@link RequestModel}
 *
 * <p>DebugCollectedNumberRequest</p>
 */
public class DebugCollectedNumberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String conversationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Number")
    private String number;

    private DebugCollectedNumberRequest(Builder builder) {
        super(builder);
        this.conversationId = builder.conversationId;
        this.instanceId = builder.instanceId;
        this.number = builder.number;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DebugCollectedNumberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return number
     */
    public String getNumber() {
        return this.number;
    }

    public static final class Builder extends Request.Builder<DebugCollectedNumberRequest, Builder> {
        private String conversationId; 
        private String instanceId; 
        private String number; 

        private Builder() {
            super();
        } 

        private Builder(DebugCollectedNumberRequest request) {
            super(request);
            this.conversationId = request.conversationId;
            this.instanceId = request.instanceId;
            this.number = request.number;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7cefbff0-8d50-4d6f-b93c-73cee23c1555</p>
         */
        public Builder conversationId(String conversationId) {
            this.putQueryParameter("ConversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7cefbff0-8d50-4d6f-b93c-73cee23c1555</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Number.
         */
        public Builder number(String number) {
            this.putQueryParameter("Number", number);
            this.number = number;
            return this;
        }

        @Override
        public DebugCollectedNumberRequest build() {
            return new DebugCollectedNumberRequest(this);
        } 

    } 

}
