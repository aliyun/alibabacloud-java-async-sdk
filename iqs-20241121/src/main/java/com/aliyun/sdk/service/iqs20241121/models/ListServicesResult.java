// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121.models;

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
 * {@link ListServicesResult} extends {@link TeaModel}
 *
 * <p>ListServicesResult</p>
 */
public class ListServicesResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("services")
    private LrOrder services;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListServicesResult(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.services = builder.services;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServicesResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return services
     */
    public LrOrder getServices() {
        return this.services;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private LrOrder services; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListServicesResult model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.services = model.services;
            this.total = model.total;
        } 

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * services.
         */
        public Builder services(LrOrder services) {
            this.services = services;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListServicesResult build() {
            return new ListServicesResult(this);
        } 

    } 

}
