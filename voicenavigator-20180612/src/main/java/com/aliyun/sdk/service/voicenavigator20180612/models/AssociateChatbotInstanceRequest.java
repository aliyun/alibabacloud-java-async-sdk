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
 * {@link AssociateChatbotInstanceRequest} extends {@link RequestModel}
 *
 * <p>AssociateChatbotInstanceRequest</p>
 */
public class AssociateChatbotInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChatbotInstanceId")
    private String chatbotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChatbotName")
    private String chatbotName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NluServiceParamsJson")
    private String nluServiceParamsJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NluServiceType")
    private String nluServiceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnionSource")
    private String unionSource;

    private AssociateChatbotInstanceRequest(Builder builder) {
        super(builder);
        this.chatbotInstanceId = builder.chatbotInstanceId;
        this.chatbotName = builder.chatbotName;
        this.instanceId = builder.instanceId;
        this.nluServiceParamsJson = builder.nluServiceParamsJson;
        this.nluServiceType = builder.nluServiceType;
        this.unionSource = builder.unionSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateChatbotInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chatbotInstanceId
     */
    public String getChatbotInstanceId() {
        return this.chatbotInstanceId;
    }

    /**
     * @return chatbotName
     */
    public String getChatbotName() {
        return this.chatbotName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nluServiceParamsJson
     */
    public String getNluServiceParamsJson() {
        return this.nluServiceParamsJson;
    }

    /**
     * @return nluServiceType
     */
    public String getNluServiceType() {
        return this.nluServiceType;
    }

    /**
     * @return unionSource
     */
    public String getUnionSource() {
        return this.unionSource;
    }

    public static final class Builder extends Request.Builder<AssociateChatbotInstanceRequest, Builder> {
        private String chatbotInstanceId; 
        private String chatbotName; 
        private String instanceId; 
        private String nluServiceParamsJson; 
        private String nluServiceType; 
        private String unionSource; 

        private Builder() {
            super();
        } 

        private Builder(AssociateChatbotInstanceRequest request) {
            super(request);
            this.chatbotInstanceId = request.chatbotInstanceId;
            this.chatbotName = request.chatbotName;
            this.instanceId = request.instanceId;
            this.nluServiceParamsJson = request.nluServiceParamsJson;
            this.nluServiceType = request.nluServiceType;
            this.unionSource = request.unionSource;
        } 

        /**
         * ChatbotInstanceId.
         */
        public Builder chatbotInstanceId(String chatbotInstanceId) {
            this.putQueryParameter("ChatbotInstanceId", chatbotInstanceId);
            this.chatbotInstanceId = chatbotInstanceId;
            return this;
        }

        /**
         * ChatbotName.
         */
        public Builder chatbotName(String chatbotName) {
            this.putQueryParameter("ChatbotName", chatbotName);
            this.chatbotName = chatbotName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NluServiceParamsJson.
         */
        public Builder nluServiceParamsJson(String nluServiceParamsJson) {
            this.putQueryParameter("NluServiceParamsJson", nluServiceParamsJson);
            this.nluServiceParamsJson = nluServiceParamsJson;
            return this;
        }

        /**
         * NluServiceType.
         */
        public Builder nluServiceType(String nluServiceType) {
            this.putQueryParameter("NluServiceType", nluServiceType);
            this.nluServiceType = nluServiceType;
            return this;
        }

        /**
         * UnionSource.
         */
        public Builder unionSource(String unionSource) {
            this.putQueryParameter("UnionSource", unionSource);
            this.unionSource = unionSource;
            return this;
        }

        @Override
        public AssociateChatbotInstanceRequest build() {
            return new AssociateChatbotInstanceRequest(this);
        } 

    } 

}
