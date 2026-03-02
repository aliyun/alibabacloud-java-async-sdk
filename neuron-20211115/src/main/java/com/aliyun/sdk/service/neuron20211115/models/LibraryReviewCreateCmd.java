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
 * {@link LibraryReviewCreateCmd} extends {@link TeaModel}
 *
 * <p>LibraryReviewCreateCmd</p>
 */
public class LibraryReviewCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("libraryId")
    private Long libraryId;

    @com.aliyun.core.annotation.NameInMap("libraryUrl")
    private String libraryUrl;

    @com.aliyun.core.annotation.NameInMap("marketId")
    private Long marketId;

    @com.aliyun.core.annotation.NameInMap("reviewerId")
    private String reviewerId;

    private LibraryReviewCreateCmd(Builder builder) {
        this.libraryId = builder.libraryId;
        this.libraryUrl = builder.libraryUrl;
        this.marketId = builder.marketId;
        this.reviewerId = builder.reviewerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LibraryReviewCreateCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return libraryId
     */
    public Long getLibraryId() {
        return this.libraryId;
    }

    /**
     * @return libraryUrl
     */
    public String getLibraryUrl() {
        return this.libraryUrl;
    }

    /**
     * @return marketId
     */
    public Long getMarketId() {
        return this.marketId;
    }

    /**
     * @return reviewerId
     */
    public String getReviewerId() {
        return this.reviewerId;
    }

    public static final class Builder {
        private Long libraryId; 
        private String libraryUrl; 
        private Long marketId; 
        private String reviewerId; 

        private Builder() {
        } 

        private Builder(LibraryReviewCreateCmd model) {
            this.libraryId = model.libraryId;
            this.libraryUrl = model.libraryUrl;
            this.marketId = model.marketId;
            this.reviewerId = model.reviewerId;
        } 

        /**
         * libraryId.
         */
        public Builder libraryId(Long libraryId) {
            this.libraryId = libraryId;
            return this;
        }

        /**
         * libraryUrl.
         */
        public Builder libraryUrl(String libraryUrl) {
            this.libraryUrl = libraryUrl;
            return this;
        }

        /**
         * marketId.
         */
        public Builder marketId(Long marketId) {
            this.marketId = marketId;
            return this;
        }

        /**
         * reviewerId.
         */
        public Builder reviewerId(String reviewerId) {
            this.reviewerId = reviewerId;
            return this;
        }

        public LibraryReviewCreateCmd build() {
            return new LibraryReviewCreateCmd(this);
        } 

    } 

}
