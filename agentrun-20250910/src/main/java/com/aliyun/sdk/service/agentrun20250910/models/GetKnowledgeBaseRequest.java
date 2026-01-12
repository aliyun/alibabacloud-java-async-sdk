// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link GetKnowledgeBaseRequest} extends {@link RequestModel}
 *
 * <p>GetKnowledgeBaseRequest</p>
 */
public class GetKnowledgeBaseRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("knowledgeBaseName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseName;

    private GetKnowledgeBaseRequest(Builder builder) {
        super(builder);
        this.knowledgeBaseName = builder.knowledgeBaseName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKnowledgeBaseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return knowledgeBaseName
     */
    public String getKnowledgeBaseName() {
        return this.knowledgeBaseName;
    }

    public static final class Builder extends Request.Builder<GetKnowledgeBaseRequest, Builder> {
        private String knowledgeBaseName; 

        private Builder() {
            super();
        } 

        private Builder(GetKnowledgeBaseRequest request) {
            super(request);
            this.knowledgeBaseName = request.knowledgeBaseName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-knowledgebase-name</p>
         */
        public Builder knowledgeBaseName(String knowledgeBaseName) {
            this.putPathParameter("knowledgeBaseName", knowledgeBaseName);
            this.knowledgeBaseName = knowledgeBaseName;
            return this;
        }

        @Override
        public GetKnowledgeBaseRequest build() {
            return new GetKnowledgeBaseRequest(this);
        } 

    } 

}
