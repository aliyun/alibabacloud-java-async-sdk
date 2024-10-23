// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAsyncInvokeConfigOutput} extends {@link TeaModel}
 *
 * <p>ListAsyncInvokeConfigOutput</p>
 */
public class ListAsyncInvokeConfigOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("configs")
    private java.util.List < AsyncConfig > configs;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    private ListAsyncInvokeConfigOutput(Builder builder) {
        this.configs = builder.configs;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAsyncInvokeConfigOutput create() {
        return builder().build();
    }

    /**
     * @return configs
     */
    public java.util.List < AsyncConfig > getConfigs() {
        return this.configs;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder {
        private java.util.List < AsyncConfig > configs; 
        private String nextToken; 

        /**
         * configs.
         */
        public Builder configs(java.util.List < AsyncConfig > configs) {
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

        public ListAsyncInvokeConfigOutput build() {
            return new ListAsyncInvokeConfigOutput(this);
        } 

    } 

}
