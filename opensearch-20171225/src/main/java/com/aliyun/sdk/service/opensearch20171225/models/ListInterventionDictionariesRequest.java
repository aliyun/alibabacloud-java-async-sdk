// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInterventionDictionariesRequest} extends {@link RequestModel}
 *
 * <p>ListInterventionDictionariesRequest</p>
 */
public class ListInterventionDictionariesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("types")
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
         * The number of the page to return. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The type of the intervention dictionary. Valid values:
         * <p>
         * 
         * *   stopword: an intervention dictionary for stop word filtering
         * *   synonym: an intervention dictionary for synonym configuration
         * *   correction: an intervention dictionary for spelling correction
         * *   category_prediction: an intervention dictionary for category prediction
         * *   ner: an intervention dictionary for named entity recognition (NER)
         * *   term_weighting: an intervention dictionary for term weight analysis
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
