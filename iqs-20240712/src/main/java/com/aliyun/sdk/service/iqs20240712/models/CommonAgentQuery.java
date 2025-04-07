// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20240712.models;

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
         * limit.
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * query.
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        /**
         * querySceneEnumCode.
         */
        public Builder querySceneEnumCode(String querySceneEnumCode) {
            this.querySceneEnumCode = querySceneEnumCode;
            return this;
        }

        /**
         * searchModel.
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
