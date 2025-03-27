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
 * {@link AddDocumentResult} extends {@link TeaModel}
 *
 * <p>AddDocumentResult</p>
 */
public class AddDocumentResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("docName")
    private String docName;

    @com.aliyun.core.annotation.NameInMap("documentInfo")
    private DocumentInfo documentInfo;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private AddDocumentResult(Builder builder) {
        this.docName = builder.docName;
        this.documentInfo = builder.documentInfo;
        this.errorMessage = builder.errorMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDocumentResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return docName
     */
    public String getDocName() {
        return this.docName;
    }

    /**
     * @return documentInfo
     */
    public DocumentInfo getDocumentInfo() {
        return this.documentInfo;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String docName; 
        private DocumentInfo documentInfo; 
        private String errorMessage; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(AddDocumentResult model) {
            this.docName = model.docName;
            this.documentInfo = model.documentInfo;
            this.errorMessage = model.errorMessage;
            this.success = model.success;
        } 

        /**
         * docName.
         */
        public Builder docName(String docName) {
            this.docName = docName;
            return this;
        }

        /**
         * documentInfo.
         */
        public Builder documentInfo(DocumentInfo documentInfo) {
            this.documentInfo = documentInfo;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AddDocumentResult build() {
            return new AddDocumentResult(this);
        } 

    } 

}
