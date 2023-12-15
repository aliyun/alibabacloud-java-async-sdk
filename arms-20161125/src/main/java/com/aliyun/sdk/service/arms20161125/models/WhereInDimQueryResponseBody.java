// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20161125.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link WhereInDimQueryResponseBody} extends {@link TeaModel}
 *
 * <p>WhereInDimQueryResponseBody</p>
 */
public class WhereInDimQueryResponseBody extends TeaModel {
    @NameInMap("Data")
    private String data;

    private WhereInDimQueryResponseBody(Builder builder) {
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WhereInDimQueryResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    public static final class Builder {
        private String data; 

        /**
         * Data.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        public WhereInDimQueryResponseBody build() {
            return new WhereInDimQueryResponseBody(this);
        } 

    } 

}
