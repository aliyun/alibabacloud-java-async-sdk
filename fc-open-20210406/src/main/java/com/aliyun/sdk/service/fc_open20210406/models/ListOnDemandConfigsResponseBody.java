// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOnDemandConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOnDemandConfigsResponseBody</p>
 */
public class ListOnDemandConfigsResponseBody extends TeaModel {
    @NameInMap("configs")
    private java.util.List < OnDemandConfig > configs;

    @NameInMap("nextToken")
    private String nextToken;

    private ListOnDemandConfigsResponseBody(Builder builder) {
        this.configs = builder.configs;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOnDemandConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return configs
     */
    public java.util.List < OnDemandConfig > getConfigs() {
        return this.configs;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder {
        private java.util.List < OnDemandConfig > configs; 
        private String nextToken; 

        /**
         * The configurations of on-demand instances.
         */
        public Builder configs(java.util.List < OnDemandConfig > configs) {
            this.configs = configs;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. If this parameter is not returned, all the layers are returned.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        public ListOnDemandConfigsResponseBody build() {
            return new ListOnDemandConfigsResponseBody(this);
        } 

    } 

}
