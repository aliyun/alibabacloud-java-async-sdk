// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link ListElasticConfigsOutput} extends {@link TeaModel}
 *
 * <p>ListElasticConfigsOutput</p>
 */
public class ListElasticConfigsOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("elasticConfigs")
    private java.util.List<ElasticConfigStatus> elasticConfigs;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    private ListElasticConfigsOutput(Builder builder) {
        this.elasticConfigs = builder.elasticConfigs;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListElasticConfigsOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return elasticConfigs
     */
    public java.util.List<ElasticConfigStatus> getElasticConfigs() {
        return this.elasticConfigs;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder {
        private java.util.List<ElasticConfigStatus> elasticConfigs; 
        private String nextToken; 

        private Builder() {
        } 

        private Builder(ListElasticConfigsOutput model) {
            this.elasticConfigs = model.elasticConfigs;
            this.nextToken = model.nextToken;
        } 

        /**
         * elasticConfigs.
         */
        public Builder elasticConfigs(java.util.List<ElasticConfigStatus> elasticConfigs) {
            this.elasticConfigs = elasticConfigs;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        public ListElasticConfigsOutput build() {
            return new ListElasticConfigsOutput(this);
        } 

    } 

}
