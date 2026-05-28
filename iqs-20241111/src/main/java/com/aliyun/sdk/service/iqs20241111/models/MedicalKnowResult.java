// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link MedicalKnowResult} extends {@link TeaModel}
 *
 * <p>MedicalKnowResult</p>
 */
public class MedicalKnowResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("messages")
    private java.util.List<MedicalKnowledgeInfo> messages;

    @com.aliyun.core.annotation.NameInMap("queryContext")
    private MultimodalQueryContext queryContext;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("searchInformation")
    private UnifiedSearchInformation searchInformation;

    private MedicalKnowResult(Builder builder) {
        this.messages = builder.messages;
        this.queryContext = builder.queryContext;
        this.requestId = builder.requestId;
        this.searchInformation = builder.searchInformation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MedicalKnowResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return messages
     */
    public java.util.List<MedicalKnowledgeInfo> getMessages() {
        return this.messages;
    }

    /**
     * @return queryContext
     */
    public MultimodalQueryContext getQueryContext() {
        return this.queryContext;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return searchInformation
     */
    public UnifiedSearchInformation getSearchInformation() {
        return this.searchInformation;
    }

    public static final class Builder {
        private java.util.List<MedicalKnowledgeInfo> messages; 
        private MultimodalQueryContext queryContext; 
        private String requestId; 
        private UnifiedSearchInformation searchInformation; 

        private Builder() {
        } 

        private Builder(MedicalKnowResult model) {
            this.messages = model.messages;
            this.queryContext = model.queryContext;
            this.requestId = model.requestId;
            this.searchInformation = model.searchInformation;
        } 

        /**
         * messages.
         */
        public Builder messages(java.util.List<MedicalKnowledgeInfo> messages) {
            this.messages = messages;
            return this;
        }

        /**
         * queryContext.
         */
        public Builder queryContext(MultimodalQueryContext queryContext) {
            this.queryContext = queryContext;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * searchInformation.
         */
        public Builder searchInformation(UnifiedSearchInformation searchInformation) {
            this.searchInformation = searchInformation;
            return this;
        }

        public MedicalKnowResult build() {
            return new MedicalKnowResult(this);
        } 

    } 

}
