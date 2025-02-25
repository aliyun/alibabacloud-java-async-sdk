// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInterventionDictionaryEntriesRequest} extends {@link RequestModel}
 *
 * <p>ListInterventionDictionaryEntriesRequest</p>
 */
public class ListInterventionDictionaryEntriesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("word")
    private String word;

    private ListInterventionDictionaryEntriesRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.word = builder.word;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInterventionDictionaryEntriesRequest create() {
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

    public static final class Builder extends Request.Builder<ListInterventionDictionaryEntriesRequest, Builder> {
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String word; 

        private Builder() {
            super();
        } 

        private Builder(ListInterventionDictionaryEntriesRequest request) {
            super(request);
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.word = request.word;
        } 

        /**
         * The name of the intervention dictionary.
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
         * The number of entries returned per page. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The intervention entry.
         */
        public Builder word(String word) {
            this.putQueryParameter("word", word);
            this.word = word;
            return this;
        }

        @Override
        public ListInterventionDictionaryEntriesRequest build() {
            return new ListInterventionDictionaryEntriesRequest(this);
        } 

    } 

}
