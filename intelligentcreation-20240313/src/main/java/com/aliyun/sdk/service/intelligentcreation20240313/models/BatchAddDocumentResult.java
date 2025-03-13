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
 * {@link BatchAddDocumentResult} extends {@link TeaModel}
 *
 * <p>BatchAddDocumentResult</p>
 */
public class BatchAddDocumentResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("addDocumentResults")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<AddDocumentResult> addDocumentResults;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private BatchAddDocumentResult(Builder builder) {
        this.addDocumentResults = builder.addDocumentResults;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchAddDocumentResult create() {
        return builder().build();
    }

    /**
     * @return addDocumentResults
     */
    public java.util.List<AddDocumentResult> getAddDocumentResults() {
        return this.addDocumentResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AddDocumentResult> addDocumentResults; 
        private String requestId; 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder addDocumentResults(java.util.List<AddDocumentResult> addDocumentResults) {
            this.addDocumentResults = addDocumentResults;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchAddDocumentResult build() {
            return new BatchAddDocumentResult(this);
        } 

    } 

}
