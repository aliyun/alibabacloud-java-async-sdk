// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
         * <p>The number of the page to return. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The type of the intervention dictionary. Valid values:</p>
         * <ul>
         * <li>stopword: an intervention dictionary for stop word filtering</li>
         * <li>synonym: an intervention dictionary for synonym configuration</li>
         * <li>correction: an intervention dictionary for spelling correction</li>
         * <li>category_prediction: an intervention dictionary for category prediction</li>
         * <li>ner: an intervention dictionary for named entity recognition (NER)</li>
         * <li>term_weighting: an intervention dictionary for term weight analysis</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;synonym&quot;]</p>
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
