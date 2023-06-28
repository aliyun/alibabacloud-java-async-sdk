// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConcurrencyConfigsOutput} extends {@link TeaModel}
 *
 * <p>ListConcurrencyConfigsOutput</p>
 */
public class ListConcurrencyConfigsOutput extends TeaModel {
    @NameInMap("configs")
    private java.util.List < ConcurrencyConfig > configs;

    @NameInMap("nextToken")
    private String nextToken;

    private ListConcurrencyConfigsOutput(Builder builder) {
        this.configs = builder.configs;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConcurrencyConfigsOutput create() {
        return builder().build();
    }

    /**
     * @return configs
     */
    public java.util.List < ConcurrencyConfig > getConfigs() {
        return this.configs;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder {
        private java.util.List < ConcurrencyConfig > configs; 
        private String nextToken; 

        /**
         * configs.
         */
        public Builder configs(java.util.List < ConcurrencyConfig > configs) {
            this.configs = configs;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        public ListConcurrencyConfigsOutput build() {
            return new ListConcurrencyConfigsOutput(this);
        } 

    } 

}
