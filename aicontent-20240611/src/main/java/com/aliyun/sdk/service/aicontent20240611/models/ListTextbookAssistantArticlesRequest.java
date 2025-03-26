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
 * {@link ListTextbookAssistantArticlesRequest} extends {@link RequestModel}
 *
 * <p>ListTextbookAssistantArticlesRequest</p>
 */
public class ListTextbookAssistantArticlesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("authToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String directoryId;

    private ListTextbookAssistantArticlesRequest(Builder builder) {
        super(builder);
        this.authToken = builder.authToken;
        this.directoryId = builder.directoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTextbookAssistantArticlesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authToken
     */
    public String getAuthToken() {
        return this.authToken;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    public static final class Builder extends Request.Builder<ListTextbookAssistantArticlesRequest, Builder> {
        private String authToken; 
        private String directoryId; 

        private Builder() {
            super();
        } 

        private Builder(ListTextbookAssistantArticlesRequest request) {
            super(request);
            this.authToken = request.authToken;
            this.directoryId = request.directoryId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tc_a893b8492c4be046cbc906c566aeb8c9</p>
         */
        public Builder authToken(String authToken) {
            this.putBodyParameter("authToken", authToken);
            this.authToken = authToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>90aa861b4d9311efbe6e0c42a106bb02</p>
         */
        public Builder directoryId(String directoryId) {
            this.putBodyParameter("directoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        @Override
        public ListTextbookAssistantArticlesRequest build() {
            return new ListTextbookAssistantArticlesRequest(this);
        } 

    } 

}
