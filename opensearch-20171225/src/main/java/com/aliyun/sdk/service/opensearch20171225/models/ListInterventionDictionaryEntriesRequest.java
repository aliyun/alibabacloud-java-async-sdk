// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInterventionDictionaryEntriesRequest} extends {@link RequestModel}
 *
 * <p>ListInterventionDictionaryEntriesRequest</p>
 */
public class ListInterventionDictionaryEntriesRequest extends Request {
    @Path
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("pageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("pageSize")
    private Integer pageSize;

    @Query
    @NameInMap("word")
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

        private Builder(ListInterventionDictionaryEntriesRequest response) {
            super(response);
            this.name = response.name;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.word = response.word;
        } 

        /**
         * name.
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * word.
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
