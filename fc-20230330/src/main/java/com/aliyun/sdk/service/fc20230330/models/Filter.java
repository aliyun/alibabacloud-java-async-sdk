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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return key
     */
    public Key getKey() {
        return this.key;
    }

    public static final class Builder {
        private Key key; 

        private Builder() {
        } 

        private Builder(Filter model) {
            this.key = model.key;
        } 

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
