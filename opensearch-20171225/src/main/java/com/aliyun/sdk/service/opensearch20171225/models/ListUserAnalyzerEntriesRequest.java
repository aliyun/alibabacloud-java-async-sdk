// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserAnalyzerEntriesRequest} extends {@link RequestModel}
 *
 * <p>ListUserAnalyzerEntriesRequest</p>
 */
public class ListUserAnalyzerEntriesRequest extends Request {
    @Path
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("pageNumber")
    @Validation(maximum = 999999999)
    private Integer pageNumber;

    @Query
    @NameInMap("pageSize")
    @Validation(maximum = 999999999)
    private Integer pageSize;

    @Query
    @NameInMap("word")
    private String word;

    private ListUserAnalyzerEntriesRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.word = builder.word;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserAnalyzerEntriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return word
     */
    public String getWord() {
        return this.word;
    }

    public static final class Builder extends Request.Builder<ListUserAnalyzerEntriesRequest, Builder> {
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String word; 

        private Builder() {
            super();
        } 

        private Builder(ListUserAnalyzerEntriesRequest request) {
            super(request);
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.word = request.word;
        } 

        /**
         * The name of the analyzer.
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * The page number. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The key to be used to query entries.
         */
        public Builder word(String word) {
            this.putQueryParameter("word", word);
            this.word = word;
            return this;
        }

        @Override
        public ListUserAnalyzerEntriesRequest build() {
            return new ListUserAnalyzerEntriesRequest(this);
        } 

    } 

}
