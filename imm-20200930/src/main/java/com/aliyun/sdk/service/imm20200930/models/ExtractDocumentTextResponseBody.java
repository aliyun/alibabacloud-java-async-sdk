// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExtractDocumentTextResponseBody} extends {@link TeaModel}
 *
 * <p>ExtractDocumentTextResponseBody</p>
 */
public class ExtractDocumentTextResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DocumentText")
    private String documentText;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ExtractDocumentTextResponseBody(Builder builder) {
        this.documentText = builder.documentText;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExtractDocumentTextResponseBody create() {
        return builder().build();
    }

    /**
     * @return documentText
     */
    public String getDocumentText() {
        return this.documentText;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String documentText; 
        private String requestId; 

        /**
         * DocumentText.
         */
        public Builder documentText(String documentText) {
            this.documentText = documentText;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExtractDocumentTextResponseBody build() {
            return new ExtractDocumentTextResponseBody(this);
        } 

    } 

}
