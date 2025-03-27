// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ListTextbookAssistantArticleDetailsRequest} extends {@link RequestModel}
 *
 * <p>ListTextbookAssistantArticleDetailsRequest</p>
 */
public class ListTextbookAssistantArticleDetailsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("articleIdList")
    private java.util.List<String> articleIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("authToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authToken;

    private ListTextbookAssistantArticleDetailsRequest(Builder builder) {
        super(builder);
        this.articleIdList = builder.articleIdList;
        this.authToken = builder.authToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTextbookAssistantArticleDetailsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return articleIdList
     */
    public java.util.List<String> getArticleIdList() {
        return this.articleIdList;
    }

    /**
     * @return authToken
     */
    public String getAuthToken() {
        return this.authToken;
    }

    public static final class Builder extends Request.Builder<ListTextbookAssistantArticleDetailsRequest, Builder> {
        private java.util.List<String> articleIdList; 
        private String authToken; 

        private Builder() {
            super();
        } 

        private Builder(ListTextbookAssistantArticleDetailsRequest request) {
            super(request);
            this.articleIdList = request.articleIdList;
            this.authToken = request.authToken;
        } 

        /**
         * articleIdList.
         */
        public Builder articleIdList(java.util.List<String> articleIdList) {
            this.putBodyParameter("articleIdList", articleIdList);
            this.articleIdList = articleIdList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tc_e6dc70c890866f4028ca685b6fa29874</p>
         */
        public Builder authToken(String authToken) {
            this.putBodyParameter("authToken", authToken);
            this.authToken = authToken;
            return this;
        }

        @Override
        public ListTextbookAssistantArticleDetailsRequest build() {
            return new ListTextbookAssistantArticleDetailsRequest(this);
        } 

    } 

}
