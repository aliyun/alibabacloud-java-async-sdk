// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBagRemainingResponseBody} extends {@link TeaModel}
 *
 * <p>QueryBagRemainingResponseBody</p>
 */
public class QueryBagRemainingResponseBody extends TeaModel {
    @NameInMap("Data")
    private Long data;

    @NameInMap("RequestId")
    private String requestId;

    private QueryBagRemainingResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBagRemainingResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Long getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Long data) {
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

        public QueryBagRemainingResponseBody build() {
            return new QueryBagRemainingResponseBody(this);
        } 

    } 

}
