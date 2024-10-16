// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20240712.models;

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
    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    @com.aliyun.core.annotation.NameInMap("querySceneEnumCode")
    private String querySceneEnumCode;

    private CommonAgentQuery(Builder builder) {
        this.query = builder.query;
        this.querySceneEnumCode = builder.querySceneEnumCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CommonAgentQuery create() {
        return builder().build();
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

    public static final class Builder {
        private String query; 
        private String querySceneEnumCode; 

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

        public CommonAgentQuery build() {
            return new CommonAgentQuery(this);
        } 

    } 

}
