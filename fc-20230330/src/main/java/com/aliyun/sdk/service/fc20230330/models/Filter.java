// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Filter} extends {@link TeaModel}
 *
 * <p>Filter</p>
 */
public class Filter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("key")
    private Key key;

    private Filter(Builder builder) {
        this.key = builder.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Filter create() {
        return builder().build();
    }

    /**
     * @return key
     */
    public Key getKey() {
        return this.key;
    }

    public static final class Builder {
        private Key key; 

        /**
         * key.
         */
        public Builder key(Key key) {
            this.key = key;
            return this;
        }

        public Filter build() {
            return new Filter(this);
        } 

    } 

}
