// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link CommonAgentQuery} extends {@link TeaModel}
 *
 * <p>CommonAgentQuery</p>
 */
public class CommonAgentQuery extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("limit")
    private Integer limit;

    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    @com.aliyun.core.annotation.NameInMap("querySceneEnumCode")
    private String querySceneEnumCode;

    @com.aliyun.core.annotation.NameInMap("searchModel")
    private String searchModel;

    private CommonAgentQuery(Builder builder) {
        this.limit = builder.limit;
        this.query = builder.query;
        this.querySceneEnumCode = builder.querySceneEnumCode;
        this.searchModel = builder.searchModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CommonAgentQuery create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return querySceneEnumCode
     */
    public String getQuerySceneEnumCode() {
        return this.querySceneEnumCode;
    }

    /**
     * @return searchModel
     */
    public String getSearchModel() {
        return this.searchModel;
    }

    public static final class Builder {
        private Integer limit; 
        private String query; 
        private String querySceneEnumCode; 
        private String searchModel; 

        private Builder() {
        } 

        private Builder(CommonAgentQuery model) {
            this.limit = model.limit;
            this.query = model.query;
            this.querySceneEnumCode = model.querySceneEnumCode;
            this.searchModel = model.searchModel;
        } 

        /**
         * <p>The maximum number of place results to return. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * <p>The natural language question used to retrieve nearby places.</p>
         * 
         * <strong>example:</strong>
         * <p>High-end hotels within 5 km of Lingyin Temple in Hangzhou</p>
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        /**
         * <p>The search scenario code. Valid values: hotels (hotel), attractions (attraction), restaurants (restaurant), and entertainment (leisure and entertainment). If you do not specify this parameter, the model identifies the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>hotels</p>
         */
        public Builder querySceneEnumCode(String querySceneEnumCode) {
            this.querySceneEnumCode = querySceneEnumCode;
            return this;
        }

        /**
         * <p>The search result mode. Valid values: single (returns simplified fields) and normal (returns all fields). Default value: normal.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder searchModel(String searchModel) {
            this.searchModel = searchModel;
            return this;
        }

        public CommonAgentQuery build() {
            return new CommonAgentQuery(this);
        } 

    } 

}
