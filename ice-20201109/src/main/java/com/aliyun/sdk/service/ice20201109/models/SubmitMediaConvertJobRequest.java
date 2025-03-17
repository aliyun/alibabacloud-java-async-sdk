// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link SubmitMediaConvertJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitMediaConvertJobRequest</p>
 */
public class SubmitMediaConvertJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PipelineId")
    private String pipelineId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitMediaConvertJobRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.config = builder.config;
        this.pipelineId = builder.pipelineId;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitMediaConvertJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitMediaConvertJobRequest, Builder> {
        private String clientToken; 
        private String config; 
        private String pipelineId; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitMediaConvertJobRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.config = request.config;
            this.pipelineId = request.pipelineId;
            this.userData = request.userData;
        } 

        /**
         * <p>The idempotency key that is used to ensure repeated requests have the same effect as a single request.</p>
         * 
         * <strong>example:</strong>
         * <p>86f8e525-9d73-4dac-88aa-7aa4e950c00a</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The configurations of the transcoding task.</p>
         * <p>This parameter is required.</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The ID of the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>e197ecfb103e4849922b054d3032f954</p>
         */
        public Builder pipelineId(String pipelineId) {
            this.putQueryParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * <p>The user data.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;videoId&quot;:&quot;abcd&quot;}</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitMediaConvertJobRequest build() {
            return new SubmitMediaConvertJobRequest(this);
        } 

    } 

}
