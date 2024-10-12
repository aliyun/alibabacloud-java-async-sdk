// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20240712.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AgentBaseQuery} extends {@link TeaModel}
 *
 * <p>AgentBaseQuery</p>
 */
public class AgentBaseQuery extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    private AgentBaseQuery(Builder builder) {
        this.query = builder.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgentBaseQuery create() {
        return builder().build();
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    public static final class Builder {
        private String query; 

        /**
         * query.
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        public AgentBaseQuery build() {
            return new AgentBaseQuery(this);
        } 

    } 

}
