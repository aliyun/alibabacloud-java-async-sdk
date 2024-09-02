// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInterventionDictionaryNerResultsRequest} extends {@link RequestModel}
 *
 * <p>ListInterventionDictionaryNerResultsRequest</p>
 */
public class ListInterventionDictionaryNerResultsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    private ListInterventionDictionaryNerResultsRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.query = builder.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInterventionDictionaryNerResultsRequest create() {
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
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    public static final class Builder extends Request.Builder<ListInterventionDictionaryNerResultsRequest, Builder> {
        private String name; 
        private String query; 

        private Builder() {
            super();
        } 

        private Builder(ListInterventionDictionaryNerResultsRequest request) {
            super(request);
            this.name = request.name;
            this.query = request.query;
        } 

        /**
         * The dictionary name.
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * Query keywords.
         */
        public Builder query(String query) {
            this.putQueryParameter("query", query);
            this.query = query;
            return this;
        }

        @Override
        public ListInterventionDictionaryNerResultsRequest build() {
            return new ListInterventionDictionaryNerResultsRequest(this);
        } 

    } 

}
