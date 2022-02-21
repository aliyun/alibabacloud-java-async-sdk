// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInterventionDictionaryNerResultsRequest} extends {@link RequestModel}
 *
 * <p>ListInterventionDictionaryNerResultsRequest</p>
 */
public class ListInterventionDictionaryNerResultsRequest extends Request {
    @Path
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("query")
    @Validation(required = true)
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

        private Builder(ListInterventionDictionaryNerResultsRequest response) {
            super(response);
            this.name = response.name;
            this.query = response.query;
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
         * query.
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
