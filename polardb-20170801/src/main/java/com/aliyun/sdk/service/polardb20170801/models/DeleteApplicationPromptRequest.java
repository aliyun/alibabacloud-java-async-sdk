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
 * {@link DeleteApplicationPromptRequest} extends {@link RequestModel}
 *
 * <p>DeleteApplicationPromptRequest</p>
 */
public class DeleteApplicationPromptRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromptId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String promptId;

    private DeleteApplicationPromptRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.promptId = builder.promptId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteApplicationPromptRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteApplicationPromptRequest, Builder> {
        private String applicationId; 
        private String promptId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteApplicationPromptRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.promptId = request.promptId;
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

        @Override
        public DeleteApplicationPromptRequest build() {
            return new DeleteApplicationPromptRequest(this);
        } 

    } 

}
