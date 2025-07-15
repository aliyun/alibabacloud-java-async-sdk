// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link EditAuditTermsRequest} extends {@link RequestModel}
 *
 * <p>EditAuditTermsRequest</p>
 */
public class EditAuditTermsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SuggestWord")
    private String suggestWord;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TermsDesc")
    private String termsDesc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private EditAuditTermsRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.keyword = builder.keyword;
        this.suggestWord = builder.suggestWord;
        this.termsDesc = builder.termsDesc;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditAuditTermsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return suggestWord
     */
    public String getSuggestWord() {
        return this.suggestWord;
    }

    /**
     * @return termsDesc
     */
    public String getTermsDesc() {
        return this.termsDesc;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<EditAuditTermsRequest, Builder> {
        private String id; 
        private String keyword; 
        private String suggestWord; 
        private String termsDesc; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(EditAuditTermsRequest request) {
            super(request);
            this.id = request.id;
            this.keyword = request.keyword;
            this.suggestWord = request.suggestWord;
            this.termsDesc = request.termsDesc;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * SuggestWord.
         */
        public Builder suggestWord(String suggestWord) {
            this.putBodyParameter("SuggestWord", suggestWord);
            this.suggestWord = suggestWord;
            return this;
        }

        /**
         * TermsDesc.
         */
        public Builder termsDesc(String termsDesc) {
            this.putBodyParameter("TermsDesc", termsDesc);
            this.termsDesc = termsDesc;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public EditAuditTermsRequest build() {
            return new EditAuditTermsRequest(this);
        } 

    } 

}
