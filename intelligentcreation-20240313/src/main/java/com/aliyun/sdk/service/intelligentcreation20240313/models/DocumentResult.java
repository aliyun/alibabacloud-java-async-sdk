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
 * {@link DocumentResult} extends {@link TeaModel}
 *
 * <p>DocumentResult</p>
 */
public class DocumentResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("documentInfo")
    private DocumentInfo documentInfo;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private DocumentResult(Builder builder) {
        this.documentInfo = builder.documentInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DocumentResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return documentInfo
     */
    public DocumentInfo getDocumentInfo() {
        return this.documentInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DocumentInfo documentInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DocumentResult model) {
            this.documentInfo = model.documentInfo;
            this.requestId = model.requestId;
        } 

        /**
         * documentInfo.
         */
        public Builder documentInfo(DocumentInfo documentInfo) {
            this.documentInfo = documentInfo;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DocumentResult build() {
            return new DocumentResult(this);
        } 

    } 

}
