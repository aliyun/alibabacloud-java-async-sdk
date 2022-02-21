// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCoreWordsRequest} extends {@link RequestModel}
 *
 * <p>QueryCoreWordsRequest</p>
 */
public class QueryCoreWordsRequest extends Request {
    @Query
    @NameInMap("CoreWordName")
    private String coreWordName;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Synonym")
    private String synonym;

    private QueryCoreWordsRequest(Builder builder) {
        super(builder);
        this.coreWordName = builder.coreWordName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.synonym = builder.synonym;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCoreWordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return coreWordName
     */
    public String getCoreWordName() {
        return this.coreWordName;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return synonym
     */
    public String getSynonym() {
        return this.synonym;
    }

    public static final class Builder extends Request.Builder<QueryCoreWordsRequest, Builder> {
        private String coreWordName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String synonym; 

        private Builder() {
            super();
        } 

        private Builder(QueryCoreWordsRequest response) {
            super(response);
            this.coreWordName = response.coreWordName;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.synonym = response.synonym;
        } 

        /**
         * CoreWordName.
         */
        public Builder coreWordName(String coreWordName) {
            this.putQueryParameter("CoreWordName", coreWordName);
            this.coreWordName = coreWordName;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Synonym.
         */
        public Builder synonym(String synonym) {
            this.putQueryParameter("Synonym", synonym);
            this.synonym = synonym;
            return this;
        }

        @Override
        public QueryCoreWordsRequest build() {
            return new QueryCoreWordsRequest(this);
        } 

    } 

}
