// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link CreateThreadRequest} extends {@link RequestModel}
 *
 * <p>CreateThreadRequest</p>
 */
public class CreateThreadRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("assistantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assistantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("originalAssistantId")
    private String originalAssistantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceIdOfOriginalAssistantId")
    private String sourceIdOfOriginalAssistantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceTypeOfOriginalAssistantId")
    private Integer sourceTypeOfOriginalAssistantId;

    private CreateThreadRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.assistantId = builder.assistantId;
        this.originalAssistantId = builder.originalAssistantId;
        this.sourceIdOfOriginalAssistantId = builder.sourceIdOfOriginalAssistantId;
        this.sourceTypeOfOriginalAssistantId = builder.sourceTypeOfOriginalAssistantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateThreadRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return assistantId
     */
    public String getAssistantId() {
        return this.assistantId;
    }

    /**
     * @return originalAssistantId
     */
    public String getOriginalAssistantId() {
        return this.originalAssistantId;
    }

    /**
     * @return sourceIdOfOriginalAssistantId
     */
    public String getSourceIdOfOriginalAssistantId() {
        return this.sourceIdOfOriginalAssistantId;
    }

    /**
     * @return sourceTypeOfOriginalAssistantId
     */
    public Integer getSourceTypeOfOriginalAssistantId() {
        return this.sourceTypeOfOriginalAssistantId;
    }

    public static final class Builder extends Request.Builder<CreateThreadRequest, Builder> {
        private String accountId; 
        private String assistantId; 
        private String originalAssistantId; 
        private String sourceIdOfOriginalAssistantId; 
        private Integer sourceTypeOfOriginalAssistantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateThreadRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.assistantId = request.assistantId;
            this.originalAssistantId = request.originalAssistantId;
            this.sourceIdOfOriginalAssistantId = request.sourceIdOfOriginalAssistantId;
            this.sourceTypeOfOriginalAssistantId = request.sourceTypeOfOriginalAssistantId;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.putHeaderParameter("accountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>assistantId1</p>
         */
        public Builder assistantId(String assistantId) {
            this.putBodyParameter("assistantId", assistantId);
            this.assistantId = assistantId;
            return this;
        }

        /**
         * originalAssistantId.
         */
        public Builder originalAssistantId(String originalAssistantId) {
            this.putBodyParameter("originalAssistantId", originalAssistantId);
            this.originalAssistantId = originalAssistantId;
            return this;
        }

        /**
         * sourceIdOfOriginalAssistantId.
         */
        public Builder sourceIdOfOriginalAssistantId(String sourceIdOfOriginalAssistantId) {
            this.putBodyParameter("sourceIdOfOriginalAssistantId", sourceIdOfOriginalAssistantId);
            this.sourceIdOfOriginalAssistantId = sourceIdOfOriginalAssistantId;
            return this;
        }

        /**
         * sourceTypeOfOriginalAssistantId.
         */
        public Builder sourceTypeOfOriginalAssistantId(Integer sourceTypeOfOriginalAssistantId) {
            this.putBodyParameter("sourceTypeOfOriginalAssistantId", sourceTypeOfOriginalAssistantId);
            this.sourceTypeOfOriginalAssistantId = sourceTypeOfOriginalAssistantId;
            return this;
        }

        @Override
        public CreateThreadRequest build() {
            return new CreateThreadRequest(this);
        } 

    } 

}
