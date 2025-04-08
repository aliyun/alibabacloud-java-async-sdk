// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListRoutineRelatedRecordsRequest} extends {@link RequestModel}
 *
 * <p>ListRoutineRelatedRecordsRequest</p>
 */
public class ListRoutineRelatedRecordsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchKeyWord")
    private String searchKeyWord;

    private ListRoutineRelatedRecordsRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchKeyWord = builder.searchKeyWord;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRoutineRelatedRecordsRequest create() {
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
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return searchKeyWord
     */
    public String getSearchKeyWord() {
        return this.searchKeyWord;
    }

    public static final class Builder extends Request.Builder<ListRoutineRelatedRecordsRequest, Builder> {
        private String name; 
        private Long pageNumber; 
        private Long pageSize; 
        private String searchKeyWord; 

        private Builder() {
            super();
        } 

        private Builder(ListRoutineRelatedRecordsRequest request) {
            super(request);
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchKeyWord = request.searchKeyWord;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SearchKeyWord.
         */
        public Builder searchKeyWord(String searchKeyWord) {
            this.putBodyParameter("SearchKeyWord", searchKeyWord);
            this.searchKeyWord = searchKeyWord;
            return this;
        }

        @Override
        public ListRoutineRelatedRecordsRequest build() {
            return new ListRoutineRelatedRecordsRequest(this);
        } 

    } 

}
