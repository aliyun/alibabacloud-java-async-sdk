// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLorneTasksMCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLorneTasksMCountResponseBody</p>
 */
public class DescribeLorneTasksMCountResponseBody extends TeaModel {
    @NameInMap("Data")
    private Float data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLorneTasksMCountResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLorneTasksMCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Float getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Float data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Float data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLorneTasksMCountResponseBody build() {
            return new DescribeLorneTasksMCountResponseBody(this);
        } 

    } 

}
