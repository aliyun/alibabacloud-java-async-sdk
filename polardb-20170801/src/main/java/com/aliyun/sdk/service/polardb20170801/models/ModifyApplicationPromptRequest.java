// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyApplicationPromptRequest} extends {@link RequestModel}
 *
 * <p>ModifyApplicationPromptRequest</p>
 */
public class ModifyApplicationPromptRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromptId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String promptId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromptName")
    private String promptName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromptValue")
    private String promptValue;

    private ModifyApplicationPromptRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.promptId = builder.promptId;
        this.promptName = builder.promptName;
        this.promptValue = builder.promptValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApplicationPromptRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return promptId
     */
    public String getPromptId() {
        return this.promptId;
    }

    /**
     * @return promptName
     */
    public String getPromptName() {
        return this.promptName;
    }

    /**
     * @return promptValue
     */
    public String getPromptValue() {
        return this.promptValue;
    }

    public static final class Builder extends Request.Builder<ModifyApplicationPromptRequest, Builder> {
        private String applicationId; 
        private String promptId; 
        private String promptName; 
        private String promptValue; 

        private Builder() {
            super();
        } 

        private Builder(ModifyApplicationPromptRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.promptId = request.promptId;
            this.promptName = request.promptName;
            this.promptValue = request.promptValue;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>papt-xx</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>papt-f9lajgw765f4fnrzn1</p>
         */
        public Builder promptId(String promptId) {
            this.putQueryParameter("PromptId", promptId);
            this.promptId = promptId;
            return this;
        }

        /**
         * PromptName.
         */
        public Builder promptName(String promptName) {
            this.putQueryParameter("PromptName", promptName);
            this.promptName = promptName;
            return this;
        }

        /**
         * PromptValue.
         */
        public Builder promptValue(String promptValue) {
            this.putQueryParameter("PromptValue", promptValue);
            this.promptValue = promptValue;
            return this;
        }

        @Override
        public ModifyApplicationPromptRequest build() {
            return new ModifyApplicationPromptRequest(this);
        } 

    } 

}
