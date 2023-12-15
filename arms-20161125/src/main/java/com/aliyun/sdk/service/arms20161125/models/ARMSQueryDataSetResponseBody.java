// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20161125.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ARMSQueryDataSetResponseBody} extends {@link TeaModel}
 *
 * <p>ARMSQueryDataSetResponseBody</p>
 */
public class ARMSQueryDataSetResponseBody extends TeaModel {
    @NameInMap("Data")
    private String data;

    private ARMSQueryDataSetResponseBody(Builder builder) {
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ARMSQueryDataSetResponseBody create() {
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

        public ARMSQueryDataSetResponseBody build() {
            return new ARMSQueryDataSetResponseBody(this);
        } 

    } 

}
