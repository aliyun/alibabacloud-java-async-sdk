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
 * {@link DescribeConversationRequest} extends {@link RequestModel}
 *
 * <p>DescribeConversationRequest</p>
 */
public class DescribeConversationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String conversationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private DescribeConversationRequest(Builder builder) {
        super(builder);
        this.conversationId = builder.conversationId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConversationRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeConversationRequest, Builder> {
        private String conversationId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeConversationRequest request) {
            super(request);
            this.conversationId = request.conversationId;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>15608cce-36be-43d5-9361-178cbe64127b</p>
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
         * <p>5daac920-d6c1-429f-a95f-2a798f5255b5</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DescribeConversationRequest build() {
            return new DescribeConversationRequest(this);
        } 

    } 

}
