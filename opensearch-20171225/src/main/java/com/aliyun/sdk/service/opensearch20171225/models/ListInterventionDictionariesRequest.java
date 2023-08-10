// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInterventionDictionariesRequest} extends {@link RequestModel}
 *
 * <p>ListInterventionDictionariesRequest</p>
 */
public class ListInterventionDictionariesRequest extends Request {
    @Query
    @NameInMap("pageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("pageSize")
    private Integer pageSize;

    @Query
    @NameInMap("types")
    private String types;

    private ListInterventionDictionariesRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInterventionDictionariesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return types
     */
    public String getTypes() {
        return this.types;
    }

    public static final class Builder extends Request.Builder<ListInterventionDictionariesRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String types; 

        private Builder() {
            super();
        } 

        private Builder(ListInterventionDictionariesRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.types = request.types;
        } 

        /**
         * 1
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 10
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * \-
         */
        public Builder types(String types) {
            this.putQueryParameter("types", types);
            this.types = types;
            return this;
        }

        @Override
        public ListInterventionDictionariesRequest build() {
            return new ListInterventionDictionariesRequest(this);
        } 

    } 

}
