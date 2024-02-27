// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCsrRequest} extends {@link RequestModel}
 *
 * <p>ListCsrRequest</p>
 */
public class ListCsrRequest extends Request {
    @Query
    @NameInMap("Algorithm")
    private String algorithm;

    @Query
    @NameInMap("CurrentPage")
    private Long currentPage;

    @Query
    @NameInMap("KeyWord")
    private String keyWord;

    @Query
    @NameInMap("ShowSize")
    private Long showSize;

    private ListCsrRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.currentPage = builder.currentPage;
        this.keyWord = builder.keyWord;
        this.showSize = builder.showSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCsrRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithm
     */
    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return keyWord
     */
    public String getKeyWord() {
        return this.keyWord;
    }

    /**
     * @return showSize
     */
    public Long getShowSize() {
        return this.showSize;
    }

    public static final class Builder extends Request.Builder<ListCsrRequest, Builder> {
        private String algorithm; 
        private Long currentPage; 
        private String keyWord; 
        private Long showSize; 

        private Builder() {
            super();
        } 

        private Builder(ListCsrRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.currentPage = request.currentPage;
            this.keyWord = request.keyWord;
            this.showSize = request.showSize;
        } 

        /**
         * Algorithm.
         */
        public Builder algorithm(String algorithm) {
            this.putQueryParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * KeyWord.
         */
        public Builder keyWord(String keyWord) {
            this.putQueryParameter("KeyWord", keyWord);
            this.keyWord = keyWord;
            return this;
        }

        /**
         * ShowSize.
         */
        public Builder showSize(Long showSize) {
            this.putQueryParameter("ShowSize", showSize);
            this.showSize = showSize;
            return this;
        }

        @Override
        public ListCsrRequest build() {
            return new ListCsrRequest(this);
        } 

    } 

}
