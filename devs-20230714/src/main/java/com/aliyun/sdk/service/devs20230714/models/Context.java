// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link Context} extends {@link TeaModel}
 *
 * <p>Context</p>
 */
public class Context extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.Map<String, ?> data;

    private Context(Builder builder) {
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Context create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public static final class Builder {
        private java.util.Map<String, ?> data; 

        private Builder() {
        } 

        private Builder(Context model) {
            this.data = model.data;
        } 

        /**
         * data.
         */
        public Builder data(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }

        public Context build() {
            return new Context(this);
        } 

    } 

}
