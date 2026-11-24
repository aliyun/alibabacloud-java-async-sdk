// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link SubmitAIAppJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitAIAppJobRequest</p>
 */
public class SubmitAIAppJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Inputs")
    private String inputs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitAIAppJobRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.clientToken = builder.clientToken;
        this.inputs = builder.inputs;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAIAppJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return inputs
     */
    public String getInputs() {
        return this.inputs;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitAIAppJobRequest, Builder> {
        private String appId; 
        private String clientToken; 
        private String inputs; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAIAppJobRequest request) {
            super(request);
            this.appId = request.appId;
            this.clientToken = request.clientToken;
            this.inputs = request.inputs;
            this.userData = request.userData;
        } 

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>Ensures the idempotence of the request. Generate a parameter value from your client to ensure that the value is unique across different requests. The ClientToken parameter supports only ASCII characters and can be up to 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>***<em><strong>20b48fb04</strong></em></p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The task inputs.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;InputPrompt&quot;: &quot;xxxx&quot;
         * }</p>
         */
        public Builder inputs(String inputs) {
            this.putBodyParameter("Inputs", inputs);
            this.inputs = inputs;
            return this;
        }

        /**
         * <p>The custom fields.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Key\&quot;:\&quot;Value\&quot;}</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitAIAppJobRequest build() {
            return new SubmitAIAppJobRequest(this);
        } 

    } 

}
