// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link LibraryReviewListResult} extends {@link TeaModel}
 *
 * <p>LibraryReviewListResult</p>
 */
public class LibraryReviewListResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("libraryReviews")
    private java.util.List<LibraryReview> libraryReviews;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private LibraryReviewListResult(Builder builder) {
        this.libraryReviews = builder.libraryReviews;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LibraryReviewListResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return libraryReviews
     */
    public java.util.List<LibraryReview> getLibraryReviews() {
        return this.libraryReviews;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<LibraryReview> libraryReviews; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(LibraryReviewListResult model) {
            this.libraryReviews = model.libraryReviews;
            this.requestId = model.requestId;
        } 

        /**
         * libraryReviews.
         */
        public Builder libraryReviews(java.util.List<LibraryReview> libraryReviews) {
            this.libraryReviews = libraryReviews;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public LibraryReviewListResult build() {
            return new LibraryReviewListResult(this);
        } 

    } 

}
