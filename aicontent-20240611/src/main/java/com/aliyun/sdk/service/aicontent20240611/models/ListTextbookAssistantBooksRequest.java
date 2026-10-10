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
         * <p>The authorization token for the API call. You can obtain this token by calling the authorization API for the AI textbook assistant feature.</p>
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
         * <p>The book ID.</p>
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
         * <p>The grade level. The value is a string from &quot;1&quot; to &quot;9&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder grade(String grade) {
            this.putBodyParameter("grade", grade);
            this.grade = grade;
            return this;
        }

        /**
         * <p>The maximum number of results to return per page. The value cannot exceed 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(String maxResults) {
            this.putBodyParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(String page) {
            this.putBodyParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The textbook version.</p>
         * 
         * <strong>example:</strong>
         * <p>人教版</p>
         */
        public Builder version(String version) {
            this.putBodyParameter("version", version);
            this.version = version;
            return this;
        }

        /**
         * <p>The volume. Valid values: 0 (all-in-one volume), 1 (first volume), and 2 (second volume).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
