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
 * {@link ListTextbookAssistantBookDirectoriesRequest} extends {@link RequestModel}
 *
 * <p>ListTextbookAssistantBookDirectoriesRequest</p>
 */
public class ListTextbookAssistantBookDirectoriesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("authToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("bookId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bookId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scenario")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scenario;

    private ListTextbookAssistantBookDirectoriesRequest(Builder builder) {
        super(builder);
        this.authToken = builder.authToken;
        this.bookId = builder.bookId;
        this.scenario = builder.scenario;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTextbookAssistantBookDirectoriesRequest create() {
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
     * @return bookId
     */
    public String getBookId() {
        return this.bookId;
    }

    /**
     * @return scenario
     */
    public String getScenario() {
        return this.scenario;
    }

    public static final class Builder extends Request.Builder<ListTextbookAssistantBookDirectoriesRequest, Builder> {
        private String authToken; 
        private String bookId; 
        private String scenario; 

        private Builder() {
            super();
        } 

        private Builder(ListTextbookAssistantBookDirectoriesRequest request) {
            super(request);
            this.authToken = request.authToken;
            this.bookId = request.bookId;
            this.scenario = request.scenario;
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

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>231698</p>
         */
        public Builder bookId(String bookId) {
            this.putBodyParameter("bookId", bookId);
            this.bookId = bookId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SYNC</p>
         */
        public Builder scenario(String scenario) {
            this.putBodyParameter("scenario", scenario);
            this.scenario = scenario;
            return this;
        }

        @Override
        public ListTextbookAssistantBookDirectoriesRequest build() {
            return new ListTextbookAssistantBookDirectoriesRequest(this);
        } 

    } 

}
