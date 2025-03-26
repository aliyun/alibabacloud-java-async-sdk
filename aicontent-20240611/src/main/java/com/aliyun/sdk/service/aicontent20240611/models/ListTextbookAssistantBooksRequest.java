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
 * {@link ListTextbookAssistantBooksRequest} extends {@link RequestModel}
 *
 * <p>ListTextbookAssistantBooksRequest</p>
 */
public class ListTextbookAssistantBooksRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("authToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("bookId")
    private String bookId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("grade")
    private String grade;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private String maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("page")
    private String page;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("volume")
    private String volume;

    private ListTextbookAssistantBooksRequest(Builder builder) {
        super(builder);
        this.authToken = builder.authToken;
        this.bookId = builder.bookId;
        this.grade = builder.grade;
        this.maxResults = builder.maxResults;
        this.page = builder.page;
        this.version = builder.version;
        this.volume = builder.volume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTextbookAssistantBooksRequest create() {
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
     * @return grade
     */
    public String getGrade() {
        return this.grade;
    }

    /**
     * @return maxResults
     */
    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return page
     */
    public String getPage() {
        return this.page;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return volume
     */
    public String getVolume() {
        return this.volume;
    }

    public static final class Builder extends Request.Builder<ListTextbookAssistantBooksRequest, Builder> {
        private String authToken; 
        private String bookId; 
        private String grade; 
        private String maxResults; 
        private String page; 
        private String version; 
        private String volume; 

        private Builder() {
            super();
        } 

        private Builder(ListTextbookAssistantBooksRequest request) {
            super(request);
            this.authToken = request.authToken;
            this.bookId = request.bookId;
            this.grade = request.grade;
            this.maxResults = request.maxResults;
            this.page = request.page;
            this.version = request.version;
            this.volume = request.volume;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tc_197bf5bb81889cc79eb51ae9b8c0cea3</p>
         */
        public Builder authToken(String authToken) {
            this.putBodyParameter("authToken", authToken);
            this.authToken = authToken;
            return this;
        }

        /**
         * bookId.
         */
        public Builder bookId(String bookId) {
            this.putBodyParameter("bookId", bookId);
            this.bookId = bookId;
            return this;
        }

        /**
         * grade.
         */
        public Builder grade(String grade) {
            this.putBodyParameter("grade", grade);
            this.grade = grade;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(String maxResults) {
            this.putBodyParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * page.
         */
        public Builder page(String page) {
            this.putBodyParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.putBodyParameter("version", version);
            this.version = version;
            return this;
        }

        /**
         * volume.
         */
        public Builder volume(String volume) {
            this.putBodyParameter("volume", volume);
            this.volume = volume;
            return this;
        }

        @Override
        public ListTextbookAssistantBooksRequest build() {
            return new ListTextbookAssistantBooksRequest(this);
        } 

    } 

}
