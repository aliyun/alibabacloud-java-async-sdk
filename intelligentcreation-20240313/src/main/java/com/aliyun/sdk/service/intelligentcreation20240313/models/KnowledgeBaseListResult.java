// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link KnowledgeBaseListResult} extends {@link TeaModel}
 *
 * <p>KnowledgeBaseListResult</p>
 */
public class KnowledgeBaseListResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("knowledgeBases")
    private java.util.List<KnowledgeBaseInfo> knowledgeBases;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer total;

    private KnowledgeBaseListResult(Builder builder) {
        this.knowledgeBases = builder.knowledgeBases;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KnowledgeBaseListResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return knowledgeBases
     */
    public java.util.List<KnowledgeBaseInfo> getKnowledgeBases() {
        return this.knowledgeBases;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<KnowledgeBaseInfo> knowledgeBases; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(KnowledgeBaseListResult model) {
            this.knowledgeBases = model.knowledgeBases;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * knowledgeBases.
         */
        public Builder knowledgeBases(java.util.List<KnowledgeBaseInfo> knowledgeBases) {
            this.knowledgeBases = knowledgeBases;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public KnowledgeBaseListResult build() {
            return new KnowledgeBaseListResult(this);
        } 

    } 

}
